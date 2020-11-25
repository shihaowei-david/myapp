package person.shw.myapp.module.user.service;

import person.shw.myapp.module.user.dto.req.UserInfoReqDTO;
import person.shw.myapp.module.user.dto.resp.UserInfoRespDTO;

/**
 * @author shihaowei
 * @date 2020/7/31 5:57 下午
 */
public interface UserService {

    String getUsernameById(Integer id);

    Integer getAgeById(Integer id);

    UserInfoRespDTO getUserInfo(UserInfoReqDTO request);
}
