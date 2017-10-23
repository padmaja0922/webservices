/**
 * 
 */
package com.bcj.crud.controller;

import com.bcj.crud.model.Customer;
import com.bcj.crud.service.RegistrationHandler;

/**
 * @author Bootcamp User 014
 *
 */
public class RegistrationController {
	
	public static int saveCustomer(String fName, String lName, String email, String nmbr,int mode)
	{
		Customer cust=new Customer();
		cust.setfName(fName);
		cust.setlName(lName);
		cust.setEmail(email);
		cust.setNmbr(nmbr);
		
		System.out.println(cust.getNmbr());
		return RegistrationHandler.saveCustomer(cust,mode);
	}

}
