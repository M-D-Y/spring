package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.User;
import system.service.UserService;

import java.util.List;

/**
 * Created by sbt-muratov-dyu on 05.04.2018.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
