package com.bcj.creditcardsample.dao;



import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.creditcardsample.entity.Applicant;




@Transactional
@Repository
public class ApplicantDao {

	@Autowired
	private SessionFactory sessionFactory;


	
	public void getSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public Applicant getApplicant() {
		
		
		Session session = this.sessionFactory.getCurrentSession();
		
		
		
	Applicant app = (Applicant) session.createQuery("from applicant where id = 1");
		
		return app;
	}

}
