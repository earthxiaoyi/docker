package profiletest;

import config.dev.ApplicationConfigDev;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import profile.Pay;

/**
 * Created by jiaming on 2017/4/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfigDev.class})
@ActiveProfiles("dev")
public class TestActiveProfileDev {

    @Autowired
    @Qualifier("payImplDev")
    private Pay payService;

    @Test
    public void payTest(){
        payService.pay();
    }
}
