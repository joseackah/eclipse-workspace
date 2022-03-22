package org.nurses.management.system.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nurses.management.system.integration.EventsRestClient;
import org.nurses.management.system.integration.dto.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin(origins = "http://localhost:8084")
@RequestMapping("/eventsFront")
public class EventsFrontController {
	
	@Autowired
	EventsRestClient eventsRest;
	
	
	
	
	
	
	
	
	@RequestMapping("/pe")
	public String accountsDetails(ModelMap model) {
	
		return "";
	
	}
	
	
	
	@RequestMapping("/ai")
	public String accounts(ModelMap model) {
	
		return "";
	
	}
	
	
	@RequestMapping("/eventsUpdate")
	public String update(Events events) {
		eventsRest.updateEvents(events);
		return "redirect:/eventsFront/displayAllEvents";
	}
	
	

	@RequestMapping("/updateEvents")
	public String updateEvents(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Events events = eventsRest.findEventsById(id);
		model.addAttribute("events", events);
		return "";
	}

	@RequestMapping(value = "updateEvents1", method = RequestMethod.GET)
	public String searchEvents1(@RequestParam("Id") Integer id, ModelMap model) {
		Events eventsUpdate = eventsRest.findEventsById(id);
		model.addAttribute("eventsUpdate", eventsUpdate);
		return "";
		
	}
	
	
	

	@RequestMapping("/saveEvents")
	public String saveEvents(Events events) {
		eventsRest.saveEvents(events);
		// System.out.println("product saved successfully");
		return "redirect:/eventsFront/displayAllEvents";

	}

	@RequestMapping("/deleteEvents/{id}")
	public String deleteEvents(@PathVariable("id") Integer id) {
		eventsRest.deleteById(id);

		return "";
	}

	@RequestMapping(value = "/displayAllEvents", method = RequestMethod.GET)
	public String displayEvents(Events events, ModelMap model) {
		Events[] event = eventsRest.getAllEvents(events);
		model.addAttribute("event", event);

		return "eventsTable";

	}

	@RequestMapping(value = "searchEvents/{id}", method = RequestMethod.POST)
	public String searchEvents(@PathVariable("id") Integer id, ModelMap model) {
		Events eventsS = eventsRest.findEventsById(id);
		model.addAttribute("eventsS", eventsS);
		return "";
	}

	

	
	  @RequestMapping(value="/retrieve/{id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("id")Integer id, ModelMap model) {
	  
	  
		  Events ids = eventsRest.findEventsById(id); 
		  model.addAttribute("ids", ids);
	  
	 
	  
	  return "eventsUpdate"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
		  Events eventss = eventsRest.findEventsById(id);
			model.addAttribute("eventss", eventss);
			return "";
		}
	  
		
	  //@RequestMapping("/eventTry")
	  @ModelAttribute("eventsT")
		public List<Events> eventTry(ModelMap model)throws SQLException {

			List<Events> events = new ArrayList<>();

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
			PreparedStatement ps = conn.prepareStatement(
					"select event_id, event_name, venue, event_date, participant from events");
			

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Events event = new Events();
				event.setEvent_id(rs.getLong(1));
				event.setEvent_name(rs.getString(2));
				event.setVenue(rs.getString(3));
				event.setEvent_date(rs.getDate(4));
				event.setParticipant(rs.getString(5));
				
				events.add(event);
				
				//model.addAttribute("eventsT", events);

			}

			return events;

		}


}
