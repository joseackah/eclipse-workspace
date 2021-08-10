package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.JHSOneResults;
import com.school.system.entities.JHSThreeResults;
import com.school.system.entities.JHSTwoResults;
import com.school.system.repos.JHSOneResultsRepo;
import com.school.system.repos.JHSThreeResultsRepo;
import com.school.system.repos.JHSTwoResultsRepo;


@RestController
@RequestMapping("/jhs")
public class JHSResultsController {
	//Injecting the repository of the lower primary results
	@Autowired
	JHSOneResultsRepo jhsOne;
	
	
	@Autowired
	JHSTwoResultsRepo jhsTwo;
	
	@Autowired
	JHSThreeResultsRepo jhsThree;
	
	
	//SAVING JHS RESULTS METHODS
	
	@PostMapping("/saveJHSOne")
	public JHSOneResults save(@RequestBody JHSOneResults oneResults) {
		
		return jhsOne.save(oneResults);
	}
	
	
	
	@PostMapping("/saveJHSTwo")
	public JHSTwoResults save(@RequestBody JHSTwoResults twoResults) {
		
		return jhsTwo.save(twoResults);
	}
	
	
	
	@PostMapping("/saveJHSThree")
	public JHSThreeResults save(@RequestBody JHSThreeResults threeResults) {
		
		return jhsThree.save(threeResults);
	}
	
	
	
	
	//updating JHS results methods
	
	@PutMapping("/updateJHSOne")
	public JHSOneResults update(@RequestBody JHSOneResults oneResults) {
		
		return jhsOne.save(oneResults);
	}
	
	
	
	@PutMapping("/updateJHSTwo")
	public JHSTwoResults update(@RequestBody JHSTwoResults twoResults) {
		
		return jhsTwo.save(twoResults);
	}
	
	
	
	@PutMapping("/updateJHSThree")
	public JHSThreeResults update(@RequestBody JHSThreeResults threeResults) {
		
		return jhsThree.save(threeResults);
	}
	
	
	
	
	
	//retrieving all JHS results methods
	
	@GetMapping("/getJHSOne")
	public List<JHSOneResults> getResults1() {
		
		return jhsOne.findAll();
	}
	
	
	
	@GetMapping("/getJHSTwo")
	public List<JHSTwoResults> getResults2() {
		
		return jhsTwo.findAll();
	}
	
	
	
	@GetMapping("/getPrimaryThree")
	public List<JHSThreeResults> getResults3() {
		
		return jhsThree.findAll();
	}
	
	
	
	//i will attend to them later and possible delete them.
	
	/*
	 * @GetMapping("/getParent") public List<Parents> getParent(){
	 * 
	 * return parentRepo.findAll(); }
	 * 
	 * @DeleteMapping("/deleteParent/{id}") public void delete(@PathVariable("id")
	 * int id) {
	 * 
	 * parentRepo.deleteById(id); }
	 * 
	 * @DeleteMapping("/deleteAllParent") public void deleteAll(@RequestBody Parents
	 * parents) { parentRepo.deleteAll(); }
	 * 
	 * @GetMapping("/findById/{id}") public void findById(@PathVariable("id") int
	 * id) {
	 * 
	 * parentRepo.findById(id); }
	 */
	
	

}
