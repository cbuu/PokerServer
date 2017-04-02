package logic.game;

import logic.game.StateMachine.IOStateMachine;
import logic.game.common.Player;
import logic.game.common.PokerGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Game{

    public static final int MAX_USER = 5;

    private String roomId;

    private PokerGroup pokerGroup;
    private IOStateMachine stateMachine;
    private ArrayList<Player> players;

    public Game() {
        pokerGroup = new PokerGroup();
    }

    public void init(String roomId){
        this.roomId = roomId;
        pokerGroup.reset();
        players = new ArrayList<Player>();
        stateMachine = new IOStateMachine(this);
    }

    public void startLogic(){
        stateMachine.start();
    }

    public PokerGroup getPokerGroup(){
        return pokerGroup;
    }

    public boolean addPlayer(Player player){

        return true;
    }
}
