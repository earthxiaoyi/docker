package profiletest;

import config.dev.ApplicationConfigDev;
import config.pro.ApplicationConfigPro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiaming on 2017/5/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("pro")
//@ActiveProfiles("dev")
@ContextConfiguration(classes = {ApplicationConfigDev.class, ApplicationConfigPro.class})
public class TestActiveProfile {

    @Autowired
    Environment env;

    @Test
    public void test1(){
        System.out.println(env.getProperty("jdbc.username"));
        System.out.println(env.getProperty("jdbc.password"));
    }

}
