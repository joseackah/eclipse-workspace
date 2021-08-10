package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.StudentAddressRestClient;
import com.school.system.front.end.integration.dto.StudentAddress;

@Controller
@RequestMapping("/studentAddress")
public class StudentAddressController {
	
	@Autowired
	StudentAddressRestClient studentAddressRestClient;
	
	
	
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
	
	@RequestMapping("/showStudentAddressForm")
	public String showStudentAddress(ModelMap model) {
		return "addStudentAddress";
	}
	
	/*
	 * @RequestMapping("/moreProductForm") public String registerMoreProduct() {
	 * return "addMoreProduct"; }
	 */
	
	@RequestMapping("/updateStudentAddress")
	public String updateStudentAddress(StudentAddress studentAddress) {
		studentAddressRestClient.updateStudentAddress(studentAddress);
		return "redirect:displayStudentAddress";
	}
	
	@RequestMapping("/saveStudentAddress")
	public String saveStudentAddress(StudentAddress studentAddress) {
		studentAddressRestClient.saveStudentAddress(studentAddress);
		return "redirect:/displayStudentAddress";
	}
	
	@RequestMapping("/moreStudentAddress")
	public String saveMoreAddress(StudentAddress studentAddress) {
		studentAddressRestClient.saveStudentAddress(studentAddress);
		System.out.println("product saved successfully");
		return "redirect:/showStudentAddressForm";
	}
	
	
	
	@RequestMapping("/deleteStudentAddress/{id}")
	public String deleteStudentAddress(@PathVariable("id") Integer id) {
		studentAddressRestClient.deleteStudentAddress(id);
		
		return "redirect:/displayStudentAddress";
	}
	
	@RequestMapping(value="/displayStudentAddress", method=RequestMethod.GET)
	public String displayStudentAddress(StudentAddress studentAddress, ModelMap model) {
		StudentAddress[] studentAddresses =  studentAddressRestClient.getAllStudentAddress(studentAddress);
		model.addAttribute("studentAddresses", studentAddresses);
		
		
		return "getAllStudentsAddress";
		
	}
	
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String searchStudentAddress(@RequestParam("id")Integer id, ModelMap model) {
		StudentAddress studentAdd = studentAddressRestClient.findById(id);
		model.addAttribute("studentAdd", studentAdd);
		return "showProduct";
	}
	
	@RequestMapping(value="search1", method=RequestMethod.GET)
	public String searchStudentAdd(@RequestParam("studentAddId")Integer id, ModelMap model) {
		StudentAddress studentAddres = studentAddressRestClient.findById(id);
		model.addAttribute("studentAddres", studentAddres);
		return "showProduct";
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
	

}
