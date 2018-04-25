package sing;

import org.springframework.stereotype.Component;

@Component
public class Performance implements  Perform{

    public void perform(int i){
        System.out.println("performance..."+i);
        return;
    }
}
