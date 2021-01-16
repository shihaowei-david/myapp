package person.shw.myapp.module.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.shw.myapp.event.UserEvent;
import person.shw.myapp.event.UserEventProducer;
import person.shw.myapp.module.user.dto.req.SeqIdReqDTO;
import person.shw.myapp.module.user.dto.req.UserInfoReqDTO;
import person.shw.myapp.module.user.dto.resp.UserInfoRespDTO;
import person.shw.myapp.module.user.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Random;

/**
 * @author shihaowei
 * @date 2020/7/31 5:58 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEventProducer userEventProducer;

    public String getUsernameById(SeqIdReqDTO reqDTO) {
        return "id为==>"+reqDTO.getId()+",名字为==>"+"小明";
    }

    public Integer getAgeById(Integer id) {
        return 27;
    }

    public UserInfoRespDTO getUserInfo(UserInfoReqDTO request) {
        UserInfoRespDTO dto = new UserInfoRespDTO();
        dto.setAge(System.currentTimeMillis());
        dto.setHobby("boxing");
        dto.setId(request.getId());
        dto.setJob("coder");
        dto.setName(request.getName());
        return dto;
    }

    public void sentMsg(){
        UserEvent userEvent = new UserEvent(0001L,"叫什么都行");
        userEventProducer.publish(userEvent);
    }
}
