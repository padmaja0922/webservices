package com.bcj.ajaxrest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcj.ajaxrest.entity.Customer;
import com.bcj.ajaxrest.service.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	private CustomerService custService;

	public void setCustService(CustomerService custService) {
		this.custService = custService;
	}
	

	@RequestMapping(value="/submitForm.web", method = RequestMethod.POST)
    public @ResponseBody Customer  submittedFromData(@RequestBody Customer member, HttpServletRequest request) {
		System.out.println(member.getFirstName());
		//service.saveCustomer(member);
		
		return member;
	}	

}
