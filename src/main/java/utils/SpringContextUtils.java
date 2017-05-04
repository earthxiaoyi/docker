package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by jiaming on 2017/4/30.
 */
@Component
public class SpringContextUtils {

    private static ApplicationContext context = null;

    @EventListener
    public void setApplicationContext(ContextRefreshedEvent eve){
        context = eve.getApplicationContext();
    }

    /**
     * 根据bean类型获取spring容器中的bean
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> tClass){
        return context.getBean(tClass);
    }

}
