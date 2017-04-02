package utils;

/**
 * Created by iori on 2017/4/2.
 */
public class SessionIdGen {
    public static long gen(){
        return (long) (Math.random() * Long.MAX_VALUE);
    }
}
