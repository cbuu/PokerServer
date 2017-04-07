package logic.task;

import io.netty.channel.ChannelHandlerContext;
import net.ClientProxy;

/**
 * Created by iori on 2017/3/17.
 */
public interface ILogicTask {

    void run(ClientProxy proxy);
}
