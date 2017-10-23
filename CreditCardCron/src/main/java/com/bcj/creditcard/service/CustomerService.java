package com.bcj.creditcard.service;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcj.creditcard.dao.CustomerDao;
import com.bcj.creditcard.entity.Customer;



@Service
public class CustomerService {

	@Autowired
	private CustomerDao custDao;
	
	private static Logger logger = Logger.getLogger(CustomerService.class);
	
	public void  generateCreditCard() {
		
		ArrayList<Customer> custList = (ArrayList<Customer>) custDao.generateCreditCard();
		
		 ExecutorService executor = Executors.newFixedThreadPool(5);
		 
		 for(Customer cust : custList){
			 
			 logger.info(" creating worker thread for customer"+cust.getFirstName());
			 Runnable worker = new WorkerThread(cust,custDao);  
	            executor.execute(worker);			 
		 }
		
		 executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
		
	}

	public CustomerDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustomerDao custDao) {
		this.custDao = custDao;
	}

	

}
