package logic.handler;

import io.netty.channel.ChannelHandlerContext;
import message.BaseMessage;

/**
 * Created by iori on 2017/3/17.
 */
public interface ILogicHandler<T extends BaseMessage> {

    void run(ChannelHandlerContext ctx,String msg);
    T parseMessage(String msg);
}
