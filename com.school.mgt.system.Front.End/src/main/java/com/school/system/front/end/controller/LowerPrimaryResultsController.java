package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.system.front.end.integration.LowerPrimaryRestClient;
import com.school.system.front.end.integration.dto.PrimaryOneResults;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryOneResultsTerm3;
import com.school.system.front.end.integration.dto.PrimaryThreeResults;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryThreeResultsTerm3;
import com.school.system.front.end.integration.dto.PrimaryTwoResults;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm1;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm2;
import com.school.system.front.end.integration.dto.PrimaryTwoResultsTerm3;


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
	@RequestMapping("/savePrimaryOne")
	public String save(PrimaryOneResults oneResults) {
		lowerPrimary.savePrimaryOneResults(oneResults);
		return "redirect:/lowerPrimary/getPrimaryThreeTerm3";
	}
	
	@RequestMapping("/savePrimaryOneTerm1")
	public PrimaryOneResultsTerm1 save(PrimaryOneResultsTerm1 oneResults1) {
		lowerPrimary.savePrimaryOneResultsTerm1(oneResults1);
		return null;
	}
	@RequestMapping("/savePrimaryOneTerm2")
	public PrimaryOneResultsTerm2 save(PrimaryOneResultsTerm2 oneResults2) {
		lowerPrimary.savePrimaryOneResultsTerm2(oneResults2);
		return null;
	}
	@RequestMapping("/savePrimaryOneTerm3")
	public PrimaryOneResultsTerm3 save(PrimaryOneResultsTerm3 oneResults3) {
		lowerPrimary.savePrimaryOneResultsTerm3(oneResults3);
		return null;
	}
	
	@RequestMapping("/savePrimaryTwo")
	public PrimaryTwoResults save(PrimaryTwoResults twoResults) {
		lowerPrimary.savePrimaryTwoResults(twoResults);
		return null;
	}
	
	@RequestMapping("/savePrimaryTwoTerm1")
	public PrimaryTwoResultsTerm1 save(PrimaryTwoResultsTerm1 twoResults1) {
		lowerPrimary.savePrimaryTwoResultsTerm1(twoResults1);
		return null;
	}
	
	@RequestMapping("/savePrimaryTwoTerm2")
	public PrimaryTwoResultsTerm2 save( PrimaryTwoResultsTerm2 twoResults2) {
		lowerPrimary.savePrimaryTwoResultsTerm2(twoResults2);
		return null;
	}
	
	@RequestMapping("/savePrimaryTwoTerm3")
	public PrimaryTwoResultsTerm3 save(PrimaryTwoResultsTerm3 twoResults3) {
		lowerPrimary.savePrimaryTwoResultsTerm3(twoResults3);
		return null;
	}
	
	@RequestMapping("/savePrimaryThree")
	public PrimaryThreeResults save( PrimaryThreeResults threeResults) {
		lowerPrimary.savePrimaryThreeResults(threeResults);
		return null;
	}
	
	@RequestMapping("/savePrimaryThreeTerm1")
	public PrimaryThreeResultsTerm1 save(PrimaryThreeResultsTerm1 threeResults1) {
		lowerPrimary.savePrimaryThreeResultsTerm1(threeResults1);
		return null;
	}
	
	@RequestMapping("/savePrimaryThreeTerm2")
	public PrimaryThreeResultsTerm2 save( PrimaryThreeResultsTerm2 threeResults2) {
		lowerPrimary.savePrimaryThreeResultsTerm2(threeResults2);
		return null;
	}
	
	@RequestMapping("/savePrimaryThreeTerm3")
	public PrimaryThreeResultsTerm3 save(PrimaryThreeResultsTerm3 threeResults3) {
		lowerPrimary.savePrimaryThreeResultsTerm3(threeResults3);
		return null;
	}
	
	
	//updating lower primary results methods
	
	@RequestMapping("/updatePrimaryOne")
	public PrimaryOneResults update( PrimaryOneResults oneResults) {
		lowerPrimary.updatePrimaryOneResults(oneResults);
		return null;
	}
	
	@RequestMapping("/updatePrimaryOneTerm1")
	public PrimaryOneResultsTerm1 update( PrimaryOneResultsTerm1 oneResults1) {
		lowerPrimary.updatePrimaryOneResultsTerm1(oneResults1);
		return null;
	}
	@RequestMapping("/updatePrimaryOneTerm2")
	public PrimaryOneResultsTerm2 update( PrimaryOneResultsTerm2 oneResults2) {
		lowerPrimary.updatePrimaryOneResultsTerm2(oneResults2);
		return null;
	}
	@RequestMapping("/updatePrimaryOneTerm3")
	public PrimaryOneResultsTerm3 update( PrimaryOneResultsTerm3 oneResults3) {
		lowerPrimary.updatePrimaryOneResultsTerm3(oneResults3);
		return null;
	}
	
	@RequestMapping("/updatePrimaryTwo")
	public PrimaryTwoResults update( PrimaryTwoResults twoResults) {
		lowerPrimary.updatePrimaryTwoResults(twoResults);
		return null;
	}
	
	@RequestMapping("/updatePrimaryTwoTerm1")
	public PrimaryTwoResultsTerm1 update(PrimaryTwoResultsTerm1 twoResults1) {
		lowerPrimary.updatePrimaryTwoResultsTerm1(twoResults1);
		return null;
	}
	
	@RequestMapping("/updatePrimaryTwoTerm2")
	public PrimaryTwoResultsTerm2 update( PrimaryTwoResultsTerm2 twoResults2) {
		lowerPrimary.updatePrimaryTwoResultsTerm2(twoResults2);
		return null;
	}
	
	@RequestMapping("/updatePrimaryTwoTerm3")
	public PrimaryTwoResultsTerm3 update(PrimaryTwoResultsTerm3 twoResults3) {
		lowerPrimary.updatePrimaryTwoResultsTerm3(twoResults3);
		return null;
	}
	
	@RequestMapping("/updatePrimaryThree")
	public PrimaryThreeResults update(PrimaryThreeResults threeResults) {
		lowerPrimary.updatePrimaryThreeResults(threeResults);
		return null;
	}
	
	@RequestMapping("/updatePrimaryThreeTerm1")
	public PrimaryThreeResultsTerm1 update( PrimaryThreeResultsTerm1 threeResults1) {
		lowerPrimary.updatePrimaryThreeResultsTerm1(threeResults1);
		return null;
	}
	
	@RequestMapping("/updatePrimaryThreeTerm2")
	public PrimaryThreeResultsTerm2 update(PrimaryThreeResultsTerm2 threeResults2) {
		lowerPrimary.updatePrimaryThreeResultsTerm2(threeResults2);
		return null;
	}
	
	@RequestMapping("/updatePrimaryThreeTerm3")
	public PrimaryThreeResultsTerm3 update( PrimaryThreeResultsTerm3 threeResults3) {
		lowerPrimary.updatePrimaryThreeResultsTerm3(threeResults3);
		return null;
	}
	
	
	
	//retrieving all lower primary results methods
	
	@RequestMapping("/getPrimaryOne")
	public String getResults1(PrimaryOneResults oneResults, ModelMap model) {
		PrimaryOneResults[] one= lowerPrimary.getPrimaryOne(oneResults);
		model.addAttribute("one", one);
		return null;
	}
	
	@RequestMapping("/getPrimaryOneTerm1")
	public String getResults1Term1(PrimaryOneResultsTerm1 oneResultsTerm1, ModelMap model) {
		PrimaryOneResultsTerm1[] one1= lowerPrimary.getPrimaryOneTerm1(oneResultsTerm1);
		model.addAttribute("one1", one1);
		return null;
	}
	@RequestMapping("/getPrimaryOneTerm2")
	public String getResults1Term2(PrimaryOneResultsTerm2 oneResultsTerm2, ModelMap model) {
		PrimaryOneResultsTerm2[] one2= lowerPrimary.getPrimaryOneTerm2(oneResultsTerm2);
		model.addAttribute("one2", one2);
		return null;
	}
	@RequestMapping("/getPrimaryOneTerm3")
	public  String getResults1Term3(PrimaryOneResultsTerm3 oneResultsTerm3, ModelMap model) {
		PrimaryOneResultsTerm3[] one3= lowerPrimary.getPrimaryOneTerm3(oneResultsTerm3);
		model.addAttribute("one3", one3);
		return null;
	}
	
	@RequestMapping("/getPrimaryTwo")
	public String getResults2(PrimaryTwoResults twoResults, ModelMap model) {
		PrimaryTwoResults[] two= lowerPrimary.getPrimaryTwo(twoResults);
		model.addAttribute("two", two);
		return null;
	}
	
	@RequestMapping("/getPrimaryTwoTerm1")
	public String getResults2Term1(PrimaryTwoResultsTerm1 twoResultsTerm1, ModelMap model) {
		PrimaryTwoResultsTerm1[] two1= lowerPrimary.getPrimaryTwoTerm1(twoResultsTerm1);
		model.addAttribute("two1", two1);
		return null;
	}
	
	@RequestMapping("/getPrimaryTwoTerm2")
	public String getResults2Term2(PrimaryTwoResultsTerm2 twoResultsTerm2, ModelMap model) {
		PrimaryTwoResultsTerm2[] two2= lowerPrimary.getPrimaryTwoTerm2(twoResultsTerm2);
		model.addAttribute("two2", two2);
		return null;
	}
	
	@RequestMapping("/getPrimaryTwoTerm3")
	public String getResults2Term3(PrimaryTwoResultsTerm3 twoResultsTerm3, ModelMap model) {
		PrimaryTwoResultsTerm3[] two3= lowerPrimary.getPrimaryTwoTerm3(twoResultsTerm3);
		model.addAttribute("two3", two3);
		return null;
	}
	
	@RequestMapping("/getPrimaryThree")
	public String getResults3(PrimaryThreeResults threeResults, ModelMap model) {
		PrimaryThreeResults[] three= lowerPrimary.getPrimaryThree(threeResults);
		model.addAttribute("three", three);
		return null;
	}
	
	@RequestMapping("/getPrimaryThreeTerm1")
	public String getResults3Term1(PrimaryThreeResultsTerm1 threeResultsTerm1, ModelMap model) {
		PrimaryThreeResultsTerm1[] three1= lowerPrimary.getPrimaryThreeTerm1(threeResultsTerm1);
		model.addAttribute("three1", three1);
		return null;
	}
	
	@RequestMapping("/getPrimaryThreeTerm2")
	public String getResults3Term2(PrimaryThreeResultsTerm2 threeResultsTerm2, ModelMap model) {
		PrimaryThreeResultsTerm2[] three2= lowerPrimary.getPrimaryThreeTerm2(threeResultsTerm2);
		model.addAttribute("three2", three2);
		return null;
	}
	
	@RequestMapping("/getPrimaryThreeTerm3")
	public String getResults3Term3(PrimaryThreeResultsTerm3 threeResultsTerm3, ModelMap model) {
		PrimaryThreeResultsTerm3[] three3= lowerPrimary.getPrimaryThreeTerm3(threeResultsTerm3);
		model.addAttribute("three3", three3);
		return "getLowerResults";
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
