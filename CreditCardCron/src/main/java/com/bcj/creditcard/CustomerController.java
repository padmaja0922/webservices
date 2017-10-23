package com.bcj.creditcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcj.creditcard.service.CustomerService;



/**
 * 
 * @author Boot Camp User 008
 *
 * This class has main method and it gets service class object from spring.xml and calls the method in service class 
 *
 */

public class CustomerController {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		CustomerService custService1 = (CustomerService)context.getBean("custService");		
			
		custService1.generateCreditCard();
		
	}
	
	
}
