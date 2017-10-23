package com.bcj.restservices.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.restservices.entity.Customer;



@Transactional
@Repository
public class CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	
   Customer cust;

	
	public Customer getCust() {
		return cust;
	}


	public void setCust(Customer cust) {
		this.cust = cust;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Customer findCustomerById(int id){
		
		Session session = sessionFactory.getCurrentSession();
		cust = (Customer) session.get(Customer.class, id);
			
		return cust;	
		
	}
	
	public void saveCustomer(Customer customer){
		
		Session session = sessionFactory.getCurrentSession();
		if(customer!=null)
			session.persist(customer);
		
	}

	public void deleteCustomerById(int id){
		
		Session session = sessionFactory.getCurrentSession();
		cust = (Customer) session.get(Customer.class, id);
		session.delete(cust);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer(){
		
		Session session = sessionFactory.getCurrentSession();
		List<Customer> custList = new ArrayList<Customer>();
		
		custList = session.createQuery("from Customer").list();
		return custList;		
		
	}
	
	public void updateCustomer(Customer customer){
		
		Session session = sessionFactory.getCurrentSession();
		
		if(customer!=null)
		  session.update(customer);
		
	}
	
	public boolean isCustomerExist(Customer customer){
		
		return findCustomerById(customer.getId())!=null;
		
	}
	
}
