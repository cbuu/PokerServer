package logic.game.StateMachine;

import logic.game.Game;
import logic.game.StateMachine.States.IOStateInit;

/**
 * Created by iori on 2017/4/2.
 */
public class IOStateMachine {

    private IOState preState;
    private IOState curState;

    private Game game;


    public IOStateMachine(Game game) {
        this.game = game;
    }

    public void start(){
        preState = null;
        curState = new IOStateInit();
        curState.enter();
        curState.run();
    }

    public void process(){
        preState = curState;
        curState = preState.exit();
        curState.enter();
        curState.run();
    }
}
