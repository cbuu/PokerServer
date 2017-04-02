package logic.task;

import io.netty.channel.ChannelHandlerContext;

/**
 * Created by iori on 2017/3/17.
 */
public interface ILogicTask {

    void run(ChannelHandlerContext ctx);
}
