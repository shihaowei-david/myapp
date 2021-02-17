package person.shw.myapp.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * @author shihaowei
 * @date 2021/2/13 下午7:43
 * @slogan 天下风云出我辈, 一入代码岁月催
 */
@Component
public class OrderService {

    public void fun1(){
        System.out.println("fun1.............");
        OrderService orderService = (OrderService) AopContext.currentProxy();
        orderService.fun2();
    }

    public void fun2(){
        System.out.println("fun2.............");
    }
}
