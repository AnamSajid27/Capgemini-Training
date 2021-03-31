package com.Q4;


import java.sql.ResultSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class userController {
	
	@Autowired
	DataBaseService dbService;
	
	@RequestMapping(value="/registration.html",method=RequestMethod.GET)
	public ModelAndView Registration() {
		ModelAndView modelAndView = new ModelAndView("registration");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/registerUser.html",method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user")UserModel user) throws Exception{
		
		       dbService.insertData(user);
	    	 
	    	   ModelAndView modelAndView = new ModelAndView("login");
	    	   return modelAndView;	
	}
	
	
	
	@RequestMapping(value ="/loginValidation.html",method = RequestMethod.POST)
	public ModelAndView loginValidation(@ModelAttribute ("user")UserModel user) throws Exception {
		 
		boolean response = dbService.getData(user);
		
		
		if(response) {
			ModelAndView modelAndView = new ModelAndView("success");
			return modelAndView;
		}
		else {
			ModelAndView modelAndView = new ModelAndView("error");
			return modelAndView;
		}
		
	
	}
	
	
	
		

}
