package com.bcj.soapcrud.dao;

import org.hibernate.Session;

import com.bcj.soapcrud.entity.Customer;
import com.bcj.soapcrud.util.HibernateUtil;

public class CustomerDao {

	public boolean  addCustomer(Customer cust) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();		
		
	    session.save(cust);
		session.getTransaction().commit();
		
		return true;
		
	}

	public Customer getCustomerById(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();	
		
	 Customer	cust = (Customer) session.get(Customer.class, id);
		
		return cust;
	}
	
	
	
	

}
