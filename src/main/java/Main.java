import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

/**
 * Created by jiaming on 2017/1/8.
 */
@RestController
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    public String hello(){
        return "hello docker!";
    }

    @RequestMapping("/now")
    public String nowTime(){
        return "nowtime:"+new Date();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
