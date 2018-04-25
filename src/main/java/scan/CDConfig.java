package scan;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan
public class CDConfig {
    @Bean
    @Primary
    public CD getCD(){
        return new SingerKing01();





    }
    @Bean
    @Primary
    public CDplayer getCDPlayer(CD cd){
        PhiCDPlayer phiCDPlayer = new PhiCDPlayer();
        phiCDPlayer.setCd(cd);
        return phiCDPlayer;
    }
}
