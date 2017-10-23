package com.citi.customerportal.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.citi.customerportal.model.CreditCard;
import com.citi.customerportal.model.Customer;
import com.citi.customerportal.model.LoginCredentials;
import com.citi.customerportal.service.ApplicationService;


/**
 * @author Bootcamp User 014
 *This class Process The Request and Dispaly Particular View on Browser
 */
@Controller
public class ApplicationController {
	
	
	@Autowired
	ApplicationService applicantservice;
	
	
	private static final Logger lgr=Logger.getLogger(ApplicationController.class);
	public void setApplicationservice(ApplicationService applicantservice) {
		this.applicantservice = applicantservice;
	}
	
	/*
	 * Dispaly the Welcome Page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() {
		return "index";
	}
	
	/*
	 * Handle  the request for new application page and save the applicant details in data base
	 */
	@RequestMapping(value = "/Application", method = RequestMethod.GET)
	public String getApplicationForm() {
		return "Application";
	} 
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveApplicant(@ModelAttribute("cust") Customer cust, BindingResult bindingResult) {
		applicantservice.saveApplicant(cust);
		lgr.info(cust);
		ModelAndView mv=new ModelAndView();
		String cName=cust.getfName()+" "+cust.getlName();
		mv.setViewName("sucess");
		mv.addObject("msg",cName);
		
		
		
		return mv;
	}
	/**
	 * Handles the requests for the card activation page and passes the card to
	 * service class returns ModelAndView
	 */
	@RequestMapping(value = "/cardactivation", method = RequestMethod.GET)
	public ModelAndView goToCardactivationForm() {

		return new ModelAndView("cardactivation");}
		
	@RequestMapping(value = "/activatecard", method = RequestMethod.POST)
	public ModelAndView activateCard(@ModelAttribute("CreditCard") com.citi.customerportal.model.CreditCard creditCard, BindingResult result,
			ModelMap model) {

		applicantservice.activateCard(creditCard);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("registration");
		mv.addObject("msg","Activated Successfully");
		
		return mv;
		
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String getRegistrationForm() {
		return "registration";
	} 
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerCustomer(@ModelAttribute("login") com.citi.customerportal.model.LoginCredentials login, BindingResult result, ModelMap model) {
		model.addAttribute("login",login);
		
		if (applicantservice.register(login)) {

			String regstatus = "Thank you! you are successfully registered";
			
			return new ModelAndView("signin", "regstatus", regstatus);
		} else {
			String regstatus = "Please check your CardNumber either it already registerd or does not exist";
			

			return new ModelAndView("signin", "regstatus", regstatus);
		}}
		
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String getSigninForm() {
		return "signin";
	} 
	
		@RequestMapping(value = "/signin", method = RequestMethod.POST)
		public ModelAndView displayProfile(@ModelAttribute("login") com.citi.customerportal.model.LoginCredentials login, BindingResult result, ModelMap model) {
			model.addAttribute("login",login);

			CreditCard creditCard = applicantservice.verifyCustomer(login);

			if (creditCard != null) {
			
				return new ModelAndView("custprofile", "profile", creditCard);
			} else {

				String message = "please check your UserId and Password";
				return new ModelAndView("custprofile", "message", message);

			}
			
		}	
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String getIndexForm() {
			return "index";
		} 
	
	
		
	
}
