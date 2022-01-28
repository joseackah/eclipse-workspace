package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.TeachersRestClient;
import com.school.system.front.end.integration.dto.Teachers;

@Controller
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/schoolTeachers")
public class TeachersController {
	
	@Autowired
	TeachersRestClient teachersRestClient;
	
	
	
	@RequestMapping("/index")
	public String showIndex(ModelMap model) {
		
		return "index";
	}
	
	/*
	 * @RequestMapping("/showItem") public String showForm(ModelMap model) { return
	 * "showItem"; }
	 */
	
	@RequestMapping("/showName")
	public String showName(ModelMap model) {
		return "search";
	}
	
	@RequestMapping("/showTeacherForm")
	public String showTeacher(ModelMap model) {
		return "addTeacher";
	}
	
	/*
	 * @RequestMapping("/moreProductForm") public String registerMoreProduct() {
	 * return "addMoreProduct"; }
	 */
	
	@RequestMapping("/updateTeachers")
	public String updateTeachers(Teachers teachers) {
		teachersRestClient.updateTeacher(teachers);
		return "redirect:displayTeachers";
	}
	
	
	@RequestMapping(value ="teacherUpdate", method=RequestMethod.GET)
	public String searchTea(@RequestParam("teacherId") Integer teacherId, ModelMap model) {
		Teachers teacher = teachersRestClient.findTeacher(teacherId);
		model.addAttribute("teacher", teacher);
		return "showTeacherSearch";
	}
	
	
	@RequestMapping("/saveTeachers")
	public String saveTeachers(Teachers teachers) {
		teachersRestClient.saveTeacher(teachers);
		return "redirect:displayTeachers";
	}
	
	@RequestMapping("/moreTeachers")
	public String saveMoreTeachers(Teachers teachers) {
		teachersRestClient.saveTeacher(teachers);
		//System.out.println("saved successfully");
		return "redirect:/showTeacherForm";
	}
	
	
	
	@RequestMapping("/deleteTeachers/{id}")
	public String deleteTeachers(@PathVariable("id") Integer id) {
		teachersRestClient.deleteTeacher(id);
		
		return "redirect:/schoolTeachers/displayTeachers";
	}
	
	@RequestMapping(value="/displayTeachers", method=RequestMethod.GET)
	public String displayTeachers(Teachers teachers, ModelMap model) {
		Teachers[] teacher =  teachersRestClient.getAllTeachers(teachers);
		model.addAttribute("teacher", teacher);
		
		
		return "getAllTeacher";
		
	}
	
	
	@RequestMapping(value="searchTeachers", method=RequestMethod.POST)
	public String searchTeacher(@RequestParam("id")Integer id, ModelMap model) {
		Teachers teachers = teachersRestClient.findById(id);
		model.addAttribute("teachers", teachers);
		return "showProduct";
	}
	
	@RequestMapping(value="searchTeacher1", method=RequestMethod.GET)
	public String searchTeachers(@RequestParam("teacherId")Integer id, ModelMap model) {
		Teachers teachers = teachersRestClient.findById(id);
		model.addAttribute("teachers", teachers);
		return "showTeacherSearch";
	}
	
	/*
	 * @RequestMapping(value="displayName", method=RequestMethod.POST) public String
	 * displayNameEcomProduct(@RequestParam("name")String name, ModelMap model) {
	 * Integer name2 = Integer.parseInt(name); //EcommerceProduct[] ecommProduct =
	 * teacherAddressRestClient.(name2); //model.addAttribute("ecommProduct",
	 * ecommProduct);
	 * 
	 * 
	 * return "searchName";
	 * 
	 * }
	 */
	
	
	/* counting teachers methods */

	@ModelAttribute("countTeachers")
	public String countTeachers() {
		return teachersRestClient.countTeachers();
	}
	
	
	@ModelAttribute("countTeacherMale")
	public String countYear3Male() {
		return teachersRestClient.countTeacherMale();
	}
	
	
	
	@ModelAttribute("countTeacherFemale")
	public String countTeacherFemale() {
		return teachersRestClient.countTeacherFemale();
	}
  
	
	
	
}
