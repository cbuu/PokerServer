package logic.game.common;

/**
 * Created by Administrator on 2017/3/31.
 */
public class CardGroup {
    private Poker[] pokers ;

    public void reset(){
        pokers = new Poker[55];
        for (int i = 1 ;i <=54 ; i++){
            pokers[i]=Poker.createAPoker(i);
        }
    }
}
