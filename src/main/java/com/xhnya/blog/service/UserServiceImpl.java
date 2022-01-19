package com.xhnya.blog.service;

import com.xhnya.blog.dao.UserRepository;
import com.xhnya.blog.po.User;
import com.xhnya.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xhn
 * @data 2020/11/15 - 19:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
