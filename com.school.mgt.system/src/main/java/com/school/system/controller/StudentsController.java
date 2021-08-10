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
	
	
	}
