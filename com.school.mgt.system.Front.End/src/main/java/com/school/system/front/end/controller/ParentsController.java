package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.ParentsRestClient;
import com.school.system.front.end.integration.dto.Parents;

@Controller
@RequestMapping("/schoolParents")
public class ParentsController {
	
	@Autowired
	ParentsRestClient parentsRestClient;
	
	
	
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
	
	@RequestMapping("/showParentForm")
	public String showParents(ModelMap model) {
		return "addParent";
	}
	
	/*
	 * @RequestMapping("/moreProductForm") public String registerMoreProduct() {
	 * return "addMoreProduct"; }
	 */
	
	@RequestMapping("/updateParents")
	public String updateParents(Parents parents) {
		parentsRestClient.updateParent(parents);
		return "redirect:displayParents";
	}
	
	@RequestMapping("/saveParents")
	public String saveParents(Parents parents) {
		parentsRestClient.saveParent(parents);
		return "redirect:/schoolStudents/studentsForm";
	}
	
	@RequestMapping("/moreParents")
	public String saveMoreParents(Parents parents) {
		parentsRestClient.saveParent(parents);
		//System.out.println("product saved successfully");
		return "redirect:/showParentForm";
	}
	
	
	
	@RequestMapping("/deleteParents/{id}")
	public String deleteParents(@PathVariable("id") Integer id) {
		parentsRestClient.deleteParent(id);
		
		return "redirect:/displayParents";
	}
	
	@RequestMapping(value="/displayParents", method=RequestMethod.GET)
	public String displayParents(Parents parents, ModelMap model) {
		Parents[] parent =  parentsRestClient.getAllParents(parents);
		model.addAttribute("parent", parent);
		
		
		return "getAllParents";
		
	}
	
	
	@RequestMapping(value="searchParents", method=RequestMethod.POST)
	public String searchParent(@RequestParam("id")Integer id, ModelMap model) {
		Parents parents = parentsRestClient.findById(id);
		model.addAttribute("parents", parents);
		return "showProduct";
	}
	
	@RequestMapping(value="searchParent1", method=RequestMethod.GET)
	public String searchParents(@RequestParam("parentId")Integer id, ModelMap model) {
		Parents parents = parentsRestClient.findById(id);
		model.addAttribute("parents", parents);
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
	@RequestMapping(value = "lastParent", method = RequestMethod.GET)
	public String lastId(Parents parents, ModelMap model) {
		Parents parent = parentsRestClient.findLastId(parents);
		model.addAttribute("parent", parent);
		return "searchParent";
	}

}
