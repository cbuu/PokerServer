package message;

/**
 * Created by iori on 2017/3/17.
 */
public class CreateRoomMessage extends BaseMessage {

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAnte() {
        return ante;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    private String roomId;
    private String password;
    private int ante;

    public CreateRoomMessage() {
        super();
    }
}
