package com.aiti.springmvc.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aiti.springmvc.user.entity.User;
import com.aiti.springmvc.user.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;

	public UserService getService() {
		
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping("/RegistrationPage")
	public String ShowRegistrationPage(@ModelAttribute("users") User user, ModelMap model) {
		model.addAttribute("users", user);
		
		return "UserReg";
		
		
		
	}
	@RequestMapping( value="registerUser", method=RequestMethod.POST)
	public String RegisterUser(@ModelAttribute("users") User user, ModelMap model) {
		
		service.save(user);
		model.addAttribute("result", "user created with Id:" + user.getId());
		//return "UserReg";
		
		return "redirect:getUser";
		
	}
	
	@RequestMapping("/getUser")
	public String getUser(ModelMap model) {
		
		List<User> users = service.getUser();
		model.addAttribute("users", users);
		
		return "displayUsers";
		
	}
	
	@RequestMapping("/updateForm")
	public String showRegForm(@RequestParam("userId") int theId, ModelMap model) {
		
		User user = service.updateUser(theId);
		model.addAttribute("users", user);
		return "updateUser";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("userId") int theId) {
		
		service.deleteUser(theId);
		//model.addAttribute("users", user);
		return "redirect:/users/getUser";
	
	
	}
	
	@RequestMapping(value="editForm", method=RequestMethod.POST)
	public String editUser( int id, ModelMap model) {
		service.updateUser(id);
		model.addAttribute(service.updateUser(id) );
		return "updateUser";
	}
	
	@RequestMapping( value="userEdit", method=RequestMethod.POST)
	public String userEdit(@ModelAttribute("users") User user, ModelMap model) {
		
		service.update(user);
		//model.addAttribute("result", "user created with Id:" + user.getId());
		//return "UserReg";
		
		return "redirect:getUser";
		
	}
}
