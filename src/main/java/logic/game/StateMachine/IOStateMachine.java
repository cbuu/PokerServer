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

    public IOState getCurState() {
        return curState;
    }

    public IOState getPreState() {
        return preState;
    }

    public void start(){
        preState = null;
        curState = new IOStateInit(game);
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
