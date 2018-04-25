package sing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan
public class ConcertConfig {

    @Bean
    public Perform getPerform(){
        return new Performance();
    }
    @Bean
    public Audience getAudience(){
        return new Audience();
    }
}
