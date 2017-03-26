package db.dao;

import db.DBCore;

/**
 * Created by iori on 2017/3/26.
 */
public class DaoFactory {

    public static RoomDao createRoomDao(){
        return new RoomDao(DBCore.getInstance().getDatastore());
    }
}
