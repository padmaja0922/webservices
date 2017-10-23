/**
 * 
 */
package com.bcj.crud.service;

import com.bcj.crud.dao.RegistrationDao;
import com.bcj.crud.model.Customer;

/**
 * @author Bootcamp User 014
 *
 */
public class RegistrationHandler {
	public static int saveCustomer(Customer cust,int mode)
	{
		return RegistrationDao.saveCustomer(cust,mode);
		
	}

}
