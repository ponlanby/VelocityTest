package com.tongdun.velocitytest.service.impl;

import com.tongdun.velocitytest.mapper.UserMapper;
import com.tongdun.velocitytest.service.*;
import com.tongdun.velocitytest.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by trc on 16/12/14.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId){
        return this.userMapper.getUser(userId);
    }

    public List<User> getAllUsers(){
        return this.userMapper.getAllUsers();
    }

    public void addUser(User user){
        this.userMapper.addUser(user.getName(), user.getAge());
    }

    public void deleteUser(String userId){
        this.userMapper.deleteUser(userId);
    }
}
