package logic.task;

import com.alibaba.fastjson.JSONObject;
import logic.message.DataPack;

/**
 * Created by iori on 2017/3/17.
 */
public class TaskFactory {

    interface EMessage{
        int TYPE_CREATE_ROOM = 1;
        int TYPE_ENTER_ROOM = 2;
        int TYPE_REGISTER = 3;
        int TYPE_LOGIN = 4;
    }

    private static final String PACKAGE_PREFIX = "logic.message.request.";

    public static ILogicTask createTask(DataPack dataPack){

        ILogicTask task = null;
        String classType = dataPack.getClassType();
        String msg = dataPack.getBaseMessage();
        try {
            Class c = Class.forName(PACKAGE_PREFIX + classType);
            task = (ILogicTask) JSONObject.parseObject(msg,c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return task;
    }
}
