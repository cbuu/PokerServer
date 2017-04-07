package logic.message.respond;

/**
 * Created by iori on 2017/4/2.
 */
public class BaseRespond {

    private int ret;
    private int reqId;

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public BaseRespond(int reqId, int ret) {
        this.ret = ret;
        this.reqId = reqId;
    }
}
