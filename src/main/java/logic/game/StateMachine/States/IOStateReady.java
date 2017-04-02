package logic.game.StateMachine.States;

import logic.game.StateMachine.IOState;

/**
 * Created by iori on 2017/4/2.
 */
public class IOStateReady extends IOState {
    public StateType getType() {
        return StateType.Ready;
    }

    public void enter() {

    }

    public void run() {

    }

    public IOState exit() {



        return new IOStateStart();
    }
}
