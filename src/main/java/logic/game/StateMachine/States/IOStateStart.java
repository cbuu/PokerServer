package logic.game.StateMachine.States;

import logic.game.Game;
import logic.game.StateMachine.IOState;

/**
 * Created by iori on 2017/4/2.
 */
public class IOStateStart extends IOState {
    public IOStateStart(Game game) {
        super(game);
    }

    public StateType getType() {
        return StateType.Start;
    }

    public void enter() {

    }

    public void run() {

    }

    public IOState exit() {
        return null;
    }
}
