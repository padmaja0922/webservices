package com.bcj.soapcrud.service;

import javax.jws.WebService;

import com.bcj.soapcrud.dao.CustomerDao;
import com.bcj.soapcrud.entity.Customer;

@WebService
public class CustomerService {

   CustomerDao custDao = new CustomerDao();
   
	public boolean addCustomer (Customer cust){
	 
	 return  custDao.addCustomer(cust);	 
    }
	
	public Customer getCustomerById(int id){
		
		Customer cust = custDao.getCustomerById(id);
		
		return cust;
		
		
	}
	
	
	
}
