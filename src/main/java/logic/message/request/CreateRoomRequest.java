package logic.message.request;

import db.dao.DaoFactory;
import db.dao.RoomDao;
import io.netty.channel.ChannelHandlerContext;
import logic.game.Game;
import logic.game.GameManager;
import logic.task.ILogicTask;
import net.ClientProxy;
import utils.Log;

/**
 * Created by iori on 2017/3/17.
 */
public class CreateRoomRequest extends BaseRequest implements ILogicTask {

    private String roomId;
    private String password;
    private int ante;

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    public void run(ClientProxy proxy) {

        RoomDao roomDao = DaoFactory.createRoomDao();
        if (roomDao.hasRoom(roomId)){
            Log.d("房间已存在");
        }else {
            roomDao.create(roomId,password,ante);
            Game game = GameManager.getInstance().createAndInitGame(roomId);
            game.startLogic();
            Log.d("房间创建成功");
        }
    }

}
