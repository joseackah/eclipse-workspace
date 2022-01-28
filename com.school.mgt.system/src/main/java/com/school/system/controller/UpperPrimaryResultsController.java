package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.UpperPrimaryResults;
import com.school.system.repos.UpperPrimaryResultsRepo;


@RestController
@RequestMapping("/upperPrimary")
public class UpperPrimaryResultsController {
	//Injecting the repository of the upper primary results
	/*
	 * @Autowired PrimaryFourResultsRepo primaryFour;
	 * 
	 * @Autowired PrimaryFiveResultsRepo primaryFive;
	 */
	
	@Autowired
	UpperPrimaryResultsRepo upperPrimary;
	
	
	/*
	 * @PostMapping("/savePrimaryFour") public PrimaryFourResults save(@RequestBody
	 * PrimaryFourResults fourResults) {
	 * 
	 * return primaryFour.save(fourResults); }
	 * 
	 * 
	 * 
	 * @PostMapping("/savePrimaryFive") public PrimaryFiveResults save(@RequestBody
	 * PrimaryFiveResults fiveResults) {
	 * 
	 * return primaryFive.save(fiveResults); }
	 */
	
	
	
	@PostMapping("/saveUpperPrimary")
	public UpperPrimaryResults save(@RequestBody UpperPrimaryResults sixResults) {
		
		return upperPrimary.save(sixResults);
	}
	
	
	
	
	//updating upper primary results methods
	
	/*
	 * @PutMapping("/updatePrimaryFour") public PrimaryFourResults
	 * update(@RequestBody PrimaryFourResults fourResults) {
	 * 
	 * return primaryFour.save(fourResults); }
	 * 
	 * 
	 * 
	 * @PutMapping("/updatePrimaryFive") public PrimaryFiveResults
	 * update(@RequestBody PrimaryFiveResults fiveResults) {
	 * 
	 * return primaryFive.save(fiveResults); }
	 */
	
	
	@PutMapping("/updateUpperPrimary")
	public UpperPrimaryResults update(@RequestBody UpperPrimaryResults sixResults) {
		
		return upperPrimary.save(sixResults);
	}
	
	
	
	
	
	//retrieving all lower primary results methods
	
	/*
	 * @GetMapping("/getPrimaryFour") public List<PrimaryFourResults> getResults4()
	 * {
	 * 
	 * return primaryFour.findAll(); }
	 * 
	 * 
	 * 
	 * @GetMapping("/getPrimaryFive") public List<PrimaryFiveResults> getResults5()
	 * {
	 * 
	 * return primaryFive.findAll(); }
	 */
	
	
	
	@GetMapping("/getUpperPrimary")
	public List<UpperPrimaryResults> getResults6() {
		
		return upperPrimary.findAll();
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
