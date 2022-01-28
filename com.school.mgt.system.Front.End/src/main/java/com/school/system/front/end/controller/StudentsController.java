package com.school.system.front.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.system.front.end.integration.LowerPrimaryRestClient;
import com.school.system.front.end.integration.StudentsRestClient;
import com.school.system.front.end.integration.TeachersRestClient;
import com.school.system.front.end.integration.dto.Students;

@Controller
@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/schoolStudents")
public class StudentsController {
	
	@Autowired
	TeachersController teacher;
	
	@Autowired
	TeachersRestClient teachersRestClient;

	@Autowired
	StudentsRestClient studentsRestClient;
	
	@Autowired
	LowerPrimaryRestClient lowerPrimary;
	
	
	
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
	  
		/* method for counting students start here */
	  
	  @ModelAttribute("count")
	  public String countStudent() {
		  return studentsRestClient.count();
	  }
	  
	  @ModelAttribute("countMale")
	  public String countStudentMale() {
		  return studentsRestClient.countMale();
	  }
	  
	  
	  @ModelAttribute("countFemale")
	  public String countStudentFemale() {
		  return studentsRestClient.countFemale();
	  }
	  
	  
		
		/* counting year 1 methods */
		
		@ModelAttribute("countYear1")
		public String countYear1() {
			return studentsRestClient.countYear1();
		}
		
		
		@ModelAttribute("countYear1Male")
		public String countYear1Male() {
			return studentsRestClient.countYear1Male();
		}
		
		
		
		@ModelAttribute("countYear1Female")
		public String countYear1Female() {
			return studentsRestClient.countYear1Female();
		}
		
		
		/* counting year 2 methods */
		
		@ModelAttribute("countYear2")
		public String countYear2() {
			return studentsRestClient.countYear2();
		}
		
		
		@ModelAttribute("countYear2Male")
		public String countYear2Male() {
			return studentsRestClient.countYear2Male();
		}
		
		
		
		@ModelAttribute("countYear2Female")
		public String countYear2Female() {
			return studentsRestClient.countYear2Female();
		}
		
		
		/* counting year 3 methods */
		
		@ModelAttribute("countYear3")
		public String countYear3() {
			return studentsRestClient.countYear3();
		}
		
		
		@ModelAttribute("countYear3Male")
		public String countYear3Male() {
			return studentsRestClient.countYear3Male();
		}
		
		
		
		@ModelAttribute("countYear3Female")
		public String countYear3Female() {
			return studentsRestClient.countYear3Female();
		}
	  
		/* method for counting students end here */
	  
	  
		/* counting teachers methods */

		@ModelAttribute("countTeachers")
		public String countTeachers() {
			return teachersRestClient.countTeachers();
		}
		
		
		@ModelAttribute("countTeacherMale")
		public String countTeacherMale() {
			return teachersRestClient.countTeacherMale();
		}
		
		
		
		@ModelAttribute("countTeacherFemale")
		public String countTeacherFemale() {
			return teachersRestClient.countTeacherFemale();
		}
		
		
		/* method to get certificate */
		
		
		@RequestMapping(value="/certificate", method=RequestMethod.POST)
		public String cert(@RequestParam("studentId") Integer id, ModelMap model) {
			Students student = studentsRestClient.find(id);
			model.addAttribute("student", student);
			return "certificate";
		}
	  
	  
	  @RequestMapping("/profiles")
		public String profiles(Students students, ModelMap model) {
		  Students[] studentS = studentsRestClient.getAllStudents(students);
			model.addAttribute("student", studentS);
			

			return "profiles";
		}
	  
	  
	  @RequestMapping("/profilesTry")
		public String profilesTry(Students students, ModelMap model) {
		  Students[] studentS = studentsRestClient.getAllStudents(students);
			model.addAttribute("student", studentS);
			

			return "profilesTry";
		}
	  
	  
	  @RequestMapping(value = "accountEntry/{studentId}", method = RequestMethod.GET)
		public String accountsEntry(@PathVariable("studentId") Integer id, ModelMap model) {
			Students account = studentsRestClient.find(id);
			model.addAttribute("account", account);
			return "addAccounts";
		}
	  
		
		
		
		 
		 
}
