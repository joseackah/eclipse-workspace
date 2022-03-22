package org.nurses.management.system.integration;

import java.util.List;

import org.nurses.management.system.integration.dto.Events;

public interface EventsRestClient {
	
	
	public void saveEvents(Events events);
	public void updateEvents( Events events);
	public void deleteEvents(Events events);
	public void deleteById( Integer id);
	public Events [] getAllEvents(Events events);
	public Events  findEventsById(Integer id);
	
	public Events[] all();
	/* public String bedCapacity(); */

}
