package person.shw.myapp.module.user.dto.req;

import java.util.Map;

/**
 * @author shihaowei
 * @date 2021/1/16 下午10:43
 * @slogan 天下风云出我辈, 一入代码岁月催
 */

public class RequestDTO {

    private String requestToken;

    private Long requestTraceId;

    private Long requestUserId;

    private Map<String,String> extMetadata;

    public String getRequestToken() {
        return requestToken;
    }

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    public Long getRequestTraceId() {
        return requestTraceId;
    }

    public void setRequestTraceId(Long requestTraceId) {
        this.requestTraceId = requestTraceId;
    }

    public Long getRequestUserId() {
        return requestUserId;
    }

    public void setRequestUserId(Long requestUserId) {
        this.requestUserId = requestUserId;
    }

    public Map<String, String> getExtMetadata() {
        return extMetadata;
    }

    public void setExtMetadata(Map<String, String> extMetadata) {
        this.extMetadata = extMetadata;
    }
}
