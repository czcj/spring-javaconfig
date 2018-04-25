package sing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Pointcut("execution(* sing.Perform.perform(..))")
    public void performance(){};

//    @Before("execution(* sing.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silence cell phones!");
    }
//   @AfterReturning("execution(* sing.Performance.perform(..))")
    @AfterReturning("performance()")
   public void applause(){
        System.out.println("applauseing...");
   }
//    @AfterThrowing("execution(* sing.Performance.perform(..))")
    @AfterThrowing("performance()")
    public void demandRefund(){
       System.out.println("demandRefund...");
    }
    @Around("performance()")
    public void around(ProceedingJoinPoint jp){
        try {
            System.out.println("silence cell phones!");
            jp.proceed();
            System.out.println("applauseing...");
        } catch (Throwable throwable) {
            System.out.println("demandRefund...");
        }
    }
}
