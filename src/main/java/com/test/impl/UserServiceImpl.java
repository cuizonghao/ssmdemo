package com.test.impl;

import com.test.dao.UserDao;
import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ahao
 * @date 2019-06-07 22:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }
}
