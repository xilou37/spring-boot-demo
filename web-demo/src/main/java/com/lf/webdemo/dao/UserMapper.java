package com.lf.webdemo.dao;

import com.lf.webdemo.entity.User;

/**
 * Description:
 *
 * @Author lf
 * @Create 2023/3/1 0001 17:58
 * @Version 1.0
 */
public interface UserMapper {
    public User selectById(String id);
}
