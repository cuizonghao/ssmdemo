package com.test.service;

import com.test.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    public User findUserById(@Param("userId")String userId);
}
