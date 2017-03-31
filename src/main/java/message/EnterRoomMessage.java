package message;

/**
 * Created by iori on 2017/3/26.
 */
public class EnterRoomMessage extends BaseMessage {

    private String roomId;
    private String password;


    public EnterRoomMessage(String roomId, String password) {
        this.roomId = roomId;
        this.password = password;
    }

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


}
