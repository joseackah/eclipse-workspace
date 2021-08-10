package com.aiti.springmvc.springmvchibernate.passenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aiti.springmvc.springmvchibernate.passenger.entity.Passenger;
import com.aiti.springmvc.springmvchibernate.passenger.services.PassengerService;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerService service;

	public PassengerService getService() {
		
		return service;
	}

	public void setService(PassengerService service) {
		this.service = service;
	}
	
	@RequestMapping("RegistrationPage")
	public String ShowRegistrationPage() {
		
		
		return "UserReg";
		
		
		
	}
	@RequestMapping( value="RegisterUser", method=RequestMethod.POST )
	public String RegisterUser(@ModelAttribute("User") Passenger user, ModelMap model) {
		
		int result = service.save(user);
		model.addAttribute("result", "user created with Id:" + result);
		return "UserReg";
	}

}
