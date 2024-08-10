package com.jdc.jsb.javaspringboot.service.impl;

import com.jdc.jsb.javaspringboot.mapper.UserMapper;
import com.jdc.jsb.javaspringboot.pojo.User;
import com.jdc.jsb.javaspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
