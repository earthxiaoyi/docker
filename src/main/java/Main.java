import config.pro.ApplicationConfigPro;
import org.springframework.boot.SpringApplication;


/**
 * Created by jiaming on 2017/1/8.
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.default","pro");
        SpringApplication.run(ApplicationConfigPro.class,args);
    }
}
