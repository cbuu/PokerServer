package db.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

/**
 * Created by iori on 2017/3/26.
 */
public class Dao{
    protected Datastore datastore;

    public Dao(Datastore datastore) {
        this.datastore = datastore;
    }
}
