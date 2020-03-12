package com.thinrain.mavenmulti.userdao;

import com.thinrain.mavenmulti.userdomain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  liyao
 * @date  2020/3/12 14:41
 * @version 1.0
 */
@Repository
public class UserDao {
    public List<User> query() {
        List<User> result = new ArrayList<User>();
        User user1 = new User(1, "zhangsan", "zhangsan123");
        User user2 = new User(1, "lisi", "lisi123");

        result.add(user1);
        result.add(user2);
        return result;
    }
}
