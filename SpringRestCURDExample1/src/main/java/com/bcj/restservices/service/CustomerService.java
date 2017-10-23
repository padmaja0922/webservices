package com.bcj.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.restservices.dao.CustomerDao;
import com.bcj.restservices.entity.Customer;


@Service
public class CustomerService {
	
	
	@Autowired
     private CustomerDao custDao;

	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	} 
	
   public Customer findCustomerById(int id){
	   
	   return custDao.findCustomerById(id);
   }
	
	public void saveCustomer(Customer cust){
		
		custDao.saveCustomer(cust);
	}
	
	public void updateCustomer(Customer cust){
		
		custDao.updateCustomer(cust);
	}
   
    public void deleteCustomer(int id){
    	custDao.deleteCustomerById(id);
    }
   
    public List<Customer> getAllCustomers(){
    	
    	return custDao.getAllCustomer();
    }
    
    public boolean isCustomerExsist(Customer cust){
    	
    	return custDao.isCustomerExist(cust);
    }
    
}
