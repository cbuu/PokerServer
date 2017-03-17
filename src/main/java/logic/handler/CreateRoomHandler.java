package logic.handler;

import com.alibaba.fastjson.JSON;
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
        //TODO fuck
        Log.d("fuck");
    }

    public BaseMessage parseMessage(String msg) {
        return JSON.parseObject(msg,CreateRoomMessage.class);
    }
}
