package com.citi.creditcardprocess.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citi.creditcardprocess.model.CreditCard;
import com.citi.creditcardprocess.model.Customer;




@Transactional
@Repository
public class ApplicationDao {

	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		

	public List<Customer> getApplicationByStatus(){
		
		
		Session session = this.sessionFactory.openSession();
	
		Query query = session.createQuery("from Customer Where applicationStatus = :status");
		query.setString("status", "New");
		List<Customer> cstmr =query.list();

		return cstmr;	
		
	}


	public void updateStatus(Customer cst) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
			session.update(cst);
			tx.commit();
			
	}


	public void saveCreditCardDetails(CreditCard creditCard) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(creditCard);
		tx.commit();
		
	}
	}

