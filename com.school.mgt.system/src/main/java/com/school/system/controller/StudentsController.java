package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.Students;
import com.school.system.repos.StudentsRepository;


@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	StudentsRepository studentRepo;
	
	
	@PostMapping("/form")
	public String userform(ModelMap model) {
		return "redirect:/resources/addUser.html";
	}
	
	
	@PostMapping("/saveStudent")
	public Students save(@RequestBody Students students) {
		
		return studentRepo.save(students);
	}
	
	@PutMapping("/updateStudent")
	public Students update(@RequestBody Students students) {
		return studentRepo.save(students);
	}
	
	@GetMapping("/getStudent")
	public List<Students> getStudent(){
		
		return studentRepo.findAll();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void delete(@PathVariable("id") Integer id) {
		
		studentRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllStudent")
	public void deleteAll(@RequestBody Students students) {
		studentRepo.deleteAll();
	}
	
	@GetMapping("/find/{id}")
	public Students find(@PathVariable("id") Integer id) {
		
		return studentRepo.findById(id).get();
	}
	
	@GetMapping("/lastId")
	public Students findLastId(Students students){
		return studentRepo.findLastId(students);
	}
	
	@GetMapping("/look")
	public String lookLastId(String student_id){
		return studentRepo.lookLastId(student_id);
	}
	
	@GetMapping("/search")
	public List<Students> search(String students){
		return studentRepo.search(students);
	}
	
	@GetMapping("/count")
	public String count() {
		return studentRepo.countStudent();
	}
	
	
	@GetMapping("/countMale")
	public String countMale() {
		return studentRepo.countStudentMale();
	}
	
	
	
	@GetMapping("/countFemale")
	public String countFemale() {
		return studentRepo.countStudentFemale();
	}
	
	
	/* counting year 1 methods */
	
	@GetMapping("/countYear1")
	public String countYear1() {
		return studentRepo.countYear1();
	}
	
	
	@GetMapping("/countYear1Male")
	public String countYear1Male() {
		return studentRepo.countYear1Male();
	}
	
	
	
	@GetMapping("/countYear1Female")
	public String countYear1Female() {
		return studentRepo.countYear1Female();
	}
	
	
	/* counting year 2 methods */
	
	@GetMapping("/countYear2")
	public String countYear2() {
		return studentRepo.countYear2();
	}
	
	
	@GetMapping("/countYear2Male")
	public String countYear2Male() {
		return studentRepo.countYear2Male();
	}
	
	
	
	@GetMapping("/countYear2Female")
	public String countYear2Female() {
		return studentRepo.countYear2Female();
	}
	
	
	/* counting year 3 methods */
	
	@GetMapping("/countYear3")
	public String countYear3() {
		return studentRepo.countYear3();
	}
	
	
	@GetMapping("/countYear3Male")
	public String countYear3Male() {
		return studentRepo.countYear3Male();
	}
	
	
	
	@GetMapping("/countYear3Female")
	public String countYear3Female() {
		return studentRepo.countYear3Female();
	}
	
	
	}
