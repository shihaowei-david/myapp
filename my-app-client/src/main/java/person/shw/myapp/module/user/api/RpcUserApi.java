package person.shw.myapp.module.user.api;

import person.shw.myapp.module.user.dto.req.UserInfoReqDTO;
import person.shw.myapp.module.user.dto.resp.UserInfoRespDTO;

/**
 * @author shihaowei
 * @date 2020/7/31 5:46 下午
 */
public interface RpcUserApi {

    String DUBBO_VERSION = "1.0";

    /**
     * 通过id获取用户名字
     * @param id
     * @return
     */
    String getUsernameById(Integer id);

    /**
     * 通过id获取用户年龄
     * @param id
     * @return
     */
    Integer getAgeById(Integer id);

    /**
     * 获取用户信息
     * @param request
     * @return
     */
    UserInfoRespDTO getUserInfo(UserInfoReqDTO request);
}
