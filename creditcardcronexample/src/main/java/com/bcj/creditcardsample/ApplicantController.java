package com.bcj.creditcardsample;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bcj.creditcardsample.service.ApplicantService;



public class ApplicantController {
	
	private static Logger logger = Logger.getLogger(ApplicantController.class);

	public static void main(String[] args) {
		
		logger.info("ApplicantController class");
		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicantService appService = (ApplicantService)context.getBean("applService");	
		
		appService.getApplicant();
		
		
	}

}
