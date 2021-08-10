package com.ecommerce.front.END.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.front.END.integration.UsersTableRestClient;
import com.ecommerce.front.END.integration.dto.EcommerceProduct;
import com.ecommerce.front.END.integration.dto.UsersTable;

@Controller
@RequestMapping("/users")
public class UsersTableController {
	
	@Autowired
	UsersTableRestClient  usersRest;
	

	
	@RequestMapping("userForm")
	public String addUser(ModelMap model) {
		
		return "addUser";
	}
	
	@RequestMapping("userUpdate")
	public String updateUser(ModelMap model) {
		
		return "update";
	}
	
	
	@RequestMapping(value="saveUser", method=RequestMethod.POST)
	public String saveUser(UsersTable users) {
		usersRest.saveUsers(users);
		
		return "redirect:/users/getAll";
	}
	
	@RequestMapping("/updateUsers")
	public String updateUser(UsersTable users, ModelMap model) {
		usersRest.updateUser(users);
		model.addAttribute("users", users);
		
		return "redirect:/users/getAll";
	}
	
	@RequestMapping(value="lookUp", method=RequestMethod.GET)
	public String searchUser(@RequestParam("id")Integer id, ModelMap model) {
		UsersTable users = usersRest.getById(id);
		model.addAttribute("users", users);
		return "updateUser";
	}
	
	
	
	@RequestMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Integer id) {
		usersRest.deleteUser(id);
		return "redirect:/users/getAll";
	}
	
	@RequestMapping("/getAll")
	public String getAllUsers(UsersTable users, ModelMap model) {
		
		UsersTable[] usersTable	= usersRest.getAll(users);
		model.addAttribute("usersTable", usersTable);
		
		return "getAllUsers";
	}
	
	@RequestMapping(value="find", method=RequestMethod.POST)
	public String findById(@RequestParam("id")int id, ModelMap model) {
		
		UsersTable users = usersRest.getById(id);
		model.addAttribute("users", users);
		
		return "updateUser";
		
	}

}
