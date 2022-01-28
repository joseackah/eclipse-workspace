package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Nurses_staff_RestClient;
import org.nurses.management.system.integration.dto.Nurses_staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nurseFront")
public class NurseController {
	
	@Autowired
	Nurses_staff_RestClient nurseRest;
	
	
	
	
	
	@RequestMapping("/k")
	public String accountsDetails(ModelMap model) {
	
		return "";
	
	}
	
	
	
	@RequestMapping("/l")
	public String accounts(ModelMap model) { 
	
		return "";
	
	}
	
	

	@RequestMapping("/updateNurse")
	public String updateNurse(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Nurses_staff nurse = nurseRest.findNursesStaff(id);
		model.addAttribute("nurse", nurse);
		return "";
	}

	@RequestMapping(value = "updateNurse1/{id}", method = RequestMethod.GET)
	public String searchNurse1(@PathVariable("id") Integer id, ModelMap model) {
		Nurses_staff nurse = nurseRest.findNursesStaff(id);
		model.addAttribute("nurse", nurse);
		return "nurseFormUpdate";
		
	}
	
	@RequestMapping(value = "resultsNurse", method = RequestMethod.GET)
	public String searchN(@RequestParam("id") Integer id, ModelMap model) {
		Nurses_staff nurses = nurseRest.findNursesStaff(id);
		model.addAttribute("nurses", nurses);
		return "";
	}

	@RequestMapping("/update")
	public String update(Nurses_staff nurse) {
		nurseRest.updateNursesStaff(nurse);
		return "redirect:/nurseFront/displayAllNurse";
	}

	

	@RequestMapping("/saveNurse")
	public String saveNurse(Nurses_staff nurses) {
		nurseRest.saveNursesStaff(nurses);
		// System.out.println("product saved successfully");
		return "redirect:/nurseFront/displayAllNurse";

	}

	@RequestMapping("/deleteNurse/{id}")
	public String deleteNurse(@PathVariable("id") Integer id) {
		nurseRest.deleteNursesStaff(id);

		return "";
	}

	@RequestMapping(value = "/displayAllNurse", method = RequestMethod.GET)
	public String displayNurse(Nurses_staff nurses, ModelMap model) {
		Nurses_staff[] nurse = nurseRest.getAllNursesStaff(nurses);
		model.addAttribute("nurse", nurse);

		return "nurseTable";

	}

	@RequestMapping(value = "searchNurse/{id}", method = RequestMethod.POST)
	public String searchNurse(@PathVariable("id") Integer id, ModelMap model) {
		Nurses_staff nurse = nurseRest.findNursesStaff(id);
		model.addAttribute("nurse", nurse);
		return "";
	}

	@RequestMapping(value="/nurse/{id}", method=RequestMethod.GET )
	public String searchAccounts(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		//Leave[] accounts = nurseRest.getAllLeave(id);
		//model.addAttribute("accounts", accounts);
		
		Nurses_staff nurse = nurseRest.findNursesStaff(ids);
		model.addAttribute("nurse", nurse);
		return "";
	}

	
	  @RequestMapping(value="/retrieve{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
		  Nurses_staff ids = nurseRest.findNursesStaff(id); 
	  model.addAttribute("ids", ids);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
		  Nurses_staff nurse = nurseRest.findNursesStaff(id);
			model.addAttribute("nurse", nurse);
			return "";
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
