package com.bcj.soap.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.soap.entity.Address;


@Transactional
@Repository
public class SoapDao {
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
     
		
	public String testing(Address addr) {
		
		Session session = sessionFactory.getCurrentSession();
		if(addr!=null)
			session.persist(addr);		
		
		return "true";
	}

}
