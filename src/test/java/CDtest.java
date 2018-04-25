import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import scan.CD;
import scan.CDConfig;
import scan.CDplayer;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CDtest {
    @Autowired
    private CDplayer cDplayer;

//    @Autowired
//    private CD cd;

    @Test
    public void test(){
        List<String> songs = new ArrayList<String>();
        songs.add("song1");
//        cd.setSongs(songs);
//        cDplayer.setCD(cd);
        cDplayer.play();
    }

}
