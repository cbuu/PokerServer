package logic.game;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/3/31.
 */
public class GameManager {
    private static GameManager mInstance = null;

    public static GameManager getInstance(){
        if (mInstance == null){
            mInstance = new GameManager();
        }
        return mInstance;
    }


    private HashMap<String,Game> gameMap;

    public void init(){
        gameMap = new HashMap<String, Game>();
    }

    public Game createAndInitGame(String roomId){
        Game game = new Game();
        game.init(roomId);
        gameMap.put(roomId,game);

        return game;
    }
}
