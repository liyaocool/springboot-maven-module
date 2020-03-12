package com.thinrain.mavenmulti.userdomain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author  liyao
 * Date  2020/3/12 14:35
 * Version 1.0
 * Description
 */
@Data
@AllArgsConstructor
public class User {
    long id;
    String userName;
    String password;
}
