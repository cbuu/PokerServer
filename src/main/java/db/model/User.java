package db.model;

import org.mongodb.morphia.annotations.Entity;

/**
 * Created by iori on 2017/3/17.
 */
@Entity
public class User {

    private String username;
    private String password;
    private int money;

    public User(String username, String password, int money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }
}
