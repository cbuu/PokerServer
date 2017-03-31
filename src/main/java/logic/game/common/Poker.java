package logic.game.common;

/**
 * Created by iori on 2017/3/17.
 */
public class Poker {

    public static final int Joker = 4;
    public static final int Spade = 3;
    public static final int Heart = 2;
    public static final int Club  = 1;
    public static final int Diamond = 0;


    public static final int JOKER_BIG = 2;
    public static final int JOKER_SMALL = 1;

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    private int suit;
    private int point;


    public Poker(){
    }

    public static Poker createAPoker(int num){
        Poker poker = new Poker();
        poker.setSuit((int)num/13);
        poker.setPoint(num%13);

        return poker;
    }

}
