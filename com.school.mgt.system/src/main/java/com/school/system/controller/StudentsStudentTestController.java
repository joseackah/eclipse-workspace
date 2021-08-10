package com.school.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.StudentsStudentTest;
import com.school.system.repos.StudentsStudentTestRepository;


@RestController
@RequestMapping("/dbError")
public class StudentsStudentTestController {
	
	@Autowired
	StudentsStudentTestRepository studentTestRepo;
	
	
	
	
	@PostMapping("/saveStudentTest")
	public StudentsStudentTest save(@RequestBody StudentsStudentTest studentTest) {
		
		return studentTestRepo.save(studentTest);
	}
	
	@PutMapping("/updateStudentTest")
	public StudentsStudentTest update(@RequestBody StudentsStudentTest studentTest) {
		return studentTestRepo.save(studentTest);
	}
	
	@GetMapping("/getStudentTest")
	public List<StudentsStudentTest> getStudentTest(){
		
		return studentTestRepo.findAll();
	}
	
	@DeleteMapping("/deleteStudentTest/{id}")
	public void delete(@PathVariable("id") String student_id) {
		
		studentTestRepo.deleteById(student_id);
	}
	
	@DeleteMapping("/deleteAllStudentTest")
	public void deleteAll(@RequestBody StudentsStudentTest studentTest) {
		studentTestRepo.deleteAll();
	}
	
	@GetMapping("/findTest/{id}")
	public StudentsStudentTest find(@PathVariable("id") String student_id) {
		
		return studentTestRepo.findById(student_id).get();
	}
	
	@GetMapping("/lastIdTest")
	public StudentsStudentTest findLastId(StudentsStudentTest studentTest){
		return studentTestRepo.findLastId(studentTest);
	}
	
	@GetMapping("/lookTest")
	public String lookLastId(String student_id){
		return studentTestRepo.lookLastId(student_id);
	}
	
	@GetMapping("/searchTest")
	public List<StudentsStudentTest> search(String studentTest){
		return studentTestRepo.search(studentTest);
	}
	
	
	}
