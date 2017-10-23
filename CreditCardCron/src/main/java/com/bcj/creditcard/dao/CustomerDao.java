package com.bcj.creditcard.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.bcj.creditcard.entity.CreditCard;
import com.bcj.creditcard.entity.Customer;

@Transactional
@Repository
public class CustomerDao {

    
	private static Logger logger = Logger.getLogger(CustomerDao.class);
	
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Customer> generateCreditCard() {

		Session session = this.sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Customer> customerList = session.createQuery("from Customer where status = 'new'").list();

		for (Customer cust : customerList)
		    logger.info(cust);

		return customerList;

	}

	public void saveCreditCard(Customer customer, CreditCard card) {
		
       
		Session session = sessionFactory.getCurrentSession();
			session.persist(card);
		session.update(customer);
		logger.info(" card is stored and customer is updated for new credit card");
		
		
	}

	public void updateCustomer(Customer customer) {
	
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
		
		
		
	}

}
