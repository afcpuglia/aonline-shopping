package com.example.aonlineshopping.controller;

/*front controller org...DispatcherServlet is in web.xml,  the helper controller is PageController*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/index", "/home"})
	public ModelAndView index() {
		//everything will go to page.jsp because or /,home and index
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
		
	}

}
