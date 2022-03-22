package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Admission_Discharge;
import org.nurses.management.system.repos.Admission_DischargeRepository;
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
@RequestMapping("/admission")
public class Admission_DischargeController {
	
	@Autowired
	Admission_DischargeRepository admission;
	
	
	
	@GetMapping("wardSummary/{wardName}")
	public Admission_Discharge wardSummary(@PathVariable("wardName") String ward_name) {
		
		return admission.wardSummary(ward_name);
	
	}
	
	@PostMapping("/saveAdmission_Discharge")
	public Admission_Discharge saveAdmission_Discharge(@RequestBody Admission_Discharge discharge) {
		
		return admission.save(discharge);
	}
	
	@PutMapping("/updateAdmission_Discharge")
	public Admission_Discharge updateAdmission_Discharge(@RequestBody Admission_Discharge discharge) {
		
		return admission.save(discharge);
	}
	
	@DeleteMapping("/deleteAdmission_Discharge/{id}")
	public void deleteAdmission_Discharge(@PathVariable("id") int id) {
		admission.deleteById(id);
	}
	
	@GetMapping("/getAllAdmission_Discharge")
	public List<Admission_Discharge> getAllLeave(){
		
		return admission.findAll();
	}
	
	
	@GetMapping("/findById/{id}")
	public Optional<Admission_Discharge> findById(@PathVariable("id") int id){
		
		return admission.findById(id);
		
	}
	
	@GetMapping("/admissionOnly")
	public List<Admission_Discharge> admissionOnly(){
		return admission.admissionOnly();
	}
	
	@GetMapping("/dischargeOnly")
	public List<Admission_Discharge> dischargeOnly() {
		return admission.dischargeOnly();
	}
	
	
	@GetMapping("/deathOnly")
	public List<Admission_Discharge> deathOnly() {
		return admission.deathOnly();
	}
	
	@GetMapping("/findByWardName")
	public List<Admission_Discharge> findByName(String name) {
		return admission.findByward_nameName(name);
	}
	
	@GetMapping("/wardDischarge")
	public List<Admission_Discharge> findDischarge(){
		return admission.findBywardDischarge();
	}
	
	@GetMapping("/maleMedical")
	public List<Admission_Discharge> maleMedical() {
		return admission.maleMedical();
	}
	
	@GetMapping("/maleSurgical")
	public List<Admission_Discharge> maleSurgical() {
		return admission.maleSurgical();
	}
	
	@GetMapping("/femaleMedical")
	public List<Admission_Discharge> femaleMedical() {
		return admission.femaleMedical();
	}
	
	@GetMapping("/femaleSurgical")
	public List<Admission_Discharge> femaleSurgical() {
		return admission.femaleSurgical();
	}
	
	@GetMapping("/maternity")
	public List<Admission_Discharge> maternity() {
		return admission.maternity();
	}
	
	@GetMapping("/childrensWard")
	public List<Admission_Discharge> childrenWard() {
		return admission.childrens();
	}
	
	@GetMapping("/religiousWard")
	public List<Admission_Discharge> religiousWard() {
		return admission.religious();
	}
	
	@GetMapping("/generalWard")
	public List<Admission_Discharge> generalWard() {
		return admission.generalWard();
	}
	
	@GetMapping("/accidentEmergency")
	public List<Admission_Discharge> accidentEmergency() {
		return admission.accident();
	}
	
	@GetMapping("/nicu")
	public List<Admission_Discharge> nicu() {
		return admission.nicu();
	}
	
	@GetMapping("/opd")
	public List<Admission_Discharge> opd() {
		return admission.opd();
	}
	
	
	
	/*>>>>>>>>>>>>>>>>>>===================Deaths======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	
	
	@GetMapping("/maleMedicalDeath")
	public List<Admission_Discharge> maleMedicalDeath() {
		return admission.maleMedicalDeath();
	}
	
	@GetMapping("/maleSurgicalDeath")
	public List<Admission_Discharge> maleSurgicalDeath() {
		return admission.maleSurgicalDeath();
	}
	
	@GetMapping("/femaleMedicalDeath")
	public List<Admission_Discharge> femaleMedicalDeath() {
		return admission.femaleMedicalDeath();
	}
	
	@GetMapping("/femaleSurgicalDeath")
	public List<Admission_Discharge> femaleSurgicalDeath() {
		return admission.femaleSurgicalDeath();
	}
	
	@GetMapping("/maternityDeath")
	public List<Admission_Discharge> maternityDeath() {
		return admission.maternityDeath();
	}
	
	@GetMapping("/childrensWardDeath")
	public List<Admission_Discharge> childrenWardDeath() {
		return admission.childrensDeath();
	}
	
	@GetMapping("/religiousWardDeath")
	public List<Admission_Discharge> religiousWardDeath() {
		return admission.religiousDeath();
	}
	
	@GetMapping("/generalWardDeath")
	public List<Admission_Discharge> generalWardDeath() {
		return admission.generalWardDeath();
	}
	
	@GetMapping("/accidentEmergencyDeath")
	public List<Admission_Discharge> accidentEmergencyDeath() {
		return admission.accidentDeath();
	}
	
	@GetMapping("/nicuDeath")
	public List<Admission_Discharge> nicuDeath() {
		return admission.nicuDeath();
	}
	
	@GetMapping("/opdDeath")
	public List<Admission_Discharge> opdDeath() {
		return admission.opdDeath();
	}
	
	
	
	
/*>>>>>>>>>>>>>>>>>>===================Discharge======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	
	
	@GetMapping("/maleMedicalDischarge")
	public List<Admission_Discharge> maleMedicalDischarge() {
		return admission.maleMedicalDischarge();
	}
	
	@GetMapping("/maleSurgicalDischarge")
	public List<Admission_Discharge> maleSurgicalDischarge() {
		return admission.maleSurgicalDischarge();
	}
	
	@GetMapping("/femaleMedicalDischarge")
	public List<Admission_Discharge> femaleMedicalDischarge() {
		return admission.femaleMedicalDischarge();
	}
	
	@GetMapping("/femaleSurgicalDischarge")
	public List<Admission_Discharge> femaleSurgicalDischarge() {
		return admission.femaleSurgicalDischarge();
	}
	
	@GetMapping("/maternityDischarge")
	public List<Admission_Discharge> maternityDischarge() {
		return admission.maternityDischarge();
	}
	
	@GetMapping("/childrensWardDischarge")
	public List<Admission_Discharge> childrenWardDischarge() {
		return admission.childrensDischarge();
	}
	
	@GetMapping("/religiousWardDischarge")
	public List<Admission_Discharge> religiousWardDischarge() {
		return admission.religiousDischarge();
	}
	
	@GetMapping("/generalWardDischarge")
	public List<Admission_Discharge> generalWardDischarge() {
		return admission.generalWardDischarge();
	}
	
	@GetMapping("/accidentEmergencyDischarge")
	public List<Admission_Discharge> accidentEmergencyDischarge() {
		return admission.accidentDischarge();
	}
	
	@GetMapping("/nicuDischarge")
	public List<Admission_Discharge> nicuDischarge() {
		return admission.nicuDischarge();
	}
	
	@GetMapping("/opdDischarge")
	public List<Admission_Discharge> opdDischarge() {
		return admission.opdDischarge();
	}
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countAdmissionJanuary")
	public String countAdmissionJanuary() {
		return admission.countAdmissionJanuary();
	}
	
	
	
	@GetMapping("countAdmissionFebruary")
	public String countAdmissionFebruary() {
		return admission.countAdmissionFebruary();
	}
	
	
	@GetMapping("countAdmissionMarch")
	public String countAdmissionMarch() {
		return admission.countAdmissionMarch();
	}
	
	
	@GetMapping("countAdmissionApril")
	public String countAdmissionApril() {
		return admission.countAdmissionApril();
	}
	
	
	@GetMapping("countAdmissionMay")
	public String countAdmissionMay() {
		return admission.countAdmissionMay();
	}
	
	
	@GetMapping("countAdmissionJune")
	public String countAdmissionJune() {
		return admission.countAdmissionJune();
	}
	
	
	@GetMapping("countAdmissionJuly")
	public String countAdmissionJuly() {
		return admission.countAdmissionJuly();
	}
	
	
	@GetMapping("countAdmissionAugust")
	public String countAdmissionAugust() {
		return admission.countAdmissionAugust();
	}
	
	
	@GetMapping("countAdmissionSeptember")
	public String countAdmissionSeptember() {
		return admission.countAdmissionSeptember();
	}
	
	
	@GetMapping("countAdmissionOctober")
	public String countAdmissionOctober() {
		return admission.countAdmissionOctober();
	}
	
	
	@GetMapping("countAdmissionNovember")
	public String countAdmissionNovember() {
		return admission.countAdmissionNovember();
	}
	
	
	@GetMapping("countAdmissionDecember")
	public String countAdmissionDecember() {
		return admission.countAdmissionDecember();
	}
	
	
	
	
	
/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countDischargeJanuary")
	public String countDischargeJanuary() {
		return admission.countDischargeJanuary();
	}
	
	
	
	@GetMapping("countDischargeFebruary")
	public String countDischargeFebruary() {
		return admission.countDischargeFebruary();
	}
	
	
	@GetMapping("countDischargeMarch")
	public String countDischargeMarch() {
		return admission.countDischargeMarch();
	}
	
	
	@GetMapping("countDischargeApril")
	public String countDischargeApril() {
		return admission.countDischargeApril();
	}
	
	
	@GetMapping("countDischargeMay")
	public String countDischargeMay() {
		return admission.countDischargeMay();
	}
	
	
	@GetMapping("countDischargeJune")
	public String countDischargeJune() {
		return admission.countDischargeJune();
	}
	
	
	@GetMapping("countDischargeJuly")
	public String countDischargeJuly() {
		return admission.countDischargeJuly();
	}
	
	
	@GetMapping("countDischargeAugust")
	public String countDischargeAugust() {
		return admission.countDischargeAugust();
	}
	
	
	@GetMapping("countDischargeSeptember")
	public String countDischargeSeptember() {
		return admission.countDischargeSeptember();
	}
	
	
	@GetMapping("countDischargeOctober")
	public String countDischargeOctober() {
		return admission.countDischargeOctober();
	}
	
	
	@GetMapping("countDischargeNovember")
	public String countDischargeNovember() {
		return admission.countDischargeNovember();
	}
	
	
	@GetMapping("countDischargeDecember")
	public String countDischargeDecember() {
		return admission.countDischargeDecember();
	}
	
	
	
/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countDeathJanuary")
	public String countDeathJanuary() {
		return admission.countDeathJanuary();
	}
	
	
	
	@GetMapping("countDeathFebruary")
	public String countDeathFebruary() {
		return admission.countDeathFebruary();
	}
	
	
	@GetMapping("countDeathMarch")
	public String countDeathMarch() {
		return admission.countDeathMarch();
	}
	
	
	@GetMapping("countDeathApril")
	public String countDeathApril() {
		return admission.countDeathApril();
	}
	
	
	@GetMapping("countDeathMay")
	public String countDeathMay() {
		return admission.countDeathMay();
	}
	
	
	@GetMapping("countDeathJune")
	public String countDeathJune() {
		return admission.countDeathJune();
	}
	
	
	@GetMapping("countDeathJuly")
	public String countDeathJuly() {
		return admission.countDeathJuly();
	}
	
	
	@GetMapping("countDeathAugust")
	public String countDeathAugust() {
		return admission.countDeathAugust();
	}
	
	
	@GetMapping("countDeathSeptember")
	public String countDeathSeptember() {
		return admission.countDeathSeptember();
	}
	
	
	@GetMapping("countDeathOctober")
	public String countDeathOctober() {
		return admission.countDeathOctober();
	}
	
	
	@GetMapping("countDeathNovember")
	public String countDeathNovember() {
		return admission.countDeathNovember();
	}
	
	
	@GetMapping("countDeathDecember")
	public String countDeathDecember() {
		return admission.countDeathDecember();
		
		
	}
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge up to date=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countAdmissionToDate")
	public String countAdmission() {
		return admission.countAdmissionToDate();
		
	}
	
	@GetMapping("countDischarge")
	public String countDischarge() {
		return admission.countDischarge();
		
	}
	
	@GetMapping("countDeath")
	public String  countDeath() {
		return admission.countDeath();
		
	}
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for today=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countTodayAdmission")
	public String  countTodayAdmission() {
		return admission.countTodayAdmission();
		
	}
	
	@GetMapping("countTodayDischarge")
	public String countTodayDischarge() {
		return admission.countTodayDischarge();
		
	}
	
	@GetMapping("countTodayDeath")
	public String countTodayDeath() {
		return admission.countTodayDeath();
		
	}
	
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for yesterday=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countYesterdayAdmission")
	public String countYesterdayAdmission() {
		return admission.countYesterdayAdmission();
		
	}
	
	@GetMapping("countYesterdayDischarge")
	public String countYesterdayDischarge() {
		return admission.countYesterdayDischarge();
		
	}
	
	@GetMapping("countYesterdayDeath")
	public String  countYesterdayDeath() {
		return admission.countYesterdayDeath();
		
	}
	
	
	@GetMapping("bedOccupant")
	public String  bedOccupancy() {
		return admission.bedOccupant();
		
	}
	
	
	/*
	 * Counting methods for male medical
	 */	
/*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countMaleMedicalAdmissionJanuary")
	public String countMaleMedicalAdmissionJanuary() {
		return admission.countMaleMedicalAdmissionJanuary();
	}
	
	
	
	@GetMapping("countMaleMedicalAdmissionFebruary")
	public String countMaleMedicalAdmissionFebruary() {
		return admission.countMaleMedicalAdmissionFebruary();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionMarch")
	public String countMaleMedicalAdmissionMarch() {
		return admission.countMaleMedicalAdmissionMarch();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionApril")
	public String countMaleMedicalAdmissionApril() {
		return admission.countMaleMedicalAdmissionApril();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionMay")
	public String countMaleMedicalAdmissionMay() {
		return admission.countMaleMedicalAdmissionMay();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionJune")
	public String countMaleMedicalAdmissionJune() {
		return admission.countMaleMedicalAdmissionJune();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionJuly")
	public String countMaleMedicalAdmissionJuly() {
		return admission.countMaleMedicalAdmissionJuly();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionAugust")
	public String countMaleMedicalAdmissionAugust() {
		return admission.countMaleMedicalAdmissionAugust();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionSeptember")
	public String countMaleMedicalAdmissionSeptember() {
		return admission.countMaleMedicalAdmissionSeptember();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionOctober")
	public String countMaleMedicalAdmissionOctober() {
		return admission.countMaleMedicalAdmissionOctober();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionNovember")
	public String countMaleMedicalAdmissionNovember() {
		return admission.countMaleMedicalAdmissionNovember();
	}
	
	
	@GetMapping("countMaleMedicalAdmissionDecember")
	public String countMaleMedicalAdmissionDecember() {
		return admission.countMaleMedicalAdmissionDecember();
	}
	
	
	
	
	
/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countMaleMedicalDischargeJanuary")
	public String countMaleMedicalDischargeJanuary() {
		return admission.countMaleMedicalDischargeJanuary();
	}
	
	
	
	@GetMapping("countMaleMedicalDischargeFebruary")
	public String countMaleMedicalDischargeFebruary() {
		return admission.countMaleMedicalDischargeFebruary();
	}
	
	
	@GetMapping("countMaleMedicalDischargeMarch")
	public String countMaleMedicalDischargeMarch() {
		return admission.countMaleMedicalDischargeMarch();
	}
	
	
	@GetMapping("countMaleMedicalDischargeApril")
	public String countMaleMedicalDischargeApril() {
		return admission.countMaleMedicalDischargeApril();
	}
	
	
	@GetMapping("countMaleMedicalDischargeMay")
	public String countMaleMedicalDischargeMay() {
		return admission.countMaleMedicalDischargeMay();
	}
	
	
	@GetMapping("countMaleMedicalDischargeJune")
	public String countMaleMedicalDischargeJune() {
		return admission.countMaleMedicalDischargeJune();
	}
	
	
	@GetMapping("countMaleMedicalDischargeJuly")
	public String countMaleMedicalDischargeJuly() {
		return admission.countMaleMedicalDischargeJuly();
	}
	
	
	@GetMapping("countMaleMedicalDischargeAugust")
	public String countMaleMedicalDischargeAugust() {
		return admission.countMaleMedicalDischargeAugust();
	}
	
	
	@GetMapping("countMaleMedicalDischargeSeptember")
	public String countMaleMedicalDischargeSeptember() {
		return admission.countMaleMedicalDischargeSeptember();
	}
	
	
	@GetMapping("countMaleMedicalDischargeOctober")
	public String countMaleMedicalDischargeOctober() {
		return admission.countMaleMedicalDischargeOctober();
	}
	
	
	@GetMapping("countMaleMedicalDischargeNovember")
	public String countMaleMedicalDischargeNovember() {
		return admission.countMaleMedicalDischargeNovember();
	}
	
	
	@GetMapping("countMaleMedicalDischargeDecember")
	public String countMaleMedicalDischargeDecember() {
		return admission.countMaleMedicalDischargeDecember();
	}
	
	
	
/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countMaleMedicalDeathJanuary")
	public String countMaleMedicalDeathJanuary() {
		return admission.countMaleMedicalDeathJanuary();
	}
	
	
	
	@GetMapping("countMaleMedicalDeathFebruary")
	public String countMaleMedicalDeathFebruary() {
		return admission.countMaleMedicalDeathFebruary();
	}
	
	
	@GetMapping("countMaleMedicalDeathMarch")
	public String countMaleMedicalDeathMarch() {
		return admission.countMaleMedicalDeathMarch();
	}
	
	
	@GetMapping("countMaleMedicalDeathApril")
	public String countMaleMedicalDeathApril() {
		return admission.countMaleMedicalDeathApril();
	}
	
	
	@GetMapping("countMaleMedicalDeathMay")
	public String countMaleMedicalDeathMay() {
		return admission.countMaleMedicalDeathMay();
	}
	
	
	@GetMapping("countMaleMedicalDeathJune")
	public String countMaleMedicalDeathJune() {
		return admission.countMaleMedicalDeathJune();
	}
	
	
	@GetMapping("countMaleMedicalDeathJuly")
	public String countMaleMedicalDeathJuly() {
		return admission.countMaleMedicalDeathJuly();
	}
	
	
	@GetMapping("countMaleMedicalDeathAugust")
	public String countMaleMedicalDeathAugust() {
		return admission.countMaleMedicalDeathAugust();
	}
	
	
	@GetMapping("countMaleMedicalDeathSeptember")
	public String countMaleMedicalDeathSeptember() {
		return admission.countMaleMedicalDeathSeptember();
	}
	
	
	@GetMapping("countMaleMedicalDeathOctober")
	public String countMaleMedicalDeathOctober() {
		return admission.countMaleMedicalDeathOctober();
	}
	
	
	@GetMapping("countMaleMedicalDeathNovember")
	public String countMaleMedicalDeathNovember() {
		return admission.countMaleMedicalDeathNovember();
	}
	
	
	@GetMapping("countMaleMedicalDeathDecember")
	public String countMaleMedicalDeathDecember() {
		return admission.countMaleMedicalDeathDecember();
		
		
	}
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge up to date=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countMaleMedicalAdmissionToDate")
	public String countMaleMedicalAdmission() {
		return admission.countMaleMedicalAdmissionToDate();
		
	}
	
	@GetMapping("countMaleMedicalDischarge")
	public String countMaleMedicalDischarge() {
		return admission.countMaleMedicalDischarge();
		
	}
	
	@GetMapping("countMaleMedicalDeath")
	public String  countMaleMedicalDeath() {
		return admission.countMaleMedicalDeath();
		
	}
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for today=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countMaleMedicalTodayAdmission")
	public String  countMaleMedicalTodayAdmission() {
		return admission.countMaleMedicalTodayAdmission();
		
	}
	
	@GetMapping("countMaleMedicalTodayDischarge")
	public String countMaleMedicalTodayDischarge() {
		return admission.countMaleMedicalTodayDischarge();
		
	}
	
	@GetMapping("countMaleMedicalTodayDeath")
	public String countMaleMedicalTodayDeath() {
		return admission.countMaleMedicalTodayDeath();
		
	}
	
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for yesterday=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countMaleMedicalYesterdayAdmission")
	public String countMaleMedicalYesterdayAdmission() {
		return admission.countMaleMedicalYesterdayAdmission();
		
	}
	
	@GetMapping("countMaleMedicalYesterdayDischarge")
	public String countMaleMedicalYesterdayDischarge() {
		return admission.countMaleMedicalYesterdayDischarge();
		
	}
	
	@GetMapping("countMaleMedicalYesterdayDeath")
	public String  countMaleMedicalYesterdayDeath() {
		return admission.countMaleMedicalYesterdayDeath();
		
	}
	
	
	
	/* Counting female medical ward */
	
	/*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countFemaleMedicalAdmissionJanuary")
	public String countFemaleMedicalAdmissionJanuary() {
		return admission.countFemaleMedicalAdmissionJanuary();
	}
	
	
	
	@GetMapping("countFemaleMedicalAdmissionFebruary")
	public String countFemaleMedicalAdmissionFebruary() {
		return admission.countFemaleMedicalAdmissionFebruary();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionMarch")
	public String countFemaleMedicalAdmissionMarch() {
		return admission.countFemaleMedicalAdmissionMarch();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionApril")
	public String countFemaleMedicalAdmissionApril() {
		return admission.countFemaleMedicalAdmissionApril();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionMay")
	public String countFemaleMedicalAdmissionMay() {
		return admission.countFemaleMedicalAdmissionMay();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionJune")
	public String countFemaleMedicalAdmissionJune() {
		return admission.countFemaleMedicalAdmissionJune();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionJuly")
	public String countFemaleMedicalAdmissionJuly() {
		return admission.countFemaleMedicalAdmissionJuly();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionAugust")
	public String countFemaleMedicalAdmissionAugust() {
		return admission.countFemaleMedicalAdmissionAugust();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionSeptember")
	public String countFemaleMedicalAdmissionSeptember() {
		return admission.countFemaleMedicalAdmissionSeptember();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionOctober")
	public String countFemaleMedicalAdmissionOctober() {
		return admission.countFemaleMedicalAdmissionOctober();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionNovember")
	public String countFemaleMedicalAdmissionNovember() {
		return admission.countFemaleMedicalAdmissionNovember();
	}
	
	
	@GetMapping("countFemaleMedicalAdmissionDecember")
	public String countFemaleMedicalAdmissionDecember() {
		return admission.countFemaleMedicalAdmissionDecember();
	}
	
	
	
	
	
/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countFemaleMedicalDischargeJanuary")
	public String countFemaleMedicalDischargeJanuary() {
		return admission.countFemaleMedicalDischargeJanuary();
	}
	
	
	
	@GetMapping("countFemaleMedicalDischargeFebruary")
	public String countFemaleMedicalDischargeFebruary() {
		return admission.countFemaleMedicalDischargeFebruary();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeMarch")
	public String countFemaleMedicalDischargeMarch() {
		return admission.countFemaleMedicalDischargeMarch();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeApril")
	public String countFemaleMedicalDischargeApril() {
		return admission.countFemaleMedicalDischargeApril();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeMay")
	public String countFemaleMedicalDischargeMay() {
		return admission.countFemaleMedicalDischargeMay();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeJune")
	public String countFemaleMedicalDischargeJune() {
		return admission.countFemaleMedicalDischargeJune();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeJuly")
	public String countFemaleMedicalDischargeJuly() {
		return admission.countFemaleMedicalDischargeJuly();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeAugust")
	public String countFemaleMedicalDischargeAugust() {
		return admission.countFemaleMedicalDischargeAugust();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeSeptember")
	public String countFemaleMedicalDischargeSeptember() {
		return admission.countFemaleMedicalDischargeSeptember();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeOctober")
	public String countFemaleMedicalDischargeOctober() {
		return admission.countFemaleMedicalDischargeOctober();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeNovember")
	public String countFemaleMedicalDischargeNovember() {
		return admission.countFemaleMedicalDischargeNovember();
	}
	
	
	@GetMapping("countFemaleMedicalDischargeDecember")
	public String countFemaleMedicalDischargeDecember() {
		return admission.countFemaleMedicalDischargeDecember();
	}
	
	
	
/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

	
	@GetMapping("/countFemaleMedicalDeathJanuary")
	public String countFemaleMedicalDeathJanuary() {
		return admission.countFemaleMedicalDeathJanuary();
	}
	
	
	
	@GetMapping("countFemaleMedicalDeathFebruary")
	public String countFemaleMedicalDeathFebruary() {
		return admission.countFemaleMedicalDeathFebruary();
	}
	
	
	@GetMapping("countFemaleMedicalDeathMarch")
	public String countFemaleMedicalDeathMarch() {
		return admission.countFemaleMedicalDeathMarch();
	}
	
	
	@GetMapping("countFemaleMedicalDeathApril")
	public String countFemaleMedicalDeathApril() {
		return admission.countFemaleMedicalDeathApril();
	}
	
	
	@GetMapping("countFemaleMedicalDeathMay")
	public String countFemaleMedicalDeathMay() {
		return admission.countFemaleMedicalDeathMay();
	}
	
	
	@GetMapping("countFemaleMedicalDeathJune")
	public String countFemaleMedicalDeathJune() {
		return admission.countFemaleMedicalDeathJune();
	}
	
	
	@GetMapping("countFemaleMedicalDeathJuly")
	public String countFemaleMedicalDeathJuly() {
		return admission.countFemaleMedicalDeathJuly();
	}
	
	
	@GetMapping("countFemaleMedicalDeathAugust")
	public String countFemaleMedicalDeathAugust() {
		return admission.countFemaleMedicalDeathAugust();
	}
	
	
	@GetMapping("countFemaleMedicalDeathSeptember")
	public String countFemaleMedicalDeathSeptember() {
		return admission.countFemaleMedicalDeathSeptember();
	}
	
	
	@GetMapping("countFemaleMedicalDeathOctober")
	public String countFemaleMedicalDeathOctober() {
		return admission.countFemaleMedicalDeathOctober();
	}
	
	
	@GetMapping("countFemaleMedicalDeathNovember")
	public String countFemaleMedicalDeathNovember() {
		return admission.countFemaleMedicalDeathNovember();
	}
	
	
	@GetMapping("countFemaleMedicalDeathDecember")
	public String countFemaleMedicalDeathDecember() {
		return admission.countFemaleMedicalDeathDecember();
		
		
	}
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge up to date=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countFemaleMedicalAdmissionToDate")
	public String countFemaleMedicalAdmission() {
		return admission.countFemaleMedicalAdmissionToDate();
		
	}
	
	@GetMapping("countFemaleMedicalDischarge")
	public String countFemaleMedicalDischarge() {
		return admission.countFemaleMedicalDischarge();
		
	}
	
	@GetMapping("countFemaleMedicalDeath")
	public String  countFemaleMedicalDeath() {
		return admission.countFemaleMedicalDeath();
		
	}
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for today=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countFemaleMedicalTodayAdmission")
	public String  countFemaleMedicalTodayAdmission() {
		return admission.countFemaleMedicalTodayAdmission();
		
	}
	
	@GetMapping("countFemaleMedicalTodayDischarge")
	public String countFemaleMedicalTodayDischarge() {
		return admission.countFemaleMedicalTodayDischarge();
		
	}
	
	@GetMapping("countFemaleMedicalTodayDeath")
	public String countFemaleMedicalTodayDeath() {
		return admission.countFemaleMedicalTodayDeath();
		
	}
	
	
	
	
	/*>>>>>>>>>>>>>>>======Counting admission and discharge for yesterday=====<<<<<<<<<<<<<<<<<*/
	
	@GetMapping("countFemaleMedicalYesterdayAdmission")
	public String countFemaleMedicalYesterdayAdmission() {
		return admission.countFemaleMedicalYesterdayAdmission();
		
	}
	
	@GetMapping("countFemaleMedicalYesterdayDischarge")
	public String countFemaleMedicalYesterdayDischarge() {
		return admission.countFemaleMedicalYesterdayDischarge();
		
	}
	
	@GetMapping("countFemaleMedicalYesterdayDeath")
	public String  countFemaleMedicalYesterdayDeath() {
		return admission.countFemaleMedicalYesterdayDeath();
		
	}
	
	
	
	/* counting male surgical ward */
	
	
	  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionJanuary")
	  	public String countMaleSurgicalAdmissionJanuary() {
	  		return admission.countMaleSurgicalAdmissionJanuary();
	  	}
	  	
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionFebruary")
	  	public String countMaleSurgicalAdmissionFebruary() {
	  		return admission.countMaleSurgicalAdmissionFebruary();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionMarch")
	  	public String countMaleSurgicalAdmissionMarch() {
	  		return admission.countMaleSurgicalAdmissionMarch();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionApril")
	  	public String countMaleSurgicalAdmissionApril() {
	  		return admission.countMaleSurgicalAdmissionApril();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionMay")
	  	public String countMaleSurgicalAdmissionMay() {
	  		return admission.countMaleSurgicalAdmissionMay();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionJune")
	  	public String countMaleSurgicalAdmissionJune() {
	  		return admission.countMaleSurgicalAdmissionJune();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionJuly")
	  	public String countMaleSurgicalAdmissionJuly() {
	  		return admission.countMaleSurgicalAdmissionJuly();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionAugust")
	  	public String countMaleSurgicalAdmissionAugust() {
	  		return admission.countMaleSurgicalAdmissionAugust();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionSeptember")
	  	public String countMaleSurgicalAdmissionSeptember() {
	  		return admission.countMaleSurgicalAdmissionSeptember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionOctober")
	  	public String countMaleSurgicalAdmissionOctober() {
	  		return admission.countMaleSurgicalAdmissionOctober();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionNovember")
	  	public String countMaleSurgicalAdmissionNovember() {
	  		return admission.countMaleSurgicalAdmissionNovember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalAdmissionDecember")
	  	public String countMaleSurgicalAdmissionDecember() {
	  		return admission.countMaleSurgicalAdmissionDecember();
	  	}
	  	
	  	
	  	
	  	
	  	
	  /*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

	  	
	  	@GetMapping("countMaleSurgicalDischargeJanuary")
	  	public String countMaleSurgicalDischargeJanuary() {
	  		return admission.countMaleSurgicalDischargeJanuary();
	  	}
	  	
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeFebruary")
	  	public String countMaleSurgicalDischargeFebruary() {
	  		return admission.countMaleSurgicalDischargeFebruary();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeMarch")
	  	public String countMaleSurgicalDischargeMarch() {
	  		return admission.countMaleSurgicalDischargeMarch();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeApril")
	  	public String countMaleSurgicalDischargeApril() {
	  		return admission.countMaleSurgicalDischargeApril();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeMay")
	  	public String countMaleSurgicalDischargeMay() {
	  		return admission.countMaleSurgicalDischargeMay();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeJune")
	  	public String countMaleSurgicalDischargeJune() {
	  		return admission.countMaleSurgicalDischargeJune();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeJuly")
	  	public String countMaleSurgicalDischargeJuly() {
	  		return admission.countMaleSurgicalDischargeJuly();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeAugust")
	  	public String countMaleSurgicalDischargeAugust() {
	  		return admission.countMaleSurgicalDischargeAugust();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeSeptember")
	  	public String countMaleSurgicalDischargeSeptember() {
	  		return admission.countMaleSurgicalDischargeSeptember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeOctober")
	  	public String countMaleSurgicalDischargeOctober() {
	  		return admission.countMaleSurgicalDischargeOctober();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeNovember")
	  	public String countMaleSurgicalDischargeNovember() {
	  		return admission.countMaleSurgicalDischargeNovember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDischargeDecember")
	  	public String countMaleSurgicalDischargeDecember() {
	  		return admission.countMaleSurgicalDischargeDecember();
	  	}
	  	
	  	
	  	
	  /*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

	  	
	  	@GetMapping("countMaleSurgicalDeathJanuary")
	  	public String countMaleSurgicalDeathJanuary() {
	  		return admission.countMaleSurgicalDeathJanuary();
	  	}
	  	
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathFebruary")
	  	public String countMaleSurgicalDeathFebruary() {
	  		return admission.countMaleSurgicalDeathFebruary();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathMarch")
	  	public String countMaleSurgicalDeathMarch() {
	  		return admission.countMaleSurgicalDeathMarch();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathApril")
	  	public String countMaleSurgicalDeathApril() {
	  		return admission.countMaleSurgicalDeathApril();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathMay")
	  	public String countMaleSurgicalDeathMay() {
	  		return admission.countMaleSurgicalDeathMay();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathJune")
	  	public String countMaleSurgicalDeathJune() {
	  		return admission.countMaleSurgicalDeathJune();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathJuly")
	  	public String countMaleSurgicalDeathJuly() {
	  		return admission.countMaleSurgicalDeathJuly();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathAugust")
	  	public String countMaleSurgicalDeathAugust() {
	  		return admission.countMaleSurgicalDeathAugust();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathSeptember")
	  	public String countMaleSurgicalDeathSeptember() {
	  		return admission.countMaleSurgicalDeathSeptember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathOctober")
	  	public String countMaleSurgicalDeathOctober() {
	  		return admission.countMaleSurgicalDeathOctober();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathNovember")
	  	public String countMaleSurgicalDeathNovember() {
	  		return admission.countMaleSurgicalDeathNovember();
	  	}
	  	
	  	
	  	@GetMapping("countMaleSurgicalDeathDecember")
	  	public String countMaleSurgicalDeathDecember() {
	  		return admission.countMaleSurgicalDeathDecember();
	  	}
	  	
	  	
	  	
	  	
		/* counting admission upto date */
		
		@GetMapping("countMaleSurgicalAdmissionToDate") 
		  public String	  countMaleSurgicalAdmissionToDate() { 
			  return admission.countMaleSurgicalAdmissionToDate();
		  
		  }
		  
		  
		  @GetMapping("countMaleSurgicalDischarge") 
		  public String countMaleSurgicalDischarge() { 
			  return admission.countMaleSurgicalDischarge();
		  
		  }
		  
		  @GetMapping("countMaleSurgicalDeath")
		  public String  countMaleSurgicalDeath() {
			  return admission.countMaleSurgicalDeath();
			
		}
		
		
	/* counting admission and discharge for today */
		  
		  @GetMapping("countMaleSurgicalTodayAdmission") 
		  public String	 countMaleSurgicalTodayAdmission() { 
			  return admission.countMaleSurgicalTodayAdmission();
		  
		  }
		  
		  
		  @GetMapping("countMaleSurgicalTodayDischarge") 
		  public String countMaleSurgicalTodayDischarge() { 
			  return admission.countMaleSurgicalTodayDischarge();
		  
		  }
		  
		  @GetMapping("countMaleSurgicalTodayDeath")
		  public String  countMaleSurgicalTodayDeath() {
			  return admission.countMaleSurgicalTodayDeath();
			
		}
		  
		  
		  
		  
		  
		  
		  
		  
		/* counting admission and discharge for yesterday */
		 
		  @GetMapping("countMaleSurgicalYesterdayAdmission") 
		  public String	  countMaleSurgicalYesterdayAdmission() { 
			  return admission.countMaleSurgicalYesterdayAdmission();
		  
		  }
		  
		  
		  @GetMapping("countMaleSurgicalYesterdayDischarge") 
		  public String	  countMaleSurgicalYesterdayDischarge() { 
			  return admission.countMaleSurgicalYesterdayDischarge();
		  
		  }
		  
		  @GetMapping("countMaleSurgicalYesterdayDeath")
		  public String  countMaleSurgicalYesterdayDeath() {
			  return admission.countMaleSurgicalYesterdayDeath();
			
		}
		  
		  
		  
		  
		  
		/* counting for female surgical ward */
		  
		  
		  
		  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			
			@GetMapping("countFemaleSurgicalAdmissionJanuary")
			public String countFemaleSurgicalAdmissionJanuary() {
				return admission.countFemaleSurgicalAdmissionJanuary();
			}
			
			
			
			@GetMapping("countFemaleSurgicalAdmissionFebruary")
			public String countFemaleSurgicalAdmissionFebruary() {
				return admission.countFemaleSurgicalAdmissionFebruary();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionMarch")
			public String countFemaleSurgicalAdmissionMarch() {
				return admission.countFemaleSurgicalAdmissionMarch();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionApril")
			public String countFemaleSurgicalAdmissionApril() {
				return admission.countFemaleSurgicalAdmissionApril();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionMay")
			public String countFemaleSurgicalAdmissionMay() {
				return admission.countFemaleSurgicalAdmissionMay();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionJune")
			public String countFemaleSurgicalAdmissionJune() {
				return admission.countFemaleSurgicalAdmissionJune();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionJuly")
			public String countFemaleSurgicalAdmissionJuly() {
				return admission.countFemaleSurgicalAdmissionJuly();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionAugust")
			public String countFemaleSurgicalAdmissionAugust() {
				return admission.countFemaleSurgicalAdmissionAugust();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionSeptember")
			public String countFemaleSurgicalAdmissionSeptember() {
				return admission.countFemaleSurgicalAdmissionSeptember();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionOctober")
			public String countFemaleSurgicalAdmissionOctober() {
				return admission.countFemaleSurgicalAdmissionOctober();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionNovember")
			public String countFemaleSurgicalAdmissionNovember() {
				return admission.countFemaleSurgicalAdmissionNovember();
			}
			
			
			@GetMapping("countFemaleSurgicalAdmissionDecember")
			public String countFemaleSurgicalAdmissionDecember() {
				return admission.countFemaleSurgicalAdmissionDecember();
			}
			
			
			
			
			
		/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			@GetMapping("countFemaleSurgicalDischargeJanuary")
			public String countFemaleSurgicalDischargeJanuary() {
				return admission.countFemaleSurgicalDischargeJanuary();
			}
			
			
			
			@GetMapping("countFemaleSurgicalDischargeFebruary")
			public String countFemaleSurgicalDischargeFebruary() {
				return admission.countFemaleSurgicalDischargeFebruary();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeMarch")
			public String countFemaleSurgicalDischargeMarch() {
				return admission.countFemaleSurgicalDischargeMarch();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeApril")
			public String countFemaleSurgicalDischargeApril() {
				return admission.countFemaleSurgicalDischargeApril();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeMay")
			public String countFemaleSurgicalDischargeMay() {
				return admission.countFemaleSurgicalDischargeMay();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeJune")
			public String countFemaleSurgicalDischargeJune() {
				return admission.countFemaleSurgicalDischargeJune();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeJuly")
			public String countFemaleSurgicalDischargeJuly() {
				return admission.countFemaleSurgicalDischargeJuly();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeAugust")
			public String countFemaleSurgicalDischargeAugust() {
				return admission.countFemaleSurgicalDischargeAugust();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeSeptember")
			public String countFemaleSurgicalDischargeSeptember() {
				return admission.countFemaleSurgicalDischargeSeptember();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeOctober")
			public String countFemaleSurgicalDischargeOctober() {
				return admission.countDischargeOctober();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeNovember")
			public String countFemaleSurgicalDischargeNovember() {
				return admission.countFemaleSurgicalDischargeNovember();
			}
			
			
			@GetMapping("countFemaleSurgicalDischargeDecember")
			public String countFemaleSurgicalDischargeDecember() {
				return admission.countFemaleSurgicalDischargeDecember();
			}
			
			
			
		/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			@GetMapping("countFemaleSurgicalDeathJanuary")
			public String countFemaleSurgicalDeathJanuary() {
				return admission.countFemaleSurgicalDeathJanuary();
			}
			
			
			
			@GetMapping("countFemaleSurgicalDeathFebruary")
			public String countFemaleSurgicalDeathFebruary() {
				return admission.countFemaleSurgicalDeathFebruary();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathMarch")
			public String countFemaleSurgicalDeathMarch() {
				return admission.countFemaleSurgicalDeathMarch();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathApril")
			public String countFemaleSurgicalDeathApril() {
				return admission.countFemaleSurgicalDeathApril();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathMay")
			public String countFemaleSurgicalDeathMay() {
				return admission.countFemaleSurgicalDeathMay();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathJune")
			public String countFemaleSurgicalDeathJune() {
				return admission.countFemaleSurgicalDeathJune();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathJuly")
			public String countFemaleSurgicalDeathJuly() {
				return admission.countFemaleSurgicalDeathJuly();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathAugust")
			public String countFemaleSurgicalDeathAugust() {
				return admission.countFemaleSurgicalDeathAugust();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathSeptember")
			public String countFemaleSurgicalDeathSeptember() {
				return admission.countFemaleSurgicalDeathSeptember();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathOctober")
			public String countFemaleSurgicalDeathOctober() {
				return admission.countFemaleSurgicalDeathOctober();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathNovember")
			public String countFemaleSurgicalDeathNovember() {
				return admission.countFemaleSurgicalDeathNovember();
			}
			
			
			@GetMapping("countFemaleSurgicalDeathDecember")
			public String countFemaleSurgicalDeathDecember() {
				return admission.countFemaleSurgicalDeathDecember();
			}
			
			
			
			/* counting admission and discharge to date */
			
			 @GetMapping("countFemaleSurgicalAdmissionToDate") 
			  public String
			  countFemaleSurgicalAdmissionToDate() { 
				  return admission.countFemaleSurgicalAdmissionToDate();
			  
			  }
			  
			  
			  @GetMapping("countFemaleSurgicalDischarge") public String
			  countFemaleSurgicalDischarge() { return admission.countFemaleSurgicalDischarge();
			  
			  }
			  
			  @GetMapping("countFemaleSurgicalDeath")
			  public String  countFemaleSurgicalDeath() {
				  return admission.countDeath();
				
			}
			
			
		/* counting admission and discharge for today */
			  
			  @GetMapping("countFemaleSurgicalTodayAdmission") 
			  public String	 countFemaleSurgicalTodayAdmission() { 
				  return admission.countFemaleSurgicalTodayAdmission();
			  
			  }
			  
			  
			  @GetMapping("countFemaleSurgicalTodayDischarge") 
			  public String countFemaleSurgicalTodayDischarge() { 
				  return admission.countFemaleSurgicalTodayDischarge();
			  
			  }
			  
			  @GetMapping("countFemaleSurgicalTodayDeath")
			  public String  countTFemaleSurgicalodayDeath() {
				  return admission.countFemaleSurgicalTodayDeath();
				
			}
			  
			  
			  
			  
			  
			  
			  
			  
			/* counting admission and discharge for yesterday */
			 
			  @GetMapping("countFemaleSurgicalYesterdayAdmission") 
			  public String
			  countFemaleSurgicalYesterdayAdmission() { 
				  return admission.countFemaleSurgicalYesterdayAdmission();
			  
			  }
			  
			  
			  @GetMapping("countFemaleSurgicalYesterdayDischarge") 
			  public String countFemaleSurgicalYesterdayDischarge() { 
				  return admission.countFemaleSurgicalYesterdayDischarge();
			  
			  }
			  
			  @GetMapping("countFemaleSurgicalYesterdayDeath")
			  public String  countFemaleSurgicalYesterdayDeath() {
				  return admission.countFemaleSurgicalYesterdayDeath();
				
			}
			
			/* couuting ends */ 
		  
		  
		  
			/*
			 * counting for children's ward
			 */

			  
			  
			  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				
				@GetMapping("countChildrensWardAdmissionJanuary")
				public String countChildrensWardAdmissionJanuary() {
					return admission.countChildrensWardAdmissionJanuary();
				}
				
				
				
				@GetMapping("countChildrensWardAdmissionFebruary")
				public String countChildrensWardAdmissionFebruary() {
					return admission.countChildrensWardAdmissionFebruary();
				}
				
				
				@GetMapping("countChildrensWardAdmissionMarch")
				public String countChildrensWardAdmissionMarch() {
					return admission.countChildrensWardAdmissionMarch();
				}
				
				
				@GetMapping("countChildrensWardAdmissionApril")
				public String countChildrensWardAdmissionApril() {
					return admission.countChildrensWardAdmissionApril();
				}
				
				
				@GetMapping("countChildrensWardAdmissionMay")
				public String countChildrensWardAdmissionMay() {
					return admission.countChildrensWardAdmissionMay();
				}
				
				
				@GetMapping("countChildrensWardAdmissionJune")
				public String countChildrensWardAdmissionJune() {
					return admission.countChildrensWardAdmissionJune();
				}
				
				
				@GetMapping("countChildrensWardAdmissionJuly")
				public String countChildrensWardAdmissionJuly() {
					return admission.countChildrensWardAdmissionJuly();
				}
				
				
				@GetMapping("countChildrensWardAdmissionAugust")
				public String countChildrensWardAdmissionAugust() {
					return admission.countChildrensWardAdmissionAugust();
				}
				
				
				@GetMapping("countChildrensWardAdmissionSeptember")
				public String countChildrensWardAdmissionSeptember() {
					return admission.countChildrensWardAdmissionSeptember();
				}
				
				
				@GetMapping("countChildrensWardAdmissionOctober")
				public String countChildrensWardAdmissionOctober() {
					return admission.countChildrensWardAdmissionOctober();
				}
				
				
				@GetMapping("countChildrensWardAdmissionNovember")
				public String countChildrensWardAdmissionNovember() {
					return admission.countChildrensWardAdmissionNovember();
				}
				
				
				@GetMapping("countChildrensWardAdmissionDecember")
				public String countChildrensWardAdmissionDecember() {
					return admission.countChildrensWardAdmissionDecember();
				}
				
				
				
				
				
			/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				@GetMapping("countChildrensWardDischargeJanuary")
				public String countChildrensWardDischargeJanuary() {
					return admission.countChildrensWardDischargeJanuary();
				}
				
				
				
				@GetMapping("countChildrensWardDischargeFebruary")
				public String countChildrensWardDischargeFebruary() {
					return admission.countChildrensWardDischargeFebruary();
				}
				
				
				@GetMapping("countChildrensWardDischargeMarch")
				public String countChildrensWardDischargeMarch() {
					return admission.countChildrensWardDischargeMarch();
				}
				
				
				@GetMapping("countChildrensWardDischargeApril")
				public String countChildrensWardDischargeApril() {
					return admission.countChildrensWardDischargeApril();
				}
				
				
				@GetMapping("countChildrensWardDischargeMay")
				public String countChildrensWardDischargeMay() {
					return admission.countChildrensWardDischargeMay();
				}
				
				
				@GetMapping("countChildrensWardDischargeJune")
				public String countChildrensWardDischargeJune() {
					return admission.countChildrensWardDischargeJune();
				}
				
				
				@GetMapping("countChildrensWardDischargeJuly")
				public String countChildrensWardDischargeJuly() {
					return admission.countChildrensWardDischargeJuly();
				}
				
				
				@GetMapping("countChildrensWardDischargeAugust")
				public String countChildrensWardDischargeAugust() {
					return admission.countChildrensWardDischargeAugust();
				}
				
				
				@GetMapping("countChildrensWardDischargeSeptember")
				public String countChildrensWardDischargeSeptember() {
					return admission.countChildrensWardDischargeSeptember();
				}
				
				
				@GetMapping("countChildrensWardDischargeOctober")
				public String countChildrensWardDischargeOctober() {
					return admission.countChildrensWardDischargeOctober();
				}
				
				
				@GetMapping("countChildrensWardDischargeNovember")
				public String countChildrensWardDischargeNovember() {
					return admission.countChildrensWardDischargeNovember();
				}
				
				
				@GetMapping("countChildrensWardDischargeDecember")
				public String countChildrensWardDischargeDecember() {
					return admission.countChildrensWardDischargeDecember();
				}
				
				
				
			/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				@GetMapping("countChildrensWardDeathJanuary")
				public String countChildrensWardDeathJanuary() {
					return admission.countChildrensWardDeathJanuary();
				}
				
				
				
				@GetMapping("countChildrensWardDeathFebruary")
				public String countChildrensWardDeathFebruary() {
					return admission.countChildrensWardDeathFebruary();
				}
				
				
				@GetMapping("countChildrensWardDeathMarch")
				public String countChildrensWardDeathMarch() {
					return admission.countChildrensWardDeathMarch();
				}
				
				
				@GetMapping("countChildrensWardDeathApril")
				public String countChildrensWardDeathApril() {
					return admission.countChildrensWardDeathApril();
				}
				
				
				@GetMapping("countChildrensWardDeathMay")
				public String countChildrensWardDeathMay() {
					return admission.countChildrensWardDeathMay();
				}
				
				
				@GetMapping("countChildrensWardDeathJune")
				public String countChildrensWardDeathJune() {
					return admission.countChildrensWardDeathJune();
				}
				
				
				@GetMapping("countChildrensWardDeathJuly")
				public String countChildrensWardDeathJuly() {
					return admission.countChildrensWardDeathJuly();
				}
				
				
				@GetMapping("countChildrensWardDeathAugust")
				public String countChildrensWardDeathAugust() {
					return admission.countChildrensWardDeathAugust();
				}
				
				
				@GetMapping("countChildrensWardDeathSeptember")
				public String countChildrensWardDeathSeptember() {
					return admission.countChildrensWardDeathSeptember();
				}
				
				
				@GetMapping("countChildrensWardDeathOctober")
				public String countChildrensWardDeathOctober() {
					return admission.countChildrensWardDeathOctober();
				}
				
				
				@GetMapping("countChildrensWardDeathNovember")
				public String countChildrensWardDeathNovember() {
					return admission.countChildrensWardDeathNovember();
				}
				
				
				@GetMapping("countChildrensWardDeathDecember")
				public String countChildrensWardDeathDecember() {
					return admission.countChildrensWardDeathDecember();
				}
				
				
				
				/* counting admission and discharge to date */
				
				 @GetMapping("countChildrensWardAdmissionToDate") 
				  public String
				  countChildrensWardAdmissionToDate() { 
					  return admission.countChildrensWardAdmissionToDate();
				  
				  }
				  
				  
				  @GetMapping("countChildrensWardDischarge") public String
				  countChildrensWardDischarge() { return admission.countChildrensWardDischarge();
				  
				  }
				  
				  @GetMapping("countChildrensWardDeath")
				  public String  countChildrensWardDeath() {
					  return admission.countChildrensWardDeath();
					
				}
				
				
			/* counting admission and discharge for today */
				  
				  @GetMapping("countChildrensWardTodayAdmission") 
				  public String	 countChildrensWardTodayAdmission() { 
					  return admission.countChildrensWardTodayAdmission();
				  
				  }
				  
				  
				  @GetMapping("countChildrensWardTodayDischarge") 
				  public String countChildrensWardTodayDischarge() { 
					  return admission.countChildrensWardTodayDischarge();
				  
				  }
				  
				  @GetMapping("countChildrensWardTodayDeath")
				  public String  countChildrensWardTodayDeath() {
					  return admission.countChildrensWardTodayDeath();
					
				}
				  
				  
				  
				  
				  
				  
				  
				  
				/* counting admission and discharge for yesterday */
				 
				  @GetMapping("countChildrensWardYesterdayAdmission") 
				  public String
				  countChildrensWardYesterdayAdmission() { 
					  return admission.countChildrensWardYesterdayAdmission();
				  
				  }
				  
				  
				  @GetMapping("countChildrensWardYesterdayDischarge") public String
				  countChildrensWardYesterdayDischarge() { return admission.countChildrensWardYesterdayDischarge();
				  
				  }
				  
				  @GetMapping("countChildrensWardYesterdayDeath")
				  public String  countChildrensWardYesterdayDeath() {
					  return admission.countChildrensWardYesterdayDeath();
					
				}
				
				/* couuting ends */


				  
				  
				  
				  
				/* counting for maternity/labour ward/unit */
				  
				  
				  
				  
				  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

					
					
					@GetMapping("countMaternityAdmissionJanuary")
					public String countMaternityAdmissionJanuary() {
						return admission.countMaternityAdmissionJanuary();
					}
					
					
					
					@GetMapping("countMaternityAdmissionFebruary")
					public String countMaternityAdmissionFebruary() {
						return admission.countMaternityAdmissionFebruary();
					}
					
					
					@GetMapping("countMaternityAdmissionMarch")
					public String countMaternityAdmissionMarch() {
						return admission.countMaternityAdmissionMarch();
					}
					
					
					@GetMapping("countMaternityAdmissionApril")
					public String countMaternityAdmissionApril() {
						return admission.countMaternityAdmissionApril();
					}
					
					
					@GetMapping("countMaternityAdmissionMay")
					public String countMaternityAdmissionMay() {
						return admission.countMaternityAdmissionMay();
					}
					
					
					@GetMapping("countMaternityAdmissionJune")
					public String countMaternityAdmissionJune() {
						return admission.countMaternityAdmissionJune();
					}
					
					
					@GetMapping("countMaternityAdmissionJuly")
					public String countMaternityAdmissionJuly() {
						return admission.countMaternityAdmissionJuly();
					}
					
					
					@GetMapping("countMaternityAdmissionAugust")
					public String countMaternityAdmissionAugust() {
						return admission.countMaternityAdmissionAugust();
					}
					
					
					@GetMapping("countMaternityAdmissionSeptember")
					public String countMaternityAdmissionSeptember() {
						return admission.countMaternityAdmissionSeptember();
					}
					
					
					@GetMapping("countMaternityAdmissionOctober")
					public String countMaternityAdmissionOctober() {
						return admission.countMaternityAdmissionOctober();
					}
					
					
					@GetMapping("countMaternityAdmissionNovember")
					public String countMaternityAdmissionNovember() {
						return admission.countMaternityAdmissionNovember();
					}
					
					
					@GetMapping("countMaternityAdmissionDecember")
					public String countMaternityAdmissionDecember() {
						return admission.countMaternityAdmissionDecember();
					}
					
					
					
					
					
				/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

					
					@GetMapping("countMaternityDischargeJanuary")
					public String countMaternityDischargeJanuary() {
						return admission.countMaternityDischargeJanuary();
					}
					
					
					
					@GetMapping("countMaternityDischargeFebruary")
					public String countMaternityDischargeFebruary() {
						return admission.countMaternityDischargeFebruary();
					}
					
					
					@GetMapping("countMaternityDischargeMarch")
					public String countMaternityDischargeMarch() {
						return admission.countMaternityDischargeMarch();
					}
					
					
					@GetMapping("countMaternityDischargeApril")
					public String countMaternityDischargeApril() {
						return admission.countMaternityDischargeApril();
					}
					
					
					@GetMapping("countMaternityDischargeMay")
					public String countMaternityDischargeMay() {
						return admission.countMaternityDischargeMay();
					}
					
					
					@GetMapping("countMaternityDischargeJune")
					public String countMaternityDischargeJune() {
						return admission.countMaternityDischargeJune();
					}
					
					
					@GetMapping("countMaternityDischargeJuly")
					public String countMaternityDischargeJuly() {
						return admission.countMaternityDischargeJuly();
					}
					
					
					@GetMapping("countMaternityDischargeAugust")
					public String countMaternityDischargeAugust() {
						return admission.countMaternityDischargeAugust();
					}
					
					
					@GetMapping("countMaternityDischargeSeptember")
					public String countMaternityDischargeSeptember() {
						return admission.countMaternityDischargeSeptember();
					}
					
					
					@GetMapping("countMaternityDischargeOctober")
					public String countMaternityDischargeOctober() {
						return admission.countMaternityDischargeOctober();
					}
					
					
					@GetMapping("countMaternityDischargeNovember")
					public String countMaternityDischargeNovember() {
						return admission.countMaternityDischargeNovember();
					}
					
					
					@GetMapping("countMaternityDischargeDecember")
					public String countMaternityDischargeDecember() {
						return admission.countMaternityDischargeDecember();
					}
					
					
					
				/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

					
					@GetMapping("countMaternityDeathJanuary")
					public String countMaternityDeathJanuary() {
						return admission.countMaternityDeathJanuary();
					}
					
					
					
					@GetMapping("countMaternityDeathFebruary")
					public String countMaternityDeathFebruary() {
						return admission.countMaternityDeathFebruary();
					}
					
					
					@GetMapping("countMaternityDeathMarch")
					public String countMaternityDeathMarch() {
						return admission.countMaternityDeathMarch();
					}
					
					
					@GetMapping("countMaternityDeathApril")
					public String countMaternityDeathApril() {
						return admission.countMaternityDeathApril();
					}
					
					
					@GetMapping("countMaternityDeathMay")
					public String countMaternityDeathMay() {
						return admission.countMaternityDeathMay();
					}
					
					
					@GetMapping("countMaternityDeathJune")
					public String countMaternityDeathJune() {
						return admission.countMaternityDeathJune();
					}
					
					
					@GetMapping("countMaternityDeathJuly")
					public String countMaternityDeathJuly() {
						return admission.countMaternityDeathJuly();
					}
					
					
					@GetMapping("countMaternityDeathAugust")
					public String countMaternityDeathAugust() {
						return admission.countMaternityDeathAugust();
					}
					
					
					@GetMapping("countMaternityDeathSeptember")
					public String countMaternityDeathSeptember() {
						return admission.countMaternityDeathSeptember();
					}
					
					
					@GetMapping("countMaternityDeathOctober")
					public String countMaternityDeathOctober() {
						return admission.countMaternityDeathOctober();
					}
					
					
					@GetMapping("countMaternityDeathNovember")
					public String countMaternityDeathNovember() {
						return admission.countMaternityDeathNovember();
					}
					
					
					@GetMapping("countMaternityDeathDecember")
					public String countMaternityDeathDecember() {
						return admission.countMaternityDeathDecember();
					}
					
					
					
					/* counting admission and discharge to date */
					
					 @GetMapping("countMaternityAdmissionToDate") 
					  public String
					  countMaternityAdmissionToDate() { 
						  return admission.countMaternityAdmissionToDate();
					  
					  }
					  
					  
					  @GetMapping("countMaternityDischarge") public String
					  countMaternityDischarge() { return admission.countMaternityDischarge();
					  
					  }
					  
					  @GetMapping("countMaternityDeath")
					  public String  countMaternityDeath() {
						  return admission.countMaternityDeath();
						
					}
					
					
				/* counting admission and discharge for today */
					  
					  @GetMapping("countMaternityTodayAdmission") 
					  public String	 countMaternityTodayAdmission() { 
						  return admission.countMaternityTodayAdmission();
					  
					  }
					  
					  
					  @GetMapping("countMaternityTodayDischarge") 
					  public String countMaternityTodayDischarge() { 
						  return admission.countMaternityTodayDischarge();
					  
					  }
					  
					  @GetMapping("countMaternityTodayDeath")
					  public String  countMaternityTodayDeath() {
						  return admission.countMaternityTodayDeath();
						
					}
					  
					  
					  
					  
					  
					  
					  
					  
					/* counting admission and discharge for yesterday */
					 
					  @GetMapping("countMaternityYesterdayAdmission") 
					  public String
					  countMaternityYesterdayAdmission() { 
						  return admission.countMaternityYesterdayAdmission();
					  
					  }
					  
					  
					  @GetMapping("countMaternityYesterdayDischarge") public String
					  countMaternityYesterdayDischarge() { return admission.countMaternityYesterdayDischarge();
					  
					  }
					  
					  @GetMapping("countMaternityYesterdayDeath")
					  public String  countMaternityYesterdayDeath() {
						  return admission.countMaternityYesterdayDeath();
						
					}
					
					/* couuting ends */
					  
					  

					  
					/* counting for nicu */
					  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

						
						
						@GetMapping("countNICUAdmissionJanuary")
						public String countNICUAdmissionJanuary() {
							return admission.countNICUAdmissionJanuary();
						}
						
						
						
						@GetMapping("countNICUAdmissionFebruary")
						public String countNICUAdmissionFebruary() {
							return admission.countNICUAdmissionFebruary();
						}
						
						
						@GetMapping("countNICUAdmissionMarch")
						public String countNICUAdmissionMarch() {
							return admission.countNICUAdmissionMarch();
						}
						
						
						@GetMapping("countNICUAdmissionApril")
						public String countNICUAdmissionApril() {
							return admission.countNICUAdmissionApril();
						}
						
						
						@GetMapping("countNICUAdmissionMay")
						public String countNICUAdmissionMay() {
							return admission.countNICUAdmissionMay();
						}
						
						
						@GetMapping("countNICUAdmissionJune")
						public String countNICUAdmissionJune() {
							return admission.countNICUAdmissionJune();
						}
						
						
						@GetMapping("countNICUAdmissionJuly")
						public String countNICUAdmissionJuly() {
							return admission.countNICUAdmissionJuly();
						}
						
						
						@GetMapping("countNICUAdmissionAugust")
						public String countNICUAdmissionAugust() {
							return admission.countNICUAdmissionAugust();
						}
						
						
						@GetMapping("countNICUAdmissionSeptember")
						public String countNICUAdmissionSeptember() {
							return admission.countNICUAdmissionSeptember();
						}
						
						
						@GetMapping("countNICUAdmissionOctober")
						public String countNICUAdmissionOctober() {
							return admission.countNICUAdmissionOctober();
						}
						
						
						@GetMapping("countNICUAdmissionNovember")
						public String countNICUAdmissionNovember() {
							return admission.countNICUAdmissionNovember();
						}
						
						
						@GetMapping("countNICUAdmissionDecember")
						public String countNICUAdmissionDecember() {
							return admission.countNICUAdmissionDecember();
						}
						
						
						
						
						
					/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

						
						@GetMapping("countNICUDischargeJanuary")
						public String countNICUDischargeJanuary() {
							return admission.countNICUDischargeJanuary();
						}
						
						
						
						@GetMapping("countNICUDischargeFebruary")
						public String countNICUDischargeFebruary() {
							return admission.countNICUDischargeFebruary();
						}
						
						
						@GetMapping("countNICUDischargeMarch")
						public String countNICUDischargeMarch() {
							return admission.countNICUDischargeMarch();
						}
						
						
						@GetMapping("countNICUDischargeApril")
						public String countNICUDischargeApril() {
							return admission.countNICUDischargeApril();
						}
						
						
						@GetMapping("countNICUDischargeMay")
						public String countNICUDischargeMay() {
							return admission.countNICUDischargeMay();
						}
						
						
						@GetMapping("countNICUDischargeJune")
						public String countNICUDischargeJune() {
							return admission.countNICUDischargeJune();
						}
						
						
						@GetMapping("countNICUDischargeJuly")
						public String countNICUDischargeJuly() {
							return admission.countNICUDischargeJuly();
						}
						
						
						@GetMapping("countNICUDischargeAugust")
						public String countNICUDischargeAugust() {
							return admission.countNICUDischargeAugust();
						}
						
						
						@GetMapping("countNICUDischargeSeptember")
						public String countNICUDischargeSeptember() {
							return admission.countNICUDischargeSeptember();
						}
						
						
						@GetMapping("countNICUDischargeOctober")
						public String countNICUDischargeOctober() {
							return admission.countNICUDischargeOctober();
						}
						
						
						@GetMapping("countNICUDischargeNovember")
						public String countNICUDischargeNovember() {
							return admission.countNICUDischargeNovember();
						}
						
						
						@GetMapping("countNICUDischargeDecember")
						public String countNICUDischargeDecember() {
							return admission.countNICUDischargeDecember();
						}
						
						
						
					/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

						
						@GetMapping("countNICUDeathJanuary")
						public String countNICUDeathJanuary() {
							return admission.countNICUDeathJanuary();
						}
						
						
						
						@GetMapping("countNICUDeathFebruary")
						public String countNICUDeathFebruary() {
							return admission.countNICUDeathFebruary();
						}
						
						
						@GetMapping("countNICUDeathMarch")
						public String countNICUDeathMarch() {
							return admission.countNICUDeathMarch();
						}
						
						
						@GetMapping("countNICUDeathApril")
						public String countNICUDeathApril() {
							return admission.countNICUDeathApril();
						}
						
						
						@GetMapping("countNICUDeathMay")
						public String countNICUDeathMay() {
							return admission.countNICUDeathMay();
						}
						
						
						@GetMapping("countNICUDeathJune")
						public String countNICUDeathJune() {
							return admission.countNICUDeathJune();
						}
						
						
						@GetMapping("countNICUDeathJuly")
						public String countNICUDeathJuly() {
							return admission.countNICUDeathJuly();
						}
						
						
						@GetMapping("countNICUDeathAugust")
						public String countNICUDeathAugust() {
							return admission.countNICUDeathAugust();
						}
						
						
						@GetMapping("countNICUDeathSeptember")
						public String countNICUDeathSeptember() {
							return admission.countNICUDeathSeptember();
						}
						
						
						@GetMapping("countNICUDeathOctober")
						public String countNICUDeathOctober() {
							return admission.countNICUDeathOctober();
						}
						
						
						@GetMapping("countNICUDeathNovember")
						public String countNICUDeathNovember() {
							return admission.countNICUDeathNovember();
						}
						
						
						@GetMapping("countNICUDeathDecember")
						public String countNICUDeathDecember() {
							return admission.countNICUDeathDecember();
						}
						
						
						
						/* counting admission and discharge to date */
						
						 @GetMapping("countNICUAdmissionToDate") 
						  public String
						  countNICUAdmissionToDate() { 
							  return admission.countNICUAdmissionToDate();
						  
						  }
						  
						  
						  @GetMapping("countNICUDischarge") public String
						  countNICUDischarge() { return admission.countNICUDischarge();
						  
						  }
						  
						  @GetMapping("countNICUDeath")
						  public String  countNICUDeath() {
							  return admission.countNICUDeath();
							
						}
						
						
					/* counting admission and discharge for today */
						  
						  @GetMapping("countNICUTodayAdmission") 
						  public String	 countNICUTodayAdmission() { 
							  return admission.countNICUTodayAdmission();
						  
						  }
						  
						  
						  @GetMapping("countNICUTodayDischarge") 
						  public String countNICUTodayDischarge() { 
							  return admission.countNICUTodayDischarge();
						  
						  }
						  
						  @GetMapping("countNICUTodayDeath")
						  public String  countNICUTodayDeath() {
							  return admission.countNICUTodayDeath();
							
						}
						  
						  
						  
						  
						  
						  
						  
						  
						/* counting admission and discharge for yesterday */
						 
						  @GetMapping("countNICUYesterdayAdmission") 
						  public String
						  countNICUYesterdayAdmission() { 
							  return admission.countNICUYesterdayAdmission();
						  
						  }
						  
						  
						  @GetMapping("countNICUYesterdayDischarge") public String
						  countNICUYesterdayDischarge() { return admission.countNICUYesterdayDischarge();
						  
						  }
						  
						  @GetMapping("countNICUYesterdayDeath")
						  public String  countNICUYesterdayDeath() {
							  return admission.countNICUYesterdayDeath();
							
						}
						
						/* couuting ends */
						  
						  
						  
						  
						  
						/* counting for religious Ward */
						  
						  
						  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

							
							
							@GetMapping("countReligiousWardAdmissionJanuary")
							public String countReligiousWardAdmissionJanuary() {
								return admission.countReligiousWardAdmissionJanuary();
							}
							
							
							
							@GetMapping("countReligiousWardAdmissionFebruary")
							public String countReligiousWardAdmissionFebruary() {
								return admission.countReligiousWardAdmissionFebruary();
							}
							
							
							@GetMapping("countReligiousWardAdmissionMarch")
							public String countReligiousWardAdmissionMarch() {
								return admission.countReligiousWardAdmissionMarch();
							}
							
							
							@GetMapping("countReligiousWardAdmissionApril")
							public String countReligiousWardAdmissionApril() {
								return admission.countReligiousWardAdmissionApril();
							}
							
							
							@GetMapping("countReligiousWardAdmissionMay")
							public String countReligiousWardAdmissionMay() {
								return admission.countReligiousWardAdmissionMay();
							}
							
							
							@GetMapping("countReligiousWardAdmissionJune")
							public String countReligiousWardAdmissionJune() {
								return admission.countReligiousWardAdmissionJune();
							}
							
							
							@GetMapping("countReligiousWardAdmissionJuly")
							public String countReligiousWardAdmissionJuly() {
								return admission.countReligiousWardAdmissionJuly();
							}
							
							
							@GetMapping("countReligiousWardAdmissionAugust")
							public String countReligiousWardAdmissionAugust() {
								return admission.countReligiousWardAdmissionAugust();
							}
							
							
							@GetMapping("countReligiousWardAdmissionSeptember")
							public String countReligiousWardAdmissionSeptember() {
								return admission.countReligiousWardAdmissionSeptember();
							}
							
							
							@GetMapping("countReligiousWardAdmissionOctober")
							public String countReligiousWardAdmissionOctober() {
								return admission.countReligiousWardAdmissionOctober();
							}
							
							
							@GetMapping("countReligiousWardAdmissionNovember")
							public String countReligiousWardAdmissionNovember() {
								return admission.countReligiousWardAdmissionNovember();
							}
							
							
							@GetMapping("countReligiousWardAdmissionDecember")
							public String countReligiousWardAdmissionDecember() {
								return admission.countReligiousWardAdmissionDecember();
							}
							
							
							
							
							
						/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

							
							@GetMapping("countReligiousWardDischargeJanuary")
							public String countReligiousWardDischargeJanuary() {
								return admission.countReligiousWardDischargeJanuary();
							}
							
							
							
							@GetMapping("countReligiousWardDischargeFebruary")
							public String countReligiousWardDischargeFebruary() {
								return admission.countReligiousWardDischargeFebruary();
							}
							
							
							@GetMapping("countReligiousWardDischargeMarch")
							public String countReligiousWardDischargeMarch() {
								return admission.countReligiousWardDischargeMarch();
							}
							
							
							@GetMapping("countReligiousWardDischargeApril")
							public String countReligiousWardDischargeApril() {
								return admission.countReligiousWardDischargeApril();
							}
							
							
							@GetMapping("countReligiousWardDischargeMay")
							public String countReligiousWardDischargeMay() {
								return admission.countReligiousWardDischargeMay();
							}
							
							
							@GetMapping("countReligiousWardDischargeJune")
							public String countReligiousWardDischargeJune() {
								return admission.countReligiousWardDischargeJune();
							}
							
							
							@GetMapping("countReligiousWardDischargeJuly")
							public String countReligiousWardDischargeJuly() {
								return admission.countReligiousWardDischargeJuly();
							}
							
							
							@GetMapping("countReligiousWardDischargeAugust")
							public String countReligiousWardDischargeAugust() {
								return admission.countReligiousWardDischargeAugust();
							}
							
							
							@GetMapping("countReligiousWardDischargeSeptember")
							public String countReligiousWardDischargeSeptember() {
								return admission.countReligiousWardDischargeSeptember();
							}
							
							
							@GetMapping("countReligiousWardDischargeOctober")
							public String countReligiousWardDischargeOctober() {
								return admission.countReligiousWardDischargeOctober();
							}
							
							
							@GetMapping("countReligiousWardDischargeNovember")
							public String countReligiousWardDischargeNovember() {
								return admission.countReligiousWardDischargeNovember();
							}
							
							
							@GetMapping("countReligiousWardDischargeDecember")
							public String countReligiousWardDischargeDecember() {
								return admission.countReligiousWardDischargeDecember();
							}
							
							
							
						/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

							
							@GetMapping("countReligiousWardDeathJanuary")
							public String countReligiousWardDeathJanuary() {
								return admission.countReligiousWardDeathJanuary();
							}
							
							
							
							@GetMapping("countReligiousWardDeathFebruary")
							public String countReligiousWardDeathFebruary() {
								return admission.countReligiousWardDeathFebruary();
							}
							
							
							@GetMapping("countReligiousWardDeathMarch")
							public String countReligiousWardDeathMarch() {
								return admission.countReligiousWardDeathMarch();
							}
							
							
							@GetMapping("countReligiousWardDeathApril")
							public String countReligiousWardDeathApril() {
								return admission.countReligiousWardDeathApril();
							}
							
							
							@GetMapping("countReligiousWardDeathMay")
							public String countReligiousWardDeathMay() {
								return admission.countReligiousWardDeathMay();
							}
							
							
							@GetMapping("countReligiousWardDeathJune")
							public String countReligiousWardDeathJune() {
								return admission.countReligiousWardDeathJune();
							}
							
							
							@GetMapping("countReligiousWardDeathJuly")
							public String countReligiousWardDeathJuly() {
								return admission.countReligiousWardDeathJuly();
							}
							
							
							@GetMapping("countReligiousWardDeathAugust")
							public String countReligiousWardDeathAugust() {
								return admission.countReligiousWardDeathAugust();
							}
							
							
							@GetMapping("countReligiousWardDeathSeptember")
							public String countReligiousWardDeathSeptember() {
								return admission.countReligiousWardDeathSeptember();
							}
							
							
							@GetMapping("countReligiousWardDeathOctober")
							public String countReligiousWardDeathOctober() {
								return admission.countReligiousWardDeathOctober();
							}
							
							
							@GetMapping("countReligiousWardDeathNovember")
							public String countReligiousWardDeathNovember() {
								return admission.countReligiousWardDeathNovember();
							}
							
							
							@GetMapping("countReligiousWardDeathDecember")
							public String countReligiousWardDeathDecember() {
								return admission.countReligiousWardDeathDecember();
							}
							
							
							
							/* counting admission and discharge to date */
							
							 @GetMapping("countReligiousWardAdmissionToDate") 
							  public String
							  countReligiousWardAdmissionToDate() { 
								  return admission.countReligiousWardAdmissionToDate();
							  
							  }
							  
							  
							  @GetMapping("countReligiousWardDischarge") public String
							  countReligiousWardDischarge() { return admission.countReligiousWardDischarge();
							  
							  }
							  
							  @GetMapping("countReligiousWardDeath")
							  public String  countReligiousWardDeath() {
								  return admission.countReligiousWardDeath();
								
							}
							
							
						/* counting admission and discharge for today */
							  
							  @GetMapping("countReligiousWardTodayAdmission") 
							  public String	 countReligiousWardTodayAdmission() { 
								  return admission.countReligiousWardTodayAdmission();
							  
							  }
							  
							  
							  @GetMapping("countReligiousWardTodayDischarge") 
							  public String countReligiousWardTodayDischarge() { 
								  return admission.countReligiousWardTodayDischarge();
							  
							  }
							  
							  @GetMapping("countReligiousWardTodayDeath")
							  public String  countReligiousWardTodayDeath() {
								  return admission.countReligiousWardTodayDeath();
								
							}
							  
							  
							  
							  
							  
							  
							  
							  
							/* counting admission and discharge for yesterday */
							 
							  @GetMapping("countReligiousWardYesterdayAdmission") 
							  public String
							  countReligiousWardYesterdayAdmission() { 
								  return admission.countReligiousWardYesterdayAdmission();
							  
							  }
							  
							  
							  @GetMapping("countReligiousWardYesterdayDischarge") public String
							  countReligiousWardYesterdayDischarge() { return admission.countReligiousWardYesterdayDischarge();
							  
							  }
							  
							  
							  
		@GetMapping("countReligiousWardYesterdayDeath")
		public String  countReligiousWardYesterdayDeath() {
			return admission.countReligiousWardYesterdayDeath();
								
		}
		
		
		
		
		
							
		/* couuting ends */
		
		
		
		
		
		/* counting for general ward */
		
		
		/*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		
		@GetMapping("countGeneralWardAdmissionJanuary")
		public String countGeneralWardAdmissionJanuary() {
			return admission.countGeneralWardAdmissionJanuary();
		}
		
		
		
		@GetMapping("countGeneralWardAdmissionFebruary")
		public String countGeneralWardAdmissionFebruary() {
			return admission.countGeneralWardAdmissionFebruary();
		}
		
		
		@GetMapping("countGeneralWardAdmissionMarch")
		public String countGeneralWardAdmissionMarch() {
			return admission.countGeneralWardAdmissionMarch();
		}
		
		
		@GetMapping("countGeneralWardAdmissionApril")
		public String countGeneralWardAdmissionApril() {
			return admission.countGeneralWardAdmissionApril();
		}
		
		
		@GetMapping("countGeneralWardAdmissionMay")
		public String countGeneralWardAdmissionMay() {
			return admission.countGeneralWardAdmissionMay();
		}
		
		
		@GetMapping("countGeneralWardAdmissionJune")
		public String countGeneralWardAdmissionJune() {
			return admission.countGeneralWardAdmissionJune();
		}
		
		
		@GetMapping("countGeneralWardAdmissionJuly")
		public String countGeneralWardAdmissionJuly() {
			return admission.countGeneralWardAdmissionJuly();
		}
		
		
		@GetMapping("countGeneralWardAdmissionAugust")
		public String countGeneralWardAdmissionAugust() {
			return admission.countGeneralWardAdmissionAugust();
		}
		
		
		@GetMapping("countGeneralWardAdmissionSeptember")
		public String countGeneralWardAdmissionSeptember() {
			return admission.countGeneralWardAdmissionSeptember();
		}
		
		
		@GetMapping("countGeneralWardAdmissionOctober")
		public String countGeneralWardAdmissionOctober() {
			return admission.countGeneralWardAdmissionOctober();
		}
		
		
		@GetMapping("countGeneralWardAdmissionNovember")
		public String countGeneralWardAdmissionNovember() {
			return admission.countGeneralWardAdmissionNovember();
		}
		
		
		@GetMapping("countGeneralWardAdmissionDecember")
		public String countGeneralWardAdmissionDecember() {
			return admission.countGeneralWardAdmissionDecember();
		}
		
		
		
		
		
	/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		@GetMapping("countGeneralWardDischargeJanuary")
		public String countGeneralWardDischargeJanuary() {
			return admission.countGeneralWardDischargeJanuary();
		}
		
		
		
		@GetMapping("countGeneralWardDischargeFebruary")
		public String countGeneralWardDischargeFebruary() {
			return admission.countGeneralWardDischargeFebruary();
		}
		
		
		@GetMapping("countGeneralWardDischargeMarch")
		public String countGeneralWardDischargeMarch() {
			return admission.countGeneralWardDischargeMarch();
		}
		
		
		@GetMapping("countGeneralWardDischargeApril")
		public String countGeneralWardDischargeApril() {
			return admission.countGeneralWardDischargeApril();
		}
		
		
		@GetMapping("countGeneralWardDischargeMay")
		public String countGeneralWardDischargeMay() {
			return admission.countGeneralWardDischargeMay();
		}
		
		
		@GetMapping("countGeneralWardDischargeJune")
		public String countGeneralWardDischargeJune() {
			return admission.countGeneralWardDischargeJune();
		}
		
		
		@GetMapping("countGeneralWardDischargeJuly")
		public String countGeneralWardDischargeJuly() {
			return admission.countGeneralWardDischargeJuly();
		}
		
		
		@GetMapping("countGeneralWardDischargeAugust")
		public String countGeneralWardDischargeAugust() {
			return admission.countGeneralWardDischargeAugust();
		}
		
		
		@GetMapping("countGeneralWardDischargeSeptember")
		public String countGeneralWardDischargeSeptember() {
			return admission.countGeneralWardDischargeSeptember();
		}
		
		
		@GetMapping("countGeneralWardDischargeOctober")
		public String countGeneralWardDischargeOctober() {
			return admission.countGeneralWardDischargeOctober();
		}
		
		
		@GetMapping("countGeneralWardDischargeNovember")
		public String countGeneralWardDischargeNovember() {
			return admission.countGeneralWardDischargeNovember();
		}
		
		
		@GetMapping("countGeneralWardDischargeDecember")
		public String countGeneralWardDischargeDecember() {
			return admission.countGeneralWardDischargeDecember();
		}
		
		
		
	/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

		
		@GetMapping("countGeneralWardDeathJanuary")
		public String countGeneralWardDeathJanuary() {
			return admission.countGeneralWardDeathJanuary();
		}
		
		
		
		@GetMapping("countGeneralWardDeathFebruary")
		public String countGeneralWardDeathFebruary() {
			return admission.countGeneralWardDeathFebruary();
		}
		
		
		@GetMapping("countGeneralWardDeathMarch")
		public String countGeneralWardDeathMarch() {
			return admission.countGeneralWardDeathMarch();
		}
		
		
		@GetMapping("countGeneralWardDeathApril")
		public String countGeneralWardDeathApril() {
			return admission.countGeneralWardDeathApril();
		}
		
		
		@GetMapping("countGeneralWardDeathMay")
		public String countGeneralWardDeathMay() {
			return admission.countGeneralWardDeathMay();
		}
		
		
		@GetMapping("countGeneralWardDeathJune")
		public String countGeneralWardDeathJune() {
			return admission.countGeneralWardDeathJune();
		}
		
		
		@GetMapping("countGeneralWardDeathJuly")
		public String countGeneralWardDeathJuly() {
			return admission.countGeneralWardDeathJuly();
		}
		
		
		@GetMapping("countGeneralWardDeathAugust")
		public String countGeneralWardDeathAugust() {
			return admission.countGeneralWardDeathAugust();
		}
		
		
		@GetMapping("countGeneralWardDeathSeptember")
		public String countGeneralWardDeathSeptember() {
			return admission.countGeneralWardDeathSeptember();
		}
		
		
		@GetMapping("countGeneralWardDeathOctober")
		public String countGeneralWardDeathOctober() {
			return admission.countGeneralWardDeathOctober();
		}
		
		
		@GetMapping("countGeneralWardDeathNovember")
		public String countGeneralWardDeathNovember() {
			return admission.countGeneralWardDeathNovember();
		}
		
		
		@GetMapping("countGeneralWardDeathDecember")
		public String countGeneralWardDeathDecember() {
			return admission.countGeneralWardDeathDecember();
		}
		
		
		
		/* counting admission and discharge to date */
		
		 @GetMapping("countGeneralWardAdmissionToDate") 
		  public String  countGeneralWardAdmissionToDate() { 
			  return admission.countGeneralWardAdmissionToDate();
		  
		  }
		  
		  
		  @GetMapping("countGeneralWardDischarge") 
		  public String	  countGeneralWardDischarge() { 
			  return admission.countGeneralWardDischarge();
		  
		  }
		  
		  @GetMapping("countGeneralWardDeath")
		  public String  countDGeneralWardeath() {
			  return admission.countGeneralWardDeath();
			
		}
		
		
	/* counting admission and discharge for today */
		  
		  @GetMapping("countGeneralWardTodayAdmission") 
		  public String	 countGeneralWardTodayAdmission() { 
			  return admission.countGeneralWardTodayAdmission();
		  
		  }
		  
		  
		  @GetMapping("countGeneralWardTodayDischarge") 
		  public String countGeneralWardTodayDischarge() { 
			  return admission.countGeneralWardTodayDischarge();
		  
		  }
		  
		  @GetMapping("countGeneralWardTodayDeath")
		  public String  countGeneralWardTodayDeath() {
			  return admission.countGeneralWardTodayDeath();
			
		}
		  
		  
		  
		  
		  
		  
		  
		  
		/* counting admission and discharge for yesterday */
		 
		  @GetMapping("countGeneralWardYesterdayAdmission") 
		  public String
		  countGeneralWardYesterdayAdmission() { 
			  return admission.countGeneralWardYesterdayAdmission();
		  
		  }
		  
		  
		  @GetMapping("countGeneralWardYesterdayDischarge") public String
		  countGeneralWardYesterdayDischarge() { return admission.countGeneralWardYesterdayDischarge();
		  
		  }
		  
		  @GetMapping("countGeneralWardYesterdayDeath")
		  public String  countGeneralWardYesterdayDeath() {
			  return admission.countGeneralWardYesterdayDeath();
			
		}
		
/* couuting ends */
		  
		  

/* counting Accident and Emergency ward */
		  
		  
		  
		  
		  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			
			@GetMapping("countAccidentEmergencyAdmissionJanuary")
			public String countAccidentEmergencyAdmissionJanuary() {
				return admission.countAccidentEmergencyAdmissionJanuary();
			}
			
			
			
			@GetMapping("countAccidentEmergencyAdmissionFebruary")
			public String countAccidentEmergencyAdmissionFebruary() {
				return admission.countAccidentEmergencyAdmissionFebruary();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionMarch")
			public String countAccidentEmergencyAdmissionMarch() {
				return admission.countAccidentEmergencyAdmissionMarch();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionApril")
			public String countAccidentEmergencyAdmissionApril() {
				return admission.countAccidentEmergencyAdmissionApril();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionMay")
			public String countAccidentEmergencyAdmissionMay() {
				return admission.countAccidentEmergencyAdmissionMay();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionJune")
			public String countAccidentEmergencyAdmissionJune() {
				return admission.countAccidentEmergencyAdmissionJune();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionJuly")
			public String countAccidentEmergencyAdmissionJuly() {
				return admission.countAccidentEmergencyAdmissionJuly();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionAugust")
			public String countAccidentEmergencyAdmissionAugust() {
				return admission.countAccidentEmergencyAdmissionAugust();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionSeptember")
			public String countAccidentEmergencyAdmissionSeptember() {
				return admission.countAccidentEmergencyAdmissionSeptember();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionOctober")
			public String countAccidentEmergencyAdmissionOctober() {
				return admission.countAccidentEmergencyAdmissionOctober();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionNovember")
			public String countAccidentEmergencyAdmissionNovember() {
				return admission.countAccidentEmergencyAdmissionNovember();
			}
			
			
			@GetMapping("countAccidentEmergencyAdmissionDecember")
			public String countAccidentEmergencyAdmissionDecember() {
				return admission.countAccidentEmergencyAdmissionDecember();
			}
			
			
			
			
			
		/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			@GetMapping("countAccidentEmergencyDischargeJanuary")
			public String countAccidentEmergencyDischargeJanuary() {
				return admission.countAccidentEmergencyDischargeJanuary();
			}
			
			
			
			@GetMapping("countAccidentEmergencyDischargeFebruary")
			public String countAccidentEmergencyDischargeFebruary() {
				return admission.countAccidentEmergencyDischargeFebruary();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeMarch")
			public String countAccidentEmergencyDischargeMarch() {
				return admission.countAccidentEmergencyDischargeMarch();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeApril")
			public String countAccidentEmergencyDischargeApril() {
				return admission.countAccidentEmergencyDischargeApril();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeMay")
			public String countAccidentEmergencyDischargeMay() {
				return admission.countAccidentEmergencyDischargeMay();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeJune")
			public String countAccidentEmergencyDischargeJune() {
				return admission.countAccidentEmergencyDischargeJune();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeJuly")
			public String countAccidentEmergencyDischargeJuly() {
				return admission.countAccidentEmergencyDischargeJuly();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeAugust")
			public String countAccidentEmergencyDischargeAugust() {
				return admission.countAccidentEmergencyDischargeAugust();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeSeptember")
			public String countAccidentEmergencyDischargeSeptember() {
				return admission.countAccidentEmergencyDischargeSeptember();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeOctober")
			public String countAccidentEmergencyDischargeOctober() {
				return admission.countAccidentEmergencyDischargeOctober();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeNovember")
			public String countAccidentEmergencyDischargeNovember() {
				return admission.countAccidentEmergencyDischargeNovember();
			}
			
			
			@GetMapping("countAccidentEmergencyDischargeDecember")
			public String countAccidentEmergencyDischargeDecember() {
				return admission.countAccidentEmergencyDischargeDecember();
			}
			
			
			
		/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

			
			@GetMapping("countAccidentEmergencyDeathJanuary")
			public String countAccidentEmergencyDeathJanuary() {
				return admission.countAccidentEmergencyDeathJanuary();
			}
			
			
			
			@GetMapping("countAccidentEmergencyDeathFebruary")
			public String countAccidentEmergencyDeathFebruary() {
				return admission.countAccidentEmergencyDeathFebruary();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathMarch")
			public String countAccidentEmergencyDeathMarch() {
				return admission.countAccidentEmergencyDeathMarch();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathApril")
			public String countAccidentEmergencyDeathApril() {
				return admission.countAccidentEmergencyDeathApril();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathMay")
			public String countAccidentEmergencyDeathMay() {
				return admission.countAccidentEmergencyDeathMay();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathJune")
			public String countAccidentEmergencyDeathJune() {
				return admission.countAccidentEmergencyDeathJune();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathJuly")
			public String countAccidentEmergencyDeathJuly() {
				return admission.countAccidentEmergencyDeathJuly();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathAugust")
			public String countAccidentEmergencyDeathAugust() {
				return admission.countAccidentEmergencyDeathAugust();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathSeptember")
			public String countAccidentEmergencyDeathSeptember() {
				return admission.countAccidentEmergencyDeathSeptember();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathOctober")
			public String countAccidentEmergencyDeathOctober() {
				return admission.countAccidentEmergencyDeathOctober();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathNovember")
			public String countAccidentEmergencyDeathNovember() {
				return admission.countAccidentEmergencyDeathNovember();
			}
			
			
			@GetMapping("countAccidentEmergencyDeathDecember")
			public String countAccidentEmergencyDeathDecember() {
				return admission.countAccidentEmergencyDeathDecember();
			}
			
			
			
			/* counting admission and discharge to date */
			
			 @GetMapping("countAccidentEmergencyAdmissionToDate") 
			  public String	  countAccidentEmergencyAdmissionToDate() { 
				  return admission.countAccidentEmergencyAdmissionToDate();
			  
			  }
			  
			  
			  @GetMapping("countAccidentEmergencyDischarge") 
			  public String	  countAccidentEmergencyDischarge() { 
				  return admission.countAccidentEmergencyDischarge();
			  
			  }
			  
			  @GetMapping("countAccidentEmergencyDeath")
			  public String  countAccidentEmergencyDeath() {
				  return admission.countAccidentEmergencyDeath();
				
			}
			
			
		/* counting admission and discharge for today */
			  
			  @GetMapping("countAccidentEmergencyTodayAdmission") 
			  public String	 countAccidentEmergencyTodayAdmission() { 
				  return admission.countTodayAdmission();
			  
			  }
			  
			  
			  @GetMapping("countAccidentEmergencyTodayDischarge") 
			  public String countAccidentEmergencyTodayDischarge() { 
				  return admission.countAccidentEmergencyTodayDischarge();
			  
			  }
			  
			  @GetMapping("countAccidentEmergencyTodayDeath")
			  public String  countAccidentEmergencyTodayDeath() {
				  return admission.countAccidentEmergencyTodayDeath();
				
			}
			  
			  
			  
			  
			  
			  
			  
			  
			/* counting admission and discharge for yesterday */
			 
			  @GetMapping("countAccidentEmergencyYesterdayAdmission") 
			  public String	  countAccidentEmergencyYesterdayAdmission() { 
				  return admission.countAccidentEmergencyYesterdayAdmission();
			  
			  }
			  
			  
			  @GetMapping("countAccidentEmergencyYesterdayDischarge") 
			  public String  countAccidentEmergencyYesterdayDischarge() { 
				  return admission.countAccidentEmergencyYesterdayDischarge();
			  
			  }
			  
			  @GetMapping("countAccidentEmergencyYesterdayDeath")
			  public String  countAccidentEmergencyYesterdayDeath() {
				  return admission.countAccidentEmergencyYesterdayDeath();
				
			}
			
			/* couuting ends */
		
		
/* counting opd admission and dishcarge */	

			  /*>>>>>>>>>>>>>>>======Counting admission fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				
				@GetMapping("countOpdAdmissionJanuary")
				public String countOpdAdmissionJanuary() {
					return admission.countOpdAdmissionJanuary();
				}
				
				
				
				@GetMapping("countOpdAdmissionFebruary")
				public String countOpdAdmissionFebruary() {
					return admission.countOpdAdmissionFebruary();
				}
				
				
				@GetMapping("countOpdAdmissionMarch")
				public String countOpdAdmissionMarch() {
					return admission.countOpdAdmissionMarch();
				}
				
				
				@GetMapping("countOpdAdmissionApril")
				public String countOpdAdmissionApril() {
					return admission.countOpdAdmissionApril();
				}
				
				
				@GetMapping("countOpdAdmissionMay")
				public String countOpdAdmissionMay() {
					return admission.countOpdAdmissionMay();
				}
				
				
				@GetMapping("countOpdAdmissionJune")
				public String countOpdAdmissionJune() {
					return admission.countOpdAdmissionJune();
				}
				
				
				@GetMapping("countOpdAdmissionJuly")
				public String countOpdAdmissionJuly() {
					return admission.countOpdAdmissionJuly();
				}
				
				
				@GetMapping("countOpdAdmissionAugust")
				public String countOpdAdmissionAugust() {
					return admission.countOpdAdmissionAugust();
				}
				
				
				@GetMapping("countOpdAdmissionSeptember")
				public String countOpdAdmissionSeptember() {
					return admission.countOpdAdmissionSeptember();
				}
				
				
				@GetMapping("countOpdAdmissionOctober")
				public String countOpdAdmissionOctober() {
					return admission.countOpdAdmissionOctober();
				}
				
				
				@GetMapping("countOpdAdmissionNovember")
				public String countOpdAdmissionNovember() {
					return admission.countOpdAdmissionNovember();
				}
				
				
				@GetMapping("countOpdAdmissionDecember")
				public String countOpdAdmissionDecember() {
					return admission.countOpdAdmissionDecember();
				}
				
				
				
				
				
			/*>>>>>>>>>>>>>>>======Counting Discharge fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				@GetMapping("countOpdDischargeJanuary")
				public String countOpdDischargeJanuary() {
					return admission.countOpdDischargeJanuary();
				}
				
				
				
				@GetMapping("countOpdDischargeFebruary")
				public String countOpdDischargeFebruary() {
					return admission.countOpdDischargeFebruary();
				}
				
				
				@GetMapping("countOpdDischargeMarch")
				public String countOpdDischargeMarch() {
					return admission.countOpdDischargeMarch();
				}
				
				
				@GetMapping("countOpdDischargeApril")
				public String countOpdDischargeApril() {
					return admission.countOpdDischargeApril();
				}
				
				
				@GetMapping("countOpdDischargeMay")
				public String countOpdDischargeMay() {
					return admission.countOpdDischargeMay();
				}
				
				
				@GetMapping("countOpdDischargeJune")
				public String countOpdDischargeJune() {
					return admission.countOpdDischargeJune();
				}
				
				
				@GetMapping("countOpdDischargeJuly")
				public String countOpdDischargeJuly() {
					return admission.countOpdDischargeJuly();
				}
				
				
				@GetMapping("countOpdDischargeAugust")
				public String countOpdDischargeAugust() {
					return admission.countOpdDischargeAugust();
				}
				
				
				@GetMapping("countOpdDischargeSeptember")
				public String countOpdDischargeSeptember() {
					return admission.countOpdDischargeSeptember();
				}
				
				
				@GetMapping("countOpdDischargeOctober")
				public String countOpdDischargeOctober() {
					return admission.countOpdDischargeOctober();
				}
				
				
				@GetMapping("countOpdDischargeNovember")
				public String countOpdDischargeNovember() {
					return admission.countOpdDischargeNovember();
				}
				
				
				@GetMapping("countOpdDischargeDecember")
				public String countOpdDischargeDecember() {
					return admission.countOpdDischargeDecember();
				}
				
				
				
			/*>>>>>>>>>>>>>>>======Counting Death fom january to december=====<<<<<<<<<<<<<<<<<*/

				
				@GetMapping("countOpdDeathJanuary")
				public String countOpdDeathJanuary() {
					return admission.countOpdDeathJanuary();
				}
				
				
				
				@GetMapping("countOpdDeathFebruary")
				public String countOpdDeathFebruary() {
					return admission.countOpdDeathFebruary();
				}
				
				
				@GetMapping("countOpdDeathMarch")
				public String countOpdDeathMarch() {
					return admission.countOpdDeathMarch();
				}
				
				
				@GetMapping("countOpdDeathApril")
				public String countOpdDeathApril() {
					return admission.countOpdDeathApril();
				}
				
				
				@GetMapping("countOpdDeathMay")
				public String countOpdDeathMay() {
					return admission.countOpdDeathMay();
				}
				
				
				@GetMapping("countOpdDeathJune")
				public String countOpdDeathJune() {
					return admission.countOpdDeathJune();
				}
				
				
				@GetMapping("countOpdDeathJuly")
				public String countOpdDeathJuly() {
					return admission.countOpdDeathJuly();
				}
				
				
				@GetMapping("countOpdDeathAugust")
				public String countOpdDeathAugust() {
					return admission.countOpdDeathAugust();
				}
				
				
				@GetMapping("countOpdDeathSeptember")
				public String countOpdDeathSeptember() {
					return admission.countOpdDeathSeptember();
				}
				
				
				@GetMapping("countOpdDeathOctober")
				public String countOpdDeathOctober() {
					return admission.countOpdDeathOctober();
				}
				
				
				@GetMapping("countOpdDeathNovember")
				public String countOpdDeathNovember() {
					return admission.countOpdDeathNovember();
				}
				
				
				@GetMapping("countOpdDeathDecember")
				public String countOpdDeathDecember() {
					return admission.countOpdDeathDecember();
				}
				
				
				
				/* counting admission and discharge to date */
				
				 @GetMapping("countOpdAdmissionToDate") 
				  public String	  countOpdAdmissionToDate() { 
					  return admission.countOpdAdmissionToDate();
				  
				  }
				  
				  
				  @GetMapping("countOpdDischarge") 
				  public String  countOpdDischarge() {
					  return admission.countOpdDischarge();
				  
				  }
				  
				  @GetMapping("countOpdDeath")
				  public String  countOpdDeath() {
					  return admission.countOpdDeath();
					
				}
				
				
			/* counting admission and discharge for today */
				  
				  @GetMapping("countOpdTodayAdmission") 
				  public String	 countOpdTodayAdmission() { 
					  return admission.countOpdTodayAdmission();
				  
				  }
				  
				  
				  @GetMapping("countOpdTodayDischarge") 
				  public String countOpdTodayDischarge() { 
					  return admission.countOpdTodayDischarge();
				  
				  }
				  
				  @GetMapping("countOpdTodayDeath")
				  public String  countOpdTodayDeath() {
					  return admission.countOpdTodayDeath();
					
				}
				  
				  
				  
				  
				  
				  
				  
				  
				/* counting admission and discharge for yesterday */
				 
				  @GetMapping("countOpdYesterdayAdmission") 
				  public String	  countOpdYesterdayAdmission() { 
					  return admission.countOpdYesterdayAdmission();
				  
				  }
				  
				  
				  @GetMapping("countOpdYesterdayDischarge") 
				  public String  countOpdYesterdayDischarge() {
					  return admission.countOpdYesterdayDischarge();
				  
				  }
				  
				  @GetMapping("countOpdYesterdayDeath")
				  public String  countOpdYesterdayDeath() {
					  return admission.countOpdYesterdayDeath();
					
				}
				
				/* couuting ends */	
	
		
}
