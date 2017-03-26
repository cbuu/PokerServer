package db;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by iori on 2017/3/26.
 */
public class DBCore {

    private Morphia morphia;

    public DBCore() {
    }

    private static DBCore mInstance;
    private Datastore datastore;

    public static DBCore getInstance(){
        if (mInstance == null){
            mInstance = new DBCore();
        }

        return mInstance;
    }

    public boolean init(){
        morphia = new Morphia();

        morphia.mapPackage("db.common");

        //创建datastore，并连接到指定数据库
//datastore有两个参数，第一个用来连接到MongoDB，第二个是数据库的名字。
        datastore = morphia.createDatastore(new MongoClient(), "poker");
        datastore.ensureIndexes();

        return true;
    }

    public Datastore getDatastore() {
        return datastore;
    }
}
