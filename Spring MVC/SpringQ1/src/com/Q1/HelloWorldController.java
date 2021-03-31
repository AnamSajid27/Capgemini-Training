package com.Q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sun.net.www.content.text.plain;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/index")
	public ModelAndView indexView() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping("/HelloWorld")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("helloWorld");
		return model;
	}

}
