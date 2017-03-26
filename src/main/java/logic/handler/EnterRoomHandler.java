package logic.handler;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandlerContext;
import message.EnterRoomMessage;

/**
 * Created by iori on 2017/3/26.
 */
public class EnterRoomHandler implements ILogicHandler<EnterRoomMessage> {


    public void run(ChannelHandlerContext ctx, String msg) {

    }

    public EnterRoomMessage parseMessage(String msg) {
        return JSONObject.parseObject(msg,EnterRoomMessage.class);
    }
}
