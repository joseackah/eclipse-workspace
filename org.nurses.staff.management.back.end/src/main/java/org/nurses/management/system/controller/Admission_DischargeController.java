package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Admission_DischargeRestClient;
import org.nurses.management.system.integration.Delivery_tableRestClient;
import org.nurses.management.system.integration.Newborn_tableRestClient;
import org.nurses.management.system.integration.WardRestClient;
import org.nurses.management.system.integration.dto.Admission_Discharge;
import org.nurses.management.system.integration.dto.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admissionFront")
public class Admission_DischargeController {
	
	@Autowired
	Admission_DischargeRestClient admissionRest;
	
	@Autowired
	WardRestClient wardRest;
	
	@Autowired
	Delivery_tableRestClient deliveryRest;
	
	@Autowired
	Newborn_tableRestClient newbornRest;

	
	
	/* counting admission and discharge up to date */
	
	  @ModelAttribute("countAdmissionToDate") 
	  public String
	  countAdmissionToDate() { 
		  return admissionRest.countAdmissionToDate();
	  
	  }
	  
	  
	  @ModelAttribute("countDischarge") public String
	  countDischarge() { return admissionRest.countDischarge();
	  
	  }
	  
	  @ModelAttribute("countDeath")
	  public String  countDeath() {
		  return admissionRest.countDeath();
		
	}
	  
	  
	/* counting admission and discharge for today */
	  
	  @ModelAttribute("countTodayAdmission") 
	  public String	 countTodayAdmission() { 
		  return admissionRest.countTodayAdmission();
	  
	  }
	  
	  
	  @ModelAttribute("countTodayDischarge") 
	  public String countTodayDischarge() { 
		  return admissionRest.countTodayDischarge();
	  
	  }
	  
	  @ModelAttribute("countTodayDeath")
	  public String  countTodayDeath() {
		  return admissionRest.countTodayDeath();
		
	}
	  
	  
	  
	  
	  
	  
	  
	  
	/* counting admission and discharge for yesterday */
	 
	  @ModelAttribute("countYesterdayAdmission") 
	  public String
	  countYesterdayAdmission() { 
		  return admissionRest.countYesterdayAdmission();
	  
	  }
	  
	  
	  @ModelAttribute("countYesterdayDischarge") public String
	  countYesterdayDischarge() { return admissionRest.countYesterdayDischarge();
	  
	  }
	  
	  @ModelAttribute("countYesterdayDeath")
	  public String  countYesterdayDeath() {
		  return admissionRest.countYesterdayDeath();
		
	}
	
	/* couuting ends */
	
	
	@RequestMapping("/form")
	public String leaveForm(ModelMap model) {
	
		return "admissionForm";
	
	}
	
	@RequestMapping("/admissionProfile")
	public String accountsDetails(ModelMap model) {
	
		return "profilesTry";
	
	}
	
	
	@RequestMapping("/nurseAdmission")
	public String nurseProfile(ModelMap model) {
	
		return "staffProfile";
	
	}
	
	
	
	@RequestMapping("/admission")
	public String accounts(ModelMap model) {
	
		return "addAccounts";
	
	}
	
	

	@RequestMapping("/updateAdmission_Discharge")
	public String updateAdmission_Discharge(@RequestParam("id") Integer id, ModelMap model) {

		Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
		model.addAttribute("admission", admission);
		return "redirect:/admissionFront/displayAllAdmission_Discharge";
	}

	@RequestMapping(value = "updateAdmission_Discharge1/{id}", method = RequestMethod.GET)
	public String searchAdmission_Discharge1(@PathVariable("id") Integer id, ModelMap model) {
		Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
		model.addAttribute("admission", admission);
		return "admissionFormUpdate";
		
	}
	
	
	@RequestMapping(value = "updateAdmission_Discharge11/{id}", method = RequestMethod.GET)
	public String searchAdmission_Discharge11(@PathVariable("id") Integer id, ModelMap model) {
		Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
		model.addAttribute("admission", admission);
		return "admissionUpdate";
		
	}
	
	@RequestMapping(value = "inchargeAdmission_Discharge", method = RequestMethod.GET)
	public String searchLAdmission_Discharge(@RequestParam("id") Integer id, ModelMap model) {
		Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
		model.addAttribute("admission", admission);
		return "leaveUpdateIncharge";
	}

	@RequestMapping("updateDischarge")
	public String updateAdmission_Discharge(Admission_Discharge admission) {
		admissionRest.updateAdmission_Discharge(admission);
		return "redirect:/admissionFront/displayAllAdmission_Discharge";
	}

	
	@RequestMapping("updateIncharge")
	public String updateInchargeAdmission_Discharge(Admission_Discharge admission) {
		admissionRest.updateAdmission_Discharge(admission);
		return "redirect:/admissionFront/displayAllAdmission_Discharge";
	}
	
	

	@RequestMapping("/saveAdmission_Discharge")
	public String saveAdmission_Discharge(Admission_Discharge admission) {
		admissionRest.saveAdmission_Discharge(admission);
		
		return "redirect:/admissionFront/displayAllAdmission_Discharge";

	}

	@RequestMapping("/deleteAdmission_Discharge/{id}")
	public String deleteAdmission_Discharge(@PathVariable("id") Integer id) {
		admissionRest.deleteAdmission_Discharge(id);

		return "redirect:/admissionFront/displayAllAdmission_Discharge";
	}

	@RequestMapping(value = "/displayAllAdmission_Discharge", method = RequestMethod.GET)
	public String displayAdmission_Discharge(Admission_Discharge admissionD, ModelMap model) {
		Admission_Discharge[] admission = admissionRest.getAllAdmission_Discharge(admissionD);
		model.addAttribute("admission", admission);

		return "admissionTable";

	}
	
	@RequestMapping(value = "/displayAllAdmission_DischargeManager", method = RequestMethod.GET)
	public String displayAdmission_DischargeManager(Admission_Discharge admissionD, ModelMap model) {
		Admission_Discharge[] admission = admissionRest.getAllAdmission_Discharge(admissionD);
		model.addAttribute("admission", admission);

		return "admissionManagerTable";

	}
	
	
	@RequestMapping(value = "/displayAdmission_Discharge", method = RequestMethod.GET)
	public String inchargeAdmission_Discharge(Admission_Discharge admissionD, ModelMap model) {
		Admission_Discharge[] admission = admissionRest.getAllAdmission_Discharge(admissionD);
		model.addAttribute("admission", admission);

		return "leaveTableIncharge";

	}
	
	@RequestMapping(value = "/displayAdmissionOnly", method = RequestMethod.GET)
	public String admissionOnly(Admission_Discharge admission, ModelMap model) {
		Admission_Discharge[] admissionOnly =  admissionRest.admissionOnly(admission);
		model.addAttribute("admissionOnly",admissionOnly);
		
		return "admissionOnlyTable";
	}
	
	@RequestMapping(value = "/displayAdmissionOnlyManager", method = RequestMethod.GET)
	public String admissionOnlyManager(Admission_Discharge admission, ModelMap model) {
		Admission_Discharge[] admissionOnly =  admissionRest.admissionOnly(admission);
		model.addAttribute("admissionOnly",admissionOnly);
		
		return "admissionOnlyManagerTable";
	}
	
	
	
	/*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	/* ward specific discharges only table */
	
	
	@RequestMapping(value = "/displayDischargeOnly", method = RequestMethod.GET)
	public String dischargeOnly(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.dischargeOnly(discharge);
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "dischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyMaleMedical", method = RequestMethod.GET)
	public String dischargeOnlyMaleMedical(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.maleMedicalDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "maleMedicaldischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyMaleSurgical", method = RequestMethod.GET)
	public String dischargeOnlyMaleSurgical(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.maleSurgicalDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "maleSurgicaldischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyFemaleMedical", method = RequestMethod.GET)
	public String dischargeOnlyFemaleMedical(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.femaleMedicalDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "femaleMedicaldischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyFemaleSurgical", method = RequestMethod.GET)
	public String dischargeOnlyFemaleSurgical(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.femaleSurgicalDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "femaleSurgicaldischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyMaternity", method = RequestMethod.GET)
	public String dischargeOnlyMaternity(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.maternityDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "maternitydischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyNicu", method = RequestMethod.GET)
	public String dischargeOnlyNicu(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.nicuDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "nicudischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyReligiousWard", method = RequestMethod.GET)
	public String dischargeOnlyReligious(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.religiousDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "religiousWarddischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyChildrensWard", method = RequestMethod.GET)
	public String dischargeOnlyChildrensWard(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.childrensDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "childrensWarddischargeOnlyTable";
	}
	
	@RequestMapping(value = "/displayDischargeOnlyGeneralWard", method = RequestMethod.GET)
	public String dischargeOnlyGeneralWard(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.generalWardDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "generalWarddischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyAccidentEmergency", method = RequestMethod.GET)
	public String dischargeOnlyAccidentEmergency(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.accidentDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "accidentEmergencydischargeOnlyTable";
	}
	
	
	@RequestMapping(value = "/displayDischargeOnlyOpd", method = RequestMethod.GET)
	public String dischargeOnlyOpd(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.opdDischarge();
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "opddischargeOnlyTable";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/displayDischargeOnlyManager", method = RequestMethod.GET)
	public String dischargeOnlyManager(Admission_Discharge discharge, ModelMap model) {
		Admission_Discharge[] dischargeOnly = admissionRest.dischargeOnly(discharge);
		model.addAttribute("dischargeOnly",dischargeOnly);
		
		
		return "dischargeOnlyManagerTable";
	}
	
	
	/* Discharge only ends here */
	/*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	
	

	@RequestMapping(value = "searchAdmission_Discharge/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
		model.addAttribute("admission", admission);
		return "";
	}

	@RequestMapping(value="/accAdmission_Discharge/{id}", method=RequestMethod.GET )
	public String searchAdmission_Discharge(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		//Leave[] accounts = nurseRest.getAllLeave(id);
		//model.addAttribute("accounts", accounts);
		
		Admission_Discharge admissionId = admissionRest.findAdmission_Discharge(ids);
		model.addAttribute("admissionId", admissionId);
		return "";
	}

	
	  @RequestMapping(value="/retrieveAdmission_Discharge{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
		  Admission_Discharge admissionids = admissionRest.findAdmission_Discharge(id); 
	  model.addAttribute("admissionids", admissionids);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping("/updateAdmission_Discharge2/{Id}")
		public String searchh(@RequestParam("Id") Integer id, ModelMap model) {
		  Admission_Discharge admission = admissionRest.findAdmission_Discharge(id);
			model.addAttribute("admission", admission);
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
	  @RequestMapping(value = "/displayWard", method = RequestMethod.GET)
		public String displayLeave(Ward leaves, ModelMap model) {
			Ward[] wardD = wardRest.getAllWard(leaves);
			model.addAttribute("wardD", wardD);

			return "wardTable";

		}
	  
	  /*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
		/* ward death only for ward specific tables */
	  
	  
	  @RequestMapping(value = "/displayDeath", method = RequestMethod.GET)
		public String deathTable(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.deathOnly(admissionD);
			model.addAttribute("admission", admission);

			return "deathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathMaleMedical", method = RequestMethod.GET)
		public String deathTableMaleMedical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maleMedicalDeath();
			model.addAttribute("admission", admission);

			return "maleMedicaldeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathMaleSurgical", method = RequestMethod.GET)
		public String deathTableMaleSurgical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maleSurgicalDeath();
			model.addAttribute("admission", admission);

			return "maleSurgicaldeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathFemaleMedical", method = RequestMethod.GET)
		public String deathTableFemaleMedical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.femaleMedicalDeath();
			model.addAttribute("admission", admission);

			return "femaleMedicaldeathTable";

		} 
	  
	  
	  @RequestMapping(value = "/displayDeathFemaleSurgical", method = RequestMethod.GET)
		public String deathTableFemaleSurgical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.femaleSurgicalDeath();
			model.addAttribute("admission", admission);

			return "femaleSurgicaldeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathMaternity", method = RequestMethod.GET)
		public String deathTableMaternity(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maternityDeath();
			model.addAttribute("admission", admission);

			return "maternitydeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathNicu", method = RequestMethod.GET)
		public String deathTableNicu(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.nicuDeath();
			model.addAttribute("admission", admission);

			return "nicudeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathReligiousWard", method = RequestMethod.GET)
		public String deathTableReligious(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.religiousDeath();
			model.addAttribute("admission", admission);

			return "religiousWarddeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathChildrensWard", method = RequestMethod.GET)
		public String deathTableChildrens(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.childrensDeath();
			model.addAttribute("admission", admission);

			return "childrensWarddeathTable";

		}
	  
	  
	  @RequestMapping(value = "/displayDeathGeneralWard", method = RequestMethod.GET)
		public String deathTableGeneralWard(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.generalWardDeath();
			model.addAttribute("admission", admission);

			return "generalWarddeathTable";

		}
	  
	  @RequestMapping(value = "/displayDeathAccidentEmergency", method = RequestMethod.GET)
		public String deathTableAccidentEmergency(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.accidentDeath();
			model.addAttribute("admission", admission);

			return "accidentEmergencydeathTable";

		}
	  
	  @RequestMapping(value = "/displayDeathOpd", method = RequestMethod.GET)
		public String deathTableOpd(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.opdDeath();
			model.addAttribute("admission", admission);

			return "opddeathTable";

		}
	  
	  
	  
	  
	  
	  @RequestMapping(value = "/displayManagerDeath", method = RequestMethod.GET)
		public String deathManagerTable(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.deathOnly(admissionD);
			model.addAttribute("admission", admission);

			return "deathManagerTable";

		}
	  
	  
	  
		/*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	  
		/* ward admissions only tables*/
	  
	  @RequestMapping(value="maleMedical", method = RequestMethod.GET)
	  public String maleMedical(ModelMap model) {
		  Admission_Discharge[] maleMedical = admissionRest.maleMedical();
		  model.addAttribute("admission", maleMedical);
		  
		  return "maleMedicaladmissionTable";
	  }
	  
	  
	  @RequestMapping(value="femaleMedical", method = RequestMethod.GET)
	  public String femaleMedical(ModelMap model) {
		  Admission_Discharge[] femaleMedical = admissionRest.femaleMedical();
		  model.addAttribute("admission", femaleMedical);
		  
		  return "femaleMedicaladmissionTable";
	  }
	  
	  @RequestMapping(value="maleSurgical", method = RequestMethod.GET)
	  public String maleSurgical(ModelMap model) {
		  Admission_Discharge[] maleSurgical = admissionRest.maleSurgical();
		  model.addAttribute("admission", maleSurgical);
		  
		  return "maleSurgicaladmissionTable";
	  }
	  
	  @RequestMapping(value="femaleSurgical", method = RequestMethod.GET)
	  public String femaleSurgical(ModelMap model) {
		  Admission_Discharge[] femaleSurgical = admissionRest.femaleSurgical();
		  model.addAttribute("admission", femaleSurgical);
		  
		  return "femaleSurgicaladmissionTable";
	  }
	  
	  
	  @RequestMapping(value="maternity", method = RequestMethod.GET)
	  public String maternity(ModelMap model) {
		  Admission_Discharge[] maternity = admissionRest.maternity();
		  model.addAttribute("admission", maternity);
		  
		  return "maternityadmissionTable";
	  }
	  
	  
	  @RequestMapping(value="generalWard", method = RequestMethod.GET)
	  public String generalWard(ModelMap model) {
		  Admission_Discharge[] generalWard = admissionRest.generalWard();
		  model.addAttribute("admission", generalWard);
		  
		  return "generalWardadmissionTable";
	  }
	  
	  @RequestMapping(value="religiousWard", method = RequestMethod.GET)
	  public String religiousWard(ModelMap model) {
		  Admission_Discharge[] religiousWard = admissionRest.religious();
		  model.addAttribute("admission", religiousWard);
		  
		  return "religiousWardadmissionTable";
	  }
	  
	  
	  @RequestMapping(value="childrensWard", method = RequestMethod.GET)
	  public String childrensWard(ModelMap model) {
		  Admission_Discharge[] childrensWard = admissionRest.childrens();
		  model.addAttribute("admission", childrensWard);
		  
		  return "childrensWardadmissionTable";
	  }
	  
	  
	  @RequestMapping(value="accidentEmergency", method = RequestMethod.GET)
	  public String accidentEmergency(ModelMap model) {
		  Admission_Discharge[] accidentEmergency = admissionRest.accident();
		  model.addAttribute("admission", accidentEmergency);
		  
		  return "accidentEmergencyadmissionTable";
	  }
	  
	  @RequestMapping(value="nicu", method = RequestMethod.GET)
	  public String nicu(ModelMap model) {
		  Admission_Discharge[] nicu = admissionRest.nicu();
		  model.addAttribute("admission", nicu);
		  
		  return "nicuadmissionTable";
	  }
	  
	  
	  @RequestMapping(value="opd", method = RequestMethod.GET)
	  public String opd(ModelMap model) {
		  Admission_Discharge[] opd = admissionRest.opd();
		  model.addAttribute("admission", opd);
		  
		  return "opdadmissionTable";
	  }

	  /*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/


		/* displaying admission and discharge table of various wards */
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeMaleMedical", method = RequestMethod.GET)
		public String displayAdmission_DischargeMaleMedical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maleMedical();
			model.addAttribute("admission", admission);

			return "maleMedicalDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeMaleSurgical", method = RequestMethod.GET)
		public String displayAdmission_DischargeMaleSurgical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maleSurgical();
			model.addAttribute("admission", admission);

			return "maleSurgicalDischarge_admissionTable";

		}
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeFemaleMedical", method = RequestMethod.GET)
		public String displayAdmission_DischargeFemaleMedical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.femaleMedical();
			model.addAttribute("admission", admission);

			return "femaleMedicalDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeFemaleSurgical", method = RequestMethod.GET)
		public String displayAdmission_DischargeFemaleSurgical(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.femaleSurgical();
			model.addAttribute("admission", admission);

			return "femaleSurgicalDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeMaternity", method = RequestMethod.GET)
		public String displayAdmission_DischargeMaternity(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.maternity();
			model.addAttribute("admission", admission);

			return "maternityDischarge_admissionTable";

		}
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeNicu", method = RequestMethod.GET)
		public String displayAdmission_DischargeNicu(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.nicu();
			model.addAttribute("admission", admission);

			return "nicuDischarge_admissionTable";

		}
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeReligiousWard", method = RequestMethod.GET)
		public String displayAdmission_DischargeReligiousWard(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.religious();
			model.addAttribute("admission", admission);

			return "religiousWardDischarge_admissionTable";

		}
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeChildrensWard", method = RequestMethod.GET)
		public String displayAdmission_DischargeChildrensWard(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.childrens();
			model.addAttribute("admission", admission);

			return "childrensWardDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeGeneralWard", method = RequestMethod.GET)
		public String displayAdmission_DischargeGeneralWard(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.generalWard();
			model.addAttribute("admission", admission);

			return "generalWardDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeAccidentEmergency", method = RequestMethod.GET)
		public String displayAdmission_DischargeAccidentEmergency(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.accident();
			model.addAttribute("admission", admission);

			return "accidentEmergencyDischarge_admissionTable";

		}
	  
	  
	  @RequestMapping(value = "/displayAllAdmission_DischargeOpd", method = RequestMethod.GET)
		public String displayAdmission_DischargeOpd(Admission_Discharge admissionD, ModelMap model) {
			Admission_Discharge[] admission = admissionRest.opd();
			model.addAttribute("admission", admission);

			return "opdDischarge_admissionTable";

		}


	  /*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/


	  
	  
	  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		
		@ModelAttribute("countAdmissionJanuary")
		public String countAdmissionJanuary() {
			return admissionRest.countAdmissionJanuary();
		}
		
		
		
		@ModelAttribute("countAdmissionFebruary")
		public String countAdmissionFebruary() {
			return admissionRest.countAdmissionFebruary();
		}
		
		
		@ModelAttribute("countAdmissionMarch")
		public String countAdmissionMarch() {
			return admissionRest.countAdmissionMarch();
		}
		
		
		@ModelAttribute("countAdmissionApril")
		public String countAdmissionApril() {
			return admissionRest.countAdmissionApril();
		}
		
		
		@ModelAttribute("countAdmissionMay")
		public String countAdmissionMay() {
			return admissionRest.countAdmissionMay();
		}
		
		
		@ModelAttribute("countAdmissionJune")
		public String countAdmissionJune() {
			return admissionRest.countAdmissionJune();
		}
		
		
		@ModelAttribute("countAdmissionJuly")
		public String countAdmissionJuly() {
			return admissionRest.countAdmissionJuly();
		}
		
		
		@ModelAttribute("countAdmissionAugust")
		public String countAdmissionAugust() {
			return admissionRest.countAdmissionAugust();
		}
		
		
		@ModelAttribute("countAdmissionSeptember")
		public String countAdmissionSeptember() {
			return admissionRest.countAdmissionSeptember();
		}
		
		
		@ModelAttribute("countAdmissionOctober")
		public String countAdmissionOctober() {
			return admissionRest.countAdmissionOctober();
		}
		
		
		@ModelAttribute("countAdmissionNovember")
		public String countAdmissionNovember() {
			return admissionRest.countAdmissionNovember();
		}
		
		
		@ModelAttribute("countAdmissionDecember")
		public String countAdmissionDecember() {
			return admissionRest.countAdmissionDecember();
		}
		
		
		
		
		
	/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		@ModelAttribute("countDischargeJanuary")
		public String countDischargeJanuary() {
			return admissionRest.countDischargeJanuary();
		}
		
		
		
		@ModelAttribute("countDischargeFebruary")
		public String countDischargeFebruary() {
			return admissionRest.countDischargeFebruary();
		}
		
		
		@ModelAttribute("countDischargeMarch")
		public String countDischargeMarch() {
			return admissionRest.countDischargeMarch();
		}
		
		
		@ModelAttribute("countDischargeApril")
		public String countDischargeApril() {
			return admissionRest.countDischargeApril();
		}
		
		
		@ModelAttribute("countDischargeMay")
		public String countDischargeMay() {
			return admissionRest.countDischargeMay();
		}
		
		
		@ModelAttribute("countDischargeJune")
		public String countDischargeJune() {
			return admissionRest.countDischargeJune();
		}
		
		
		@ModelAttribute("countDischargeJuly")
		public String countDischargeJuly() {
			return admissionRest.countDischargeJuly();
		}
		
		
		@ModelAttribute("countDischargeAugust")
		public String countDischargeAugust() {
			return admissionRest.countDischargeAugust();
		}
		
		
		@ModelAttribute("countDischargeSeptember")
		public String countDischargeSeptember() {
			return admissionRest.countDischargeSeptember();
		}
		
		
		@ModelAttribute("countDischargeOctober")
		public String countDischargeOctober() {
			return admissionRest.countDischargeOctober();
		}
		
		
		@ModelAttribute("countDischargeNovember")
		public String countDischargeNovember() {
			return admissionRest.countDischargeNovember();
		}
		
		
		@ModelAttribute("countDischargeDecember")
		public String countDischargeDecember() {
			return admissionRest.countDischargeDecember();
		}
		
		
		
	/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		@ModelAttribute("countDeathJanuary")
		public String countDeathJanuary() {
			return admissionRest.countDeathJanuary();
		}
		
		
		
		@ModelAttribute("countDeathFebruary")
		public String countDeathFebruary() {
			return admissionRest.countDeathFebruary();
		}
		
		
		@ModelAttribute("countDeathMarch")
		public String countDeathMarch() {
			return admissionRest.countDeathMarch();
		}
		
		
		@ModelAttribute("countDeathApril")
		public String countDeathApril() {
			return admissionRest.countDeathApril();
		}
		
		
		@ModelAttribute("countDeathMay")
		public String countDeathMay() {
			return admissionRest.countDeathMay();
		}
		
		
		@ModelAttribute("countDeathJune")
		public String countDeathJune() {
			return admissionRest.countDeathJune();
		}
		
		
		@ModelAttribute("countDeathJuly")
		public String countDeathJuly() {
			return admissionRest.countDeathJuly();
		}
		
		
		@ModelAttribute("countDeathAugust")
		public String countDeathAugust() {
			return admissionRest.countDeathAugust();
		}
		
		
		@ModelAttribute("countDeathSeptember")
		public String countDeathSeptember() {
			return admissionRest.countDeathSeptember();
		}
		
		
		@ModelAttribute("countDeathOctober")
		public String countDeathOctober() {
			return admissionRest.countDeathOctober();
		}
		
		
		@ModelAttribute("countDeathNovember")
		public String countDeathNovember() {
			return admissionRest.countDeathNovember();
		}
		
		
		@ModelAttribute("countDeathDecember")
		public String countDeathDecember() {
			return admissionRest.countDeathDecember();
		}
		
		
		
		
		/* Count type of delivery */
		@RequestMapping("countSpontaneousDelivery")
		public String countSpontaneousDelivery() {
			return deliveryRest.countSpontaneousVaginalDelivery();

		}

		@RequestMapping("countCs")
		public String countCs() {
			return deliveryRest.countCs();

		}

		@RequestMapping("countSVDWithEpis")
		public String countSVDWithEpis() {
			return deliveryRest.countSVDWithEpis();

		}

		@RequestMapping("countVacuumExtraction")
		public String countVacuumExtraction() {
			return deliveryRest.countVacuumExtraction();
		}

		@RequestMapping("countSVDAugument")
		public String countSVDAugument() {
			return deliveryRest.SVDAugument();
		}

		@RequestMapping("contSVDInduce")
		public String countSVDInduce() {
			return deliveryRest.countSVDInduce();
		}

		@RequestMapping("countDelivery")
		public String countDelivery() {
			return deliveryRest.countDelivery();
		}

		/* Counting delivery from january to december */

		@RequestMapping("/countDeliveryJanuary")
		public String countDeliveryJanuary() {
			return deliveryRest.countDeliveryJanuary();
		}

		@RequestMapping("countDeliveryFebruary")
		public String countDeliveryFebruary() {
			return deliveryRest.countDeliveryFebruary();
		}

		@RequestMapping("countDeliveryMarch")
		public String countDeliveryMarch() {
			return deliveryRest.countDeliveryMarch();
		}

		@RequestMapping("countDeliveryApril")
		public String countDeliveryApril() {
			return deliveryRest.countDeliveryApril();
		}

		@RequestMapping("countDeliveryMay")
		public String countDeliveryMay() {
			return deliveryRest.countDeliveryMay();
		}

		@RequestMapping("countDeliveryJune")
		public String countDeliveryJune() {
			return deliveryRest.countDeliveryJune();
		}

		@RequestMapping("countDeliveryJuly")
		public String countDeliveryJuly() {
			return deliveryRest.countDeliveryJuly();
		}

		@RequestMapping("countDeliveryAugust")
		public String countDeliveryAugust() {
			return deliveryRest.countDeliveryAugust();
		}

		@RequestMapping("countDeliverySeptember")
		public String countDeliverySeptember() {
			return deliveryRest.countDeliverySeptember();
		}

		@RequestMapping("countDeliveryOctober")
		public String countDeliveryOctober() {
			return deliveryRest.countDeliveryOctober();
		}

		@RequestMapping("countDeliveryNovember")
		public String countDeliveryNovember() {
			return deliveryRest.countDeliveryNovember();
		}

		@RequestMapping("countDeliveryDecember")
		public String countDeliveryDecember() {
			return deliveryRest.countDeliveryDecember();
		}
		
		
		
		/* Count newborns */
		
		@RequestMapping("countTotalNumberOfBabies")
		public String countTotalNumberOfBabie() {
			return newbornRest.countTotalNumberOfBabies();
			
		}
		
	/* Counting Newborn from january to december */
		
		@RequestMapping("/countNewbornJanuary")
		public String countNewbornJanuary() {
			return newbornRest.countNewbornJanuary();
		}
		
		
		
		@RequestMapping("countNewbornFebruary")
		public String countNewbornFebruary() {
			return newbornRest.countNewbornFebruary();
		}
		
		
		@RequestMapping("countNewbornMarch")
		public String countNewbornMarch() {
			return newbornRest.countNewbornMarch();
		}
		
		
		@RequestMapping("countNewbornApril")
		public String countNewbornApril() {
			return newbornRest.countNewbornApril();
		}
		
		
		@RequestMapping("countNewbornMay")
		public String countNewbornMay() {
			return newbornRest.countNewbornMay();
		}
		
		
		@RequestMapping("countNewbornJune")
		public String countNewbornJune() {
			return newbornRest.countNewbornJune();
		}
		
		
		@RequestMapping("countNewbornJuly")
		public String countNewbornJuly() {
			return newbornRest.countNewbornJuly();
		}
		
		
		@RequestMapping("countNewbornAugust")
		public String countNewbornAugust() {
			return newbornRest.countNewbornAugust();
		}
		
		
		@RequestMapping("countNewbornSeptember")
		public String countNewbornSeptember() {
			return newbornRest.countNewbornSeptember();
		}
		
		
		@RequestMapping("countNewbornOctober")
		public String countNewbornOctober() {
			return newbornRest.countNewbornOctober();
		}
		
		
		@RequestMapping("countNewbornNovember")
		public String countNewbornNovember() {
			return newbornRest.countNewbornNovember();
		}
		
		
		@RequestMapping("countNewbornDecember")
		public String countNewbornDecember() {
			return newbornRest.countNewbornDecember();
		}


}
