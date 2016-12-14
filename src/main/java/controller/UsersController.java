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
    @RequestMapping(value = "/showInit",method = RequestMethod.GET)
    public void showUser(HttpServletResponse response) throws IOException {
        response.getWriter().print("<h1>Hello SpringMVC</h1>");
        response.flushBuffer();
    }
}
