package com.bcj.soapspring.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bcj.soapspring.dao.CustomerDao;
import com.bcj.soapspring.model.Customer;

@WebService(endpointInterface="com.bcj.soapspring.service.CustomerService", serviceName="CustomerService")
public class CustomerServiceImpl implements  CustomerService{
	
	@Autowired
	private CustomerDao custDao;
	

	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	@WebMethod
	@Override
	public ArrayList<Customer> getListOfCustomers() {		
		return custDao.getCustomerList();
	}
	@WebMethod
	@Override
	public Customer getCustomer(int id) {
		return custDao.getCustomer(id);
	}
	@WebMethod
	@Override
	public boolean deleteCustomer(int id) {
		return custDao.deleteCustomer(id);
	}
	@WebMethod
	@Override
	public boolean createCustomer(Customer cust) {
		if(custDao.createCustomer(cust))
		return true;
		else return false;
	}
	@WebMethod
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@WebMethod
	@Override
	public boolean updateCustomer(int  id, Customer cust) {
		if(custDao.updateCustomer(id, cust))
			return true;
			else return false;
	}

	
}
