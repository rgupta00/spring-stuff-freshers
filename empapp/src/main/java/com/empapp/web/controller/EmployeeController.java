package com.empapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@GetMapping(path="hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hello");
		mv.addObject("data", "string mvc hello world");
		return mv;
	}
}
