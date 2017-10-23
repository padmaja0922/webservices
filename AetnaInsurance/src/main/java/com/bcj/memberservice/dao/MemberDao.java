package com.bcj.memberservice.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.memberservice.entity.Address;
import com.bcj.memberservice.entity.Member;

@Repository

public class MemberDao {

	@Autowired
	private SessionFactory sessionFactory;

	Member mem = new Member();
	Address address = new Address();

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
/**
 * 
 * @param member
 * @return int
 *  
 *    This method creates new member
 */
	
	public int registerMember(Member member) {

		Session session = this.sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		session.persist(member);
		
         tx.commit();
		return member.getmId();
	}
	
	/**
	 * 
	 * @param id
	 * @return member
	 * 
	 *  This method gets member details based on member Id
	 */

	@SuppressWarnings("unchecked")
	public Member getMemberById(int id) {

		Object[] obj;
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		
		
		Criteria cr = session.createCriteria(Member.class)
			    .setProjection(Projections.projectionList()
			      .add(Projections.property("memberId"), "memberId")
			      .add(Projections.property("firstName"), "firstName")
			      .add(Projections.property("lastName"), "lastName")
			      .add(Projections.property("addr"), "addr"));
			   //  cr .add( Restrictions.eq("member.memberId", id));	
			    		
			    
		
		   
		List<Object[]> list = cr.list();
		

	/*	Query query = session.createQuery(
				"SELECT m.firstName, m.lastName, m.planSelected, m.addr.addressLine1, m.addr.addressLine2, m.addr.city, m.addr.state,m.addr.zipCode FROM Member m WHERE m.id = :id");

		query.setInteger("id", id);
		
		List<Object[]> result= (List<Object[]>)query.list();
		
		  for(Object[] member: result){
			*/
		
		 for(Object[] member : list){
			 
			mem.setFirstName(String.valueOf(member[0]));

			mem.setLastName(String.valueOf(member[1]));

			mem.setPlanSelected(String.valueOf(member[2]));

			address.setAddressLine1(String.valueOf(member[3]));

			address.setAddressLine2(String.valueOf(member[4]));

			address.setCity(String.valueOf(member[5]));

			address.setState(String.valueOf(member[6]));

			address.setZipCode(String.valueOf(member[7]));

			mem.setAddr(address);

		}

		tx.commit();
		session.close();

		return mem;
	}
	
	

}
