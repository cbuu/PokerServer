package net;

import com.alibaba.fastjson.JSON;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import logic.message.respond.BaseRespond;
import utils.Log;

/**
 * Created by iori on 2017/4/3.
 */
public class ClientProxy {

    private ChannelHandlerContext ctx;

    public ClientProxy(ChannelHandlerContext ctx) {
        this.ctx = ctx;
    }

    public void send(BaseRespond respond){
        String reqStr = JSON.toJSONString(respond);
        TextWebSocketFrame tws = new TextWebSocketFrame(reqStr);
        Log.d(reqStr);
        if (ctx != null){
            ctx.writeAndFlush(tws);
        }
    }
}
