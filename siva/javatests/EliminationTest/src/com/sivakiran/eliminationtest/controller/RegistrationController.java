package com.sivakiran.eliminationtest.controller;

import com.sivakiran.eliminationtest.database.RegistartionDb;
import com.sivakiran.eliminationtest.entity.Customer;
import com.sivakiran.eliminationtest.service.RegistrationService;
import com.sivakiran.eliminationtest.userinterface.RegistrationUi;

public class RegistrationController {
	
	public static void saveCustomer(RegistrationUi reg)
	{
		Customer cust = new Customer();
		cust.setName(reg.name);
		cust.setLastName(reg.lastName);
		cust.setPhoneNumber(reg.phoneNumber);
		cust.setEmail(reg.email);
		
		cust.setUserId(reg.userId);
		cust.setPassword(reg.Password);
		RegistartionDb db = RegistrationService.saveCustomer(cust);
		
		RegistrationUi.DisplayCustomer(db);
		
		
	}

}
