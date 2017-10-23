package com.bcj.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String addStudent(){
		
		return "new Student";
	}

}
