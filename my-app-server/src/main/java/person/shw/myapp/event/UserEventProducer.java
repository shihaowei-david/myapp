package person.shw.myapp.event;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.EventHandlerGroup;
import com.lmax.disruptor.dsl.ProducerType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import person.shw.springboot.plugin.eventqueue.event.EventWrapper;
import person.shw.springboot.plugin.eventqueue.producer.AbstractEventProducer;

/**
 * @author shihaowei
 * @date 2020/9/30 4:30 下午
 */
public class UserEventProducer extends AbstractEventProducer<UserEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(UserEventProducer.class);

    private UserEventConsumer[] consumers;

    public UserEventProducer(UserEventConsumer ...consumers) {
        super("UserEventProducer",64*1024, ProducerType.MULTI,new BlockingWaitStrategy());
        this.consumers = consumers;
    }

    @Override
    public EventHandlerGroup<EventWrapper<UserEvent>> initEventHandlerGroup(Disruptor<EventWrapper<UserEvent>> disruptor) {
        return disruptor.handleEventsWithWorkerPool(consumers);
    }
}
