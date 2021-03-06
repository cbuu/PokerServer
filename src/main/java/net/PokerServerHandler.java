package net;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import logic.Router;

import java.util.Locale;

/**
 * Created by iori on 2017/3/11.
 */

public class PokerServerHandler extends SimpleChannelInboundHandler<WebSocketFrame> {


    public PokerServerHandler(){

    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, WebSocketFrame frame) throws Exception {
        // ping and pong frames already handled

        ClientProxy proxy = new ClientProxy(ctx);

        if (frame instanceof TextWebSocketFrame) {
            // Send the uppercase string back.

            String request = ((TextWebSocketFrame) frame).text();
            System.out.println(request);

            Router.route(proxy,request);
        } else {
            String message = "unsupported frame type: " + frame.getClass().getName();
            throw new UnsupportedOperationException(message);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        ctx.close();
    }
}
