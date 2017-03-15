package core;

import net.PokerServer;

/**
 * Created by iori on 2017/3/16.
 */
public class Boot {
    public static void main(String[] args) throws Exception {
        PokerServer server = new PokerServer();
        server.start();
    }
}
