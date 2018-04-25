package scan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PhiCDPlayer implements CDplayer {


    public void setCd(CD cd) {
        this.cd = cd;
    }

    int i = 0;
    private CD cd;

    public void play() {
        System.out.println(cd.getSongs());
    }

    public CD getCD() {
        return cd;
    }

//    public Boolean setCD(CD cd) {
//        this.cd = cd;
//        return true;
//    }
}
