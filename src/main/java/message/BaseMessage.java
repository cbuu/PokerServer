package message;

/**
 * Created by iori on 2017/3/17.
 */
public class BaseMessage {
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    protected int seq;
    protected int type;
    protected String msg;

    public BaseMessage(int seq){
        this.seq = seq;
    }
}
