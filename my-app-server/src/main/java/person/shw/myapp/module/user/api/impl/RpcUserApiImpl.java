package person.shw.myapp.module.user.api.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import person.shw.myapp.module.user.api.RpcUserApi;
import person.shw.myapp.module.user.dto.req.SeqIdReqDTO;
import person.shw.myapp.module.user.dto.req.UserInfoReqDTO;
import person.shw.myapp.module.user.dto.resp.UserInfoRespDTO;
import person.shw.myapp.module.user.service.UserService;
import person.shw.springboot.plugin.gateway.annotation.GatewayAPI;

/**
 * @author shihaowei
 * @date 2020/7/31 5:51 下午
 */
@Service(version = RpcUserApi.DUBBO_VERSION)
public class RpcUserApiImpl implements RpcUserApi {

    @Autowired
    private UserService userService;

    @GatewayAPI(path = "/user/getUsernameById",retries = 2)
    public String getUsernameById(SeqIdReqDTO reqDTO) {
        return userService.getUsernameById(reqDTO);
    }

    @GatewayAPI(path = "/user/getAgeById",retries = 2)
    public Integer getAgeById(Integer id) {
        return userService.getAgeById(id);
    }

    @GatewayAPI(path = "/user/getUserInfo")
    public UserInfoRespDTO getUserInfo(UserInfoReqDTO request) {
        return userService.getUserInfo(request);
    }

    @Override
    @GatewayAPI(path = "/user/getString")
    public String getString(String text) {
        return text;
    }


}
