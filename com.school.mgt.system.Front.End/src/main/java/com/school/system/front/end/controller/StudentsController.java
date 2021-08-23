package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.StudentsRestClient;
import com.school.system.front.end.integration.dto.Students;

@Controller
@RequestMapping("/schoolStudents")
public class StudentsController {

	@Autowired
	StudentsRestClient studentsRestClient;
	
	
	
	@RequestMapping("/adminHome")
	public String adminHomePage(ModelMap model) {
		return "adminHomePageExample2";
	}
	
	
	

	@RequestMapping("/index")
	public String showIndex(ModelMap model) {

		return "index";
	}

	@RequestMapping("/showItem")
	public String showForm(ModelMap model) {
		return "update";
	}

	@RequestMapping("/showName")
	public String showName(ModelMap model) {
		return "search";
	}

	@RequestMapping("/showStudentsForm")
	public String showStudents(@RequestParam("id") Integer id, ModelMap model) {
		Students students = studentsRestClient.find(id);
		model.addAttribute("students", students);

		return "update";
	}
	@RequestMapping("/studentsForm")
	public String registerStudents() {
		return "addStudent";
	}

	@RequestMapping("/moreStudentsForm")
	public String registerMoreStudents() {
		return "addMoreStudents";

	}

	@RequestMapping("/updateStudents")
	public String updateStudents(@RequestParam(value = "studentId", required = false) Integer id, ModelMap model) {

		Students student = studentsRestClient.find(id);
		model.addAttribute("student", student);
		return "showStudentSearch";
	}

	@RequestMapping(value = "update1", method = RequestMethod.GET)
	public String searchStud(@RequestParam("studentId") Integer id, ModelMap model) {
		Students student = studentsRestClient.find(id);
		model.addAttribute("student", student);
		return "showStudentSearch";
	}
	
	@RequestMapping(value = "results", method = RequestMethod.GET)
	public String searchResults(@RequestParam("studentId") Integer id, ModelMap model) {
		Students student = studentsRestClient.find(id);
		model.addAttribute("student", student);
		return "showResultsSearch";
	}

	@RequestMapping("/update")
	public String update(Students students) {
		studentsRestClient.updateStudent(students);
		return "redirect:displayStudents";
	}

	@RequestMapping("/saveStudents")
	public String saveStudents(Students students) {
		studentsRestClient.saveStudent(students);
		return "redirect:/indexForm";
	}

	@RequestMapping("/moreStudents")
	public String saveMoreStudents(Students students) {
		studentsRestClient.saveStudent(students);
		// System.out.println("product saved successfully");
		return "redirect:/schoolStudents/moreStudentsForm";

	}

	@RequestMapping("/deleteStudents/{id}")
	public String deleteStudents(@PathVariable("id") Integer id) {
		studentsRestClient.deleteStudent(id);

		return "redirect:/schoolStudents/displayStudents";
	}

	@RequestMapping(value = "/displayStudents", method = RequestMethod.GET)
	public String displayStudents(Students students, ModelMap model) {
		Students[] student = studentsRestClient.getAllStudents(students);
		model.addAttribute("student", student);

		return "getAllStudents";

	}

	@RequestMapping(value = "searchStudents/{id}", method = RequestMethod.POST)
	public String searchStudent(@PathVariable("id") Integer id, ModelMap model) {
		Students studentss = studentsRestClient.find(id);
		model.addAttribute("studentss", studentss);
		return "update";
	}

	@RequestMapping(value = "/searchStudent1{id}", method = RequestMethod.GET)
	public String searchStudents(@PathVariable("id") Integer id, ModelMap model) {
		Students students = studentsRestClient.find(id);
		model.addAttribute("students", students);
		return "showStudentSearch";
	}

	
	  @RequestMapping(value="/retrieve{studentId}", method=RequestMethod.GET) 
	  public String retriveId(@PathVariable("studentId")Integer id, ModelMap model) {
	  
	  //Students[] students = studentsRestClient.getAllStudents(student);
	  Students ids = studentsRestClient.find(id); 
	  model.addAttribute("ids", ids);
	  
	 
	  
	  return null; //"search"; 
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
	  
	  @RequestMapping(name="update2/{Id}", method=RequestMethod.POST)
		public String search(@RequestParam("Id") Integer id, ModelMap model) {
			Students student = studentsRestClient.find(id);
			model.addAttribute("student", student);
			return "showStudentSearch";
		}
	  
	  @RequestMapping(value="look", method=RequestMethod.GET)
		public String lookForId(String student_id, Model model) { 
		  String student = studentsRestClient.lookLastId(student_id);
			model.addAttribute("student", student);
			return "search";
		}
	  
	  @RequestMapping(value = "last", method = RequestMethod.GET)
		public String lastId(Students students, ModelMap model) {
			Students student = studentsRestClient.findLastId(students);
			model.addAttribute("student", student);
			return "search";
		}
	  
	  @ModelAttribute("count")
	  public String countStudent() {
		  return studentsRestClient.count();
	  }

}
