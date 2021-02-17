package person.shw.myapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author shihaowei
 * @date 2021/2/13 下午7:45
 * @slogan 天下风云出我辈, 一入代码岁月催
 */
@Aspect
@Component
public class OrderServiceAop {

    @Before("execution(* person.shw.myapp.aop.OrderService.fun1())")
    public void fun1JoinPoint(JoinPoint joinPoint){
        System.out.println("join point fun1 ...");
    }

    @Before("execution(* person.shw.myapp.aop.OrderService.fun2())")
    public void fun2JoinPoint(JoinPoint joinPoint){
        System.out.println("join point fun2 ...");
    }
}
