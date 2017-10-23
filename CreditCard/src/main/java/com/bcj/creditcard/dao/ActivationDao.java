package com.bcj.creditcard.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcj.creditcard.entity.CreditCard;
import com.bcj.creditcard.entity.Login;

/*
 * 
 */

@Transactional
@Repository
public class ActivationDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int verifyCreditCard(Login login) {

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session.createQuery("from CreditCard where cardNo= :number");
		query.setString("number", login.getCardNo());
		CreditCard card = (CreditCard) query.uniqueResult();

		System.out.println(card);

		if (card == null)
			return 1;

		else if (card.getStatus().equalsIgnoreCase("new")) {

			card.setStatus("Activate");
			session.update(card);
			session.persist(login);
			return 2;

		}

		else
			return 3;
	}

}
