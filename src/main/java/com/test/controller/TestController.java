package com.test.controller;

import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ahao
 * @date 2019-06-07 22:35
 */

@Controller
@RequestMapping("/user")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(User user, HttpServletRequest request){
        return userService.findUserById(user.getUserId());
    }
}
