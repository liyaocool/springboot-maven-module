package com.thinrain.mavenmulti.userweb;

import com.thinrain.mavenmulti.userdomain.User;
import com.thinrain.mavenmulti.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author  liyao
 * Date  2020/3/12 15:00
 * Version 1.0
 * Description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> queryUer() {
        return userService.query();
    }
}
