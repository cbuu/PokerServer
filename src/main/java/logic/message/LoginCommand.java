package logic.message;

import io.netty.channel.ChannelHandlerContext;
import logic.task.ILogicTask;

/**
 * Created by iori on 2017/4/2.
 */
public class LoginCommand extends BaseCommand implements ILogicTask{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void run(ChannelHandlerContext ctx) {

    }
}
