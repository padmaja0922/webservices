package com.bcj.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bcj.springboot.entity.Student;
import com.bcj.springboot.service.StudentService;



@RestController
public class StudentController {
	
	
	@Autowired
	StudentService stuService;
	
	final static Logger logger = Logger.getLogger(StudentController.class);
	
	@RequestMapping(value = "student", method = RequestMethod.GET)
	 public String  testMethod(){
		
		return "sucess";
	}
	
	@RequestMapping(value = "student/new", method = RequestMethod.POST)
	
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		
		System.out.println("controller");
		
	boolean result = stuService.addStudent(student);
		
		 if (result == false) 
     	    return new ResponseEntity<Student>(HttpStatus.CONFLICT);
             
		 else{
             HttpHeaders headers = new HttpHeaders();
             //headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
             return new ResponseEntity<Student>(headers, HttpStatus.CREATED);
		
		 }
		
		
		//logger.debug("Added: " + student);
		
	
	

	}
}
