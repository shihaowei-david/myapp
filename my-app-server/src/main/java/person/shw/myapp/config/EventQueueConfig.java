package person.shw.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import person.shw.myapp.event.UserEventConsumer;
import person.shw.myapp.event.UserEventProducer;

/**
 * @author shihaowei
 * @date 2020/9/30 4:46 下午
 */
@Configuration
public class EventQueueConfig {

    @Bean
    public UserEventProducer userEventProducer(){
        UserEventProducer userEventProducer = new UserEventProducer(new UserEventConsumer(1),new UserEventConsumer(2));
        userEventProducer.start();
        return userEventProducer;
    }
}
