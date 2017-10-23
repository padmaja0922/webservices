package com.bcj.creditcard;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bcj.creditcard.entity.Customer;
import com.bcj.creditcard.entity.Login;
import com.bcj.creditcard.service.ActivationService;
import com.bcj.creditcard.service.LoginService;
import com.bcj.creditcard.service.RegistrationService;


@Controller
public class CreditcardController {

	@Autowired
	private RegistrationService register;

	@Autowired
	private ActivationService activate;
	
	@Autowired
	private LoginService loginService;
	

	

	@RequestMapping("/")
	public ModelAndView getFrontPage() {

		return new ModelAndView("index");

	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String toRegistration() {

		return "registration";

	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer cust) {

		register.addCustomer(cust);

		return "success";

	}

	@RequestMapping(value = "/activate", method = RequestMethod.GET)
	public String toActivate() {

		return "activate";

	}

	@RequestMapping(value = "/activatecard", method = RequestMethod.POST)
	public String toActivateCard(@ModelAttribute("login")  Login login) {

		
			
		String result = activate.activateCard(login);
		
		 if("error".equals(result)){
		//	 JOptionPane.showMessageDialog(null, "Invalid card number please enter again ");
		    return "activate";
		 }
		 
		 else if ("active".equals(result)){
			 return "active";
			 
		 }
		 else{		 
		      
		   return "error";
		 }
	
		
	}

	
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("login") Login login){
		
	 int result= loginService.validateLogin(login);
	  
	    if (result == 1) 	 
		       return "home";
	    else 
	    {
	    	JOptionPane.showMessageDialog(null, "UserName or Password is wrong");
	        return "active";
	    }
	}
	
	

	public ActivationService getActivate() {
		return activate;
	}

	public void setActivate(ActivationService activate) {
		this.activate = activate;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public RegistrationService getRegister() {
		return register;
	}

	public void setRegister(RegistrationService register) {
		this.register = register;
	}
	
}
