package logic;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import logic.task.TaskFactory;
import logic.task.ILogicTask;
import logic.message.DataPack;
import net.ClientProxy;

/**
 * Created by iori on 2017/3/17.
 */
public class Router {


    public Router(){

    }

    public static void route(ClientProxy proxy, String json){
        DataPack dataPack = JSON.parseObject(json, DataPack.class);
        ILogicTask task = TaskFactory.createTask(dataPack);
        task.run(proxy);
    }
}
