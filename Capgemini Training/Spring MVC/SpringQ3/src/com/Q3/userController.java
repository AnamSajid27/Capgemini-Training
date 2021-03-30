package com.Q3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class userController {
	
	@RequestMapping(value = "/login.html",method = RequestMethod.GET)
	public ModelAndView Userlogin() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/validation.html",method = RequestMethod.POST)
	public ModelAndView UserValidation(@ModelAttribute("user")UserModel user) {
		
		if(user.getUsername().equals("neeraj") && user.getPassword().equals("Neeraj@123")) {
			ModelAndView model = new ModelAndView("success");
			return model;
		}
		else {
			ModelAndView model = new ModelAndView("error");
			return model;
		}
		
		
	}

}
