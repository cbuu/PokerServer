package logic.message.request;

import db.dao.DaoFactory;
import db.dao.RoomDao;
import db.model.Room;
import io.netty.channel.ChannelHandlerContext;
import logic.game.common.Player;
import logic.task.ILogicTask;
import utils.Log;

/**
 * Created by iori on 2017/3/26.
 */
public class EnterRoomRequest extends BaseRequest implements ILogicTask {

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String roomId;
    private String password;

    public void run(ChannelHandlerContext ctx) {

        RoomDao roomDao = DaoFactory.createRoomDao();
        if (roomDao.hasRoom(roomId)) {
            Room room = roomDao.getRoom(roomId);
            if (password.equals(room.getPassword())) {
                Log.d("验证通过，进入房间");
                Player player = new Player();
            }
        } else {
            Log.d("验证失败");
        }
    }
}
