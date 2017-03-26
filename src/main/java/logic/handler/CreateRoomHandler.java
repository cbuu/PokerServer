package logic.handler;

import com.alibaba.fastjson.JSON;
import db.dao.DaoFactory;
import db.dao.RoomDao;
import db.model.Room;
import io.netty.channel.ChannelHandlerContext;
import message.BaseMessage;
import message.CreateRoomMessage;
import utils.Log;

/**
 * Created by iori on 2017/3/17.
 */
public class CreateRoomHandler implements ILogicHandler {

    public void run(ChannelHandlerContext ctx, String msg) {
        CreateRoomMessage message = (CreateRoomMessage) parseMessage(msg);

        String roomid = message.getRoomId();
        String password = message.getPassword();
        int ante = message.getAnte();

        RoomDao roomDao = DaoFactory.createRoomDao();
        if (roomDao.hasRoom(roomid)){
            Log.d("房间已存在");
        }else {
            roomDao.create(roomid,password,ante);
            Log.d("房间创建成功");
        }

    }

    public BaseMessage parseMessage(String msg) {
        return JSON.parseObject(msg,CreateRoomMessage.class);
    }
}
