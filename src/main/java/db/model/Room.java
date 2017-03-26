package db.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by iori on 2017/3/16.
 */
@Entity
public class Room {

    @Id
    private String roomId;
    private String password;

    private int ante;

    public String getRoomId() {
        return roomId;
    }

    public String getPassword() {
        return password;
    }

    public int getAnte() {
        return ante;
    }

    public Room(String roomId, String password, int ante) {
        this.roomId = roomId;
        this.password = password;
        this.ante = ante;
    }

}
