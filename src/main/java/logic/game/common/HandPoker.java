package logic.game.common;

import utils.GameConstant;

/**
 * Created by iori on 2017/4/7.
 */
public class HandPoker {

    public enum Style {
        TONG_HUA_SHUN,
        SI_TIAO,
        HU_LU,
        SHUN,
        HUA,
        SAN_TIAO,
        LIANG_DUI,
        DUI,
        NONE
    }

    private Poker[] pokers;
    private Style style;

    public boolean hasJoker(){
        for (int i = 0;i<  GameConstant.MAX_POKER_NUM;i++){
            if (pokers[i].getSuit() == Poker.Joker){
                return true;
            }
        }
        return false;
    }

    public HandPoker(Poker[] pokers) {
        this.pokers = pokers;
    }

    public static HandPoker makeReal(HandPoker handPoker){

        return null;
    }

    public Style getStyle(){
        if (style == null){
            style = analyse();
        }

        return style;
    }

    private Style analyse(){
        if (hasJoker()){

        }else {

        }

        return Style.NONE;
    }


}
