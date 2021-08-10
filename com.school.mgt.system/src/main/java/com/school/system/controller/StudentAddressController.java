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

import com.school.system.entities.StudentAddress;
import com.school.system.repos.StudentAddressRepository;


@RestController
@RequestMapping("/studentAddress")
public class StudentAddressController {
	
	@Autowired
	StudentAddressRepository studentAddressRepo;
	
	
	@PostMapping("/saveStudentAddress")
	public StudentAddress save(@RequestBody StudentAddress studentAddress) {
		
		return studentAddressRepo.save(studentAddress);
	}
	
	@PutMapping("/updateStudentAddress")
	public StudentAddress update(@RequestBody StudentAddress studentAddress) {
		return studentAddressRepo.save(studentAddress);
	}
	
	@GetMapping("/getStudentAddress")
	public List<StudentAddress> getParent(){
		
		return studentAddressRepo.findAll();
	}
	
	@DeleteMapping("/deleteStudentAddress/{id}")
	public void delete(@PathVariable("id") int id) {
		
		studentAddressRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllStudentAddress")
	public void deleteAll(@RequestBody StudentAddress studentAddress) {
		studentAddressRepo.deleteAll();
	}
	
	@GetMapping("/findById/{id}")
	public void findById(@PathVariable("id") int id) {
		
		studentAddressRepo.findById(id);
	}
	
	

}
