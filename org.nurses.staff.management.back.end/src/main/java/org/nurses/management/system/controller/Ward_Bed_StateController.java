package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Ward_Bed_StateRestClient;
import org.nurses.management.system.integration.dto.Ward_Bed_State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bedStateFront")
public class Ward_Bed_StateController {
	
	@Autowired
	Ward_Bed_StateRestClient bedRest;
	
	
	
	@RequestMapping("/bedStateForm")
	public String bedStateForm(ModelMap model) {
	
		return "leaveForm";
	
	}
	
	@RequestMapping("/bedStateProfile")
	public String bedStateDetails(ModelMap model) {
	
		return "profilesTry";
	
	}
	
	
	@RequestMapping("/nursebedStateProfile")
	public String bedStateProfile(ModelMap model) {
	
		return "staffProfile";
	
	}
	
	
	
	@RequestMapping("/accountsbedState")
	public String bedState(ModelMap model) {
	
		return "addAccounts";
	
	}
	
	

	@RequestMapping("/update")
	public String updateWard_Bed_State(@RequestParam("id") Integer id, ModelMap model) {

		Ward_Bed_State bedState = bedRest.find(id);
		model.addAttribute("bedState", bedState);
		return "redirect:/leaveFront/displayAllLeave";
	}

	@RequestMapping(value = "updateWard_Bed_State1/{id}", method = RequestMethod.GET)
	public String searchLeave1(@PathVariable("id") Integer id, ModelMap model) {
		Ward_Bed_State bedState = bedRest.find(id);
		model.addAttribute("bedState", bedState);
		return "leaveUpdate";
		
	}
	
	@RequestMapping(value = "inchargeWard_Bed_State", method = RequestMethod.GET)
	public String searchL(@RequestParam("id") Integer id, ModelMap model) {
		Ward_Bed_State bedState = bedRest.find(id);
		model.addAttribute("bedState", bedState);
		return "leaveUpdateIncharge";
	}

	@RequestMapping("updateWard_Bed_State")
	public String update(Ward_Bed_State leave) {
		bedRest.updateWard_Bed_State(leave);
		return "redirect:/leaveFront/displayAllLeave";
	}

	
	@RequestMapping("updateInchargeWard_Bed_State")
	public String updateInchargebedState(Ward_Bed_State bedState) {
		bedRest.updateWard_Bed_State(bedState);
		return "redirect:/leaveFront/displayAllRecom";
	}
	
	

	@RequestMapping("/saveWard_Bed_State")
	public String savebedState(Ward_Bed_State bedState) {
		bedRest.saveWard_Bed_State(bedState);
		// System.out.println("product saved successfully");
		return "redirect:/bedStateFront/displayAllWard_Bed_State";

	}

	@RequestMapping("/deleteWard_Bed_State/{id}")
	public String deleteStudents(@PathVariable("id") Integer id) {
		bedRest.deleteWard_Bed_State(id);

		return "redirect:/leaveFront/displayAllLeave";
	}

	@RequestMapping(value = "/displayAllWard_Bed_State", method = RequestMethod.GET)
	public String displayLeave(Ward_Bed_State bedStates, ModelMap model) {
		Ward_Bed_State[] bedState = bedRest.getAllWard_Bed_State(bedStates);
		model.addAttribute("bedState", bedState);

		return "wardStateTable";

	}
	
	
	@RequestMapping(value = "/displayAllWard_Bed_StateRecom", method = RequestMethod.GET)
	public String inchargeLeave(Ward_Bed_State bedStates, ModelMap model) {
		Ward_Bed_State[] bedState = bedRest.getAllWard_Bed_State(bedStates);
		model.addAttribute("bedState", bedState);

		return "leaveTableIncharge";

	}
	
	

	@RequestMapping(value = "searchWard_Bed_State/{id}", method = RequestMethod.POST)
	public String searchWard_Bed_State(@PathVariable("id") Integer id, ModelMap model) {
		Ward_Bed_State bedState = bedRest.find(id);
		model.addAttribute("bedState", bedState);
		return "";
	}

	@RequestMapping(value="/accWard_Bed_State/{id}", method=RequestMethod.GET )
	public String searchWard_Bed_States(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		//Leave[] accounts = nurseRest.getAllLeave(id);
		//model.addAttribute("accounts", accounts);
		
		Ward_Bed_State bedStateId = bedRest.find(ids);
		model.addAttribute("bedStateId", bedStateId);
		return "";
	}

	
	  @RequestMapping(value="/retrieveWard_Bed_State{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
		  Ward_Bed_State idsbedState = bedRest.find(id); 
	  model.addAttribute("idsbedState", idsbedState);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping(name="updateWard_Bed_State2/{Id}", method=RequestMethod.POST)
		public String searchhWard_Bed_State(@RequestParam("Id") Integer id, ModelMap model) {
		  Ward_Bed_State bedState = bedRest.find(id);
			model.addAttribute("bedState", bedState);
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
	  
	  
		/* ward individual ward/bed state */
	  
	  
	  @RequestMapping(value = "/displayAllMaleMedicalWard_Bed_State", method = RequestMethod.GET)
		public String maleMedicalWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.maleMedical();
			model.addAttribute("bedState", bedState);

			return "maleMedicalwardStateTable";
			
			
	  }
	  
	  
	  
	  @RequestMapping(value = "/displayAllfemaleMedicalWard_Bed_State", method = RequestMethod.GET)
		public String femaleMedicalWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.femaleMedical();
			model.addAttribute("bedState", bedState);

			return "femaleMedicalwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllMaleSurgicalWard_Bed_State", method = RequestMethod.GET)
		public String maleSurgicalWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.maleSurgical();
			model.addAttribute("bedState", bedState);

			return "maleSurgicalwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllFemaleSurgicalWard_Bed_State", method = RequestMethod.GET)
		public String femaleSurgicalWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.femaleSurgical();
			model.addAttribute("bedState", bedState);

			return "femaleSurgicalwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllChildrensWarWard_Bed_State", method = RequestMethod.GET)
		public String childrensWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.childrens();
			model.addAttribute("bedState", bedState);

			return "childrensWardwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllMaternityWard_Bed_State", method = RequestMethod.GET)
		public String maternityWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.maternity();
			model.addAttribute("bedState", bedState);

			return "maternitywardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllGeneralWardWard_Bed_State", method = RequestMethod.GET)
		public String generalWardWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.generalWard();
			model.addAttribute("bedState", bedState);

			return "generalWardwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllNicuWard_Bed_State", method = RequestMethod.GET)
		public String nicuWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.nicu();
			model.addAttribute("bedState", bedState);

			return "nicuwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllReligiousWardWard_Bed_State", method = RequestMethod.GET)
		public String religiousWardWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.religious();
			model.addAttribute("bedState", bedState);

			return "religiousWardwardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllAccidentEmergencyWard_Bed_State", method = RequestMethod.GET)
		public String accidentEmergencyWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.accident();
			model.addAttribute("bedState", bedState);

			return "accidentEmergencywardStateTable";
			
			
	  }
	  
	  @RequestMapping(value = "/displayAllopdWard_Bed_State", method = RequestMethod.GET)
		public String opdWardState(Ward_Bed_State bedStates, ModelMap model) {
			Ward_Bed_State[] bedState = bedRest.opd();
			model.addAttribute("bedState", bedState);

			return "opdwardStateTable";
			
			
	  }
	  
	  /* ward/bed state counting */
		
		
		@ModelAttribute("midnightRemain")
		public String countMidnightRemain() {
			return bedRest.countRemainAtMidnight();
			
		}
		
		@ModelAttribute("criticalPatient")
		public String countCriticalPatient() {
			return bedRest.countTotalCriticalIll();
			
		}
		
		@ModelAttribute("floorPatient")
		public String countFloorPatient() {
			return bedRest.countTotalFloorPatient();
		}
		
		@ModelAttribute("abscondedPatient")
		public String abscondedPatient() {
			return bedRest.countAbsconded();
			
		}


}
