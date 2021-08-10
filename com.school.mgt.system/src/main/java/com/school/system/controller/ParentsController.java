package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.Parents;
import com.school.system.repos.ParentsRepository;


@RestController
@RequestMapping("/parents")
public class ParentsController {
	
	@Autowired
	ParentsRepository parentRepo;
	
	
	@PostMapping("/saveParent")
	public Parents save(@RequestBody Parents parents) {
		
		return parentRepo.save(parents);
	}
	
	@PutMapping("/updateParent")
	public Parents update(@RequestBody Parents parents) {
		return parentRepo.save(parents);
	}
	
	@GetMapping("/getParent")
	public List<Parents> getParent(){
		
		return parentRepo.findAll();
	}
	
	@DeleteMapping("/deleteParent/{id}")
	public void delete(@PathVariable("id") int id) {
		
		parentRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllParent")
	public void deleteAll(@RequestBody Parents parents) {
		parentRepo.deleteAll();
	}
	
	@GetMapping("/findById/{id}")
	public void findById(@PathVariable("id") int id) {
		
		parentRepo.findById(id);
	}
	
	@GetMapping("/lastId")
	public Parents findLastId(Parents parents){
		return parentRepo.findLastId(parents);
	}
	
	

}
