package logic.game.StateMachine;

import logic.game.Game;

/**
 * Created by iori on 2017/4/2.
 */
public abstract class IOState {

    public enum StateType{
        Init,
        Ready,
        Start,
        Deal,
        BettingOne,
        Exchange,
        BettingTow,
        Clear,
        End,
    }

    private Game game;

    public Game getGame() {
        return game;
    }

    public IOState(Game game) {
        this.game = game;
    }

    public abstract StateType getType();
    public abstract void enter();
    public abstract void run();
    public abstract IOState exit();
}
