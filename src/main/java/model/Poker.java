package model;

/**
 * Created by iori on 2017/3/17.
 */
public class Poker {

    public static final int Spade = 0;
    public static final int Heart = 1;
    public static final int Club  = 2;
    public static final int Diamond = 3;
    public static final int Joker = 4;

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

}
