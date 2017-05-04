package user;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user.bean.UserInfo;
import user.service.UserService;

/**
 * Created by jiaming on 2017/2/12.
 */
public class TestUserBean {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("config");
        UserInfo bean = context.getBean(UserInfo.class);
        System.out.println(bean);
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("config");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.sayHello("小明"));
    }

}
