/**
 * 
 */
package com.bcj.crud.controller;

import com.bcj.crud.model.Customer;
import com.bcj.crud.service.ModificationHandler;

/**
 * @author Bootcamp User 014
 *
 */
public class ModificationController {
	public static boolean modifyCustomer(String fName, String lName, String email, String nmbr,int id,int mode)
	{
		Customer cust=new Customer();
		cust.setfName(fName);
		cust.setlName(lName);
		cust.setEmail(email);
		cust.setNmbr(nmbr);
		cust.setId(id);
		return ModificationHandler.updateCustomer(cust,mode);
}}
