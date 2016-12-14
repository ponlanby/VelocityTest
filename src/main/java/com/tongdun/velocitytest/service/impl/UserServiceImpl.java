package com.tongdun.velocitytest.service.impl;

import com.tongdun.velocitytest.mapper.UserMapper;
import com.tongdun.velocitytest.service.*;
import com.tongdun.velocitytest.module.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by trc on 16/12/14.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId){
        return this.userMapper.getUser(userId);
    }
}
