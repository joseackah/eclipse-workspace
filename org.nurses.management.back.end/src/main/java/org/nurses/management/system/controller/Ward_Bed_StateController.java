package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Ward_Bed_State;
import org.nurses.management.system.repos.Ward_Bed_StateRepository;
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
@RequestMapping("/bedState")
public class Ward_Bed_StateController {
	
	@Autowired
	Ward_Bed_StateRepository bedState;
	
	
	@PostMapping("/saveWard_Bed_State")
	public Ward_Bed_State saveWard_Bed_State(@RequestBody Ward_Bed_State state) {
		
		return bedState.save(state);
	}
	
	@PutMapping("/updateWard_Bed_State")
	public Ward_Bed_State updatestate(@RequestBody Ward_Bed_State state) {
		
		return bedState.save(state);
	}
	
	@DeleteMapping("/deleteWard_Bed_State/{id}")
	public void deletestate(@PathVariable("id") int id) {
		bedState.deleteById(id);
	}
	
	@GetMapping("/getAllWard_Bed_State")
	public List<Ward_Bed_State> getAllWard_Bed_State(){
		
		return bedState.findAll();
	}
	
	
	@GetMapping("/findById/{id}")
	public Optional<Ward_Bed_State> findById(@PathVariable("id") int id){
		
		return bedState.findById(id);
		
	}
	
	
	
	@GetMapping("/maleMedicalBedState")
	public List<Ward_Bed_State> wardbedState(){
		return bedState.maleMedical();
	}
	
	@GetMapping("/femaleMedicalBedState")
	public List<Ward_Bed_State> femalebedState() {
		return bedState.femaleMedical();
	}
	
	@GetMapping("/maleSurgicalBedState")
	public List<Ward_Bed_State> maleSurgicalbedState() {
		return bedState.maleSurgical();
	}
	
	@GetMapping("/femaleSurgicalBedState")
	public List<Ward_Bed_State> femaleSurgicalbedState() {
		return bedState.femaleSurgical();
	}
	
	@GetMapping("/childrenWardBedState")
	public List<Ward_Bed_State> childrenWardbedState() {
		return bedState.childrens();
	}
	
	@GetMapping("/maternityWardBedState")
	public List<Ward_Bed_State> maternityWardbedState() {
		return bedState.maternity();
	}
	
	@GetMapping("generalWardBedState")
	public List<Ward_Bed_State> generalWardbedState() {
		return bedState.generalWard();
	}
	
	@GetMapping("/nicuBedState")
	public List<Ward_Bed_State> nicubedState() {
		return bedState.nicu();
	}
	
	@GetMapping("/religiousWardBedState")
	public List<Ward_Bed_State> religiousWardbedState() {
		return bedState.religious();
	}
	
	
	@GetMapping("/accidentEmergencyBedState")
	public List<Ward_Bed_State> accidentbedState() {
		return bedState.accident();
	}
	
	@GetMapping("/opdBedState")
	public List<Ward_Bed_State> opdbedState() {
		return bedState.opd();
	}
	
	
	@GetMapping("remainMidnight")
	public String countMidnight() {
		return bedState.countRemainAtMidnight();
		
	}
	
	@GetMapping("criticalPatient")
	public String  countCritical() {
		return bedState.countTotalCriticalIll();
		
	}
	
	@GetMapping("abscondedPatient")
	public String  countAbsconded() {
		return bedState.countAbsconded();
		
	}
	
	@GetMapping("floorPatient")
	public String  countFloorPatient() {
		return bedState.countTotalFloorPatient();
		
	}
	
	

}
