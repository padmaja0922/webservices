package com.bcj.soapcxf.service;

import java.util.ArrayList;

import javax.jws.WebService;

import com.bcj.soapcxf.dao.CustomerDao;
import com.bcj.soapcxf.model.Customer;

@WebService(endpointInterface="com.bcj.soapcxf.service.CustomerService")
public class CustomerServiceImpl implements  CustomerService{
	
	CustomerDao custDao= new CustomerDao();
	

	public ArrayList<Customer> getListOfCustomers() {		
		return custDao.getCustomerList();
	}

	public Customer getCustomer(int id) {
		
		
		return custDao.getCustomer(id);
	}

	public boolean deleteCustomer(int id) {
		return custDao.deleteCustomer(id);
	}

	public boolean createCustomer(Customer cust) {
		if(custDao.createCustomer(cust))
		return true;
		else return false;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public boolean updateCustomer(int  id, Customer cust) {
		
		if(custDao.updateCustomer(id, cust))
			return true;
			else return false;
	}

	
}
