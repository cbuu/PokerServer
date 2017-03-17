package core;

import com.alibaba.fastjson.JSON;
import logic.Router;
import message.BaseMessage;
import message.CreateRoomMessage;
import message.DataPack;
import model.Poker;
import net.PokerServer;
import utils.Log;

/**
 * Created by iori on 2017/3/16.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
//        PokerServer server = new PokerServer();
//        server.start();
        test();
    }

    public static void test(){
        Router router = new Router();
        String a = "{\"baseMessage\":\"{\\\"from\\\":\\\"iori\\\",\\\"password\\\":\\\"wocao\\\",\\\"roomId\\\":\\\"123\\\"}\",\"seq\":1,\"type\":1}";
        router.route(null,a);
        CreateRoomMessage message = new CreateRoomMessage();
        message.setRoomId("123");
        message.setPassword("wocao");
        message.setFrom("iori");

        DataPack dataPack = new DataPack();
        dataPack.setType(1);
        dataPack.setSeq(1);
        dataPack.setBaseMessage(JSON.toJSONString(message));

        Log.d(JSON.toJSONString(dataPack));
    }
}
