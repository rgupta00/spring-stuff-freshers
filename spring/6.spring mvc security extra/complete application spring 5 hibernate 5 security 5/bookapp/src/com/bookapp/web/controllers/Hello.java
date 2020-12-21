package com.bookapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

	@RequestMapping(value="hello", method=RequestMethod.GET)
	public ModelAndView hello(ModelAndView mv){
		mv.setViewName("hello");
		return mv;
	}
}
