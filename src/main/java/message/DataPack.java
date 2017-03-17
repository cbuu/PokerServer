package message;

/**
 * Created by Administrator on 2017/3/17.
 */
public class DataPack {
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

    public String getBaseMessage() {
        return baseMessage;
    }

    public void setBaseMessage(String baseMessage) {
        this.baseMessage = baseMessage;
    }

    private int seq;
    private int type;
    private String baseMessage;

    public DataPack(){

    }

}
