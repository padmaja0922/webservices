package com.bcj.creditcard.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.creditcard.entity.Address;
import com.bcj.creditcard.entity.Customer;
import com.bcj.creditcard.entity.EmploymentDetails;




@Repository
@Transactional
public class RegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCustomer(Customer cust) {

		Session session = this.sessionFactory.getCurrentSession();
		Address add= cust.getAddr();
		EmploymentDetails emp= cust.getEmpDetails();
		session.persist(add);
		session.persist(emp);
		
		session.persist(cust);
		

	}
}
