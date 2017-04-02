package logic.message;

/**
 * Created by Administrator on 2017/3/17.
 */
public class DataPack {

    public String getClassType() {
        return classType;
    }

    public String getBaseMessage() {
        return baseMessage;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public void setBaseMessage(String baseMessage) {
        this.baseMessage = baseMessage;
    }

    private String classType;
    private String baseMessage;

    public DataPack(){
    }

}
