package com.lf.webdemo.service.impl;

import com.lf.webdemo.dao.UserMapper;
import com.lf.webdemo.entity.User;
import com.lf.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author lf
 * @Create 2023/3/1 0001 18:04
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectById(String id) {
        return userMapper.selectById(id);
    }
}
