package init;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jiaming on 2017/4/29.
 */
@Component
public class LoadConfig {

    @PostConstruct
    public void init(){
        System.out.println("load config!");
    }

}
