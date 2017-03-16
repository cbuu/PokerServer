package core;

import com.alibaba.fastjson.JSON;
import model.Poker;
import net.PokerServer;

/**
 * Created by iori on 2017/3/16.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
        PokerServer server = new PokerServer();
        server.start();
//        test();
    }

    public static void test(){
        Poker poker = new Poker();
        poker.setPoint(2);
        poker.setSuit(3);

        String json = JSON.toJSONString(poker);

        System.out.println(json);

        String a = "{'point':2,'suit':5}";
        Poker p = JSON.parseObject(a,Poker.class);
        System.out.println("" + p.getPoint() + " " + p.getSuit());
    }
}
