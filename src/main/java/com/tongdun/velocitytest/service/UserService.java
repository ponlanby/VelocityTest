package com.tongdun.velocitytest.service;

import com.tongdun.velocitytest.model.User;
import java.util.List;

/**
 * Created by trc on 16/12/14.
 */
public interface UserService {
    User getUser(String userId);
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(String userId);
}
