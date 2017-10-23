/**
 * 
 */
package com.bcj.drdashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Bootcamp User 002
 *
 */
@Entity
public class Event {

	@Id
	@Column(name = "eventID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String tittle;
	private String date;
	private String time;
	private String eventDuration;

	public int getId() {
		return id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String title) {
		this.tittle = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEventDuration() {
		return eventDuration;
	}

	public void setEventDuration(String eventDuration) {
		this.eventDuration = eventDuration;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", tittle=" + tittle + ", date=" + date + ", time=" + time + ", eventDuration="
				+ eventDuration + "]";
	}

}
