package config.pro;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import user.bean.UserInfo;

/**
 * Created by jiaming on 2017/2/11.
 */
@Configuration
@ComponentScan("init,order,user,profile,utils")
@EnableAutoConfiguration
@Profile("pro")
@PropertySource(value={"classpath:pro/jdbc.properties"})
public class ApplicationConfigPro {

    @Bean
    public UserInfo userInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(10);
        userInfo.setPassword("pwd11");
        userInfo.setUserName("wangerxiao");
        return userInfo;
    }

}
