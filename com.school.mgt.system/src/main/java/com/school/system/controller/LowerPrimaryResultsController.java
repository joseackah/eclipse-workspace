package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.LowerPrimaryResults;
import com.school.system.repos.LowerPrimaryResultsRepo;


@RestController
@RequestMapping("/lowerPrimary")
public class LowerPrimaryResultsController {
	//Injecting the repository of the lower primary results
	@Autowired
	LowerPrimaryResultsRepo LowerPrimary;
	
	/*
	 * @Autowired PrimaryTwoResultsRepo primaryTwo;
	 * 
	 * @Autowired PrimaryThreeResultsRepo primaryThree;
	 */
	
	@PostMapping("/saveLowerPrimary")
	public LowerPrimaryResults save(@RequestBody LowerPrimaryResults lowerResults) {
		
		return LowerPrimary.save(lowerResults);
	}
	
	
	
	/*
	 * @PostMapping("/savePrimaryTwo") public PrimaryTwoResults save(@RequestBody
	 * PrimaryTwoResults twoResults) {
	 * 
	 * return primaryTwo.save(twoResults); }
	 * 
	 * 
	 * 
	 * @PostMapping("/savePrimaryThree") public PrimaryThreeResults
	 * save(@RequestBody PrimaryThreeResults threeResults) {
	 * 
	 * return primaryThree.save(threeResults); }
	 */
	
	
	
	
	//updating lower primary results methods
	
	@PutMapping("/updateLowerPrimary")
	public LowerPrimaryResults update(@RequestBody LowerPrimaryResults lowerResults) {
		
		return LowerPrimary.save(lowerResults);
	}
	
	
	
	/*
	 * @PutMapping("/updatePrimaryTwo") public PrimaryTwoResults update(@RequestBody
	 * PrimaryTwoResults twoResults) {
	 * 
	 * return primaryTwo.save(twoResults); }
	 * 
	 * 
	 * 
	 * @PutMapping("/updatePrimaryThree") public PrimaryThreeResults
	 * update(@RequestBody PrimaryThreeResults threeResults) {
	 * 
	 * return primaryThree.save(threeResults); }
	 */
	
	
	
	
	
	//retrieving all lower primary results methods
	
	@GetMapping("/getLowerPrimary")
	public List<LowerPrimaryResults> getResults1() {
		
		return LowerPrimary.findAll();
	}
	
	
	
	/*
	 * @GetMapping("/getPrimaryTwo") public List<PrimaryTwoResults> getResults2() {
	 * 
	 * return primaryTwo.findAll(); }
	 * 
	 * 
	 * 
	 * @GetMapping("/getPrimaryThree") public List<PrimaryThreeResults>
	 * getResults3() {
	 * 
	 * return primaryThree.findAll(); }
	 */
	
	
	
	
	
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
