package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
@Controller
@RequestMapping("/user")
public class TestModelAndView {
        @RequestMapping("/mav")
        public ModelAndView test(User user){
            ModelAndView mv = new ModelAndView();
            mv.addObject("user", user);
            System.out.println(user);
            mv.setViewName("success");
            return mv;
        }
    }
