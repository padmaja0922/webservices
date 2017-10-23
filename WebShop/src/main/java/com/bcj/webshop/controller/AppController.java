/**
 * 
 */
package com.bcj.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bcj.webshop.model.Order;
import com.bcj.webshop.service.OrderService;



@Controller
public class AppController {
	
	@Autowired
	OrderService orderservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toHome(@ModelAttribute("msg") Order msg) {
		return "index";
	}
	
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String toJMS(@ModelAttribute("msg") Order order) {
		
		if(orderservice.sendOrder(order)){
			return "orderSucess";
		}
		else{
			return "failed";
		}
		
	}

}
