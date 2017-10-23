package com.bcj.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcard.dao.RegistrationDao;
import com.bcj.creditcard.entity.Customer;



@Service
public class RegistrationService {
	
	
	@Autowired
	private RegistrationDao custDao;

	
	public void setCustDao(RegistrationDao custDao) {
		this.custDao = custDao;
	}
	
	
	public void addCustomer(Customer cust) {
		custDao.addCustomer(cust);
		
	}
	

}
