package com.bcj.soapcxf.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bcj.soapcxf.HibernateUtil;
import com.bcj.soapcxf.model.Customer;

public class CustomerDao {

	public ArrayList<Customer> getCustomerList() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction  transaction = session.beginTransaction();
		ArrayList<Customer> customerList = (ArrayList<Customer>) session.createQuery("from Customer").list();	
		transaction.commit();
		session.close();
		return customerList;		
	}

	public Customer getCustomer(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction  transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		System.out.println(cst);
		transaction.commit();
		session.close();
		return cst;
		
	}

	public boolean createCustomer(Customer cust) {
		System.out.println(cust);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction  transaction = session.beginTransaction();
		session.saveOrUpdate(cust);
		transaction.commit();
		session.close();
		return true;
		
	}

	public boolean deleteCustomer(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction  transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		if(null != cst){
			session.delete(cst);
		}
		transaction.commit();
		session.close();
		return true;
	}

	public boolean updateCustomer(int id, Customer cust) {
		
		System.out.println(cust);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction  transaction = session.beginTransaction();
		
		Customer customer = 
                   (Customer)session.get(Customer.class, id); 
        customer.setFirstName(cust.getFirstName());
        customer.setLastName(cust.getLastName());
        
		 session.update(customer); 
		transaction.commit();
		session.close();
		return true;
	}

	}

	
	
	
	
	

