package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiaming on 2017/2/11.
 */
@Service
public class UserService {

    public String sayHello(String name){
        return "hi "+name;
    }

}
