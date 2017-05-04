package user;

import config.dev.ApplicationConfigDev;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import user.bean.UserInfo;
import user.service.UserService;

/**
 * Created by jiaming on 2017/2/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfigDev.class})
@ActiveProfiles("dev")
public class TestUserBean {

    @Autowired
    private UserInfo userInfo;

    @Test
    public void test1(){
        System.out.println(userInfo);
    }

}
