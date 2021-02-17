package person.shw.myapp.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shihaowei
 * @date 2021/2/13 下午7:59
 * @slogan 天下风云出我辈, 一入代码岁月催
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AOPTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void test1(){
        System.out.println("1111");
        orderService.fun1();
    }

    @Test
    public void test2(){
        orderService.fun2();
    }
}
