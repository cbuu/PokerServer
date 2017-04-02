package logic.message.request;

import io.netty.channel.ChannelHandlerContext;
import logic.task.ILogicTask;

/**
 * Created by iori on 2017/4/2.
 */
public class StartRequest extends BaseRequest implements ILogicTask {
    public void run(ChannelHandlerContext ctx) {
        
    }
}
