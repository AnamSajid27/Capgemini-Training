package com.Q8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class loginController {

    @RequestMapping("/login.html")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        return  modelAndView;
    }
}
