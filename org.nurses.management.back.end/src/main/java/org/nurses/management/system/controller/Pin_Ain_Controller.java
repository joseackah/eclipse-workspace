package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Pin_Ain;
import org.nurses.management.system.repos.Pin_Ain_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8084")
@RestController
@RequestMapping("/pin_ain")
public class Pin_Ain_Controller {
	
	Pin_Ain pin = new Pin_Ain();
	
	
	@Autowired
	Pin_Ain_Repository pinAinRepos;
	
	
	@PostMapping("/savePin")
	public Pin_Ain savePin(@RequestBody Pin_Ain pin) {
		return pinAinRepos.save(pin);
	}
	
	
	//@PostMapping("/saveMorePin")
	public Pin_Ain saveMorePin() {
		
			
		return null;
	}
	
	/*
	 * @PostMapping("/saveMorePin")
	 * 
	 * @Transactional public List<Pin_Ain> saveAll(List<Pin_Ain> studentList) {
	 * List<Pin_Ain> response = (List<Pin_Ain>) pinAinRepos.saveAll(studentList);
	 * return response; }
	 */
	
	
	
	@PostMapping("/saveMorePin")
	public List<Pin_Ain> saveAll(@RequestBody List<Pin_Ain> pin) {
		List<Pin_Ain> pins = (List<Pin_Ain>) pinAinRepos.saveAll(pin);
		return pins;
	}
	
	
	
	 
	
	@PutMapping("/updatePin")
	public Pin_Ain updatePin(@RequestBody Pin_Ain pin) {
		return pinAinRepos.save(pin);
	}
	
	
	@GetMapping("/getAllPin")
	public List<Pin_Ain> getAllPin(){
		
		return pinAinRepos.findAll();
		
		
	}
	
	
	@GetMapping("/getPinById/{id}")
	public Optional<Pin_Ain> findById(@PathVariable("id") Long id){
		return pinAinRepos.findById(id);
	}
	
	@DeleteMapping("/deletePin/{id}")
	public void deletePin(@PathVariable("id") Long id) {
		pinAinRepos.deleteById(id);
	}

}
