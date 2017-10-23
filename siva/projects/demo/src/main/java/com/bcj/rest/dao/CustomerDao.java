package com.bcj.rest.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bcj.rest.dbutil.SessionUtil;
import com.bcj.rest.model.Customer;

public class CustomerDao {

	public void addCustomer(Customer cust) {
		Session session = SessionUtil.getSession();        
        Transaction tx = session.beginTransaction();
        addCustomer(session,cust);        
        tx.commit();
        session.close();
	}
	public void addCustomer(Session session, Customer cust) {
	
	Customer cstmr= new Customer();
	cstmr.setfName(cust.getfName());
	cstmr.setlName(cust.getlName());
	cstmr.setNumber(cust.getNumber());
	session.save(cstmr);
	}}