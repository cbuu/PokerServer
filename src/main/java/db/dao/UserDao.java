package db.dao;

import db.model.User;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.MorphiaIterator;
import utils.GameConstant;

/**
 * Created by iori on 2017/4/2.
 */
public class UserDao extends Dao {
    public UserDao(Datastore datastore) {
        super(datastore);
    }

    public boolean isRegistered(String username){
        MorphiaIterator iterator = datastore.createQuery(User.class).field("username").equal(username).fetch();
        return iterator.hasNext();
    }

    public void register(String username,String password){
        User user = new User(username,password, GameConstant.USER_ORIGIN_MONEY);
        datastore.save(user);
    }

    public User getUserByUsername(String username){
        MorphiaIterator iterator = datastore.createQuery(User.class).field("username").equal(username).fetch();
        User user = null;
        if (iterator.hasNext()){
            user = (User)iterator.next();
        }
        return user;
    }
}
