package com.school.system.front.end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/general")
public class GeneralController {

	/*
	 * @Autowired StudentsRestClient studentsRestClient;
	 */
	
	
	
	@RequestMapping("/card")
	public String card(ModelMap model) {

		return "indexTry";
	}
	
	
	
	
	
	
	@RequestMapping("/adminHomePageExample2")
	public String adminHomePageExample2(ModelMap model) {

		return "adminHomePageExample2";
	}
	
	
	@RequestMapping("/image")
	public String image(ModelMap model) {

		return "imageFileUpload";
	}
	@RequestMapping("/imageUpload")
	public String imageUpload(ModelMap model) {

		return "image";
	}
	
	
	
	@RequestMapping("/adminPageExample")
	public String adminPage(ModelMap model) {

		return "adminPageExample";
	}
	
	
	
	
	@RequestMapping("/test")
	public String test(ModelMap model) {

		return "testlog";
	}
	
	
	@RequestMapping("/validate")
	public String validate(ModelMap model) {

		return "validate";
	}
	
	@RequestMapping("/homeExample")
	public String homeExample(ModelMap model) {

		return "homeExample";
	}
	
	
	
	
	@RequestMapping("/saveR")
	public String saveResult(ModelMap model) {

		return "resultProcess";
	}
	
	
	
	@RequestMapping("/home")
	public String showIndex(ModelMap model) {

		return "home";
	}
	
	@RequestMapping("/teacherHome")
	public String showTeacherHome(ModelMap model) {

		return "teacherHome";
	}
	
	@RequestMapping("/parentHome")
	public String showParentHome(ModelMap model) {

		return "parentHome";
	}
	
	@RequestMapping("/homePage")
	public String homePage(ModelMap model) {

		return "index";
	}
	
	@RequestMapping("/logIn")
	public String adminLogIn(ModelMap model) {

		/* return "logInForm"; */
		return "adminLogin";
	}
	
	@RequestMapping("/teacherLogin")
	public String teacherlogIn(ModelMap model) {

		return "teacherLogin";
	}
	
	@RequestMapping("/parentLogin")
	public String parentlogIn(ModelMap model) {

		return "parentLogin";
	}
	
	@RequestMapping("/example")
	public String example(ModelMap model) {

		return "example";
	}
	
	@RequestMapping("/log")
	public String log(ModelMap model) {

		return "log";
	}
	
	@RequestMapping("/lowerResults")
	public String lowerResults(ModelMap model) {

		return "getLowerResults";
	}

	/*
	 * @RequestMapping("/showItem") public String showForm(ModelMap model) { return
	 * "update"; }
	 * 
	 * @RequestMapping("/showName") public String showName(ModelMap model) { return
	 * "search"; }
	 * 
	 * @RequestMapping("/showStudentsForm") public String
	 * showStudents(@RequestParam("id") Integer id, ModelMap model) { Students
	 * students = studentsRestClient.find(id); model.addAttribute("students",
	 * students);
	 * 
	 * return "update"; }
	 * 
	 * @RequestMapping("/moreStudentsForm") public String registerMoreStudents() {
	 * return "addMoreStudents";
	 * 
	 * }
	 * 
	 * @RequestMapping("/updateStudents") public String
	 * updateStudents(@RequestParam(value = "studentId", required = false) Integer
	 * id, ModelMap model) {
	 * 
	 * Students student = studentsRestClient.find(id); model.addAttribute("student",
	 * student); return "showStudentSearch"; }
	 * 
	 * @RequestMapping(value = "update1", method = RequestMethod.GET) public String
	 * searchProduct(@RequestParam("studentId") Integer id, ModelMap model) {
	 * Students student = studentsRestClient.find(id); model.addAttribute("student",
	 * student); return "showStudentSearch"; }
	 * 
	 * @RequestMapping("/update") public String update(Students students) {
	 * studentsRestClient.updateStudent(students); return
	 * "redirect:displayStudents"; }
	 * 
	 * @RequestMapping("/saveStudents") public String saveStudents(Students
	 * students) { studentsRestClient.saveStudent(students); return
	 * "redirect:/indexForm"; }
	 * 
	 * @RequestMapping("/moreStudents") public String saveMoreStudents(Students
	 * students) { studentsRestClient.saveStudent(students); //
	 * System.out.println("product saved successfully"); return
	 * "redirect:/schoolStudents/moreStudentsForm";
	 * 
	 * }
	 * 
	 * @RequestMapping("/deleteStudents/{id}") public String
	 * deleteStudents(@PathVariable("id") Integer id) {
	 * studentsRestClient.deleteStudent(id);
	 * 
	 * return "redirect:/schoolStudents/displayStudents"; }
	 * 
	 * @RequestMapping(value = "/displayStudents", method = RequestMethod.GET)
	 * public String displayStudents(Students students, ModelMap model) { Students[]
	 * student = studentsRestClient.getAllStudents(students);
	 * model.addAttribute("student", student);
	 * 
	 * return "getAllStudents";
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "searchStudents/{id}", method = RequestMethod.POST)
	 * public String searchStudent(@PathVariable("id") Integer id, ModelMap model) {
	 * Students studentss = studentsRestClient.find(id);
	 * model.addAttribute("studentss", studentss); return "update"; }
	 * 
	 * @RequestMapping(value = "/searchStudent1{id}", method = RequestMethod.GET)
	 * public String searchStudents(@PathVariable("id") Integer id, ModelMap model)
	 * { Students students = studentsRestClient.find(id);
	 * model.addAttribute("students", students); return "showStudentSearch"; }
	 * 
	 * 
	 * @RequestMapping(value="/retrieve{studentId}", method=RequestMethod.GET)
	 * public String retriveId(@PathVariable("studentId")Integer id, ModelMap model)
	 * {
	 * 
	 * //Students[] students = studentsRestClient.getAllStudents(student); Students
	 * ids = studentsRestClient.find(id); model.addAttribute("ids", ids);
	 * 
	 * 
	 * 
	 * return null; //"search"; }
	 * 
	 * 
	 * 
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
	 * 
	 * 
	 * @RequestMapping(name="update2/{Id}", method=RequestMethod.POST) public String
	 * search(@RequestParam("Id") Integer id, ModelMap model) { Students student =
	 * studentsRestClient.find(id); model.addAttribute("student", student); return
	 * "showStudentSearch"; }
	 * 
	 * @RequestMapping(value="look", method=RequestMethod.GET) public String
	 * lookForId(String student_id, ModelMap model) { String student =
	 * studentsRestClient.lookLastId(student_id); model.addAttribute("student",
	 * student); return "search"; }
	 * 
	 * @RequestMapping(value = "last", method = RequestMethod.GET) public String
	 * lastId(Students students, ModelMap model) { Students student =
	 * studentsRestClient.findLastId(students); model.addAttribute("student",
	 * student); return "search"; }
	 */

}
