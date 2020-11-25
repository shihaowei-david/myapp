package person.shw.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import person.shw.springboot.plugin.gateway.annotation.EnableGatewayAPI;

/**
 * @author shihaowei
 * @date 2020/7/31 5:03 下午
 */
@SpringBootApplication(scanBasePackages = "person.shw")
@EnableGatewayAPI(route = "/api/myapp/v1")
public class MyAppLaunch {

    public static void main(String[] args) {
        System.setProperty("appid","my-app");
        SpringApplication.run(MyAppLaunch.class,args);
    }
}
