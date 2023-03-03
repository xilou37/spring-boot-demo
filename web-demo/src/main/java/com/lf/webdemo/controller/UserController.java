package com.lf.webdemo.controller;

import com.lf.webdemo.entity.User;
import com.lf.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author lf
 * @Create 2023/3/1 0001 12:00
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/{id}")
    public User hello(@PathVariable("id") String id){
        return userService.selectById(id);
    }
}
