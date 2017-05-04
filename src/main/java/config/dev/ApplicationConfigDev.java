package config.dev;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import user.bean.UserInfo;

/**
 * Created by jiaming on 2017/4/30.
 */
@Configuration
@ComponentScan("init,order,user,profile,utils")
@EnableAutoConfiguration
@Profile("dev")
@PropertySource(value={"classpath:dev/jdbc.properties"})
public class ApplicationConfigDev {

    @Bean
    public UserInfo userInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10);
        userInfo.setPassword("pwd11");
        userInfo.setUserName("wangerxiao");
        return userInfo;
    }

}
