package logic;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import logic.handler.HandlerFactory;
import logic.handler.ILogicHandler;
import message.BaseMessage;
import message.DataPack;

/**
 * Created by iori on 2017/3/17.
 */
public class Router {


    public Router(){

    }

    public void route(ChannelHandlerContext ctx,String json){
        DataPack dataPack = JSON.parseObject(json, DataPack.class);
        ILogicHandler handler = HandlerFactory.createHandler(ctx,dataPack);
        handler.run(ctx,dataPack.getBaseMessage());
    }
}
