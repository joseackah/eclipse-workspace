package org.nurses.management.system.controller;

import org.nurses.management.system.integration.WardRestClient;
import org.nurses.management.system.integration.dto.Ward;
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
@RequestMapping("/wardFront")
public class WardController {
	
	@Autowired
	WardRestClient wardRest;
	
	
	
	@ModelAttribute("bedCapacity")
	public String  bedCapacity() {
		return wardRest.bedCapacity();
	}
	
	
	
	
	
	@RequestMapping("/pe")
	public String accountsDetails(ModelMap model) {
	
		return "";
	
	}
	
	
	
	@RequestMapping("/ai")
	public String accounts(ModelMap model) {
	
		return "";
	
	}
	
	
	@RequestMapping("/wardUpdate")
	public String update(Ward ward) {
		wardRest.updateWard(ward);
		return "redirect:/wardFront/displayAllWard";
	}
	
	

	@RequestMapping("/updateWard")
	public String updateWard(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Ward ward = wardRest.findById(id);
		model.addAttribute("ward", ward);
		return "";
	}

	@RequestMapping(value = "updateWard1", method = RequestMethod.GET)
	public String searchLeave1(@RequestParam("Id") Integer id, ModelMap model) {
		Ward wardUpdate = wardRest.findById(id);
		model.addAttribute("wardUpdate", wardUpdate);
		return "";
		
	}
	
	/*
	 * @RequestMapping(value = "resultsAccount", method = RequestMethod.GET) public
	 * String searchL(@RequestParam("id") Integer id, ModelMap model) { Leave leaveS
	 * = wardRest.find(id); model.addAttribute("leaveS", leaveS); return ""; }
	 */
	
	
	/*
	 * @RequestMapping("/updateAcc") public String update(Leave leave) {
	 * wardRest.updateLeave(leave); return ""; }
	 */
	

	@RequestMapping("/saveWard")
	public String saveWard(Ward ward) {
		wardRest.saveWard(ward);
		// System.out.println("product saved successfully");
		return "redirect:/wardFront/displayAllWard";

	}

	@RequestMapping("/deleteWard/{id}")
	public String deleteWard(@PathVariable("id") Integer id) {
		wardRest.deleteById(id);

		return "";
	}

	@RequestMapping(value = "/displayAllWard", method = RequestMethod.GET)
	public String displayLeave(Ward leaves, ModelMap model) {
		Ward[] wardD = wardRest.getAllWard(leaves);
		model.addAttribute("wardD", wardD);

		return "wardTable";

	}

	@RequestMapping(value = "searchWard/{id}", method = RequestMethod.POST)
	public String searchWard(@PathVariable("id") Integer id, ModelMap model) {
		Ward wardS = wardRest.findById(id);
		model.addAttribute("wardS", wardS);
		return "";
	}

	/*
	 * @RequestMapping(value="schoolAccounts/accDetail/{id}",
	 * method=RequestMethod.GET ) public String searchAccounts(@PathVariable("id")
	 * Integer id, @PathVariable("id")Integer ids, ModelMap model) { //Leave[]
	 * accounts = nurseRest.getAllLeave(id); //model.addAttribute("accounts",
	 * accounts);
	 * 
	 * Leave leaveId = wardRest.find(ids); model.addAttribute("leaveId", leaveId);
	 * return ""; }
	 */

	
	  @RequestMapping(value="/retrieve/{id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("id")Integer id, ModelMap model) {
	  
	  
		  Ward ids = wardRest.findById(id); 
		  model.addAttribute("ids", ids);
	  
	 
	  
	  return "wardUpdate"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
		  Ward wards = wardRest.findById(id);
			model.addAttribute("wards", wards);
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
