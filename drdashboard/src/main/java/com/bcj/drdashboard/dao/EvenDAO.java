/**
 * 
 */
package com.bcj.drdashboard.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bcj.drdashboard.model.Event;
import com.bcj.drdashboard.util.HibernateUtil;



@Repository
public class EvenDAO {

	public Event saveEvent(Event event) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			Transaction tx = session.beginTransaction();

			if (event != null) {
				session.persist(event);

				if (!tx.wasCommitted()) {
					tx.commit();
				}
				return event;
			} else {
				return null;
			}
		} catch (RuntimeException exp) {
			session.getTransaction().rollback();
			throw exp;
		}
	}

	public List<Event> getAllEvents() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		List<Event> Events = (List<Event>) session.createQuery("FROM Event").list();

		tx.commit();
		return Events;
	}

	public boolean updateEvent(Event event) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		if (event != null) {
			session.update(event);

			tx.commit();
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteEvent(Event event) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		String hql = "delete from Event where id = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", event.getId());
		int rowCount = query.executeUpdate();
		
		if (rowCount >= 1) {
			tx.commit();
			return true;
		} else {
			return false;
		}

	}
}
