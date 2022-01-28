package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.AccountsRestClient;
import com.school.system.front.end.integration.dto.Accounts;
import com.school.system.front.end.integration.dto.Students;

@Controller
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/schoolAccounts")
public class AccountsController {
	
	@Autowired
	AccountsRestClient account;
	
	
	
	
	
	@RequestMapping("/accountsDetails")
	public String accountsDetails(ModelMap model) {
	
		return "accountsDetails";
	
	}
	
	
	
	@RequestMapping("/accounts")
	public String accounts(ModelMap model) {
	
		return "addAccounts";
	
	}
	
	

	@RequestMapping("/updateAccounts")
	public String updateStudents(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Accounts accounts = account.find(id);
		model.addAttribute("accounts", accounts);
		return "";
	}

	@RequestMapping(value = "updateAccounts1", method = RequestMethod.GET)
	public String searchStud(@RequestParam("Id") Integer id, ModelMap model) {
		Accounts accounts = account.find(id);
		model.addAttribute("account", accounts);
		return "";
		
	}
	
	@RequestMapping(value = "resultsAccount", method = RequestMethod.GET)
	public String searchResults(@RequestParam("studentId") Integer id, ModelMap model) {
		Accounts accounts = account.find(id);
		model.addAttribute("accounts", accounts);
		return "";
	}

	@RequestMapping("/updateAcc")
	public String update(Accounts accounts) {
		account.updateAccount(accounts);
		return "redirect:displayStudents";
	}

	@RequestMapping("/saveAccounts")
	public String saveStudents(Accounts accounts, @RequestParam("amount_due") Double due, @RequestParam("amount_paid")Double paid, Double balance, @RequestParam("paying") double paying) {
		
		/*
		 * Double amount_due = 0.0; Double amount_paid = 0.0; Double balance =
		 * amount_due - amount_paid;
		 */
		paid = paying;
		 balance = due - paid; 
		account.saveAccount(accounts);
		return "redirect:displayAccounts";
	}

	@RequestMapping("/moreAccounts")
	public String saveMoreStudents(Accounts accounts) {
		account.saveAccount(accounts);
		// System.out.println("product saved successfully");
		return "";

	}

	@RequestMapping("/deleteAccounts/{id}")
	public String deleteStudents(@PathVariable("id") Integer id) {
		account.deleteAccount(id);

		return "";
	}

	@RequestMapping(value = "/displayAccounts", method = RequestMethod.GET)
	public String displayStudents(Accounts accounts, ModelMap model) {
		Accounts[] accountss = account.getAllAccounts(accounts);
		model.addAttribute("accountss", accountss);

		return "allAccountsRecords";

	}

	@RequestMapping(value = "searchStudents/{id}", method = RequestMethod.POST)
	public String searchStudent(@PathVariable("id") Integer id, ModelMap model) {
		Accounts accounts = account.find(id);
		model.addAttribute("accounts", accounts);
		return "update";
	}

	@RequestMapping(value="schoolAccounts/accDetail/{id}", method=RequestMethod.GET )
	public String searchAccounts(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		Accounts[] accounts = account.findAllById(id);
		model.addAttribute("accounts", accounts);
		
		Accounts accountT = account.find(ids);
		model.addAttribute("accountT", accountT);
		return "accountsDetails";
	}

	
	  @RequestMapping(value="/retrieve{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
	  Accounts ids = account.find(id); 
	  model.addAttribute("ids", ids);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	/*
	 * @RequestMapping(value="displayName", method=RequestMethod.POST) public String
	 * displayNameEcomProduct(@RequestParam("name")String name, ModelMap model) {
	 * Integer name2 = Integer.parseInt(name); //EcommerceProduct[] ecommProduct =
	 * teacherAddressRestClient.(name2); //model.addAttribute("ecommProduct",
	 * ecommProduct);
	 * 
	 * 
	 * return "searchName";
	 * 
	 * }
	 */
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
			Accounts accounts = account.find(id);
			model.addAttribute("accounts", accounts);
			return "";
		}
	  
	  @RequestMapping(value="look", method=RequestMethod.GET)
		public String lookForId(String student_id, Model model) { 
		  String accounts = account.lookLastId(student_id);
			model.addAttribute("student", accounts);
			return "search";
		}
	  
	  @RequestMapping(value = "last", method = RequestMethod.GET)
		public String lastId(Students students, ModelMap model) {
			//Accounts accounts = account.findLastId(students);
			//model.addAttribute("accounts", accounts);
			return "search";
		}
	  
		/* method for counting students start here */
	  
	  @ModelAttribute("count")
	  public String countStudent() {
		  return account.count();
	  }
	  
	  @ModelAttribute("countMale")
	  public String countStudentMale() {
		  return account.countMale();
	  }
	  
	  
	  @ModelAttribute("countFemale")
	  public String countStudentFemale() {
		  return account.countFemale();
	  }
	  
	  
		
		/* counting year 1 methods */
		
		@ModelAttribute("countYear1")
		public String countYear1() {
			return account.countYear1();
		}
		
		
		@ModelAttribute("countYear1Male")
		public String countYear1Male() {
			return account.countYear1Male();
		}
		
		
		
		@ModelAttribute("countYear1Female")
		public String countYear1Female() {
			return account.countYear1Female();
		}
		
		
		/* counting year 2 methods */
		
		@ModelAttribute("countYear2")
		public String countYear2() {
			return account.countYear2();
		}
		
		
		@ModelAttribute("countYear2Male")
		public String countYear2Male() {
			return account.countYear2Male();
		}
		
		
		
		@ModelAttribute("countYear2Female")
		public String countYear2Female() {
			return account.countYear2Female();
		}
		
		
		/* counting year 3 methods */
		
		@ModelAttribute("countYear3")
		public String countYear3() {
			return account.countYear3();
		}
		
		
		@ModelAttribute("countYear3Male")
		public String countYear3Male() {
			return account.countYear3Male();
		}
		
		
		
		@ModelAttribute("countYear3Female")
		public String countYear3Female() {
			return account.countYear3Female();
		}
	  
		/* method for counting students end here */
	  
	  
		/* counting teachers methods */

		/*
		 * @ModelAttribute("countTeachers") public String countTeachers() { return
		 * account.countTeachers(); }
		 * 
		 * 
		 * @ModelAttribute("countTeacherMale") public String countTeacherMale() { return
		 * account.countTeacherMale(); }
		 * 
		 * 
		 * 
		 * @ModelAttribute("countTeacherFemale") public String countTeacherFemale() {
		 * return teachersRestClient.countTeacherFemale(); }
		 */
		
		/* method to get certificate */
		
		
		@RequestMapping(value="/certificate", method=RequestMethod.POST)
		public String cert(@RequestParam("studentId") Integer id, ModelMap model) {
			Accounts accounts = account.find(id);
			model.addAttribute("accounts", accounts);
			return "";
		}
	  
	  
		/*
		 * @RequestMapping("/profiles") public String profiles(Students students,
		 * ModelMap model) { Students[] studentS =
		 * studentsRestClient.getAllStudents(students); model.addAttribute("student",
		 * studentS);
		 * 
		 * 
		 * return "profiles"; }
		 */
	  
	  
		
	  
		
		
		
		 
		 
}
