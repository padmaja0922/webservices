package com.bcj.rest.service;
 import com.bcj.rest.dao.CustomerDao;
import com.bcj.rest.model.Customer;
public class CustomerService {

	public void addCustomer(Customer cust) {
		
		CustomerDao dao= new CustomerDao();
		dao.addCustomer(cust);
	}

}
