package com.bcj.ajaxrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.ajaxrest.dao.CustomerDao;
import com.bcj.ajaxrest.entity.Customer;

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

	public boolean isCustomerExsist(Customer cust) {
		
		return custDao.isCustomerExist(cust);
	}

	public void saveCustomer(Customer cust) {
		
		custDao.saveCustomer(cust);
	}

	public Customer findCustomerById(int id) {
		
		 return custDao.findCustomerById(id);
		
	}

	public List<Customer> getAllCustomers() {
	
		return custDao.getAllCustomer();
	}

	public void updateCustomer(Customer customer) {
		
		custDao.updateCustomer(customer);
		
	}

	public void deleteCustomer(int id) {
	
		custDao.deleteCustomerById(id);
		
	}

}
