package logic.message.request;

/**
 * Created by iori on 2017/3/17.
 */
public class BaseRequest {

    private String from;
    private long sessionId;
    private int reqId;

    public BaseRequest(){}

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }
}
