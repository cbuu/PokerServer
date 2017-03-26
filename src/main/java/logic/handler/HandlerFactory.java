package logic.handler;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import message.CreateRoomMessage;
import message.DataPack;

/**
 * Created by iori on 2017/3/17.
 */
public class HandlerFactory {

    interface EMessage{
        int TYPE_CREATE_ROOM = 1;
        int TYPE_ENTER_ROOM = 2;
    }

    public static ILogicHandler createHandler(ChannelHandlerContext ctx, DataPack dataPack){

        ILogicHandler handler = null;
        switch (dataPack.getType()){
            case EMessage.TYPE_CREATE_ROOM:
                handler = new CreateRoomHandler();
                break;
        }
        return handler;
    }
}
