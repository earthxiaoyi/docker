package order.controller;

import order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiaming on 2017/4/29.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    public Object order(HttpServletRequest request){
        String orderId = request.getParameter("orderId");
        return orderService.order(orderId);
    }
}
