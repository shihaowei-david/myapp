package person.shw.myapp.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import person.shw.springboot.plugin.eventqueue.consumer.AbstractEventConsumer;

/**
 * @author shihaowei
 * @date 2020/9/30 4:39 下午
 */
public class UserEventConsumer extends AbstractEventConsumer<UserEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(UserEventConsumer.class);

    public UserEventConsumer(int seed) {
        super("UserEventConsumer"+seed);
    }

    @Override
    public void process(UserEvent obj) throws Exception {
        LOG.info("UserEventConsumer 接受到的消息：",obj.getSeqId(),obj.getName());
        System.err.println(obj);
    }
}
