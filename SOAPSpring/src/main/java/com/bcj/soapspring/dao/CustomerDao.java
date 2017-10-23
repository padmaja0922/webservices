package com.bcj.soapspring.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.soapspring.model.Customer;



@Repository  @Transactional
public class CustomerDao {
	
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ArrayList<Customer> getCustomerList() {
		Session session = this.sessionFactory.getCurrentSession();
		//Transaction transaction = session.beginTransaction();
		@SuppressWarnings("unchecked")
		ArrayList<Customer> customerList = (ArrayList<Customer>) session.createQuery("from Customer").list();
		//transaction.commit();
		//session.close();
		return customerList;
	}

	public Customer getCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		//Transaction transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		System.out.println(cst);
		//transaction.commit();
		//session.close();
		return cst;
	}

	public boolean createCustomer(Customer cust) {
		System.out.println(cust);
		Session session = this.sessionFactory.getCurrentSession();
		//Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(cust);
		//transaction.commit();
		//session.close();
		return true;
	}

	public boolean deleteCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		//Transaction transaction = session.beginTransaction();
		Customer cst = (Customer) session.load(Customer.class, new Integer(id));
		if (null != cst) {
			session.delete(cst);
		}
		//transaction.commit();
		//session.close();
		return true;
	}

	public boolean updateCustomer(int id, Customer cust) {
		System.out.println(cust);
		Session session = this.sessionFactory.getCurrentSession();
		//Transaction transaction = session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, id);
		customer.setFirstName(cust.getFirstName());
		customer.setLastName(cust.getLastName());
		session.update(customer);
		//transaction.commit();
		//session.close();
		return true;
	}

}
