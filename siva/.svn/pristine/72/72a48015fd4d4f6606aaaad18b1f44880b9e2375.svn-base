package com.citi.customerportal.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citi.customerportal.model.CreditCard;
import com.citi.customerportal.model.Customer;
import com.citi.customerportal.model.LoginCredentials;

@Repository
@Transactional
public class ApplicationDao {

	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveApplicant(Customer cust) {

		Session session = this.sessionFactory.getCurrentSession();

		session.persist(cust);

	}

	public boolean activateCard(CreditCard creditCard) {

		Session session = this.sessionFactory.getCurrentSession();

		Query query = session
				.createQuery("FROM CreditCard where creditCardNumber =:ccNumber AND cardStatus =:cardstatus");
		
		query.setParameter("ccNumber", creditCard.getCreditCardNumber());
		query.setParameter("cardstatus", "Not Active");
		
		CreditCard card = (CreditCard) query.uniqueResult();
		
		if (card != null) {
			
			card.setCardStatus("Active");
			session.update(card);
			
			
			return true;
		} else {
			return false;
		}

	
	}

	public boolean registerCustomer(LoginCredentials login) {
		
		Session session = this.sessionFactory.getCurrentSession();
		String cardnumber = login.getCardNumber();
		Query query1 = session.createQuery(" FROM LoginCredentials where CardNumber =:cardNumber");
		query1.setParameter("cardNumber", cardnumber);
		LoginCredentials rcrd = (LoginCredentials) query1.uniqueResult();
		
		if (rcrd == null) {

			boolean isValidCard = false;

			Query query2 = session.createQuery(" FROM CreditCard where creditCardNumber =:cardNumber");
			query2.setParameter("cardNumber", cardnumber);

			CreditCard card = (CreditCard) query2.uniqueResult();
			if (card != null) {
				login.setApplictnId(card.getCustId());

				session.persist(login);
				
				isValidCard = true;

			} else {
				
				isValidCard = false;
			}
			return isValidCard;
		} else {
			
			return false;
		}
	}

	public CreditCard verifyCustomer(LoginCredentials login) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM LoginCredentials where UserID =:Userid AND Password = :password");

		query.setParameter("Userid", login.getUserID());
		query.setParameter("password", login.getPassword());

		LoginCredentials prfl = (LoginCredentials) query.uniqueResult();

		if (prfl != null) {
			
			Query query1 = session.createQuery("FROM CreditCard where  creditCardNumber =:nmbr");
			query1.setParameter("nmbr", prfl.getCardNumber());

			CreditCard creditCard = (CreditCard) query1.uniqueResult();
			return creditCard;
			
		} else {
			return null;
		}
	}

}
