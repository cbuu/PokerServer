package logic.message.request;

import db.dao.DaoFactory;
import db.dao.UserDao;
import io.netty.channel.ChannelHandlerContext;
import logic.task.ILogicTask;
import utils.Log;

/**
 * Created by iori on 2017/4/2.
 */
public class RegisterRequest extends BaseRequest implements ILogicTask{

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;


    public void run(ChannelHandlerContext ctx) {

        UserDao userDao = DaoFactory.createUserDao();
        if (userDao.isRegistered(username)){
            Log.d("用户已存在");
        }else {
            userDao.register(username,password);
            Log.d("用户注册成功");
        }
    }
}
