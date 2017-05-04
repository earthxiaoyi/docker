package profiletest;

import config.dev.ApplicationConfigDev;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiaming on 2017/4/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfigDev.class})
@ActiveProfiles("dev")
public class EnviromentTest {

    @Autowired
    Environment env;

    @Test
    public void envTest1(){
        System.out.println(env.getProperty("jdbc.username"));
        System.out.println(env.getProperty("jdbc.password"));
    }
}
