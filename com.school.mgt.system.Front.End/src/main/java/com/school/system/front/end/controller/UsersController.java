package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.system.front.end.integration.UsersTableRestClient;
import com.school.system.front.end.integration.dto.UsersTable;




@Controller
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersTableRestClient repo;
	 

	@RequestMapping("/form")
	public String form() {

		return "addUser";
	}

	@RequestMapping("/save")
	public String saveUsers( UsersTable users) {

		 repo.saveUser(users);
		 
		 return "";
	}

	@RequestMapping("/update")
	public String updateUsers( UsersTable users) {
		repo.saveUser(users);
		
		return "";
	}

	@RequestMapping("/delete/{id}")
	public String deleteUsers(@PathVariable("id") Integer id) {
		repo.deleteUser(id);
	return "";	
	
	}
	

	@RequestMapping("getAll")
	public String allUsers(UsersTable users, ModelMap model) {

		UsersTable[] user = repo.getUser(users);
		model.addAttribute("user", user);
		return "";
	}

	/*
	 * @RequestMapping("/find/{id}") public String findById(@PathVariable("id")
	 * Integer id) { return repo.findById(id); }
	 */

}
