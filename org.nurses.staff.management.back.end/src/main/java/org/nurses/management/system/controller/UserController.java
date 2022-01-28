package org.nurses.management.system.controller;

import org.nurses.management.system.integration.UsersRestClient;
import org.nurses.management.system.integration.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/userFront")
public class UserController {
	
	@Autowired
	UsersRestClient userRest;
	
	
	
	
	
	@RequestMapping("/pr")
	public String accountsDetails(ModelMap model) {
	
		return "";
	
	}
	
	
	
	@RequestMapping("/as")
	public String accounts(ModelMap model) {
	
		return "";
	
	}
	
	

	@RequestMapping("/updateLeave")
	public String updateLeave(@RequestParam(value = "Id", required = false) Integer id, ModelMap model) {

		Users user = userRest.findUser(id);
		model.addAttribute("user", user);
		return "";
	}

	@RequestMapping(value = "updateUsers1/{id}", method = RequestMethod.GET)
	public String searchUsers1(@PathVariable("id") Integer id, ModelMap model) {
		Users users = userRest.findUser(id);
		model.addAttribute("users", users);
		return "usersFormUpdate";
		
	}
	
	@RequestMapping(value = "resultsUsers", method = RequestMethod.GET)
	public String searchL(@RequestParam("id") Integer id, ModelMap model) {
		Users userId = userRest.findUser(id);
		model.addAttribute("userId", userId);
		return "";
	}

	@RequestMapping("/usersUpdate")
	public String update(Users user) {
		userRest.updateUsers(user);
		return "redirect:/userFront/displayAllUser";
	}

	

	@RequestMapping("/saveUsers")
	public String saveUsers(Users users) {
		userRest.saveUsers(users);
		// System.out.println("product saved successfully");
		return "redirect:/userFront/displayAllUser";

	}

	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Integer id) {
		userRest.deleteUsers(id);

		return "redirect:/userFront/displayAllUser";
	}

	@RequestMapping(value = "/displayAllUser", method = RequestMethod.GET)
	public String displayUsers(Users users, ModelMap model) {
		Users[] userT = userRest.getAllUsers(users);
		model.addAttribute("userT", userT);

		return "userTable";

	}

	@RequestMapping(value = "searchUser/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Users userS = userRest.findUser(id);
		model.addAttribute("userS", userS);
		return "";
	}

	@RequestMapping(value="Users/{id}", method=RequestMethod.GET )
	public String searchUser(@PathVariable("id") Integer id, @PathVariable("id")Integer ids, ModelMap model) {
		//Leave[] accounts = nurseRest.getAllLeave(id);
		//model.addAttribute("accounts", accounts);
		
		Users users = userRest.findUser(ids);
		model.addAttribute("users", users);
		return "";
	}

	
	  @RequestMapping(value="/retrieve{Id}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("Id")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
		  Users ids = userRest.findUser(id); 
	  model.addAttribute("ids", ids);
	  
	 
	  
	  return null; //"search"; 
	  }
	 

	
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
		  Users usersUpdate = userRest.findUser(id);
			model.addAttribute("usersUpdate", usersUpdate);
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
