package com.thinrain.mavenmulti.userservice;

import com.thinrain.mavenmulti.userdao.UserDao;
import com.thinrain.mavenmulti.userdomain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author  liyao
 * Date  2020/3/12 14:49
 * Version 1.0
 * Description
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> query() {
        return userDao.query();
    }
}
