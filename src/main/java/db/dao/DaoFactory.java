package db.dao;

import db.DBCore;
import org.mongodb.morphia.Datastore;

/**
 * Created by iori on 2017/3/26.
 */
public class DaoFactory {

    public static RoomDao createRoomDao(){
        return new RoomDao(getDatastore());
    }

    public static UserDao createUserDao(){
        return new UserDao(getDatastore());
    }

    private static Datastore getDatastore(){
        return DBCore.getInstance().getDatastore();
    }
}
