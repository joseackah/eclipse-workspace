package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Ward;
import org.nurses.management.system.repos.Ward_Repository;
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
@RequestMapping("/ward")
public class WardController {
	
	
	@Autowired
	Ward_Repository wardRepos;
	
	
	
	@PostMapping("/saveWard")
	public Ward saveWard(@RequestBody Ward ward) {
		return wardRepos.save(ward);
	}
	
	@PutMapping("/updateWard")
	public Ward updateWard(@RequestBody Ward ward) {
		return wardRepos.save(ward);
	}
	
	
	@GetMapping("/getWard")
	public List<Ward> getWard(){
		
		return wardRepos.findAll();
	}
	
	@GetMapping("/findWardById/{id}")
	public Optional<Ward> findById(@PathVariable("id") int id) {
		return wardRepos.findById(id);
	}
	
	@DeleteMapping("/deleteWard")
	public void deleteWard(@PathVariable("id") int id) {
		wardRepos.deleteById(id);
	}
	
	 
	@GetMapping("bedCapacity")
	public String  bedCapacity() {
		return wardRepos.bedCapacity();
		
	}

}
