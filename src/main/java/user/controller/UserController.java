package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiaming on 2017/4/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request){
        String name = request.getParameter("name");
        return userService.sayHello(name);
    }

}
