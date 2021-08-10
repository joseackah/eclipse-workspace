package com.school.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.school.front.integration.LowerPrimaryRestClient;
import com.school.front.integration.dto.PrimaryOneResults;
import com.school.front.integration.dto.PrimaryThreeResults;
import com.school.front.integration.dto.PrimaryTwoResults;


@Controller
@RequestMapping("/lowerPrimary")
public class LowerPrimaryResultsController {
	//Injecting the repository of the lower primary results
	@Autowired
	LowerPrimaryRestClient lowerPrimary;
	
	
	
	@RequestMapping("/saveResults")
	public String showIndex(ModelMap model) {

		return "addResults";
	}
	@RequestMapping(value="/savePrimaryOne", method=RequestMethod.POST)
	public String save(PrimaryOneResults oneResults) {
		lowerPrimary.savePrimaryOneResults(oneResults);
		
		return "redirect:/lowerPrimary/getPrimaryThreeTerm3";
	}
	
	
	
	@RequestMapping("/savePrimaryTwo")
	public PrimaryTwoResults save(PrimaryTwoResults twoResults) {
		lowerPrimary.savePrimaryTwoResults(twoResults);
		return null;
	}
	
	
	
	@RequestMapping("/savePrimaryThree")
	public PrimaryThreeResults save( PrimaryThreeResults threeResults) {
		lowerPrimary.savePrimaryThreeResults(threeResults);
		return null;
	}
	
	
	
	
	//updating lower primary results methods
	
	@RequestMapping("/updatePrimaryOne")
	public PrimaryOneResults update( PrimaryOneResults oneResults) {
		lowerPrimary.updatePrimaryOneResults(oneResults);
		return null;
	}
	
	
	
	@RequestMapping("/updatePrimaryTwo")
	public PrimaryTwoResults update( PrimaryTwoResults twoResults) {
		lowerPrimary.updatePrimaryTwoResults(twoResults);
		return null;
	}
	
	
	
	@RequestMapping("/updatePrimaryThree")
	public PrimaryThreeResults update(PrimaryThreeResults threeResults) {
		lowerPrimary.updatePrimaryThreeResults(threeResults);
		return null;
	}
	
	
	
	
	
	//retrieving all lower primary results methods
	
	@RequestMapping("/getPrimaryOne")
	public String getResults1(PrimaryOneResults oneResults, ModelMap model) {
		PrimaryOneResults[] one= lowerPrimary.getPrimaryOne(oneResults);
		model.addAttribute("one", one);
		return null;
	}
	
	
	
	@RequestMapping("/getPrimaryTwo")
	public String getResults2(PrimaryTwoResults twoResults, ModelMap model) {
		PrimaryTwoResults[] two= lowerPrimary.getPrimaryTwo(twoResults);
		model.addAttribute("two", two);
		return null;
	}
	
	
	
	@RequestMapping("/getPrimaryThree")
	public String getResults3(PrimaryThreeResults threeResults, ModelMap model) {
		PrimaryThreeResults[] three= lowerPrimary.getPrimaryThree(threeResults);
		model.addAttribute("three", three);
		return null;
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
