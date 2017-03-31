package logic.handler;

import com.alibaba.fastjson.JSONObject;
import db.dao.DaoFactory;
import db.dao.RoomDao;
import db.model.Room;
import io.netty.channel.ChannelHandlerContext;
import message.EnterRoomMessage;
import utils.Log;

/**
 * Created by iori on 2017/3/26.
 */
public class EnterRoomHandler implements ILogicHandler<EnterRoomMessage> {


    public void run(ChannelHandlerContext ctx, String msg) {
        EnterRoomMessage message = parseMessage(msg);

        String roomid = message.getRoomId();
        String password = message.getPassword();

        RoomDao roomDao = DaoFactory.createRoomDao();
        if (roomDao.hasRoom(roomid)){
            Room room = roomDao.getRoom(roomid);
            if (password.equals(room.getPassword())){
                Log.d("验证通过，进入房间");
            }
        }else {
            Log.d("验证失败");
        }
    }

    public EnterRoomMessage parseMessage(String msg) {
        return JSONObject.parseObject(msg,EnterRoomMessage.class);
    }
}
