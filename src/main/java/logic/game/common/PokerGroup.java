package logic.game.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/31.
 */
public class PokerGroup {
    private List<Poker> pokers;

    public void reset(){
        pokers = new ArrayList<Poker>();
        for (int i = 1 ;i <=54 ; i++){
            pokers.add(Poker.createAPoker(i));
        }
    }

    public boolean isOver(){
        return pokers.isEmpty();
    }
    public Poker getAPoker(){
        Poker poker = null;
        if (!pokers.isEmpty()){
            int index = (int)(Math.random() * pokers.size());
            poker = pokers.get(index);
            pokers.remove(index);
        }
        return poker;
    }
}
