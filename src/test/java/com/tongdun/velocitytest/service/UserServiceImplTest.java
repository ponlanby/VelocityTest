package com.tongdun.velocitytest.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tongdun.velocitytest.model.User;
/**
 * Created by trc on 16/12/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUserTest(){
        User user = userService.getUser("1");
        Assert.assertNotNull(user);
    }
}
