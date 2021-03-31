package com.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class simpleInterestController {
	
	@RequestMapping(value="/simpleIntrestCalculator",method = RequestMethod.GET)
	public ModelAndView simpleIntrest() {
		ModelAndView modelAndView = new ModelAndView("simpleInterest");
		return modelAndView;
	}
	
	@RequestMapping(value="/calculateSI.html",method=RequestMethod.POST)
	public ModelAndView calculateSI(@ModelAttribute("SI")SICalculator SI) {
		ModelAndView modelAndView = new ModelAndView("simpleInterestView");
		double msg = SI.ROICal();
		modelAndView.addObject("msg",msg);
		return modelAndView;
		
	}

}
