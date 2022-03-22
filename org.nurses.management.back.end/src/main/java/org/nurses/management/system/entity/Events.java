package org.nurses.management.system.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long event_id;
	private String event_name;
	private String venue;
	private Date event_date;
	private String participant;

	public Events() {
		
	}

	public Events(Long event_id, String event_name, String venue, Date event_date, String participant) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.venue = venue;
		this.event_date = event_date;
		this.participant = participant;
	}

	public Long getEvent_id() {
		return event_id;
	}

	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	
	

	public String getParticipant() {
		return participant;
	}

	public void setParticipant(String participant) {
		this.participant = participant;
	}

	@Override
	public String toString() {
		return "Events [event_id=" + event_id + ", event_name=" + event_name + ", venue=" + venue + ", event_date="
				+ event_date + ", participant=" + participant + "]";
	}
	
	
	

}
