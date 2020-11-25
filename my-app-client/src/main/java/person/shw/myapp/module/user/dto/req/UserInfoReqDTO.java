package person.shw.myapp.module.user.dto.req;

import java.io.Serializable;

/**
 * @author shihaowei
 * @date 2020/8/20 11:56 上午
 */
public class UserInfoReqDTO implements Serializable {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfoReqDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
