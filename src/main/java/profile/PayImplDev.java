package profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jiaming on 2017/4/30.
 */
@Service("payImplDev")
public class PayImplDev implements Pay{

    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    public void pay() {
        System.out.println("devPay。userName:"+userName+" password:"+password);
    }
}
