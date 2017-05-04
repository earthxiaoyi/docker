package order.service;

import org.springframework.stereotype.Service;

/**
 * Created by jiaming on 2017/4/29.
 */
@Service
public class OrderService {

    public String order(String orderId){

        return orderId+"下单成功";
    }

}
