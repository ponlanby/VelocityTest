package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by trc on 16/12/13.
 */

@Controller
public class UsersController {
    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public String showUser(){
        //1.调用BLL层的服务接口
        //2.设置模型数据
        //3.返回逻辑视图名称
        return "showUser";
    }
}
