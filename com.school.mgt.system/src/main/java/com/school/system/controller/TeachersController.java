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

import com.school.system.entities.Teachers;
import com.school.system.repos.TeachersRepository;


@RestController
@RequestMapping("/teachers")
public class TeachersController {
	
	@Autowired
	TeachersRepository teacherRepo;
	
	
	@PostMapping("/saveTeacher")
	public Teachers save(@RequestBody Teachers teachers) {
		
		return teacherRepo.save(teachers);
	}
	
	@PutMapping("/updateTeacher")
	public Teachers update(@RequestBody Teachers teachers) {
		return teacherRepo.save(teachers);
	}
	
	@GetMapping("/getTeacher")
	public List<Teachers> getTeacher(){
		
		return teacherRepo.findAll();
	}
	
	@DeleteMapping("/deleteTeacher/{id}")
	public void delete(@PathVariable("id") int id) {
		
		teacherRepo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllTeachers")
	public void deleteAll(@RequestBody Teachers teachers) {
		teacherRepo.deleteAll();
	}
	
	
	@GetMapping("/findById/{id}")
	public void findById(@PathVariable("id") int id) {
		
		teacherRepo.findById(id);
	}
	
	
	@GetMapping("/find/{id}")
	public Teachers find(@PathVariable("id") Integer id) {
		
		return teacherRepo.findById(id).get();
	}
	
	
	/* teachers counting methods */
	
	@GetMapping("/countTeachers")
	public String countTeachers() {
		return teacherRepo.countTeachers();
	}
	
	
	@GetMapping("/countTeacherMale")
	public String countTeacherMale() {
		return teacherRepo.countTeacherMale();
	}
	
	
	
	@GetMapping("/countTeacherFemale")
	public String countTeacherFemale() {
		return teacherRepo.countTeacherFemale();
	}
	
	
	

}
