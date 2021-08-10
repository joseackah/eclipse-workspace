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

import com.school.system.entities.TeacherAddress;
import com.school.system.repos.TeacherAddressRepository;


@RestController
@RequestMapping("/teacherAddress")
public class TeacherAddressController {
	
	@Autowired
	TeacherAddressRepository teacherAddressRepo;
	
	
	@PostMapping("/saveTeacherAddress")
	public TeacherAddress save(@RequestBody TeacherAddress teacherAddress) {
		
		return teacherAddressRepo.save(teacherAddress);
	}
	
	@PutMapping("/updateTeacherAddress")
	public TeacherAddress update(@RequestBody TeacherAddress teacherAddress) {
		return teacherAddressRepo.save(teacherAddress);
	}
	
	@GetMapping("/getTeacherAddress")
	public List<TeacherAddress> getParent(){
		
		return teacherAddressRepo.findAll();
	}
	
	@DeleteMapping("/deleteTeacherAddress/{id}")
	public void delete(@PathVariable("id") int id) {
		
		teacherAddressRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllTeacherAddress")
	public void deleteAll(@RequestBody TeacherAddress teacherAddress) {
		teacherAddressRepo.deleteAll();
	}
	
	@GetMapping("/findById/{id}")
	public void findById(@PathVariable("id") int id) {
		
		teacherAddressRepo.findById(id);
	}
	
	

}
