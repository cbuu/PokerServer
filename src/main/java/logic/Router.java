package logic;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import logic.handler.HandlerFactory;
import logic.handler.ILogicHandler;
import message.BaseMessage;

/**
 * Created by iori on 2017/3/17.
 */
public class Router {


    public Router(){

    }

    public void route(ChannelHandlerContext ctx,String json){
        BaseMessage baseMessage = JSON.parseObject(json,BaseMessage.class);

        ILogicHandler handler = HandlerFactory.createHandler(ctx,baseMessage.getType());

        handler.run(ctx,baseMessage);
    }
}
