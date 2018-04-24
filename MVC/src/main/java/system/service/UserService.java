package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import system.dao.UserDao;

import java.util.List;

/**
 * Created by sbt-muratov-dyu on 05.04.2018.
 */
public class UserService {

    @Autowired
    private UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUsers();
    }
}
