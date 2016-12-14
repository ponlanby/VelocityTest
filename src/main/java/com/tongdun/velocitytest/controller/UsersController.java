package com.tongdun.velocitytest.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tongdun.velocitytest.service.UserService;
import com.tongdun.velocitytest.model.User;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

import javax.annotation.Resource;

/**
 * Created by trc on 16/12/13.
 */

@Controller
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String showUser(@RequestParam("id") String id, ModelMap modelMap){
        //1.调用BLL层的服务接口
        User user = userService.getUser(id);
        //2.设置模型数据
        modelMap.put("user", user);
        //3.返回逻辑视图名称
        return "showUser";
    }

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public String allUsers(ModelMap modelMap){
        List<User> users = userService.getAllUsers();
        modelMap.put("users", users);
        return "allUsers";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(@RequestParam("name")String userName, @RequestParam("age")String userAge, ModelMap modelMap){
        User user = new User();
        user.setName(userName);
        user.setAge(userAge);
        userService.addUser(user);
        return "redirect:/allUsers";
    }

    @RequestMapping(value = "deleteUser", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id")String userId, ModelMap modelMap){
        userService.deleteUser(userId);
        return "redirect:/allUsers";
    }
}
