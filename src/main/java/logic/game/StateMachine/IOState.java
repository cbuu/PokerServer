package logic.game.StateMachine;

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

    public abstract StateType getType();
    public abstract void enter();
    public abstract void run();
    public abstract IOState exit();
}
