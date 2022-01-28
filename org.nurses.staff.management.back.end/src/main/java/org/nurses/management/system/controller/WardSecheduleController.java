package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Nurses_staff_RestClient;
import org.nurses.management.system.integration.WardRestClient;
import org.nurses.management.system.integration.Ward_schedule_RestClient;
import org.nurses.management.system.integration.dto.Nurses_staff;
import org.nurses.management.system.integration.dto.Ward;
import org.nurses.management.system.integration.dto.Ward_schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/scheduleFront")
public class WardSecheduleController {
	
	@Autowired
	Ward_schedule_RestClient scheduleRest;
	@Autowired
	WardRestClient wardRest;
	
	@Autowired
	Nurses_staff_RestClient nurseRest;
	
	
	
	
	/*
	 * @RequestMapping("/profile") public String accountsDetails(ModelMap model) {
	 * 
	 * return "profilesTry";
	 * 
	 * }
	 */
	
	
	
	/*
	 * @RequestMapping("/accounts") public String accounts(ModelMap model) {
	 * 
	 * return "addAccounts";
	 * 
	 * }
	 */
	
	

	@RequestMapping("/updateSchedule")
	public String updateSchedule(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Ward_schedule scheduleUpdate = scheduleRest.find(id);
		model.addAttribute("scheduleUpdate", scheduleUpdate);
		return "";
	}

	@RequestMapping(value = "updateSchedule1/{id}", method = RequestMethod.GET)
	public String searchSchedule1(@PathVariable("id") Integer id, ModelMap model) {
		Ward_schedule scheduleWard = scheduleRest.find(id);
		model.addAttribute("scheduleWard", scheduleWard);
		return "wardScheduleFormUpdate";
		
	}
	
	/*
	 * @RequestMapping(value = "resultsAccount", method = RequestMethod.GET) public
	 * String searchS(@RequestParam("id") Integer id, ModelMap model) {
	 * Ward_schedule leaveS = scheduleRest.find(id); model.addAttribute("leaveS",
	 * leaveS); return ""; }
	 */

	@RequestMapping("/updateS")
	public String update(Ward_schedule schedule) {
		scheduleRest.updateWardSchedule(schedule);
		return "redirect:/scheduleFront/displayAllSchedule";
	}

	

	@RequestMapping("/saveSchedule")
	public String saveSchedule(Ward_schedule schedule) {
		scheduleRest.saveWardSchedule(schedule);
		// System.out.println("product saved successfully");
		return "redirect:/scheduleFront/displayAllSchedule";

	}

	@RequestMapping("/deleteSchedule/{id}")
	public String deleteStudents(@PathVariable("id") Integer id) {
		scheduleRest.deleteWardSchedule(id);

		return "";
	}

	@RequestMapping(value = "/displayAllSchedule", method = RequestMethod.GET)
	public String displaySchedule(Ward_schedule schedule, ModelMap model) {
		Ward_schedule[] scheduleTable = scheduleRest.getAllWardSchedule(schedule);
		model.addAttribute("scheduleTable", scheduleTable);

		return "wardScheduleTable";

	}
	
	
	@RequestMapping(value = "/displayAllCheckSchedule", method = RequestMethod.GET)
	public String checkDisplaySchedule(Ward_schedule schedule, ModelMap model) {
		Ward_schedule[] scheduleTable = scheduleRest.getAllWardSchedule(schedule);
		model.addAttribute("scheduleTable", scheduleTable);

		return "checkWardScheduleTable";

	}
	
	

	@RequestMapping(value = "searchLeave/{id}", method = RequestMethod.POST)
	public String searchSchedule(@PathVariable("id") Integer id, ModelMap model) {
		Ward_schedule scheduleSearch = scheduleRest.find(id);
		model.addAttribute("scheduleSearch", scheduleSearch);
		return "";
	}

	/*
	 * @RequestMapping(value="schoolAccounts/accDetail/{id}",
	 * method=RequestMethod.GET ) public String searchAccounts(@PathVariable("id")
	 * Integer id, @PathVariable("id")Integer ids, ModelMap model) { //Leave[]
	 * accounts = nurseRest.getAllLeave(id); //model.addAttribute("accounts",
	 * accounts);
	 * 
	 * Ward_schedule leaveId = scheduleRest.find(ids); model.addAttribute("leaveId",
	 * leaveId); return ""; }
	 */

	
	  @RequestMapping(value="/retrieve{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
	  Ward_schedule scheduleIds = scheduleRest.find(id); 
	  model.addAttribute("scheduleIds", scheduleIds);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String searchSchedule2(@RequestParam("Id") Integer id, ModelMap model) {
			Ward_schedule scheduleU = scheduleRest.find(id);
			model.addAttribute("scheduleU", scheduleU);
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
	  
	  
	  @RequestMapping(value = "/displayAll", method = RequestMethod.GET)
		public String displayWardS(Ward leaves, Nurses_staff nurses, ModelMap model) {
			Ward[] wardD = wardRest.getAllWard(leaves);
			model.addAttribute("wardD", wardD);
			
			Nurses_staff[] nurse = nurseRest.getAllNursesStaff(nurses);
			model.addAttribute("nurse", nurse);

			return "wardScheduleForm";

		}
	  
	  
		/*
		 * @RequestMapping(value = "/displayNurse", method = RequestMethod.GET) public
		 * String displayNurseS(Nurses_staff nurses, ModelMap model) { Nurses_staff[]
		 * nurse = nurseRest.getAllNursesStaff(nurses); model.addAttribute("nurse",
		 * nurse);
		 * 
		 * return "nurseTable";
		 * 
		 * }
		 */
	  
	  
	  
		/*<<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	  
		/* check ward individual ward schedule */
	  
	  
	  
	  @RequestMapping(value = "/displayAllCheckMaleMedicalSchedule", method = RequestMethod.GET)
		public String checkMaleMedicalDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.maleMedical();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkMaleMedicalWardScheduleTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllCheckFemaleMedicalSchedule", method = RequestMethod.GET)
		public String checkFemaleMedicalDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.femaleMedical();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkFemaleMedicalWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckMaleSurgicalSchedule", method = RequestMethod.GET)
		public String checkMaleSurgicalDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.maleSurgical();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkMaleSurgicalWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckFemaleSurgicalSchedule", method = RequestMethod.GET)
		public String checkFemaleSurgicalDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.femaleSurgical();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkFemaleSurgicalWardScheduleTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllCheckChildrensWardSchedule", method = RequestMethod.GET)
		public String checkChildrensWardDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.childrens();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkChildrensWardWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckMaternitySchedule", method = RequestMethod.GET)
		public String checkMaternityDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.maternity();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkMaternityWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckGeneralWardSchedule", method = RequestMethod.GET)
		public String checkGeneralWardDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.generalWard();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkGeneralWardWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckNicuSchedule", method = RequestMethod.GET)
		public String checkNicuDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.nicu();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkNicuWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckReligiousWardSchedule", method = RequestMethod.GET)
		public String checkReligiousWardDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.religious();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkReligiousWardWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckAccidentEmergencySchedule", method = RequestMethod.GET)
		public String checkAccidentEmergencyDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.accident();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkAccidentEmergencyWardScheduleTable";

		}
	  
	  @RequestMapping(value = "/displayAllCheckOpdSchedule", method = RequestMethod.GET)
		public String checkOpdDisplaySchedule(Ward_schedule schedule, ModelMap model) {
			Ward_schedule[] scheduleTable = scheduleRest.opd();
			model.addAttribute("scheduleTable", scheduleTable);

			return "checkOpdWardScheduleTable";

		}
	  
		/*<<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	

	  
	  
	  

}
