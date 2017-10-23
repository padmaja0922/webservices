package com.bcj.ajaxrest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.ajaxrest.entity.Customer;


@Transactional
@Repository
public class CustomerDao {
	
	
	@Autowired
	private SessionFactory sessionFactory ;
	
 
	private Customer cust;

	
	public Customer getCust() {
		return cust;
	}


	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	public boolean isCustomerExist(Customer cust) {
		// TODO Auto-generated method stub
		return false;
	}

	public void saveCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
		if(customer!=null)
			session.persist(customer);
		
	}

	
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCustomer(Customer customer) {
		
         Session session = sessionFactory.getCurrentSession();
		
		if(customer!=null)
		  session.update(customer);
		
	}

	public void deleteCustomerById(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		cust = (Customer) session.get(Customer.class, id);
		session.delete(cust);
	}

	public Customer findCustomerById(int id) {
		

		Session session = sessionFactory.getCurrentSession();
		Query query = session.getNamedQuery("getCustomerProcedure")
				.setParameter("id",id);
		
		cust = (Customer)query.uniqueResult();
			
		return cust;	
	}

}
