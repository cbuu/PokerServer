package logic.message.request;

import db.dao.DaoFactory;
import db.dao.UserDao;
import db.model.User;
import io.netty.channel.ChannelHandlerContext;
import logic.task.ILogicTask;
import utils.Log;
import utils.SessionIdGen;

/**
 * Created by iori on 2017/4/2.
 */
public class LoginRequest extends BaseRequest implements ILogicTask{

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
            Log.d("用户存在");
            User user = userDao.getUserByUsername(username);
            if (user.getPassword().equals(password)){
                Log.d("登录成功");

            }else {
                Log.d("登录失败s");
            }
        }else {
            Log.d("用户不存在");
        }
    }
}
