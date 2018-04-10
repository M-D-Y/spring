package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sbt-muratov-dyu on 05.04.2018.
 */
@Repository
public class UserDao {
    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user", "user"));

    public List<User> getAllUsers() {
        return users;
    }
}
