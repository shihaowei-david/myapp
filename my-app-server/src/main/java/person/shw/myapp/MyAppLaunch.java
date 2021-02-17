package person.shw.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import person.shw.springboot.plugin.gateway.annotation.EnableGatewayAPI;

import javax.annotation.PostConstruct;

/**
 * @author shihaowei
 * @date 2020/7/31 5:03 下午
 */
@SpringBootApplication(scanBasePackages = "person.shw")
@EnableGatewayAPI(route = "/api/myapp/v1")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MyAppLaunch {

    public static void main(String[] args) {
        System.setProperty("appid","my-app");
        SpringApplication.run(MyAppLaunch.class,args);
    }
}
