package net;

import java.util.HashMap;

/**
 * Created by iori on 2017/4/3.
 */
public class ClientManager {

    private static ClientManager mInstance = null;

    public static ClientManager getInstance(){
        if (mInstance == null){
            mInstance = new ClientManager();
        }

        return mInstance;
    }
}
