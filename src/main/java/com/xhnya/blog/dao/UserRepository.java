package com.xhnya.blog.dao;

import com.xhnya.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xhn
 * @data 2020/11/15 - 20:02
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
