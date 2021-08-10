package com.school.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.front.integration.TeacherAddressRestClient;
import com.school.front.integration.dto.TeacherAddress;

@Controller
@RequestMapping("/teacherAddress")
public class TeacherAddressController {
	
	@Autowired
	TeacherAddressRestClient teacherAddressRestClient;
	
	
	
	@RequestMapping("/index")
	public String showIndex(ModelMap model) {
		
		return "index";
	}
	
	/*
	 * @RequestMapping("/showItem") public String showForm(ModelMap model) { return
	 * "showItem"; }
	 */
	
	@RequestMapping("/showNameAddress")
	public String showName(ModelMap model) {
		return "search";
	}
	
	@RequestMapping("/showTeacherAddressForm")
	public String teacherAddress(ModelMap model) {
		return "addTeacherAddress ";
	}
	
	/*
	 * @RequestMapping("/moreProductForm") public String registerMoreProduct() {
	 * return "addMoreProduct"; }
	 */
	
	@RequestMapping("/updateTeacherAddress")
	public String updateTeacherAddress(TeacherAddress teacherAddress) {
		teacherAddressRestClient.updateTeacherAddress(teacherAddress);
		return "redirect:displayTeacherAddress";
	}
	
	@RequestMapping("/saveTeacherAddress")
	public String saveTeacherAddress(TeacherAddress teacherAddress) {
		teacherAddressRestClient.saveTeacherAddress(teacherAddress);
		return "redirect:/displayTeacherAddress";
	}
	
	@RequestMapping("/moreTeacherAddress")
	public String saveMoreTAddress(TeacherAddress teacherAddress) {
		teacherAddressRestClient.saveTeacherAddress(teacherAddress);
		//System.out.println("product saved successfully");
		return "redirect:/showTeacherAddressForm";
	}
	
	
	
	@RequestMapping("/deleteStudentAddress/{id}")
	public String deleteTeacherAddress(@PathVariable("id") Integer id) {
		teacherAddressRestClient.deleteTeacherAddress(id);
		
		return "redirect:/displayTeacherAddress";
	}
	
	@RequestMapping(value="/displayTeacherAddress", method=RequestMethod.GET)
	public String displayTeacherAddress(TeacherAddress teacherAddress, ModelMap model) {
		TeacherAddress[] teacherAddresses =  teacherAddressRestClient.getAllTeacherAddress(teacherAddress);
		model.addAttribute("teacherAddresses", teacherAddresses);
		
		
		return "getAllTeachersAddress";
		
	}
	
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String searchTeacherAddress(@RequestParam("id")Integer id, ModelMap model) {
		TeacherAddress teacherAdd = teacherAddressRestClient.findById(id);
		model.addAttribute("studentAdd", teacherAdd);
		return "showProduct";
	}
	
	@RequestMapping(value="search1", method=RequestMethod.GET)
	public String searchTeacherAdd(@RequestParam("teacherAddressId")Integer id, ModelMap model) {
		TeacherAddress teacherAddres = teacherAddressRestClient.findById(id);
		model.addAttribute("teacherAddres", teacherAddres);
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
