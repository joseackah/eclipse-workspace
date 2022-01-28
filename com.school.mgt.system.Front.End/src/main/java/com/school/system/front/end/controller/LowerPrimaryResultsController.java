package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.LowerPrimaryRestClient;
import com.school.system.front.end.integration.StudentsRestClient;
import com.school.system.front.end.integration.dto.LowerPrimaryResults;

import com.school.system.front.end.integration.dto.Students;


@Controller
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/lowerPrimaryResults")
public class LowerPrimaryResultsController {
	//Injecting the repository of the lower primary results
	@Autowired
	LowerPrimaryRestClient lowerPrimary;
	
	@Autowired
	StudentsRestClient studentsRestClient;
	
	
	
	@RequestMapping("/saveResults")
	public String showIndex(ModelMap model) {

		return "addResults";
	}
	@RequestMapping(name="/saveLowerPrimaryResults", method=RequestMethod.POST)
	public String save(@RequestParam("level") String level, @RequestParam("subject") String subject, @RequestParam("marks") Integer marks, @RequestParam("grade") String grade,LowerPrimaryResults oneResults) {
		
		if(level.equals("year 1")) {
			if(marks >=80){
				 grade = "A";
			 }else if(marks >=75 && marks <80){
				 grade = "B+";
			 }else if(marks >=70 && marks <74){
				 grade = "B";
			 }else if(marks >=65 && marks <70){
				 grade = "C+";
			 }else if(marks >=60 && marks <65){
				 grade = "C";
			 }else if(marks >=55 && marks <60){
				 grade = "D+";
			 }else if(marks >=50 && marks <55){
				 grade = "D";
			 }else if(marks >=45 && marks < 50){
				 grade = "E";
			 }else 
				 grade = "F";
				 ;
		lowerPrimary.savePrimaryOneResults(oneResults);
		}else if(level.equals("year 2")) {
			if(marks >=80){
				 grade = "A";
			 }else if(marks >=75 && marks <80){
				 grade = "B+";
			 }else if(marks >=70 && marks <74){
				 grade = "B";
			 }else if(marks >=65 && marks <70){
				 grade = "C+";
			 }else if(marks >=60 && marks <65){
				 grade = "C";
			 }else if(marks >=55 && marks <60){
				 grade = "D+";
			 }else if(marks >=50 && marks <55){
				 grade = "D";
			 }else if(marks >=45 && marks < 50){
				 grade = "E";
			 }else 
				 grade = "F";
				 ;
	//lowerPrimary.savePrimaryTwoResults();
		}else if(level.equals("year 3")) {
			if(marks >=80){
				 grade = "A";
			 }else if(marks >=75 && marks <80){
				 grade = "B+";
			 }else if(marks >=70 && marks <74){
				 grade = "B";
			 }else if(marks >=65 && marks <70){
				 grade = "C+";
			 }else if(marks >=60 && marks <65){
				 grade = "C";
			 }else if(marks >=55 && marks <60){
				 grade = "D+";
			 }else if(marks >=50 && marks <55){
				 grade = "D";
			 }else if(marks >=45 && marks < 50){
				 grade = "E";
			 }else 
				 grade = "F";
				 ;
		//lowerPrimary.savePrimaryThreeResults(threeResults);
			
		}
		//model.addAttribute("student", )
		
		
		return "redirect:/lowerPrimary/getPrimaryThreeTerm3";
	}
	
	
	
	//updating lower primary results methods
	
	@RequestMapping("/updateLowerPrimaryResults")
	public LowerPrimaryResults update( LowerPrimaryResults oneResults) {
		lowerPrimary.updatePrimaryOneResults(oneResults);
		return null;
	}
	
	
	
	
	//retrieving all lower primary results methods
	
	@RequestMapping("/getLowerPrimaryResults")
	public String getResults1(LowerPrimaryResults oneResults, ModelMap model) {
		LowerPrimaryResults[] one= lowerPrimary.getPrimaryOne(oneResults);
		model.addAttribute("one", one);
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
	
	
	@RequestMapping(value = "/update2", method = RequestMethod.GET)
	public String searchStud(@RequestParam("studentId") Integer id, ModelMap model) {
		Students student = studentsRestClient.find(id);
		model.addAttribute("student", student);
		return "showStudentSearch";
	}
	

}
