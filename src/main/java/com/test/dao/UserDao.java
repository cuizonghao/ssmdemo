package com.test.dao;


import com.test.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User findUserById(@Param("userId")String userId);
}
