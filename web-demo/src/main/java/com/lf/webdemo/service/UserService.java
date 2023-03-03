package com.lf.webdemo.service;

import com.lf.webdemo.entity.User;

/**
 * Description:
 *
 * @Author lf
 * @Create 2023/3/1 0001 18:02
 * @Version 1.0
 */
public interface UserService {
    User selectById(String id);
}
