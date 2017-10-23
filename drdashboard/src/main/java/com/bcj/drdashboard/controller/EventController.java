/**
 * 
 */
package com.bcj.drdashboard.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bcj.drdashboard.model.Event;
import com.bcj.drdashboard.service.EventService;

/**
 * @author Bootcamp User 002
 *
 */

@RestController
public class EventController {

	@Autowired
	private EventService esev;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(@ModelAttribute("event") Event event) {
		return new ModelAndView("index", "command", new Event());
	}

	@RequestMapping(value = "/saveEvent", consumes = MediaType.APPLICATION_JSON, method = RequestMethod.POST)
	@Consumes
	@Produces
	public Event saveEvent(@RequestBody Event event) {
		return esev.saveEvent(event);
	}

	@RequestMapping(value = "/getEvents", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET)
	@Consumes
	@Produces
	public List<Event> getAllEvents() {
		return esev.getAllEvents();
	}

	@RequestMapping(value = "/updateEvent", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST)
	@Consumes
	@Produces
	public boolean updateEvent(@RequestBody Event event) {
		return esev.updateEvent(event);
	}
	
	@RequestMapping(value = "/deleteEvent", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST)
	@Consumes
	@Produces
	public boolean deleteEvent(@RequestBody Event event) {
		return esev.deleteEvent(event);
	}

}
