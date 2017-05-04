package profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jiaming on 2017/4/30.
 */
@Service("payImplPro")
public class PayImplPro implements Pay{

    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    public void pay() {
        System.out.println("proPay。userName:"+userName+" password:"+password);
    }
}
