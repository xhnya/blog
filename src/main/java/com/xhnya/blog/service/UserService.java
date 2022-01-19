package com.xhnya.blog.service;

import com.xhnya.blog.po.User;

/**
 * @author xhn
 * @data 2020/11/15 - 19:46
 */
public interface UserService {

    User checkUser(String username, String password);

}
