package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/find")
    public String test(Model model){
        User user = new User();
        user.setUsername("如花");
        user.setAge(23);
        user.setDate( new Date());
        model.addAttribute(user);
        return "success";
    }
}
