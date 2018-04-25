import junit.framework.JUnit4TestAdapterCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sing.Audience;
import sing.ConcertConfig;
import sing.Perform;
import sing.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {
    @Autowired
    private Perform perform;

    @Test
    public void test(){
        perform.perform(3);
    }
}
