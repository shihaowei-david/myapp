package person.shw.myapp.module.user.dto.resp;

import java.io.Serializable;

/**
 * @author shihaowei
 * @date 2020/8/20 11:58 上午
 */
public class UserInfoRespDTO implements Serializable {

    private Long id;
    private String name;
    private String hobby;
    private String job;
    private Long age;


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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfoRespDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
