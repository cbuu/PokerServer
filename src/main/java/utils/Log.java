package utils;

/**
 * Created by iori on 2017/3/16.
 */
public class Log {

    public static void d(String msg){
        System.out.println(msg);
    }

    public static void d(String tag, String msg){
        System.out.println(tag+ " : " + msg);
    }
}
