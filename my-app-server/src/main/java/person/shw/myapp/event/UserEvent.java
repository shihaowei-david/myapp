package person.shw.myapp.event;

/**
 * @author shihaowei
 * @date 2020/9/30 4:25 下午
 */

public class UserEvent {

    private Long seqId;
    private String name;

    public UserEvent(Long seqId, String name) {
        this.seqId = seqId;
        this.name = name;
    }

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEvent{" +
                "seqId=" + seqId +
                ", name='" + name + '\'' +
                '}';
    }
}
