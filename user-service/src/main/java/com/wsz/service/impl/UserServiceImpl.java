package com.wsz.service.impl;

import com.test.entity.User;
import com.wsz.mapper.UserMapper;
import com.wsz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUserById(uid);
    }
}
