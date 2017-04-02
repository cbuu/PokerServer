package logic.message;

import db.dao.DaoFactory;
import db.dao.RoomDao;
import db.model.Room;
import io.netty.channel.ChannelHandlerContext;
import logic.task.ILogicTask;
import utils.Log;

/**
 * Created by iori on 2017/3/26.
 */
public class EnterRoomCommand extends BaseCommand implements ILogicTask {

    private String roomId;
    private String password;

    public void run(ChannelHandlerContext ctx) {

        RoomDao roomDao = DaoFactory.createRoomDao();
        if (roomDao.hasRoom(roomId)) {
            Room room = roomDao.getRoom(roomId);
            if (password.equals(room.getPassword())) {
                Log.d("验证通过，进入房间");
            }
        } else {
            Log.d("验证失败");
        }
    }
}
