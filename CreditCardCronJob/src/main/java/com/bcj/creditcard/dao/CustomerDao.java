package com.bcj.creditcard.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bcj.creditcard.entity.Customer;

public class CustomerDao {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public List<Customer> generateCreditCard() {
		
		Session session = this.sessionFactory.getCurrentSession();	
		
		Query  query = session.createQuery("from Customer where status = :status");
		query.setString("status", "new");
		
		
		@SuppressWarnings("unchecked")
		List<Customer> customerList = query.list();
		
		for(Customer cust : customerList)
			System.out.println(cust);
		
		
		return customerList;
		
	}
	
	
	

}
