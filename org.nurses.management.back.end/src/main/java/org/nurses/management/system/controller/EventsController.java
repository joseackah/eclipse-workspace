package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Events;
import org.nurses.management.system.repos.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8084")
@RestController
@RequestMapping("/events")
public class EventsController {
	
	
	@Autowired
	EventsRepository eventsRepos;
	
	
	
	@PostMapping("/saveEvents")
	public Events saveEvents(@RequestBody Events events) {
		return eventsRepos.save(events);
	}
	
	@PutMapping("/updateEvents")
	public Events updateEvents(@RequestBody Events events) {
		return eventsRepos.save(events);
	}
	
	
	@GetMapping("/getEvents")
	public List<Events> getEvents(){
		
		return eventsRepos.findAll();
	}
	
	@GetMapping("/findEventsById/{id}")
	public Optional<Events> findById(@PathVariable("id")Long  id) {
		return eventsRepos.findById(id);
	}
	
	@DeleteMapping("/deleteEvents")
	public void deleteEvents(@PathVariable("id") Long id) {
		eventsRepos.deleteById(id);
	}
	
	 
	
	  @GetMapping("allEvents") 
	  public List<Events> all() { 
		  
		  return eventsRepos.all();
	  
	  }
	 

}
