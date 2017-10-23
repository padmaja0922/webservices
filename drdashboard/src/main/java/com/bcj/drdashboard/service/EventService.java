/**
 * 
 */
package com.bcj.drdashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bcj.drdashboard.dao.EvenDAO;
import com.bcj.drdashboard.model.Event;


@Service
public class EventService {

	@Autowired
	private EvenDAO edao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Event saveEvent(Event event) {
		return edao.saveEvent(event);
	}

	public List<Event> getAllEvents() {
		return edao.getAllEvents();

	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean updateEvent(Event event) {
		return edao.updateEvent(event);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean deleteEvent(Event event) {
		return edao.deleteEvent(event);
	}

}
