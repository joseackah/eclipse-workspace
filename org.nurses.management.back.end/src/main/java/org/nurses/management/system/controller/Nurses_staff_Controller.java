package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Nurses_staff;
import org.nurses.management.system.repos.Nurses_staff_Repository;
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
@RequestMapping("/nurses")
public class Nurses_staff_Controller {
	
	@Autowired
	Nurses_staff_Repository nursesRepos;
	
	
	@PostMapping("/saveNurse")
	public Nurses_staff saveNurses(@RequestBody Nurses_staff nurses) {
		
		return nursesRepos.save(nurses);
	}
	
	
	@PutMapping("/updateNurse")
	public Nurses_staff updateNurses(@RequestBody Nurses_staff nurses) {
		return nursesRepos.save(nurses);
	}
	
	@GetMapping("/getAllNurses")
	public List<Nurses_staff> getAllNurses(){
		return nursesRepos.findAll();
	}
	
	@DeleteMapping("/deleteNurse/{id}")
	public void deleteNurses(@PathVariable("id") int id	) {
		nursesRepos.deleteById(id);
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Nurses_staff> findNurseById(@PathVariable("id") int id){
		return nursesRepos.findById(id);
	}
	
	@GetMapping("countNurses")
	public String countNurses() {
		return nursesRepos.countNurses();
	}
	
	@GetMapping("countMaleNurses")
	public String countMaleNurses() {
		return nursesRepos.countMaleNurses();
		
	}
	
	@GetMapping("countFemaleNurses")
	public String countFemaleNurses() {
		return nursesRepos.countFemaleNurses();
		
	}

}
