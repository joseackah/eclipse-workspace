package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.EventsRestClient;
import org.nurses.management.system.integration.dto.Events;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EventsRestClientImpl implements EventsRestClient {
	
	
	Events events = new Events();
	RestTemplate rest = new RestTemplate();
	

	@Override
	public void saveEvents(Events event) {
		events.setEvent_id(event.getEvent_id());
		events.setEvent_name(event.getEvent_name());
		events.setVenue(event.getVenue());
		events.setEvent_date(event.getEvent_date());
		events.setParticipant(event.getParticipant());
		rest.postForObject("http://localhost:8084/events/saveEvents/", event, Events.class);
		
	}

	@Override
	public void updateEvents(Events event) {
		Map<String, Long> updateEvents = new HashMap<String, Long>();
		updateEvents.put("id", event.getEvent_id());
		rest.put("http://localhost:8084/events/updateEvents/", event, updateEvents);
		
		
	}

	@Override
	public void deleteEvents(Events events) {
		rest.delete("http://localhost:8084/events/deleteEvents");
		
	}

	@Override
	public void deleteById(Integer id) {
		rest.delete("http://localhost:8084/events/deleteEvents/"+id);
		
	}

	@Override
	public Events[] getAllEvents(Events events) {
		Events [] getEvents = rest.getForObject("http://localhost:8084/events/getEvents", Events[].class);
		return getEvents;
	}

	@Override
	public Events findEventsById(Integer id) {
		Events events = rest.getForObject("http://localhost:8084/events/findEventsById/"+id, Events.class);
		return events;
	}

	@Override
	public Events[] all() {
		Events [] event = rest.getForObject("http://localhost:8084/events/allEvents", Events[].class);
		return event;
	}

	
	
	
	

}
