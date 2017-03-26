package db.dao;

import db.model.Room;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.MorphiaIterator;
import org.mongodb.morphia.query.MorphiaKeyIterator;

/**
 * Created by iori on 2017/3/26.
 */
public class RoomDao extends Dao{

    public RoomDao(Datastore datastore) {
        super(datastore);
    }

    public boolean hasRoom(String roomId){
        MorphiaIterator iterator = datastore.createQuery(Room.class).field("roomId").equal(roomId).fetch();
        return iterator.hasNext();
    }

    public void create(String roomId,String password,int ante){
        Room room = new Room(roomId,password,ante);
        datastore.save(room);
    }

    public Room getRoom(String roomId){
        MorphiaIterator iterator = datastore.createQuery(Room.class).field("roomId").equal(roomId).fetch();
        if (iterator.hasNext()){
            Room room = (Room) iterator.next();
            return room;
        }
        return null;
    }
}
