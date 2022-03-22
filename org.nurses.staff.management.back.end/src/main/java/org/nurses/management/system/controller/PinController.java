package org.nurses.management.system.controller;

import java.util.List;

import org.nurses.management.system.integration.Pin_Ain_RestClient;
import org.nurses.management.system.integration.dto.Pin_Ain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin(origins = "http://localhost:8084")
@RequestMapping("/pinFront")
public class PinController {
	
	@Autowired
	Pin_Ain_RestClient pinRest;
	
	
	
	
	
	@RequestMapping("/a")
	public String accountsDetails(ModelMap model) {
	
		return "";
	
	}
	
	
	
	@RequestMapping("/ac")
	public String accounts(ModelMap model) {
	
		return "";
	
	}
	
	

	@RequestMapping("/updateLeave")
	public String updatePin(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Pin_Ain ainPin = pinRest.find(id);
		model.addAttribute("ainPin", ainPin);
		return "";
	}

	@RequestMapping(value = "updatePin1/{id}", method = RequestMethod.GET)
	public String searchPin1(@PathVariable("id") Integer id, ModelMap model) {
		Pin_Ain ain = pinRest.find(id);
		model.addAttribute("ain", ain);
		return "pin_ainUpdate";
		
	}
	
	@RequestMapping(value = "resultsPin", method = RequestMethod.GET)
	public String searchL(@RequestParam("id") Integer id, ModelMap model) {
		Pin_Ain pinSearch = pinRest.find(id);
		model.addAttribute("pinSearch", pinSearch);
		return "";
	}

	@RequestMapping("/updateP")
	public String update(Pin_Ain pin) {
		pinRest.updatePinAin(pin);
		return "redirect:/pinFront/displayAllPin";
	}

	

	@RequestMapping("/savePin")
	public String savePin(Pin_Ain pinSave) {
		pinRest.savePinAin(pinSave);
		// System.out.println("product saved successfully");
		return "redirect:/pinFront/displayAllPin";

	}

	@RequestMapping("/deletePin/{id}")
	public String deletePin(@PathVariable("id") Integer id) {
		pinRest.deletePinAin(id);

		return "redirect:/pinFront/displayAllPin";
	}

	@RequestMapping(value = "/displayAllPin", method = RequestMethod.GET)
	public String displayPin(Pin_Ain pinAin, ModelMap model) {
		Pin_Ain[] pinGet = pinRest.getAllPinAin(pinAin);
		model.addAttribute("pinGet", pinGet);

		return "pin_ainTable";

	}

	@RequestMapping(value = "searchLeave/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Pin_Ain pinPath = pinRest.find(id);
		model.addAttribute("pinPath", pinPath);
		return "";
	}

	@RequestMapping(value="/pin/{id}", method=RequestMethod.GET )
	public String searchPin(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		//Leave[] accounts = nurseRest.getAllLeave(id);
		//model.addAttribute("accounts", accounts);
		
		Pin_Ain pinId = pinRest.find(ids);
		model.addAttribute("pinId", pinId);
		return "";
	}

	
	  @RequestMapping(value="/retrieve{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
		  Pin_Ain ids = pinRest.find(id); 
	  model.addAttribute("ids", ids);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
		  Pin_Ain pin = pinRest.find(id);
			model.addAttribute("pin", pin);
			return "";
		}
	  
	  
	  @RequestMapping("/saveMorePin")
		public String saveMorePin(List<Pin_Ain> pinSave) {
			pinRest.saveAll(pinSave);
			
			return "redirect:/pinFront/displayAllPin";
	  }
		/*
		 * @RequestMapping(value="look", method=RequestMethod.GET) public String
		 * lookForId(String student_id, Model model) { String accounts =
		 * nurseRest.lookLastId(student_id); model.addAttribute("student", accounts);
		 * return "search"; }
		 * 
		 * @RequestMapping(value = "last", method = RequestMethod.GET) public String
		 * lastId(Students students, ModelMap model) { //Accounts accounts =
		 * nurseRest.findLastId(students); //model.addAttribute("accounts", accounts);
		 * return "search"; }
		 */
	  


}
