package com.bcj.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcj.creditcard.service.CustomerService;





public class CustomerController {
	
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CustomerService custService = (CustomerService)context.getBean("custService");
		System.out.println(custService);
		
		
		custService.generateCreditCard();
		
		
		
	}
	
	
}
