package com.tongdun.velocitytest.controller;

import com.tongdun.velocitytest.service.UserService;
import com.tongdun.velocitytest.module.User;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
}
