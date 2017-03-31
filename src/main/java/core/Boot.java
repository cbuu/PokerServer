package core;

import db.DBCore;
import logic.Router;
import logic.game.GameManager;

/**
 * Created by iori on 2017/3/16.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
        DBCore.getInstance().init();
        GameManager.getInstance().init();
//        PokerServer server = new PokerServer();
//        server.start();

        test();
    }

    public static void test(){
        String msg = "{'seq':1,'type':1,'baseMessage':{'from':'nima','roomId':'wocao','password':'nimei','ante':1000}}";
        Router router = new Router();
        router.route(null,msg);
    }
}
