package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Leave;
import org.nurses.management.system.repos.Leave_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8084")
@RestController
@RequestMapping("/leave")
public class LeaveController {
	
	@Autowired
	Leave_Repository leaveRepos;
	
	
	@PostMapping("/saveLeave")
	public Leave saveLeave(@RequestBody Leave leave) {
		
		return leaveRepos.save(leave);
	}
	
	@PutMapping("/updateLeave")
	public Leave updateLeave(@RequestBody Leave leave) {
		
		return leaveRepos.save(leave);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLeave(@PathVariable("id") int id) {
		leaveRepos.deleteById(id);
	}
	
	@GetMapping("/getAllLeave")
	public List<Leave> getAllLeave(){
		
		return leaveRepos.findAll();
	}
	
	
	@GetMapping("/findById/{id}")
	public Optional<Leave> findById(@PathVariable("id") int id){
		
		return leaveRepos.findById(id);
		
	}
	
	@GetMapping("/maleMedicalLeave")
	public List<Leave> wardLeave(){
		return leaveRepos.maleMedical();
	}
	
	@GetMapping("/femaleMedicalLeave")
	public List<Leave> femaleLeave() {
		return leaveRepos.femaleMedical();
	}
	
	@GetMapping("/maleSurgicalLeave")
	public List<Leave> maleSurgical() {
		return leaveRepos.maleSurgical();
	}
	
	@GetMapping("/femaleSurgicalLeave")
	public List<Leave> femaleSurgical() {
		return leaveRepos.femaleSurgical();
	}
	
	@GetMapping("/childrenWardLeave")
	public List<Leave> childrenWardLeave() {
		return leaveRepos.childrenWard();
	}
	
	@GetMapping("/maternityWardLeave")
	public List<Leave> maternityWardLeave() {
		return leaveRepos.maternity();
	}
	
	@GetMapping("generalWardLeave")
	public List<Leave> generalWardLeave() {
		return leaveRepos.generalWard();
	}
	
	@GetMapping("/nicuLeave")
	public List<Leave> nicuLeave() {
		return leaveRepos.nicu();
	}
	
	@GetMapping("/religiousWardLeave")
	public List<Leave> religiousWardLeave() {
		return leaveRepos.religious();
	}
	
	
	@GetMapping("/accidentEmergencyLeave")
	public List<Leave> accidentLeave() {
		return leaveRepos.accident();
	}
	
	@GetMapping("/opdLeave")
	public List<Leave> opdLeave() {
		return leaveRepos.opd();
	}

}
