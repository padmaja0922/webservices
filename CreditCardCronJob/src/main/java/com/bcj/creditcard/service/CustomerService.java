package com.bcj.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcard.dao.CustomerDao;



@Service
public class CustomerService {

	@Autowired
	private CustomerDao custDao;
	
	
	
	public void  generateCreditCard() {
		
/*	   ArrayList <Customer> custList =	(ArrayList<Customer>) */
		
		custDao.generateCreditCard();
		
		
	}

	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	

}
