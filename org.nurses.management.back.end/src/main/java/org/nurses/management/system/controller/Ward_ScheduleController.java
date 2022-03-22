package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.bridge.CountingMessageHandler;
import org.nurses.management.system.entity.Ward_schedule;
import org.nurses.management.system.repos.Ward_schedule_Repository;
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
@RequestMapping("/ward_schedule")
public class Ward_ScheduleController {
	
	
	@Autowired
	Ward_schedule_Repository wardScheduleRepos;
	
	
	@PostMapping("/saveSchedule")
	public Ward_schedule saveWardSchedule(@RequestBody Ward_schedule wardSchedule) {
		return wardScheduleRepos.save(wardSchedule);
	}
	
	@PutMapping("/updateSchedule")
	public Ward_schedule updateWardSchedule(@RequestBody Ward_schedule wardSchedule) {
		return wardScheduleRepos.save(wardSchedule);
	}
	
	@GetMapping("/getAllSchedule")
	public List<Ward_schedule> getAllWardSchedule(){
		return wardScheduleRepos.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Ward_schedule> findById(@PathVariable("id") int id){
		return wardScheduleRepos.findById(id);
	}
	
	@DeleteMapping("/deleteSchedule")
	public void deleteWardSchedule(@PathVariable("id") int id) {
		wardScheduleRepos.deleteById(id);
	}
	
	
	
	@GetMapping("/maleMedicalSchedule")
	public List<Ward_schedule> maleWardSchedule(){
		return wardScheduleRepos.maleMedical();
	}
	
	@GetMapping("/femaleMedicalSchedule")
	public List<Ward_schedule> femaleSchedule() {
		return wardScheduleRepos.femaleMedical();
	}
	
	@GetMapping("/maleSurgicalSchedule")
	public List<Ward_schedule> maleSurgicalSchedule() {
		return wardScheduleRepos.maleSurgical();
	}
	
	@GetMapping("/femaleSurgicalSchedule")
	public List<Ward_schedule> femaleSurgicalSchedule() {
		return wardScheduleRepos.femaleSurgical();
	}
	
	@GetMapping("/childrenWardSchedule")
	public List<Ward_schedule> childrenWardSchedule() {
		return wardScheduleRepos.childrenWard();
	}
	
	@GetMapping("/maternityWardSchedule")
	public List<Ward_schedule> maternityWardSchedule() {
		return wardScheduleRepos.maternity();
	}
	
	@GetMapping("generalWardSchedule")
	public List<Ward_schedule> generalWardSchedule() {
		return wardScheduleRepos.generalWard();
	}
	
	@GetMapping("/nicuSchedule")
	public List<Ward_schedule> nicuSchedule() {
		return wardScheduleRepos.nicu();
	}
	
	@GetMapping("/religiousWardSchedule")
	public List<Ward_schedule> religiousWardSchedule() {
		return wardScheduleRepos.religious();
	}
	
	
	@GetMapping("/accidentEmergencySchedule")
	public List<Ward_schedule> accidentSchedule() {
		return wardScheduleRepos.accident();
	}
	
	@GetMapping("/opdSchedule")
	public List<Ward_schedule> opdSchedule() {
		return wardScheduleRepos.opd();
	}
	
	
	
	/* Counting nurse in particular ward */
	
	@GetMapping("nurseInMaleMedical")
	public String  countNurseInMaleMedical() {
		return wardScheduleRepos.countNurseInMaleMedical();
		
	}
	
	@GetMapping("nurseInMaleSurgical")
	public String  countNurseInMaleSurgical() {
		return wardScheduleRepos.countNurseInMaleSurgical();
		
	}
	
	@GetMapping("nurseInFemaleMedical")
	public String  countNurseInFemaleMedical() {
		return wardScheduleRepos.countNurseInFemaleMedical();
		
	}
	
	@GetMapping("nurseInFemaleSurgical")
	public String  countNurseInFemaleSurgical() {
		return wardScheduleRepos.countNurseInFemaleSurgical();
		
	}
	
	@GetMapping("nurseInMaternity")
	public String  countNurseInMaternity() {
		return wardScheduleRepos.countNurseInMaternity();
		
	}
	@GetMapping("nurseInNICU")
	public String  countNurseInNICU() {
		return wardScheduleRepos.countNurseInNICU();
		
	}
	
	@GetMapping("nurseInReligiousWard")
	public String  countNurseInReligiousWard() {
		return wardScheduleRepos.countNurseInReligiousWard();
		
	}
	
	@GetMapping("nurseInGeneralWard")
	public String  countNurseInGeneralWard() {
		return wardScheduleRepos.countNurseInGeneralWard();
		
	}
	
	@GetMapping("nurseInOpd")
	public String  countNurseInOpd() {
		return wardScheduleRepos.countNurseInOpd();
		
	}
	
	@GetMapping("nurseInAccidentEmergency")
	public String  countNurseInAccidentEmergency() {
		return wardScheduleRepos.countNurseInAccidentEmergency();
		
	}
	
	

}
