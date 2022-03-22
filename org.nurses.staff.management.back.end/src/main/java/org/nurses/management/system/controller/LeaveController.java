package org.nurses.management.system.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nurses.management.system.integration.Admission_DischargeRestClient;
import org.nurses.management.system.integration.Delivery_tableRestClient;
import org.nurses.management.system.integration.EventsRestClient;
import org.nurses.management.system.integration.LeaveRestClient;
import org.nurses.management.system.integration.Newborn_tableRestClient;
import org.nurses.management.system.integration.Nurses_staff_RestClient;
import org.nurses.management.system.integration.WardRestClient;
import org.nurses.management.system.integration.Ward_Bed_StateRestClient;
import org.nurses.management.system.integration.dto.Events;
import org.nurses.management.system.integration.dto.Leave;
import org.nurses.management.system.integration.dto.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@CrossOrigin(origins = "http://localhost:8084")
@RequestMapping("/leaveFront")
public class LeaveController {

	@Autowired
	LeaveRestClient leaveRest;
	
	@Autowired
	EventsRestClient eventsRest;
	
	@Autowired
	Delivery_tableRestClient deliveryRest;
	
	@Autowired
	Newborn_tableRestClient newbornRest;

	@Autowired
	Nurses_staff_RestClient nursesRest;

	@Autowired
	Admission_DischargeRestClient admissionRest;

	@Autowired
	WardRestClient wardRest;

	@Autowired
	Ward_Bed_StateRestClient bedRest;
	
	
	
	
	@RequestMapping(value = "/displayAllWard", method = RequestMethod.GET)
	public String displayLeave(Ward leaves, ModelMap model) {
		Ward[] wardD = wardRest.getAllWard(leaves);
		model.addAttribute("wardD", wardD);

		return "wardTable";

	}

	@ModelAttribute("bedOccupancy")
	public String bedOccupant() {
		return admissionRest.bedOccupant();
	}

	@ModelAttribute("bedCapacity")
	public String bedCapacity() {
		return wardRest.bedCapacity();
	}

	@ModelAttribute("countAdmissionToDate")
	public String countAdmissionToDate() {
		return admissionRest.countAdmissionToDate();

	}

	@ModelAttribute("countDischarge")
	public String countDischarge() {
		return admissionRest.countDischarge();

	}

	@ModelAttribute("countDeath")
	public String countDeath() {
		return admissionRest.countDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countTodayAdmission")
	public String countTodayAdmission() {
		return admissionRest.countTodayAdmission();

	}

	@ModelAttribute("countTodayDischarge")
	public String countTodayDischarge() {
		return admissionRest.countTodayDischarge();

	}

	@ModelAttribute("countTodayDeath")
	public String countTodayDeath() {
		return admissionRest.countTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countYesterdayAdmission")
	public String countYesterdayAdmission() {
		return admissionRest.countYesterdayAdmission();

	}

	@ModelAttribute("countYesterdayDischarge")
	public String countYesterdayDischarge() {
		return admissionRest.countYesterdayDischarge();

	}

	@ModelAttribute("countYesterdayDeath")
	public String countYesterdayDeath() {
		return admissionRest.countYesterdayDeath();

	}

	/* couuting ends */

	@ModelAttribute("countNurses")
	public String countNurses() {
		return nursesRest.countNurses();

	}

	@ModelAttribute("countMale")
	public String countMaleNurses() {
		return nursesRest.countMaleNurses();

	}

	@ModelAttribute("countFemale")
	public String countFemaleNurses() {
		return nursesRest.countFemaleNurses();

	}

	@RequestMapping("/leaveForm")
	public String leaveForm(ModelMap model) {

		return "leaveForm";

	}

	@RequestMapping("/profile")
	public String accountsDetails(ModelMap model) {

		return "profilesTry";

	}

	@RequestMapping("/nurseProfile")
	public String nurseProfile(ModelMap model) {

		return "staffProfile";

	}

	@RequestMapping("/accounts")
	public String accounts(ModelMap model) {

		return "addAccounts";

	}

	@RequestMapping("/updateLeave")
	public String updateLeave(@RequestParam("id") Integer id, ModelMap model) {

		Leave leave = leaveRest.find(id);
		model.addAttribute("leave", leave);
		return "redirect:/leaveFront/displayAllLeave";
	}

	@RequestMapping(value = "updateLeave1/{id}", method = RequestMethod.GET)
	public String searchLeave1(@PathVariable("id") Integer id, ModelMap model) {
		Leave leave = leaveRest.find(id);
		model.addAttribute("leave", leave);
		return "leaveUpdate";

	}

	@RequestMapping(value = "inchargeRecom", method = RequestMethod.GET)
	public String searchL(@RequestParam("id") Integer id, ModelMap model) {
		Leave leave = leaveRest.find(id);
		model.addAttribute("leave", leave);
		return "leaveUpdateIncharge";
	}

	@RequestMapping("update")
	public String update(Leave leave) {
		leaveRest.updateLeave(leave);
		return "redirect:/leaveFront/displayAllLeave";
	}

	@RequestMapping("updateIncharge")
	public String updateIncharge(Leave leave) {
		leaveRest.updateLeave(leave);
		return "redirect:/leaveFront/displayAllRecom";
	}

	@RequestMapping("/saveLeave")
	public String saveLeave(Leave leaves) {
		leaveRest.saveLeave(leaves);
		// System.out.println("product saved successfully");
		return "redirect:/leaveFront/displayAllLeave";

	}

	@RequestMapping("/deleteLeave/{id}")
	public String deleteStudents(@PathVariable("id") Integer id) {
		leaveRest.deleteLeave(id);

		return "redirect:/leaveFront/displayAllLeave";
	}

	@RequestMapping(value = "/displayAllLeave", method = RequestMethod.GET)
	public String displayLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.getAllLeave(leaves);
		model.addAttribute("leave", leave);

		return "leaveTable";

	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>
	 */

	/* ward leave recommendations methods */

	@RequestMapping(value = "/displayAllRecom", method = RequestMethod.GET)
	public String inchargeLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.getAllLeave(leaves);
		model.addAttribute("leave", leave);

		return "leaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllMaleMedicalRecom", method = RequestMethod.GET)
	public String inchargeMaleMedicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleMedical();
		model.addAttribute("leave", leave);

		return "maleMedicalleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllMaleSurgicalRecom", method = RequestMethod.GET)
	public String inchargeMaleSurgicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleSurgical();
		model.addAttribute("leave", leave);

		return "maleSurgicalleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllFemaleMedicalRecom", method = RequestMethod.GET)
	public String inchargeFemaleMedicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleMedical();
		model.addAttribute("leave", leave);

		return "femaleMedicalleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllFemaleSurgicalRecom", method = RequestMethod.GET)
	public String inchargeFemaleSurgicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleSurgical();
		model.addAttribute("leave", leave);

		return "femaleSurgicalleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllChildrensWardRecom", method = RequestMethod.GET)
	public String inchargeChildrensWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.childrenWard();
		model.addAttribute("leave", leave);

		return "childrensWardleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllMaternityRecom", method = RequestMethod.GET)
	public String inchargeMaternityLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maternity();
		model.addAttribute("leave", leave);

		return "maternityleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllGeneralWardRecom", method = RequestMethod.GET)
	public String inchargeGeneralWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.generalWard();
		model.addAttribute("leave", leave);

		return "generalWardleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllNicuRecom", method = RequestMethod.GET)
	public String inchargeNicuLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.nicu();
		model.addAttribute("leave", leave);

		return "niculeaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllReligiousWardRecom", method = RequestMethod.GET)
	public String inchargeReligiousWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.religious();
		model.addAttribute("leave", leave);

		return "religiousWardleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllAccidentEmergencyRecom", method = RequestMethod.GET)
	public String inchargeAccidentEmergencyLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.accident();
		model.addAttribute("leave", leave);

		return "accidentEmergencyleaveTableIncharge";

	}

	@RequestMapping(value = "/displayAllOpdRecom", method = RequestMethod.GET)
	public String inchargeOpdLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.opd();
		model.addAttribute("leave", leave);

		return "opdleaveTableIncharge";

	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>
	 */

	@RequestMapping(value = "searchLeave/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Leave leave = leaveRest.find(id);
		model.addAttribute("leave", leave);
		return "";
	}

	@RequestMapping(value = "schoolAccounts/accDetail/{id}", method = RequestMethod.GET)
	public String searchAccounts(@PathVariable("id") Integer id, @PathVariable("id") Integer ids, ModelMap model) {
		// Leave[] accounts = nurseRest.getAllLeave(id);
		// model.addAttribute("accounts", accounts);

		Leave leaveId = leaveRest.find(ids);
		model.addAttribute("leaveId", leaveId);
		return "";
	}

	@RequestMapping(value = "/staffLeaveCheck/{id}", method = RequestMethod.GET)
	public String retriveId(@PathVariable("id") Integer id, ModelMap model) {

		// Students[] students = studentsRestClient.getAllStudents(student);
		Leave ids = leaveRest.find(id);
		model.addAttribute("ids", ids);

		return null; // "search";
	}

	@RequestMapping(name = "update2/{Id}", method = RequestMethod.POST)
	public String searchh(@RequestParam("Id") Integer id, ModelMap model) {
		Leave leave = leaveRest.find(id);
		model.addAttribute("leave", leave);
		return "";
	}

	/*
	 * @RequestMapping(value="look", method=RequestMethod.GET) public String
	 * lookForId(String student_id, Model model) { String accounts =
	 * nurseRest.lookLastId(student_id); model.addAttribute("student", accounts);
	 * return "search"; }
	 * 
	 * @RequestMapping(value = "last", method = RequestMethod.GET) public String
	 * lastId(Students students, ModelMap model) { //Accounts accounts =
	 * nurseRest.findLastId(students); //model.addAttribute("accounts", accounts);
	 * return "search"; }
	 */

	/*
	 * <<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>
	 */

	/* leave approval tables */

	@RequestMapping(value = "/displayApproval", method = RequestMethod.GET)
	public String inchargeApproval(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.getAllLeave(leaves);
		model.addAttribute("leave", leave);

		return "leaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApproval", method = RequestMethod.GET)
	public String inchargeLeaveApproval(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.getAllLeave(leaves);
		model.addAttribute("leave", leave);

		return "leaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalMaleMedical", method = RequestMethod.GET)
	public String inchargeLeaveApprovalMaleMedical(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleMedical();
		model.addAttribute("leave", leave);

		return "maleMedicalleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalMaleSurgical", method = RequestMethod.GET)
	public String inchargeLeaveApprovalMaleSurgical(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleSurgical();
		model.addAttribute("leave", leave);

		return "maleSurgicalleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalFemaleMedical", method = RequestMethod.GET)
	public String inchargeLeaveApprovalFemaleMedical(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleMedical();
		model.addAttribute("leave", leave);

		return "femaleMedicalleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalFemaleSurgical", method = RequestMethod.GET)
	public String inchargeLeaveApprovalFemaleSurgical(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleSurgical();
		model.addAttribute("leave", leave);

		return "femaleSurgicalleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalMaternity", method = RequestMethod.GET)
	public String inchargeLeaveApprovalMaternity(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maternity();
		model.addAttribute("leave", leave);

		return "maternityleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalChildrensWard", method = RequestMethod.GET)
	public String inchargeLeaveApprovalChildrens(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.childrenWard();
		model.addAttribute("leave", leave);

		return "childrensWardleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalNicu", method = RequestMethod.GET)
	public String inchargeLeaveApprovalNicu(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.nicu();
		model.addAttribute("leave", leave);

		return "niculeaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalGeneralWard", method = RequestMethod.GET)
	public String inchargeLeaveApprovalGeneralWard(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.generalWard();
		model.addAttribute("leave", leave);

		return "generalWardleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalReligiousWard", method = RequestMethod.GET)
	public String inchargeLeaveApprovalReligous(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.religious();
		model.addAttribute("leave", leave);

		return "religiousWardleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalAccidentEmergency", method = RequestMethod.GET)
	public String inchargeLeaveApprovalAccidentEmergency(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.accident();
		model.addAttribute("leave", leave);

		return "accidentEmergencyleaveApprovalTable";

	}

	@RequestMapping(value = "/displayLeaveApprovalOpd", method = RequestMethod.GET)
	public String inchargeLeaveApprovalOpd(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.opd();
		model.addAttribute("leave", leave);

		return "opdleaveApprovalTable";

	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>
	 */

	/* ward leave specific display */

	@RequestMapping(value = "/displayAllMaleMedicalLeave", method = RequestMethod.GET)
	public String displayMaleMedicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleMedical();
		model.addAttribute("leave", leave);

		return "maleMedicalleaveTable";

	}

	@RequestMapping(value = "/displayAllfemaleMedicalLeave", method = RequestMethod.GET)
	public String displayfemaleMedicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleMedical();
		model.addAttribute("leave", leave);

		return "femaleMedicalleaveTable";

	}

	@RequestMapping(value = "/displayAllMaleSurgicalLeave", method = RequestMethod.GET)
	public String displayMaleSurgicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maleSurgical();
		model.addAttribute("leave", leave);

		return "maleSurgicalleaveTable";

	}

	@RequestMapping(value = "/displayAllfemaleSurgicalLeave", method = RequestMethod.GET)
	public String displayfemaleSurgicalLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.femaleSurgical();
		model.addAttribute("leave", leave);

		return "femaleSurgicalleaveTable";

	}

	@RequestMapping(value = "/displayAllChildrensWardLeave", method = RequestMethod.GET)
	public String displayChildrensWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.childrenWard();
		model.addAttribute("leave", leave);

		return "childrensWardleaveTable";

	}

	@RequestMapping(value = "/displayAllMaternityLeave", method = RequestMethod.GET)
	public String displayMaternityLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.maternity();
		model.addAttribute("leave", leave);

		return "maternityleaveTable";

	}

	@RequestMapping(value = "/displayAllGeneralWardLeave", method = RequestMethod.GET)
	public String displayGeneralWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.generalWard();
		model.addAttribute("leave", leave);

		return "generalWardleaveTable";

	}

	@RequestMapping(value = "/displayAllNicuLeave", method = RequestMethod.GET)
	public String displayNicuLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.nicu();
		model.addAttribute("leave", leave);

		return "niculeaveTable";

	}

	@RequestMapping(value = "/displayAllReligiousWardLeave", method = RequestMethod.GET)
	public String displayReligiousWardLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.religious();
		model.addAttribute("leave", leave);

		return "religiousWardleaveTable";

	}

	@RequestMapping(value = "/displayAllAccidentEmergencyLeave", method = RequestMethod.GET)
	public String displayAccidentEmergencyLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.accident();
		model.addAttribute("leave", leave);

		return "accidentEmergencyleaveTable";

	}

	@RequestMapping(value = "/displayAllOpdLeave", method = RequestMethod.GET)
	public String displayOpdLeave(Leave leaves, ModelMap model) {
		Leave[] leave = leaveRest.opd();
		model.addAttribute("leave", leave);

		return "opdleaveTable";

	}

	/*
	 * <<<<<<<<<<<<<<<<<<<<=========================================>>>>>>>>>>>>>>>>
	 * >>>>>>>>>>>>
	 */

	/* ward/bed state counting */

	@ModelAttribute("midnightRemain")
	public String countMidnightRemain() {
		return bedRest.countRemainAtMidnight();

	}

	@ModelAttribute("criticalPatient")
	public String countCriticalPatient() {
		return bedRest.countTotalCriticalIll();

	}

	@ModelAttribute("floorPatient")
	public String countFloorPatient() {
		return bedRest.countTotalFloorPatient();
	}

	@ModelAttribute("abscondedPatient")
	public String abscondedPatient() {
		return bedRest.countAbsconded();

	}

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countAdmissionJanuary")
	public String countAdmissionJanuary() {
		return admissionRest.countAdmissionJanuary();
	}

	@ModelAttribute("countAdmissionFebruary")
	public String countAdmissionFebruary() {
		return admissionRest.countAdmissionFebruary();
	}

	@ModelAttribute("countAdmissionMarch")
	public String countAdmissionMarch() {
		return admissionRest.countAdmissionMarch();
	}

	@ModelAttribute("countAdmissionApril")
	public String countAdmissionApril() {
		return admissionRest.countAdmissionApril();
	}

	@ModelAttribute("countAdmissionMay")
	public String countAdmissionMay() {
		return admissionRest.countAdmissionMay();
	}

	@ModelAttribute("countAdmissionJune")
	public String countAdmissionJune() {
		return admissionRest.countAdmissionJune();
	}

	@ModelAttribute("countAdmissionJuly")
	public String countAdmissionJuly() {
		return admissionRest.countAdmissionJuly();
	}

	@ModelAttribute("countAdmissionAugust")
	public String countAdmissionAugust() {
		return admissionRest.countAdmissionAugust();
	}

	@ModelAttribute("countAdmissionSeptember")
	public String countAdmissionSeptember() {
		return admissionRest.countAdmissionSeptember();
	}

	@ModelAttribute("countAdmissionOctober")
	public String countAdmissionOctober() {
		return admissionRest.countAdmissionOctober();
	}

	@ModelAttribute("countAdmissionNovember")
	public String countAdmissionNovember() {
		return admissionRest.countAdmissionNovember();
	}

	@ModelAttribute("countAdmissionDecember")
	public String countAdmissionDecember() {
		return admissionRest.countAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countDischargeJanuary")
	public String countDischargeJanuary() {
		return admissionRest.countDischargeJanuary();
	}

	@ModelAttribute("countDischargeFebruary")
	public String countDischargeFebruary() {
		return admissionRest.countDischargeFebruary();
	}

	@ModelAttribute("countDischargeMarch")
	public String countDischargeMarch() {
		return admissionRest.countDischargeMarch();
	}

	@ModelAttribute("countDischargeApril")
	public String countDischargeApril() {
		return admissionRest.countDischargeApril();
	}

	@ModelAttribute("countDischargeMay")
	public String countDischargeMay() {
		return admissionRest.countDischargeMay();
	}

	@ModelAttribute("countDischargeJune")
	public String countDischargeJune() {
		return admissionRest.countDischargeJune();
	}

	@ModelAttribute("countDischargeJuly")
	public String countDischargeJuly() {
		return admissionRest.countDischargeJuly();
	}

	@ModelAttribute("countDischargeAugust")
	public String countDischargeAugust() {
		return admissionRest.countDischargeAugust();
	}

	@ModelAttribute("countDischargeSeptember")
	public String countDischargeSeptember() {
		return admissionRest.countDischargeSeptember();
	}

	@ModelAttribute("countDischargeOctober")
	public String countDischargeOctober() {
		return admissionRest.countDischargeOctober();
	}

	@ModelAttribute("countDischargeNovember")
	public String countDischargeNovember() {
		return admissionRest.countDischargeNovember();
	}

	@ModelAttribute("countDischargeDecember")
	public String countDischargeDecember() {
		return admissionRest.countDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countDeathJanuary")
	public String countDeathJanuary() {
		return admissionRest.countDeathJanuary();
	}

	@ModelAttribute("countDeathFebruary")
	public String countDeathFebruary() {
		return admissionRest.countDeathFebruary();
	}

	@ModelAttribute("countDeathMarch")
	public String countDeathMarch() {
		return admissionRest.countDeathMarch();
	}

	@ModelAttribute("countDeathApril")
	public String countDeathApril() {
		return admissionRest.countDeathApril();
	}

	@ModelAttribute("countDeathMay")
	public String countDeathMay() {
		return admissionRest.countDeathMay();
	}

	@ModelAttribute("countDeathJune")
	public String countDeathJune() {
		return admissionRest.countDeathJune();
	}

	@ModelAttribute("countDeathJuly")
	public String countDeathJuly() {
		return admissionRest.countDeathJuly();
	}

	@ModelAttribute("countDeathAugust")
	public String countDeathAugust() {
		return admissionRest.countDeathAugust();
	}

	@ModelAttribute("countDeathSeptember")
	public String countDeathSeptember() {
		return admissionRest.countDeathSeptember();
	}

	@ModelAttribute("countDeathOctober")
	public String countDeathOctober() {
		return admissionRest.countDeathOctober();
	}

	@ModelAttribute("countDeathNovember")
	public String countDeathNovember() {
		return admissionRest.countDeathNovember();
	}

	@ModelAttribute("countDeathDecember")
	public String countDeathDecember() {
		return admissionRest.countDeathDecember();
	}

	/* Male medical counting */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleMedicalAdmissionJanuary")
	public String countMaleMedicalAdmissionJanuary() {
		return admissionRest.countMaleMedicalAdmissionJanuary();
	}

	@ModelAttribute("countMaleMedicalAdmissionFebruary")
	public String countMaleMedicalAdmissionFebruary() {
		return admissionRest.countMaleMedicalAdmissionFebruary();
	}

	@ModelAttribute("countMaleMedicalAdmissionMarch")
	public String countMaleMedicalAdmissionMarch() {
		return admissionRest.countMaleMedicalAdmissionMarch();
	}

	@ModelAttribute("countMaleMedicalAdmissionApril")
	public String countMaleMedicalAdmissionApril() {
		return admissionRest.countAdmissionApril();
	}

	@ModelAttribute("countMaleMedicalAdmissionMay")
	public String countMaleMedicalAdmissionMay() {
		return admissionRest.countMaleMedicalAdmissionMay();
	}

	@ModelAttribute("countMaleMedicalAdmissionJune")
	public String countMaleMedicalAdmissionJune() {
		return admissionRest.countMaleMedicalAdmissionJune();
	}

	@ModelAttribute("countMaleMedicalAdmissionJuly")
	public String countMaleMedicalAdmissionJuly() {
		return admissionRest.countMaleMedicalAdmissionJuly();
	}

	@ModelAttribute("countMaleMedicalAdmissionAugust")
	public String countMaleMedicalAdmissionAugust() {
		return admissionRest.countMaleMedicalAdmissionAugust();
	}

	@ModelAttribute("countMaleMedicalAdmissionSeptember")
	public String countMaleMedicalAdmissionSeptember() {
		return admissionRest.countMaleMedicalAdmissionSeptember();
	}

	@ModelAttribute("countMaleMedicalAdmissionOctober")
	public String countMaleMedicalAdmissionOctober() {
		return admissionRest.countMaleMedicalAdmissionOctober();
	}

	@ModelAttribute("countMaleMedicalAdmissionNovember")
	public String countMaleMedicalAdmissionNovember() {
		return admissionRest.countMaleMedicalAdmissionNovember();
	}

	@ModelAttribute("countMaleMedicalAdmissionDecember")
	public String countMaleMedicalAdmissionDecember() {
		return admissionRest.countMaleMedicalAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting MaleMedical Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleMedicalDischargeJanuary")
	public String countMaleMedicalDischargeJanuary() {
		return admissionRest.countMaleMedicalDischargeJanuary();
	}

	@ModelAttribute("countMaleMedicalDischargeFebruary")
	public String countMaleMedicalDischargeFebruary() {
		return admissionRest.countMaleMedicalDischargeFebruary();
	}

	@ModelAttribute("countMaleMedicalDischargeMarch")
	public String countMaleMedicalDischargeMarch() {
		return admissionRest.countMaleMedicalDischargeMarch();
	}

	@ModelAttribute("countMaleMedicalDischargeApril")
	public String countMaleMedicalDischargeApril() {
		return admissionRest.countMaleMedicalDischargeApril();
	}

	@ModelAttribute("countMaleMedicalDischargeMay")
	public String countMaleMedicalDischargeMay() {
		return admissionRest.countMaleMedicalDischargeMay();
	}

	@ModelAttribute("countMaleMedicalDischargeJune")
	public String countMaleMedicalDischargeJune() {
		return admissionRest.countMaleMedicalDischargeJune();
	}

	@ModelAttribute("countMaleMedicalDischargeJuly")
	public String countMaleMedicalDischargeJuly() {
		return admissionRest.countMaleMedicalDischargeJuly();
	}

	@ModelAttribute("countMaleMedicalDischargeAugust")
	public String countMaleMedicalDischargeAugust() {
		return admissionRest.countMaleMedicalDischargeAugust();
	}

	@ModelAttribute("countMaleMedicalDischargeSeptember")
	public String countMaleMedicalDischargeSeptember() {
		return admissionRest.countMaleMedicalDischargeSeptember();
	}

	@ModelAttribute("countMaleMedicalDischargeOctober")
	public String countMaleMedicalDischargeOctober() {
		return admissionRest.countMaleMedicalDischargeOctober();
	}

	@ModelAttribute("countMaleMedicalDischargeNovember")
	public String countMaleMedicalDischargeNovember() {
		return admissionRest.countMaleMedicalDischargeNovember();
	}

	@ModelAttribute("countMaleMedicalDischargeDecember")
	public String countMaleMedicalDischargeDecember() {
		return admissionRest.countMaleMedicalDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting MaleMedical Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleMedicalDeathJanuary")
	public String countMaleMedicalDeathJanuary() {
		return admissionRest.countMaleMedicalDeathJanuary();
	}

	@ModelAttribute("countMaleMedicalDeathFebruary")
	public String countMaleMedicalDeathFebruary() {
		return admissionRest.countMaleMedicalDeathFebruary();
	}

	@ModelAttribute("countMaleMedicalDeathMarch")
	public String countMaleMedicalDeathMarch() {
		return admissionRest.countMaleMedicalDeathMarch();
	}

	@ModelAttribute("countMaleMedicalDeathApril")
	public String countMaleMedicalDeathApril() {
		return admissionRest.countMaleMedicalDeathApril();
	}

	@ModelAttribute("countMaleMedicalDeathMay")
	public String countMaleMedicalDeathMay() {
		return admissionRest.countMaleMedicalDeathMay();
	}

	@ModelAttribute("countMaleMedicalDeathJune")
	public String countMaleMedicalDeathJune() {
		return admissionRest.countMaleMedicalDeathJune();
	}

	@ModelAttribute("countMaleMedicalDeathJuly")
	public String countMaleMedicalDeathJuly() {
		return admissionRest.countMaleMedicalDeathJuly();
	}

	@ModelAttribute("countMaleMedicalDeathAugust")
	public String countMaleMedicalDeathAugust() {
		return admissionRest.countMaleMedicalDeathAugust();
	}

	@ModelAttribute("countMaleMedicalDeathSeptember")
	public String countMaleMedicalDeathSeptember() {
		return admissionRest.countMaleMedicalDeathSeptember();
	}

	@ModelAttribute("countMaleMedicalDeathOctober")
	public String countMaleMedicalDeathOctober() {
		return admissionRest.countMaleMedicalDeathOctober();
	}

	@ModelAttribute("countMaleMedicalDeathNovember")
	public String countMaleMedicalDeathNovember() {
		return admissionRest.countMaleMedicalDeathNovember();
	}

	@ModelAttribute("countMaleMedicalDeathDecember")
	public String countMaleMedicalDeathDecember() {
		return admissionRest.countMaleMedicalDeathDecember();
	}

	/* counting admission upto date */

	@ModelAttribute("countMaleMedicalAdmissionToDate")
	public String countMaleMedicalAdmissionToDate() {
		return admissionRest.countMaleMedicalAdmissionToDate();

	}

	@ModelAttribute("countMaleMedicalDischarge")
	public String countMaleMedicalDischarge() {
		return admissionRest.countMaleMedicalDischarge();

	}

	@ModelAttribute("countMaleMedicalDeath")
	public String countMaleMedicalDeath() {
		return admissionRest.countMaleMedicalDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countMaleMedicalTodayAdmission")
	public String countMaleMedicalTodayAdmission() {
		return admissionRest.countMaleMedicalTodayAdmission();

	}

	@ModelAttribute("countMaleMedicalTodayDischarge")
	public String countMaleMedicalTodayDischarge() {
		return admissionRest.countMaleMedicalTodayDischarge();

	}

	@ModelAttribute("countMaleMedicalTodayDeath")
	public String countMaleMedicalTodayDeath() {
		return admissionRest.countMaleMedicalTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countMaleMedicalYesterdayAdmission")
	public String countMaleMedicalYesterdayAdmission() {
		return admissionRest.countMaleMedicalYesterdayAdmission();

	}

	@ModelAttribute("countMaleMedicalYesterdayDischarge")
	public String countMaleMedicalYesterdayDischarge() {
		return admissionRest.countMaleMedicalYesterdayDischarge();

	}

	@ModelAttribute("countMaleMedicalYesterdayDeath")
	public String countMaleMedicalYesterdayDeath() {
		return admissionRest.countMaleMedicalYesterdayDeath();

	}

	/* couuting ends */

	/* female medical counting starts here */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleMedicalAdmissionJanuary")
	public String countFemaleMedicalAdmissionJanuary() {
		return admissionRest.countFemaleMedicalAdmissionJanuary();
	}

	@ModelAttribute("countFemaleMedicalAdmissionFebruary")
	public String countFemaleMedicalAdmissionFebruary() {
		return admissionRest.countFemaleMedicalAdmissionFebruary();
	}

	@ModelAttribute("countFemaleMedicalAdmissionMarch")
	public String countFemaleMedicalAdmissionMarch() {
		return admissionRest.countFemaleMedicalAdmissionMarch();
	}

	@ModelAttribute("countFemaleMedicalAdmissionApril")
	public String countFemaleMedicalAdmissionApril() {
		return admissionRest.countFemaleMedicalAdmissionApril();
	}

	@ModelAttribute("countFemaleMedicalAdmissionMay")
	public String countFemaleMedicalAdmissionMay() {
		return admissionRest.countFemaleMedicalAdmissionMay();
	}

	@ModelAttribute("countFemaleMedicalAdmissionJune")
	public String countFemaleMedicalAdmissionJune() {
		return admissionRest.countFemaleMedicalAdmissionJune();
	}

	@ModelAttribute("countFemaleMedicalAdmissionJuly")
	public String countFemaleMedicalAdmissionJuly() {
		return admissionRest.countFemaleMedicalAdmissionJuly();
	}

	@ModelAttribute("countFemaleMedicalAdmissionAugust")
	public String countFemaleMedicalAdmissionAugust() {
		return admissionRest.countFemaleMedicalAdmissionAugust();
	}

	@ModelAttribute("countFemaleMedicalAdmissionSeptember")
	public String countFemaleMedicalAdmissionSeptember() {
		return admissionRest.countFemaleMedicalAdmissionSeptember();
	}

	@ModelAttribute("countFemaleMedicalAdmissionOctober")
	public String countFemaleMedicalAdmissionOctober() {
		return admissionRest.countFemaleMedicalAdmissionOctober();
	}

	@ModelAttribute("countFemaleMedicalAdmissionNovember")
	public String countFemaleMedicalAdmissionNovember() {
		return admissionRest.countFemaleMedicalAdmissionNovember();
	}

	@ModelAttribute("countFemaleMedicalAdmissionDecember")
	public String countFemaleMedicalAdmissionDecember() {
		return admissionRest.countFemaleMedicalAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleMedicalDischargeJanuary")
	public String countFemaleMedicalDischargeJanuary() {
		return admissionRest.countFemaleMedicalDischargeJanuary();
	}

	@ModelAttribute("countFemaleMedicalDischargeFebruary")
	public String countFemaleMedicalDischargeFebruary() {
		return admissionRest.countFemaleMedicalDischargeFebruary();
	}

	@ModelAttribute("countFemaleMedicalDischargeMarch")
	public String countFemaleMedicalDischargeMarch() {
		return admissionRest.countFemaleMedicalDischargeMarch();
	}

	@ModelAttribute("countFemaleMedicalDischargeApril")
	public String countFemaleMedicalDischargeApril() {
		return admissionRest.countFemaleMedicalDischargeApril();
	}

	@ModelAttribute("countFemaleMedicalDischargeMay")
	public String countFemaleMedicalDischargeMay() {
		return admissionRest.countFemaleMedicalDischargeMay();
	}

	@ModelAttribute("countFemaleMedicalDischargeJune")
	public String countFemaleMedicalDischargeJune() {
		return admissionRest.countFemaleMedicalDischargeJune();
	}

	@ModelAttribute("countFemaleMedicalDischargeJuly")
	public String countFemaleMedicalDischargeJuly() {
		return admissionRest.countFemaleMedicalDischargeJuly();
	}

	@ModelAttribute("countFemaleMedicalDischargeAugust")
	public String countFemaleMedicalDischargeAugust() {
		return admissionRest.countFemaleMedicalDischargeAugust();
	}

	@ModelAttribute("countFemaleMedicalDischargeSeptember")
	public String countFemaleMedicalDischargeSeptember() {
		return admissionRest.countFemaleMedicalDischargeSeptember();
	}

	@ModelAttribute("countFemaleMedicalDischargeOctober")
	public String countFemaleMedicalDischargeOctober() {
		return admissionRest.countFemaleMedicalDischargeOctober();
	}

	@ModelAttribute("countFemaleMedicalDischargeNovember")
	public String countFemaleMedicalDischargeNovember() {
		return admissionRest.countFemaleMedicalDischargeNovember();
	}

	@ModelAttribute("countFemaleMedicalDischargeDecember")
	public String countFemaleMedicalDischargeDecember() {
		return admissionRest.countFemaleMedicalDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleMedicalDeathJanuary")
	public String countFemaleMedicalDeathJanuary() {
		return admissionRest.countFemaleMedicalDeathJanuary();
	}

	@ModelAttribute("countFemaleMedicalDeathFebruary")
	public String countFemaleMedicalDeathFebruary() {
		return admissionRest.countFemaleMedicalDeathFebruary();
	}

	@ModelAttribute("countFemaleMedicalDeathMarch")
	public String countFemaleMedicalDeathMarch() {
		return admissionRest.countFemaleMedicalDeathMarch();
	}

	@ModelAttribute("countFemaleMedicalDeathApril")
	public String countFemaleMedicalDeathApril() {
		return admissionRest.countFemaleMedicalDeathApril();
	}

	@ModelAttribute("countFemaleMedicalDeathMay")
	public String countFemaleMedicalDeathMay() {
		return admissionRest.countFemaleMedicalDeathMay();
	}

	@ModelAttribute("countFemaleMedicalDeathJune")
	public String countFemaleMedicalDeathJune() {
		return admissionRest.countFemaleMedicalDeathJune();
	}

	@ModelAttribute("countFemaleMedicalDeathJuly")
	public String countFemaleMedicalDeathJuly() {
		return admissionRest.countFemaleMedicalDeathJuly();
	}

	@ModelAttribute("countFemaleMedicalDeathAugust")
	public String countFemaleMedicalDeathAugust() {
		return admissionRest.countFemaleMedicalDeathAugust();
	}

	@ModelAttribute("countFemaleMedicalDeathSeptember")
	public String countFemaleMedicalDeathSeptember() {
		return admissionRest.countFemaleMedicalDeathSeptember();
	}

	@ModelAttribute("countFemaleMedicalDeathOctober")
	public String countFemaleMedicalDeathOctober() {
		return admissionRest.countFemaleMedicalDeathOctober();
	}

	@ModelAttribute("countFemaleMedicalDeathNovember")
	public String countFemaleMedicalDeathNovember() {
		return admissionRest.countFemaleMedicalDeathNovember();
	}

	@ModelAttribute("countFemaleMedicalDeathDecember")
	public String countFemaleMedicalDeathDecember() {
		return admissionRest.countFemaleMedicalDeathDecember();
	}

	/* counting admission upto date */

	@ModelAttribute("countFemaleMedicalAdmissionToDate")
	public String countFemaleMedicalAdmissionToDate() {
		return admissionRest.countFemaleMedicalAdmissionToDate();

	}

	@ModelAttribute("countFemaleMedicalDischarge")
	public String countFEmaleMedicalDischarge() {
		return admissionRest.countFemaleMedicalDischarge();

	}

	@ModelAttribute("countFemaleMedicalDeath")
	public String countFemaleMedicalDeath() {
		return admissionRest.countFemaleMedicalDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countFemaleMedicalTodayAdmission")
	public String countFemaleMedicalTodayAdmission() {
		return admissionRest.countFemaleMedicalTodayAdmission();

	}

	@ModelAttribute("countFemaleMedicalTodayDischarge")
	public String countFemaleMedicalTodayDischarge() {
		return admissionRest.countFemaleMedicalTodayDischarge();

	}

	@ModelAttribute("countFemaleMedicalTodayDeath")
	public String countFemaleMedicalTodayDeath() {
		return admissionRest.countFemaleMedicalTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countFemaleMedicalYesterdayAdmission")
	public String countFemaleMedicalYesterdayAdmission() {
		return admissionRest.countFemaleMedicalYesterdayAdmission();

	}

	@ModelAttribute("countFemaleMedicalYesterdayDischarge")
	public String countFemaleMedicalYesterdayDischarge() {
		return admissionRest.countFemaleMedicalYesterdayDischarge();

	}

	@ModelAttribute("countFemaleMedicalYesterdayDeath")
	public String countFemaleMedicalYesterdayDeath() {
		return admissionRest.countFemaleMedicalYesterdayDeath();

	}

	/* counting male surgical ward */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleSurgicalAdmissionJanuary")
	public String countMaleSurgicalAdmissionJanuary() {
		return admissionRest.countMaleSurgicalAdmissionJanuary();
	}

	@ModelAttribute("countMaleSurgicalAdmissionFebruary")
	public String countMaleSurgicalAdmissionFebruary() {
		return admissionRest.countMaleSurgicalAdmissionFebruary();
	}

	@ModelAttribute("countMaleSurgicalAdmissionMarch")
	public String countMaleSurgicalAdmissionMarch() {
		return admissionRest.countMaleSurgicalAdmissionMarch();
	}

	@ModelAttribute("countMaleSurgicalAdmissionApril")
	public String countMaleSurgicalAdmissionApril() {
		return admissionRest.countMaleSurgicalAdmissionApril();
	}

	@ModelAttribute("countMaleSurgicalAdmissionMay")
	public String countMaleSurgicalAdmissionMay() {
		return admissionRest.countMaleSurgicalAdmissionMay();
	}

	@ModelAttribute("countMaleSurgicalAdmissionJune")
	public String countMaleSurgicalAdmissionJune() {
		return admissionRest.countMaleSurgicalAdmissionJune();
	}

	@ModelAttribute("countMaleSurgicalAdmissionJuly")
	public String countMaleSurgicalAdmissionJuly() {
		return admissionRest.countMaleSurgicalAdmissionJuly();
	}

	@ModelAttribute("countMaleSurgicalAdmissionAugust")
	public String countMaleSurgicalAdmissionAugust() {
		return admissionRest.countMaleSurgicalAdmissionAugust();
	}

	@ModelAttribute("countMaleSurgicalAdmissionSeptember")
	public String countMaleSurgicalAdmissionSeptember() {
		return admissionRest.countMaleSurgicalAdmissionSeptember();
	}

	@ModelAttribute("countMaleSurgicalAdmissionOctober")
	public String countMaleSurgicalAdmissionOctober() {
		return admissionRest.countMaleSurgicalAdmissionOctober();
	}

	@ModelAttribute("countMaleSurgicalAdmissionNovember")
	public String countMaleSurgicalAdmissionNovember() {
		return admissionRest.countMaleSurgicalAdmissionNovember();
	}

	@ModelAttribute("countMaleSurgicalAdmissionDecember")
	public String countMaleSurgicalAdmissionDecember() {
		return admissionRest.countMaleSurgicalAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleSurgicalDischargeJanuary")
	public String countMaleSurgicalDischargeJanuary() {
		return admissionRest.countMaleSurgicalDischargeJanuary();
	}

	@ModelAttribute("countMaleSurgicalDischargeFebruary")
	public String countMaleSurgicalDischargeFebruary() {
		return admissionRest.countMaleSurgicalDischargeFebruary();
	}

	@ModelAttribute("countMaleSurgicalDischargeMarch")
	public String countMaleSurgicalDischargeMarch() {
		return admissionRest.countMaleSurgicalDischargeMarch();
	}

	@ModelAttribute("countMaleSurgicalDischargeApril")
	public String countMaleSurgicalDischargeApril() {
		return admissionRest.countMaleSurgicalDischargeApril();
	}

	@ModelAttribute("countMaleSurgicalDischargeMay")
	public String countMaleSurgicalDischargeMay() {
		return admissionRest.countMaleSurgicalDischargeMay();
	}

	@ModelAttribute("countMaleSurgicalDischargeJune")
	public String countMaleSurgicalDischargeJune() {
		return admissionRest.countMaleSurgicalDischargeJune();
	}

	@ModelAttribute("countMaleSurgicalDischargeJuly")
	public String countMaleSurgicalDischargeJuly() {
		return admissionRest.countMaleSurgicalDischargeJuly();
	}

	@ModelAttribute("countMaleSurgicalDischargeAugust")
	public String countMaleSurgicalDischargeAugust() {
		return admissionRest.countMaleSurgicalDischargeAugust();
	}

	@ModelAttribute("countMaleSurgicalDischargeSeptember")
	public String countMaleSurgicalDischargeSeptember() {
		return admissionRest.countMaleSurgicalDischargeSeptember();
	}

	@ModelAttribute("countMaleSurgicalDischargeOctober")
	public String countMaleSurgicalDischargeOctober() {
		return admissionRest.countMaleSurgicalDischargeOctober();
	}

	@ModelAttribute("countMaleSurgicalDischargeNovember")
	public String countMaleSurgicalDischargeNovember() {
		return admissionRest.countMaleSurgicalDischargeNovember();
	}

	@ModelAttribute("countMaleSurgicalDischargeDecember")
	public String countMaleSurgicalDischargeDecember() {
		return admissionRest.countMaleSurgicalDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaleSurgicalDeathJanuary")
	public String countMaleSurgicalDeathJanuary() {
		return admissionRest.countMaleSurgicalDeathJanuary();
	}

	@ModelAttribute("countMaleSurgicalDeathFebruary")
	public String countMaleSurgicalDeathFebruary() {
		return admissionRest.countMaleSurgicalDeathFebruary();
	}

	@ModelAttribute("countMaleSurgicalDeathMarch")
	public String countMaleSurgicalDeathMarch() {
		return admissionRest.countMaleSurgicalDeathMarch();
	}

	@ModelAttribute("countMaleSurgicalDeathApril")
	public String countMaleSurgicalDeathApril() {
		return admissionRest.countMaleSurgicalDeathApril();
	}

	@ModelAttribute("countMaleSurgicalDeathMay")
	public String countMaleSurgicalDeathMay() {
		return admissionRest.countMaleSurgicalDeathMay();
	}

	@ModelAttribute("countMaleSurgicalDeathJune")
	public String countMaleSurgicalDeathJune() {
		return admissionRest.countMaleSurgicalDeathJune();
	}

	@ModelAttribute("countMaleSurgicalDeathJuly")
	public String countMaleSurgicalDeathJuly() {
		return admissionRest.countMaleSurgicalDeathJuly();
	}

	@ModelAttribute("countMaleSurgicalDeathAugust")
	public String countMaleSurgicalDeathAugust() {
		return admissionRest.countMaleSurgicalDeathAugust();
	}

	@ModelAttribute("countMaleSurgicalDeathSeptember")
	public String countMaleSurgicalDeathSeptember() {
		return admissionRest.countMaleSurgicalDeathSeptember();
	}

	@ModelAttribute("countMaleSurgicalDeathOctober")
	public String countMaleSurgicalDeathOctober() {
		return admissionRest.countMaleSurgicalDeathOctober();
	}

	@ModelAttribute("countMaleSurgicalDeathNovember")
	public String countMaleSurgicalDeathNovember() {
		return admissionRest.countMaleSurgicalDeathNovember();
	}

	@ModelAttribute("countMaleSurgicalDeathDecember")
	public String countMaleSurgicalDeathDecember() {
		return admissionRest.countMaleSurgicalDeathDecember();
	}

	/* counting admission upto date */

	@ModelAttribute("countMaleSurgicalAdmissionToDate")
	public String countMaleSurgicalAdmissionToDate() {
		return admissionRest.countMaleSurgicalAdmissionToDate();

	}

	@ModelAttribute("countMaleSurgicalDischarge")
	public String countMaleSurgicalDischarge() {
		return admissionRest.countMaleSurgicalDischarge();

	}

	@ModelAttribute("countMaleSurgicalDeath")
	public String countMaleSurgicalDeath() {
		return admissionRest.countMaleSurgicalDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countMaleSurgicalTodayAdmission")
	public String countMaleSurgicalTodayAdmission() {
		return admissionRest.countMaleSurgicalTodayAdmission();

	}

	@ModelAttribute("countMaleSurgicalTodayDischarge")
	public String countMaleSurgicalTodayDischarge() {
		return admissionRest.countMaleSurgicalTodayDischarge();

	}

	@ModelAttribute("countFemaleMedicalTodayDeath")
	public String countMaleSurgicalTodayDeath() {
		return admissionRest.countMaleSurgicalTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countMaleSurgicalYesterdayAdmission")
	public String countMaleSurgicalYesterdayAdmission() {
		return admissionRest.countMaleSurgicalYesterdayAdmission();

	}

	@ModelAttribute("countMaleSurgicalYesterdayDischarge")
	public String countMaleSurgicalYesterdayDischarge() {
		return admissionRest.countMaleSurgicalYesterdayDischarge();

	}

	@ModelAttribute("countMaleSurgicalYesterdayDeath")
	public String countMaleSurgicalYesterdayDeath() {
		return admissionRest.countMaleSurgicalYesterdayDeath();

	}

	/* counting for female surgical ward */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleSurgicalAdmissionJanuary")
	public String countFemaleSurgicalAdmissionJanuary() {
		return admissionRest.countFemaleSurgicalAdmissionJanuary();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionFebruary")
	public String countFemaleSurgicalAdmissionFebruary() {
		return admissionRest.countFemaleSurgicalAdmissionFebruary();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionMarch")
	public String countFemaleSurgicalAdmissionMarch() {
		return admissionRest.countFemaleSurgicalAdmissionMarch();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionApril")
	public String countFemaleSurgicalAdmissionApril() {
		return admissionRest.countFemaleSurgicalAdmissionApril();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionMay")
	public String countFemaleSurgicalAdmissionMay() {
		return admissionRest.countFemaleSurgicalAdmissionMay();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionJune")
	public String countFemaleSurgicalAdmissionJune() {
		return admissionRest.countFemaleSurgicalAdmissionJune();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionJuly")
	public String countFemaleSurgicalAdmissionJuly() {
		return admissionRest.countFemaleSurgicalAdmissionJuly();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionAugust")
	public String countFemaleSurgicalAdmissionAugust() {
		return admissionRest.countFemaleSurgicalAdmissionAugust();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionSeptember")
	public String countFemaleSurgicalAdmissionSeptember() {
		return admissionRest.countFemaleSurgicalAdmissionSeptember();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionOctober")
	public String countFemaleSurgicalAdmissionOctober() {
		return admissionRest.countFemaleSurgicalAdmissionOctober();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionNovember")
	public String countFemaleSurgicalAdmissionNovember() {
		return admissionRest.countFemaleSurgicalAdmissionNovember();
	}

	@ModelAttribute("countFemaleSurgicalAdmissionDecember")
	public String countFemaleSurgicalAdmissionDecember() {
		return admissionRest.countFemaleSurgicalAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleSurgicalDischargeJanuary")
	public String countFemaleSurgicalDischargeJanuary() {
		return admissionRest.countFemaleSurgicalDischargeJanuary();
	}

	@ModelAttribute("countFemaleSurgicalDischargeFebruary")
	public String countFemaleSurgicalDischargeFebruary() {
		return admissionRest.countFemaleSurgicalDischargeFebruary();
	}

	@ModelAttribute("countFemaleSurgicalDischargeMarch")
	public String countFemaleSurgicalDischargeMarch() {
		return admissionRest.countFemaleSurgicalDischargeMarch();
	}

	@ModelAttribute("countFemaleSurgicalDischargeApril")
	public String countFemaleSurgicalDischargeApril() {
		return admissionRest.countFemaleSurgicalDischargeApril();
	}

	@ModelAttribute("countFemaleSurgicalDischargeMay")
	public String countFemaleSurgicalDischargeMay() {
		return admissionRest.countFemaleSurgicalDischargeMay();
	}

	@ModelAttribute("countFemaleSurgicalDischargeJune")
	public String countFemaleSurgicalDischargeJune() {
		return admissionRest.countFemaleSurgicalDischargeJune();
	}

	@ModelAttribute("countFemaleSurgicalDischargeJuly")
	public String countFemaleSurgicalDischargeJuly() {
		return admissionRest.countFemaleSurgicalDischargeJuly();
	}

	@ModelAttribute("countFemaleSurgicalDischargeAugust")
	public String countFemaleSurgicalDischargeAugust() {
		return admissionRest.countFemaleSurgicalDischargeAugust();
	}

	@ModelAttribute("countFemaleSurgicalDischargeSeptember")
	public String countFemaleSurgicalDischargeSeptember() {
		return admissionRest.countFemaleSurgicalDischargeSeptember();
	}

	@ModelAttribute("countFemaleSurgicalDischargeOctober")
	public String countFemaleSurgicalDischargeOctober() {
		return admissionRest.countDischargeOctober();
	}

	@ModelAttribute("countFemaleSurgicalDischargeNovember")
	public String countFemaleSurgicalDischargeNovember() {
		return admissionRest.countFemaleSurgicalDischargeNovember();
	}

	@ModelAttribute("countFemaleSurgicalDischargeDecember")
	public String countFemaleSurgicalDischargeDecember() {
		return admissionRest.countFemaleSurgicalDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countFemaleSurgicalDeathJanuary")
	public String countFemaleSurgicalDeathJanuary() {
		return admissionRest.countFemaleSurgicalDeathJanuary();
	}

	@ModelAttribute("countFemaleSurgicalDeathFebruary")
	public String countFemaleSurgicalDeathFebruary() {
		return admissionRest.countFemaleSurgicalDeathFebruary();
	}

	@ModelAttribute("countFemaleSurgicalDeathMarch")
	public String countFemaleSurgicalDeathMarch() {
		return admissionRest.countFemaleSurgicalDeathMarch();
	}

	@ModelAttribute("countFemaleSurgicalDeathApril")
	public String countFemaleSurgicalDeathApril() {
		return admissionRest.countFemaleSurgicalDeathApril();
	}

	@ModelAttribute("countFemaleSurgicalDeathMay")
	public String countFemaleSurgicalDeathMay() {
		return admissionRest.countFemaleSurgicalDeathMay();
	}

	@ModelAttribute("countFemaleSurgicalDeathJune")
	public String countFemaleSurgicalDeathJune() {
		return admissionRest.countFemaleSurgicalDeathJune();
	}

	@ModelAttribute("countFemaleSurgicalDeathJuly")
	public String countFemaleSurgicalDeathJuly() {
		return admissionRest.countFemaleSurgicalDeathJuly();
	}

	@ModelAttribute("countFemaleSurgicalDeathAugust")
	public String countFemaleSurgicalDeathAugust() {
		return admissionRest.countFemaleSurgicalDeathAugust();
	}

	@ModelAttribute("countFemaleSurgicalDeathSeptember")
	public String countFemaleSurgicalDeathSeptember() {
		return admissionRest.countFemaleSurgicalDeathSeptember();
	}

	@ModelAttribute("countFemaleSurgicalDeathOctober")
	public String countFemaleSurgicalDeathOctober() {
		return admissionRest.countFemaleSurgicalDeathOctober();
	}

	@ModelAttribute("countFemaleSurgicalDeathNovember")
	public String countFemaleSurgicalDeathNovember() {
		return admissionRest.countFemaleSurgicalDeathNovember();
	}

	@ModelAttribute("countFemaleSurgicalDeathDecember")
	public String countFemaleSurgicalDeathDecember() {
		return admissionRest.countFemaleSurgicalDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countFemaleSurgicalAdmissionToDate")
	public String countFemaleSurgicalAdmissionToDate() {
		return admissionRest.countFemaleSurgicalAdmissionToDate();

	}

	@ModelAttribute("countFemaleSurgicalDischarge")
	public String countFemaleSurgicalDischarge() {
		return admissionRest.countFemaleSurgicalDischarge();

	}

	@ModelAttribute("countFemaleSurgicalDeath")
	public String countFemaleSurgicalDeath() {
		return admissionRest.countDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countFemaleSurgicalTodayAdmission")
	public String countFemaleSurgicalTodayAdmission() {
		return admissionRest.countFemaleSurgicalTodayAdmission();

	}

	@ModelAttribute("countFemaleSurgicalTodayDischarge")
	public String countFemaleSurgicalTodayDischarge() {
		return admissionRest.countFemaleSurgicalTodayDischarge();

	}

	@ModelAttribute("countFemaleSurgicalTodayDeath")
	public String countTFemaleSurgicalodayDeath() {
		return admissionRest.countFemaleSurgicalTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countFemaleSurgicalYesterdayAdmission")
	public String countFemaleSurgicalYesterdayAdmission() {
		return admissionRest.countFemaleSurgicalYesterdayAdmission();

	}

	@ModelAttribute("countFemaleSurgicalYesterdayDischarge")
	public String countFemaleSurgicalYesterdayDischarge() {
		return admissionRest.countFemaleSurgicalYesterdayDischarge();

	}

	@ModelAttribute("countFemaleSurgicalYesterdayDeath")
	public String countFemaleSurgicalYesterdayDeath() {
		return admissionRest.countFemaleSurgicalYesterdayDeath();

	}

	/* couuting ends */

	/*
	 * counting for children's ward
	 */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countChildrensWardAdmissionJanuary")
	public String countChildrensWardAdmissionJanuary() {
		return admissionRest.countChildrensWardAdmissionJanuary();
	}

	@ModelAttribute("countChildrensWardAdmissionFebruary")
	public String countChildrensWardAdmissionFebruary() {
		return admissionRest.countChildrensWardAdmissionFebruary();
	}

	@ModelAttribute("countChildrensWardAdmissionMarch")
	public String countChildrensWardAdmissionMarch() {
		return admissionRest.countChildrensWardAdmissionMarch();
	}

	@ModelAttribute("countChildrensWardAdmissionApril")
	public String countChildrensWardAdmissionApril() {
		return admissionRest.countChildrensWardAdmissionApril();
	}

	@ModelAttribute("countChildrensWardAdmissionMay")
	public String countChildrensWardAdmissionMay() {
		return admissionRest.countChildrensWardAdmissionMay();
	}

	@ModelAttribute("countChildrensWardAdmissionJune")
	public String countChildrensWardAdmissionJune() {
		return admissionRest.countChildrensWardAdmissionJune();
	}

	@ModelAttribute("countChildrensWardAdmissionJuly")
	public String countChildrensWardAdmissionJuly() {
		return admissionRest.countChildrensWardAdmissionJuly();
	}

	@ModelAttribute("countChildrensWardAdmissionAugust")
	public String countChildrensWardAdmissionAugust() {
		return admissionRest.countChildrensWardAdmissionAugust();
	}

	@ModelAttribute("countChildrensWardAdmissionSeptember")
	public String countChildrensWardAdmissionSeptember() {
		return admissionRest.countChildrensWardAdmissionSeptember();
	}

	@ModelAttribute("countChildrensWardAdmissionOctober")
	public String countChildrensWardAdmissionOctober() {
		return admissionRest.countChildrensWardAdmissionOctober();
	}

	@ModelAttribute("countChildrensWardAdmissionNovember")
	public String countChildrensWardAdmissionNovember() {
		return admissionRest.countChildrensWardAdmissionNovember();
	}

	@ModelAttribute("countChildrensWardAdmissionDecember")
	public String countChildrensWardAdmissionDecember() {
		return admissionRest.countChildrensWardAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countChildrensWardDischargeJanuary")
	public String countChildrensWardDischargeJanuary() {
		return admissionRest.countChildrensWardDischargeJanuary();
	}

	@ModelAttribute("countChildrensWardDischargeFebruary")
	public String countChildrensWardDischargeFebruary() {
		return admissionRest.countChildrensWardDischargeFebruary();
	}

	@ModelAttribute("countChildrensWardDischargeMarch")
	public String countChildrensWardDischargeMarch() {
		return admissionRest.countChildrensWardDischargeMarch();
	}

	@ModelAttribute("countChildrensWardDischargeApril")
	public String countChildrensWardDischargeApril() {
		return admissionRest.countChildrensWardDischargeApril();
	}

	@ModelAttribute("countChildrensWardDischargeMay")
	public String countChildrensWardDischargeMay() {
		return admissionRest.countChildrensWardDischargeMay();
	}

	@ModelAttribute("countChildrensWardDischargeJune")
	public String countChildrensWardDischargeJune() {
		return admissionRest.countChildrensWardDischargeJune();
	}

	@ModelAttribute("countChildrensWardDischargeJuly")
	public String countChildrensWardDischargeJuly() {
		return admissionRest.countChildrensWardDischargeJuly();
	}

	@ModelAttribute("countChildrensWardDischargeAugust")
	public String countChildrensWardDischargeAugust() {
		return admissionRest.countChildrensWardDischargeAugust();
	}

	@ModelAttribute("countChildrensWardDischargeSeptember")
	public String countChildrensWardDischargeSeptember() {
		return admissionRest.countChildrensWardDischargeSeptember();
	}

	@ModelAttribute("countChildrensWardDischargeOctober")
	public String countChildrensWardDischargeOctober() {
		return admissionRest.countChildrensWardDischargeOctober();
	}

	@ModelAttribute("countChildrensWardDischargeNovember")
	public String countChildrensWardDischargeNovember() {
		return admissionRest.countChildrensWardDischargeNovember();
	}

	@ModelAttribute("countChildrensWardDischargeDecember")
	public String countChildrensWardDischargeDecember() {
		return admissionRest.countChildrensWardDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countChildrensWardDeathJanuary")
	public String countChildrensWardDeathJanuary() {
		return admissionRest.countChildrensWardDeathJanuary();
	}

	@ModelAttribute("countChildrensWardDeathFebruary")
	public String countChildrensWardDeathFebruary() {
		return admissionRest.countChildrensWardDeathFebruary();
	}

	@ModelAttribute("countChildrensWardDeathMarch")
	public String countChildrensWardDeathMarch() {
		return admissionRest.countChildrensWardDeathMarch();
	}

	@ModelAttribute("countChildrensWardDeathApril")
	public String countChildrensWardDeathApril() {
		return admissionRest.countChildrensWardDeathApril();
	}

	@ModelAttribute("countChildrensWardDeathMay")
	public String countChildrensWardDeathMay() {
		return admissionRest.countChildrensWardDeathMay();
	}

	@ModelAttribute("countChildrensWardDeathJune")
	public String countChildrensWardDeathJune() {
		return admissionRest.countChildrensWardDeathJune();
	}

	@ModelAttribute("countChildrensWardDeathJuly")
	public String countChildrensWardDeathJuly() {
		return admissionRest.countChildrensWardDeathJuly();
	}

	@ModelAttribute("countChildrensWardDeathAugust")
	public String countChildrensWardDeathAugust() {
		return admissionRest.countChildrensWardDeathAugust();
	}

	@ModelAttribute("countChildrensWardDeathSeptember")
	public String countChildrensWardDeathSeptember() {
		return admissionRest.countChildrensWardDeathSeptember();
	}

	@ModelAttribute("countChildrensWardDeathOctober")
	public String countChildrensWardDeathOctober() {
		return admissionRest.countChildrensWardDeathOctober();
	}

	@ModelAttribute("countChildrensWardDeathNovember")
	public String countChildrensWardDeathNovember() {
		return admissionRest.countChildrensWardDeathNovember();
	}

	@ModelAttribute("countChildrensWardDeathDecember")
	public String countChildrensWardDeathDecember() {
		return admissionRest.countChildrensWardDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countChildrensWardAdmissionToDate")
	public String countChildrensWardAdmissionToDate() {
		return admissionRest.countChildrensWardAdmissionToDate();

	}

	@ModelAttribute("countChildrensWardDischarge")
	public String countChildrensWardDischarge() {
		return admissionRest.countDischarge();

	}

	@ModelAttribute("countChildrensWardDeath")
	public String countChildrensWardDeath() {
		return admissionRest.countDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countChildrensWardTodayAdmission")
	public String countChildrensWardTodayAdmission() {
		return admissionRest.countChildrensWardTodayAdmission();

	}

	@ModelAttribute("countTodayDischarge")
	public String countChildrensWardTodayDischarge() {
		return admissionRest.countChildrensWardTodayDischarge();

	}

	@ModelAttribute("countChildrensWardTodayDeath")
	public String countChildrensWardTodayDeath() {
		return admissionRest.countChildrensWardTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countChildrensWardYesterdayAdmission")
	public String countChildrensWardYesterdayAdmission() {
		return admissionRest.countChildrensWardYesterdayAdmission();

	}

	@ModelAttribute("countChildrensWardYesterdayDischarge")
	public String countChildrensWardYesterdayDischarge() {
		return admissionRest.countChildrensWardYesterdayDischarge();

	}

	@ModelAttribute("countChildrensWardYesterdayDeath")
	public String countChildrensWardYesterdayDeath() {
		return admissionRest.countChildrensWardYesterdayDeath();

	}

	/* couuting ends */

	/* counting for maternity/labour ward/unit */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaternityAdmissionJanuary")
	public String countMaternityAdmissionJanuary() {
		return admissionRest.countMaternityAdmissionJanuary();
	}

	@ModelAttribute("countMaternityAdmissionFebruary")
	public String countMaternityAdmissionFebruary() {
		return admissionRest.countMaternityAdmissionFebruary();
	}

	@ModelAttribute("countMaternityAdmissionMarch")
	public String countMaternityAdmissionMarch() {
		return admissionRest.countMaternityAdmissionMarch();
	}

	@ModelAttribute("countMaternityAdmissionApril")
	public String countMaternityAdmissionApril() {
		return admissionRest.countMaternityAdmissionApril();
	}

	@ModelAttribute("countMaternityAdmissionMay")
	public String countMaternityAdmissionMay() {
		return admissionRest.countMaternityAdmissionMay();
	}

	@ModelAttribute("countMaternityAdmissionJune")
	public String countMaternityAdmissionJune() {
		return admissionRest.countMaternityAdmissionJune();
	}

	@ModelAttribute("countMaternityAdmissionJuly")
	public String countMaternityAdmissionJuly() {
		return admissionRest.countMaternityAdmissionJuly();
	}

	@ModelAttribute("countMaternityAdmissionAugust")
	public String countMaternityAdmissionAugust() {
		return admissionRest.countMaternityAdmissionAugust();
	}

	@ModelAttribute("countMaternityAdmissionSeptember")
	public String countMaternityAdmissionSeptember() {
		return admissionRest.countMaternityAdmissionSeptember();
	}

	@ModelAttribute("countMaternityAdmissionOctober")
	public String countMaternityAdmissionOctober() {
		return admissionRest.countMaternityAdmissionOctober();
	}

	@ModelAttribute("countMaternityAdmissionNovember")
	public String countMaternityAdmissionNovember() {
		return admissionRest.countMaternityAdmissionNovember();
	}

	@ModelAttribute("countMaternityAdmissionDecember")
	public String countMaternityAdmissionDecember() {
		return admissionRest.countMaternityAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaternityDischargeJanuary")
	public String countMaternityDischargeJanuary() {
		return admissionRest.countMaternityDischargeJanuary();
	}

	@ModelAttribute("countMaternityDischargeFebruary")
	public String countMaternityDischargeFebruary() {
		return admissionRest.countMaternityDischargeFebruary();
	}

	@ModelAttribute("countMaternityDischargeMarch")
	public String countMaternityDischargeMarch() {
		return admissionRest.countMaternityDischargeMarch();
	}

	@ModelAttribute("countMaternityDischargeApril")
	public String countMaternityDischargeApril() {
		return admissionRest.countMaternityDischargeApril();
	}

	@ModelAttribute("countMaternityDischargeMay")
	public String countMaternityDischargeMay() {
		return admissionRest.countMaternityDischargeMay();
	}

	@ModelAttribute("countMaternityDischargeJune")
	public String countMaternityDischargeJune() {
		return admissionRest.countMaternityDischargeJune();
	}

	@ModelAttribute("countMaternityDischargeJuly")
	public String countMaternityDischargeJuly() {
		return admissionRest.countMaternityDischargeJuly();
	}

	@ModelAttribute("countMaternityDischargeAugust")
	public String countMaternityDischargeAugust() {
		return admissionRest.countMaternityDischargeAugust();
	}

	@ModelAttribute("countMaternityDischargeSeptember")
	public String countMaternityDischargeSeptember() {
		return admissionRest.countMaternityDischargeSeptember();
	}

	@ModelAttribute("countMaternityDischargeOctober")
	public String countMaternityDischargeOctober() {
		return admissionRest.countMaternityDischargeOctober();
	}

	@ModelAttribute("countMaternityDischargeNovember")
	public String countMaternityDischargeNovember() {
		return admissionRest.countMaternityDischargeNovember();
	}

	@ModelAttribute("countMaternityDischargeDecember")
	public String countMaternityDischargeDecember() {
		return admissionRest.countMaternityDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countMaternityDeathJanuary")
	public String countMaternityDeathJanuary() {
		return admissionRest.countMaternityDeathJanuary();
	}

	@ModelAttribute("countMaternityDeathFebruary")
	public String countMaternityDeathFebruary() {
		return admissionRest.countMaternityDeathFebruary();
	}

	@ModelAttribute("countMaternityDeathMarch")
	public String countMaternityDeathMarch() {
		return admissionRest.countMaternityDeathMarch();
	}

	@ModelAttribute("countMaternityDeathApril")
	public String countMaternityDeathApril() {
		return admissionRest.countMaternityDeathApril();
	}

	@ModelAttribute("countMaternityDeathMay")
	public String countMaternityDeathMay() {
		return admissionRest.countMaternityDeathMay();
	}

	@ModelAttribute("countMaternityDeathJune")
	public String countMaternityDeathJune() {
		return admissionRest.countMaternityDeathJune();
	}

	@ModelAttribute("countMaternityDeathJuly")
	public String countMaternityDeathJuly() {
		return admissionRest.countMaternityDeathJuly();
	}

	@ModelAttribute("countMaternityDeathAugust")
	public String countMaternityDeathAugust() {
		return admissionRest.countMaternityDeathAugust();
	}

	@ModelAttribute("countMaternityDeathSeptember")
	public String countMaternityDeathSeptember() {
		return admissionRest.countMaternityDeathSeptember();
	}

	@ModelAttribute("countMaternityDeathOctober")
	public String countMaternityDeathOctober() {
		return admissionRest.countMaternityDeathOctober();
	}

	@ModelAttribute("countMaternityDeathNovember")
	public String countMaternityDeathNovember() {
		return admissionRest.countMaternityDeathNovember();
	}

	@ModelAttribute("countMaternityDeathDecember")
	public String countMaternityDeathDecember() {
		return admissionRest.countMaternityDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countMaternityAdmissionToDate")
	public String countMaternityAdmissionToDate() {
		return admissionRest.countMaternityAdmissionToDate();

	}

	@ModelAttribute("countMaternityDischarge")
	public String countMaternityDischarge() {
		return admissionRest.countMaternityDischarge();

	}

	@ModelAttribute("countMaternityDeath")
	public String countMaternityDeath() {
		return admissionRest.countMaternityDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countMaternityTodayAdmission")
	public String countMaternityTodayAdmission() {
		return admissionRest.countMaternityTodayAdmission();

	}

	@ModelAttribute("countMaternityTodayDischarge")
	public String countMaternityTodayDischarge() {
		return admissionRest.countMaternityTodayDischarge();

	}

	@ModelAttribute("countMaternityTodayDeath")
	public String countMaternityTodayDeath() {
		return admissionRest.countMaternityTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countMaternityYesterdayAdmission")
	public String countMaternityYesterdayAdmission() {
		return admissionRest.countMaternityYesterdayAdmission();

	}

	@ModelAttribute("countMaternityYesterdayDischarge")
	public String countMaternityYesterdayDischarge() {
		return admissionRest.countMaternityYesterdayDischarge();

	}

	@ModelAttribute("countMaternityYesterdayDeath")
	public String countMaternityYesterdayDeath() {
		return admissionRest.countMaternityYesterdayDeath();

	}

	/* couuting ends */

	/* counting for nicu */
	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countNICUAdmissionJanuary")
	public String countNICUAdmissionJanuary() {
		return admissionRest.countNICUAdmissionJanuary();
	}

	@ModelAttribute("countNICUAdmissionFebruary")
	public String countNICUAdmissionFebruary() {
		return admissionRest.countNICUAdmissionFebruary();
	}

	@ModelAttribute("countNICUAdmissionMarch")
	public String countNICUAdmissionMarch() {
		return admissionRest.countNICUAdmissionMarch();
	}

	@ModelAttribute("countNICUAdmissionApril")
	public String countNICUAdmissionApril() {
		return admissionRest.countNICUAdmissionApril();
	}

	@ModelAttribute("countNICUAdmissionMay")
	public String countNICUAdmissionMay() {
		return admissionRest.countNICUAdmissionMay();
	}

	@ModelAttribute("countNICUAdmissionJune")
	public String countNICUAdmissionJune() {
		return admissionRest.countNICUAdmissionJune();
	}

	@ModelAttribute("countNICUAdmissionJuly")
	public String countNICUAdmissionJuly() {
		return admissionRest.countNICUAdmissionJuly();
	}

	@ModelAttribute("countNICUAdmissionAugust")
	public String countNICUAdmissionAugust() {
		return admissionRest.countNICUAdmissionAugust();
	}

	@ModelAttribute("countNICUAdmissionSeptember")
	public String countNICUAdmissionSeptember() {
		return admissionRest.countNICUAdmissionSeptember();
	}

	@ModelAttribute("countNICUAdmissionOctober")
	public String countNICUAdmissionOctober() {
		return admissionRest.countNICUAdmissionOctober();
	}

	@ModelAttribute("countNICUAdmissionNovember")
	public String countNICUAdmissionNovember() {
		return admissionRest.countNICUAdmissionNovember();
	}

	@ModelAttribute("countNICUAdmissionDecember")
	public String countNICUAdmissionDecember() {
		return admissionRest.countNICUAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countNICUDischargeJanuary")
	public String countNICUDischargeJanuary() {
		return admissionRest.countNICUDischargeJanuary();
	}

	@ModelAttribute("countNICUDischargeFebruary")
	public String countNICUDischargeFebruary() {
		return admissionRest.countNICUDischargeFebruary();
	}

	@ModelAttribute("countNICUDischargeMarch")
	public String countNICUDischargeMarch() {
		return admissionRest.countNICUDischargeMarch();
	}

	@ModelAttribute("countNICUDischargeApril")
	public String countNICUDischargeApril() {
		return admissionRest.countNICUDischargeApril();
	}

	@ModelAttribute("countNICUDischargeMay")
	public String countNICUDischargeMay() {
		return admissionRest.countNICUDischargeMay();
	}

	@ModelAttribute("countNICUDischargeJune")
	public String countNICUDischargeJune() {
		return admissionRest.countNICUDischargeJune();
	}

	@ModelAttribute("countNICUDischargeJuly")
	public String countNICUDischargeJuly() {
		return admissionRest.countNICUDischargeJuly();
	}

	@ModelAttribute("countNICUDischargeAugust")
	public String countNICUDischargeAugust() {
		return admissionRest.countNICUDischargeAugust();
	}

	@ModelAttribute("countNICUDischargeSeptember")
	public String countNICUDischargeSeptember() {
		return admissionRest.countNICUDischargeSeptember();
	}

	@ModelAttribute("countNICUDischargeOctober")
	public String countNICUDischargeOctober() {
		return admissionRest.countNICUDischargeOctober();
	}

	@ModelAttribute("countNICUDischargeNovember")
	public String countNICUDischargeNovember() {
		return admissionRest.countNICUDischargeNovember();
	}

	@ModelAttribute("countNICUDischargeDecember")
	public String countNICUDischargeDecember() {
		return admissionRest.countNICUDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countNICUDeathJanuary")
	public String countNICUDeathJanuary() {
		return admissionRest.countNICUDeathJanuary();
	}

	@ModelAttribute("countNICUDeathFebruary")
	public String countNICUDeathFebruary() {
		return admissionRest.countNICUDeathFebruary();
	}

	@ModelAttribute("countNICUDeathMarch")
	public String countNICUDeathMarch() {
		return admissionRest.countNICUDeathMarch();
	}

	@ModelAttribute("countNICUDeathApril")
	public String countNICUDeathApril() {
		return admissionRest.countNICUDeathApril();
	}

	@ModelAttribute("countNICUDeathMay")
	public String countNICUDeathMay() {
		return admissionRest.countNICUDeathMay();
	}

	@ModelAttribute("countNICUDeathJune")
	public String countNICUDeathJune() {
		return admissionRest.countNICUDeathJune();
	}

	@ModelAttribute("countNICUDeathJuly")
	public String countNICUDeathJuly() {
		return admissionRest.countNICUDeathJuly();
	}

	@ModelAttribute("countNICUDeathAugust")
	public String countNICUDeathAugust() {
		return admissionRest.countNICUDeathAugust();
	}

	@ModelAttribute("countNICUDeathSeptember")
	public String countNICUDeathSeptember() {
		return admissionRest.countNICUDeathSeptember();
	}

	@ModelAttribute("countNICUDeathOctober")
	public String countNICUDeathOctober() {
		return admissionRest.countNICUDeathOctober();
	}

	@ModelAttribute("countNICUDeathNovember")
	public String countNICUDeathNovember() {
		return admissionRest.countNICUDeathNovember();
	}

	@ModelAttribute("countNICUDeathDecember")
	public String countNICUDeathDecember() {
		return admissionRest.countNICUDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countNICUAdmissionToDate")
	public String countNICUAdmissionToDate() {
		return admissionRest.countNICUAdmissionToDate();

	}

	@ModelAttribute("countNICUDischarge")
	public String countNICUDischarge() {
		return admissionRest.countNICUDischarge();

	}

	@ModelAttribute("countNICUDeath")
	public String countNICUDeath() {
		return admissionRest.countNICUDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countNICUTodayAdmission")
	public String countNICUTodayAdmission() {
		return admissionRest.countNICUTodayAdmission();

	}

	@ModelAttribute("countNICUTodayDischarge")
	public String countNICUTodayDischarge() {
		return admissionRest.countNICUTodayDischarge();

	}

	@ModelAttribute("countNICUTodayDeath")
	public String countNICUTodayDeath() {
		return admissionRest.countNICUTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countNICUYesterdayAdmission")
	public String countNICUYesterdayAdmission() {
		return admissionRest.countNICUYesterdayAdmission();

	}

	@ModelAttribute("countNICUYesterdayDischarge")
	public String countNICUYesterdayDischarge() {
		return admissionRest.countNICUYesterdayDischarge();

	}

	@ModelAttribute("countNICUYesterdayDeath")
	public String countNICUYesterdayDeath() {
		return admissionRest.countNICUYesterdayDeath();

	}

	/* couuting ends */

	/* counting for religious Ward */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countReligiousWardAdmissionJanuary")
	public String countReligiousWardAdmissionJanuary() {
		return admissionRest.countReligiousWardAdmissionJanuary();
	}

	@ModelAttribute("countReligiousWardAdmissionFebruary")
	public String countReligiousWardAdmissionFebruary() {
		return admissionRest.countReligiousWardAdmissionFebruary();
	}

	@ModelAttribute("countReligiousWardAdmissionMarch")
	public String countReligiousWardAdmissionMarch() {
		return admissionRest.countReligiousWardAdmissionMarch();
	}

	@ModelAttribute("countReligiousWardAdmissionApril")
	public String countReligiousWardAdmissionApril() {
		return admissionRest.countReligiousWardAdmissionApril();
	}

	@ModelAttribute("countReligiousWardAdmissionMay")
	public String countReligiousWardAdmissionMay() {
		return admissionRest.countReligiousWardAdmissionMay();
	}

	@ModelAttribute("countReligiousWardAdmissionJune")
	public String countReligiousWardAdmissionJune() {
		return admissionRest.countReligiousWardAdmissionJune();
	}

	@ModelAttribute("countReligiousWardAdmissionJuly")
	public String countReligiousWardAdmissionJuly() {
		return admissionRest.countReligiousWardAdmissionJuly();
	}

	@ModelAttribute("countReligiousWardAdmissionAugust")
	public String countReligiousWardAdmissionAugust() {
		return admissionRest.countReligiousWardAdmissionAugust();
	}

	@ModelAttribute("countReligiousWardAdmissionSeptember")
	public String countReligiousWardAdmissionSeptember() {
		return admissionRest.countReligiousWardAdmissionSeptember();
	}

	@ModelAttribute("countReligiousWardAdmissionOctober")
	public String countReligiousWardAdmissionOctober() {
		return admissionRest.countReligiousWardAdmissionOctober();
	}

	@ModelAttribute("countReligiousWardAdmissionNovember")
	public String countReligiousWardAdmissionNovember() {
		return admissionRest.countReligiousWardAdmissionNovember();
	}

	@ModelAttribute("countReligiousWardAdmissionDecember")
	public String countReligiousWardAdmissionDecember() {
		return admissionRest.countReligiousWardAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countReligiousWardDischargeJanuary")
	public String countReligiousWardDischargeJanuary() {
		return admissionRest.countReligiousWardDischargeJanuary();
	}

	@ModelAttribute("countReligiousWardDischargeFebruary")
	public String countReligiousWardDischargeFebruary() {
		return admissionRest.countReligiousWardDischargeFebruary();
	}

	@ModelAttribute("countReligiousWardDischargeMarch")
	public String countReligiousWardDischargeMarch() {
		return admissionRest.countReligiousWardDischargeMarch();
	}

	@ModelAttribute("countReligiousWardDischargeApril")
	public String countReligiousWardDischargeApril() {
		return admissionRest.countReligiousWardDischargeApril();
	}

	@ModelAttribute("countReligiousWardDischargeMay")
	public String countReligiousWardDischargeMay() {
		return admissionRest.countReligiousWardDischargeMay();
	}

	@ModelAttribute("countReligiousWardDischargeJune")
	public String countReligiousWardDischargeJune() {
		return admissionRest.countReligiousWardDischargeJune();
	}

	@ModelAttribute("countReligiousWardDischargeJuly")
	public String countReligiousWardDischargeJuly() {
		return admissionRest.countReligiousWardDischargeJuly();
	}

	@ModelAttribute("countReligiousWardDischargeAugust")
	public String countReligiousWardDischargeAugust() {
		return admissionRest.countReligiousWardDischargeAugust();
	}

	@ModelAttribute("countReligiousWardDischargeSeptember")
	public String countReligiousWardDischargeSeptember() {
		return admissionRest.countReligiousWardDischargeSeptember();
	}

	@ModelAttribute("countReligiousWardDischargeOctober")
	public String countReligiousWardDischargeOctober() {
		return admissionRest.countReligiousWardDischargeOctober();
	}

	@ModelAttribute("countReligiousWardDischargeNovember")
	public String countReligiousWardDischargeNovember() {
		return admissionRest.countReligiousWardDischargeNovember();
	}

	@ModelAttribute("countReligiousWardDischargeDecember")
	public String countReligiousWardDischargeDecember() {
		return admissionRest.countReligiousWardDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countReligiousWardDeathJanuary")
	public String countReligiousWardDeathJanuary() {
		return admissionRest.countReligiousWardDeathJanuary();
	}

	@ModelAttribute("countReligiousWardDeathFebruary")
	public String countReligiousWardDeathFebruary() {
		return admissionRest.countReligiousWardDeathFebruary();
	}

	@ModelAttribute("countReligiousWardDeathMarch")
	public String countReligiousWardDeathMarch() {
		return admissionRest.countReligiousWardDeathMarch();
	}

	@ModelAttribute("countReligiousWardDeathApril")
	public String countReligiousWardDeathApril() {
		return admissionRest.countReligiousWardDeathApril();
	}

	@ModelAttribute("countReligiousWardDeathMay")
	public String countReligiousWardDeathMay() {
		return admissionRest.countReligiousWardDeathMay();
	}

	@ModelAttribute("countReligiousWardDeathJune")
	public String countReligiousWardDeathJune() {
		return admissionRest.countReligiousWardDeathJune();
	}

	@ModelAttribute("countReligiousWardDeathJuly")
	public String countReligiousWardDeathJuly() {
		return admissionRest.countReligiousWardDeathJuly();
	}

	@ModelAttribute("countReligiousWardDeathAugust")
	public String countReligiousWardDeathAugust() {
		return admissionRest.countReligiousWardDeathAugust();
	}

	@ModelAttribute("countReligiousWardDeathSeptember")
	public String countReligiousWardDeathSeptember() {
		return admissionRest.countReligiousWardDeathSeptember();
	}

	@ModelAttribute("countReligiousWardDeathOctober")
	public String countReligiousWardDeathOctober() {
		return admissionRest.countReligiousWardDeathOctober();
	}

	@ModelAttribute("countReligiousWardDeathNovember")
	public String countReligiousWardDeathNovember() {
		return admissionRest.countReligiousWardDeathNovember();
	}

	@ModelAttribute("countReligiousWardDeathDecember")
	public String countReligiousWardDeathDecember() {
		return admissionRest.countReligiousWardDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countReligiousWardAdmissionToDate")
	public String countReligiousWardAdmissionToDate() {
		return admissionRest.countReligiousWardAdmissionToDate();

	}

	@ModelAttribute("countReligiousWardDischarge")
	public String countReligiousWardDischarge() {
		return admissionRest.countReligiousWardDischarge();

	}

	@ModelAttribute("countReligiousWardDeath")
	public String countReligiousWardDeath() {
		return admissionRest.countReligiousWardDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countReligiousWardTodayAdmission")
	public String countReligiousWardTodayAdmission() {
		return admissionRest.countReligiousWardTodayAdmission();

	}

	@ModelAttribute("countReligiousWardTodayDischarge")
	public String countReligiousWardTodayDischarge() {
		return admissionRest.countReligiousWardTodayDischarge();

	}

	@ModelAttribute("countReligiousWardTodayDeath")
	public String countReligiousWardTodayDeath() {
		return admissionRest.countReligiousWardTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countReligiousWardYesterdayAdmission")
	public String countReligiousWardYesterdayAdmission() {
		return admissionRest.countReligiousWardYesterdayAdmission();

	}

	@ModelAttribute("countReligiousWardYesterdayDischarge")
	public String countReligiousWardYesterdayDischarge() {
		return admissionRest.countReligiousWardYesterdayDischarge();

	}

	@ModelAttribute("countReligiousWardYesterdayDeath")
	public String countReligiousWardYesterdayDeath() {
		return admissionRest.countReligiousWardYesterdayDeath();

	}

	/* couuting ends */

	/* counting for general ward */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countGeneralWardAdmissionJanuary")
	public String countGeneralWardAdmissionJanuary() {
		return admissionRest.countGeneralWardAdmissionJanuary();
	}

	@ModelAttribute("countGeneralWardAdmissionFebruary")
	public String countGeneralWardAdmissionFebruary() {
		return admissionRest.countGeneralWardAdmissionFebruary();
	}

	@ModelAttribute("countGeneralWardAdmissionMarch")
	public String countGeneralWardAdmissionMarch() {
		return admissionRest.countGeneralWardAdmissionMarch();
	}

	@ModelAttribute("countGeneralWardAdmissionApril")
	public String countGeneralWardAdmissionApril() {
		return admissionRest.countGeneralWardAdmissionApril();
	}

	@ModelAttribute("countGeneralWardAdmissionMay")
	public String countGeneralWardAdmissionMay() {
		return admissionRest.countGeneralWardAdmissionMay();
	}

	@ModelAttribute("countGeneralWardAdmissionJune")
	public String countGeneralWardAdmissionJune() {
		return admissionRest.countGeneralWardAdmissionJune();
	}

	@ModelAttribute("countGeneralWardAdmissionJuly")
	public String countGeneralWardAdmissionJuly() {
		return admissionRest.countGeneralWardAdmissionJuly();
	}

	@ModelAttribute("countGeneralWardAdmissionAugust")
	public String countGeneralWardAdmissionAugust() {
		return admissionRest.countGeneralWardAdmissionAugust();
	}

	@ModelAttribute("countGeneralWardAdmissionSeptember")
	public String countGeneralWardAdmissionSeptember() {
		return admissionRest.countGeneralWardAdmissionSeptember();
	}

	@ModelAttribute("countGeneralWardAdmissionOctober")
	public String countGeneralWardAdmissionOctober() {
		return admissionRest.countGeneralWardAdmissionOctober();
	}

	@ModelAttribute("countGeneralWardAdmissionNovember")
	public String countGeneralWardAdmissionNovember() {
		return admissionRest.countGeneralWardAdmissionNovember();
	}

	@ModelAttribute("countGeneralWardAdmissionDecember")
	public String countGeneralWardAdmissionDecember() {
		return admissionRest.countGeneralWardAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countGeneralWardDischargeJanuary")
	public String countGeneralWardDischargeJanuary() {
		return admissionRest.countGeneralWardDischargeJanuary();
	}

	@ModelAttribute("countGeneralWardDischargeFebruary")
	public String countGeneralWardDischargeFebruary() {
		return admissionRest.countGeneralWardDischargeFebruary();
	}

	@ModelAttribute("countGeneralWardDischargeMarch")
	public String countGeneralWardDischargeMarch() {
		return admissionRest.countGeneralWardDischargeMarch();
	}

	@ModelAttribute("countGeneralWardDischargeApril")
	public String countGeneralWardDischargeApril() {
		return admissionRest.countGeneralWardDischargeApril();
	}

	@ModelAttribute("countGeneralWardDischargeMay")
	public String countGeneralWardDischargeMay() {
		return admissionRest.countGeneralWardDischargeMay();
	}

	@ModelAttribute("countGeneralWardDischargeJune")
	public String countGeneralWardDischargeJune() {
		return admissionRest.countGeneralWardDischargeJune();
	}

	@ModelAttribute("countGeneralWardDischargeJuly")
	public String countGeneralWardDischargeJuly() {
		return admissionRest.countGeneralWardDischargeJuly();
	}

	@ModelAttribute("countGeneralWardDischargeAugust")
	public String countGeneralWardDischargeAugust() {
		return admissionRest.countGeneralWardDischargeAugust();
	}

	@ModelAttribute("countGeneralWardDischargeSeptember")
	public String countGeneralWardDischargeSeptember() {
		return admissionRest.countGeneralWardDischargeSeptember();
	}

	@ModelAttribute("countGeneralWardDischargeOctober")
	public String countGeneralWardDischargeOctober() {
		return admissionRest.countGeneralWardDischargeOctober();
	}

	@ModelAttribute("countGeneralWardDischargeNovember")
	public String countGeneralWardDischargeNovember() {
		return admissionRest.countGeneralWardDischargeNovember();
	}

	@ModelAttribute("countGeneralWardDischargeDecember")
	public String countGeneralWardDischargeDecember() {
		return admissionRest.countGeneralWardDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countGeneralWardDeathJanuary")
	public String countGeneralWardDeathJanuary() {
		return admissionRest.countGeneralWardDeathJanuary();
	}

	@ModelAttribute("countGeneralWardDeathFebruary")
	public String countGeneralWardDeathFebruary() {
		return admissionRest.countGeneralWardDeathFebruary();
	}

	@ModelAttribute("countGeneralWardDeathMarch")
	public String countGeneralWardDeathMarch() {
		return admissionRest.countGeneralWardDeathMarch();
	}

	@ModelAttribute("countGeneralWardDeathApril")
	public String countGeneralWardDeathApril() {
		return admissionRest.countGeneralWardDeathApril();
	}

	@ModelAttribute("countGeneralWardDeathMay")
	public String countGeneralWardDeathMay() {
		return admissionRest.countGeneralWardDeathMay();
	}

	@ModelAttribute("countGeneralWardDeathJune")
	public String countGeneralWardDeathJune() {
		return admissionRest.countGeneralWardDeathJune();
	}

	@ModelAttribute("countGeneralWardDeathJuly")
	public String countGeneralWardDeathJuly() {
		return admissionRest.countGeneralWardDeathJuly();
	}

	@ModelAttribute("countGeneralWardDeathAugust")
	public String countGeneralWardDeathAugust() {
		return admissionRest.countGeneralWardDeathAugust();
	}

	@ModelAttribute("countGeneralWardDeathSeptember")
	public String countGeneralWardDeathSeptember() {
		return admissionRest.countGeneralWardDeathSeptember();
	}

	@ModelAttribute("countGeneralWardDeathOctober")
	public String countGeneralWardDeathOctober() {
		return admissionRest.countGeneralWardDeathOctober();
	}

	@ModelAttribute("countGeneralWardDeathNovember")
	public String countGeneralWardDeathNovember() {
		return admissionRest.countGeneralWardDeathNovember();
	}

	@ModelAttribute("countGeneralWardDeathDecember")
	public String countGeneralWardDeathDecember() {
		return admissionRest.countGeneralWardDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countGeneralWardAdmissionToDate")
	public String countGeneralWardAdmissionToDate() {
		return admissionRest.countGeneralWardAdmissionToDate();

	}

	@ModelAttribute("countGeneralWardDischarge")
	public String countGeneralWardDischarge() {
		return admissionRest.countGeneralWardDischarge();

	}

	@ModelAttribute("countGeneralWardDeath")
	public String countDGeneralWardeath() {
		return admissionRest.countGeneralWardDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countGeneralWardTodayAdmission")
	public String countGeneralWardTodayAdmission() {
		return admissionRest.countGeneralWardTodayAdmission();

	}

	@ModelAttribute("countGeneralWardTodayDischarge")
	public String countGeneralWardTodayDischarge() {
		return admissionRest.countGeneralWardTodayDischarge();

	}

	@ModelAttribute("countGeneralWardTodayDeath")
	public String countGeneralWardTodayDeath() {
		return admissionRest.countGeneralWardTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countGeneralWardYesterdayAdmission")
	public String countGeneralWardYesterdayAdmission() {
		return admissionRest.countGeneralWardYesterdayAdmission();

	}

	@ModelAttribute("countGeneralWardYesterdayDischarge")
	public String countGeneralWardYesterdayDischarge() {
		return admissionRest.countGeneralWardYesterdayDischarge();

	}

	@ModelAttribute("countGeneralWardYesterdayDeath")
	public String countGeneralWardYesterdayDeath() {
		return admissionRest.countGeneralWardYesterdayDeath();

	}

	/* couuting ends */

	/* counting Accident and Emergency ward */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countAccidentEmergencyAdmissionJanuary")
	public String countAccidentEmergencyAdmissionJanuary() {
		return admissionRest.countAccidentEmergencyAdmissionJanuary();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionFebruary")
	public String countAccidentEmergencyAdmissionFebruary() {
		return admissionRest.countAccidentEmergencyAdmissionFebruary();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionMarch")
	public String countAccidentEmergencyAdmissionMarch() {
		return admissionRest.countAccidentEmergencyAdmissionMarch();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionApril")
	public String countAccidentEmergencyAdmissionApril() {
		return admissionRest.countAccidentEmergencyAdmissionApril();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionMay")
	public String countAccidentEmergencyAdmissionMay() {
		return admissionRest.countAccidentEmergencyAdmissionMay();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionJune")
	public String countAccidentEmergencyAdmissionJune() {
		return admissionRest.countAccidentEmergencyAdmissionJune();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionJuly")
	public String countAccidentEmergencyAdmissionJuly() {
		return admissionRest.countAccidentEmergencyAdmissionJuly();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionAugust")
	public String countAccidentEmergencyAdmissionAugust() {
		return admissionRest.countAccidentEmergencyAdmissionAugust();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionSeptember")
	public String countAccidentEmergencyAdmissionSeptember() {
		return admissionRest.countAccidentEmergencyAdmissionSeptember();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionOctober")
	public String countAccidentEmergencyAdmissionOctober() {
		return admissionRest.countAccidentEmergencyAdmissionOctober();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionNovember")
	public String countAccidentEmergencyAdmissionNovember() {
		return admissionRest.countAccidentEmergencyAdmissionNovember();
	}

	@ModelAttribute("countAccidentEmergencyAdmissionDecember")
	public String countAccidentEmergencyAdmissionDecember() {
		return admissionRest.countAccidentEmergencyAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countAccidentEmergencyDischargeJanuary")
	public String countAccidentEmergencyDischargeJanuary() {
		return admissionRest.countAccidentEmergencyDischargeJanuary();
	}

	@ModelAttribute("countAccidentEmergencyDischargeFebruary")
	public String countAccidentEmergencyDischargeFebruary() {
		return admissionRest.countAccidentEmergencyDischargeFebruary();
	}

	@ModelAttribute("countAccidentEmergencyDischargeMarch")
	public String countAccidentEmergencyDischargeMarch() {
		return admissionRest.countAccidentEmergencyDischargeMarch();
	}

	@ModelAttribute("countAccidentEmergencyDischargeApril")
	public String countAccidentEmergencyDischargeApril() {
		return admissionRest.countAccidentEmergencyDischargeApril();
	}

	@ModelAttribute("countAccidentEmergencyDischargeMay")
	public String countAccidentEmergencyDischargeMay() {
		return admissionRest.countAccidentEmergencyDischargeMay();
	}

	@ModelAttribute("countAccidentEmergencyDischargeJune")
	public String countAccidentEmergencyDischargeJune() {
		return admissionRest.countAccidentEmergencyDischargeJune();
	}

	@ModelAttribute("countAccidentEmergencyDischargeJuly")
	public String countAccidentEmergencyDischargeJuly() {
		return admissionRest.countAccidentEmergencyDischargeJuly();
	}

	@ModelAttribute("countAccidentEmergencyDischargeAugust")
	public String countAccidentEmergencyDischargeAugust() {
		return admissionRest.countAccidentEmergencyDischargeAugust();
	}

	@ModelAttribute("countAccidentEmergencyDischargeSeptember")
	public String countAccidentEmergencyDischargeSeptember() {
		return admissionRest.countAccidentEmergencyDischargeSeptember();
	}

	@ModelAttribute("countAccidentEmergencyDischargeOctober")
	public String countAccidentEmergencyDischargeOctober() {
		return admissionRest.countAccidentEmergencyDischargeOctober();
	}

	@ModelAttribute("countAccidentEmergencyDischargeNovember")
	public String countAccidentEmergencyDischargeNovember() {
		return admissionRest.countAccidentEmergencyDischargeNovember();
	}

	@ModelAttribute("countAccidentEmergencyDischargeDecember")
	public String countAccidentEmergencyDischargeDecember() {
		return admissionRest.countAccidentEmergencyDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countAccidentEmergencyDeathJanuary")
	public String countAccidentEmergencyDeathJanuary() {
		return admissionRest.countAccidentEmergencyDeathJanuary();
	}

	@ModelAttribute("countAccidentEmergencyDeathFebruary")
	public String countAccidentEmergencyDeathFebruary() {
		return admissionRest.countAccidentEmergencyDeathFebruary();
	}

	@ModelAttribute("countAccidentEmergencyDeathMarch")
	public String countAccidentEmergencyDeathMarch() {
		return admissionRest.countAccidentEmergencyDeathMarch();
	}

	@ModelAttribute("countAccidentEmergencyDeathApril")
	public String countAccidentEmergencyDeathApril() {
		return admissionRest.countAccidentEmergencyDeathApril();
	}

	@ModelAttribute("countAccidentEmergencyDeathMay")
	public String countAccidentEmergencyDeathMay() {
		return admissionRest.countAccidentEmergencyDeathMay();
	}

	@ModelAttribute("countAccidentEmergencyDeathJune")
	public String countAccidentEmergencyDeathJune() {
		return admissionRest.countAccidentEmergencyDeathJune();
	}

	@ModelAttribute("countAccidentEmergencyDeathJuly")
	public String countAccidentEmergencyDeathJuly() {
		return admissionRest.countAccidentEmergencyDeathJuly();
	}

	@ModelAttribute("countAccidentEmergencyDeathAugust")
	public String countAccidentEmergencyDeathAugust() {
		return admissionRest.countAccidentEmergencyDeathAugust();
	}

	@ModelAttribute("countAccidentEmergencyDeathSeptember")
	public String countAccidentEmergencyDeathSeptember() {
		return admissionRest.countAccidentEmergencyDeathSeptember();
	}

	@ModelAttribute("countAccidentEmergencyDeathOctober")
	public String countAccidentEmergencyDeathOctober() {
		return admissionRest.countAccidentEmergencyDeathOctober();
	}

	@ModelAttribute("countAccidentEmergencyDeathNovember")
	public String countAccidentEmergencyDeathNovember() {
		return admissionRest.countAccidentEmergencyDeathNovember();
	}

	@ModelAttribute("countAccidentEmergencyDeathDecember")
	public String countAccidentEmergencyDeathDecember() {
		return admissionRest.countAccidentEmergencyDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countAccidentEmergencyAdmissionToDate")
	public String countAccidentEmergencyAdmissionToDate() {
		return admissionRest.countAccidentEmergencyAdmissionToDate();

	}

	@ModelAttribute("countAccidentEmergencyDischarge")
	public String countAccidentEmergencyDischarge() {
		return admissionRest.countAccidentEmergencyDischarge();

	}

	@ModelAttribute("countAccidentEmergencyDeath")
	public String countAccidentEmergencyDeath() {
		return admissionRest.countAccidentEmergencyDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countAccidentEmergencyTodayAdmission")
	public String countAccidentEmergencyTodayAdmission() {
		return admissionRest.countTodayAdmission();

	}

	@ModelAttribute("countAccidentEmergencyTodayDischarge")
	public String countAccidentEmergencyTodayDischarge() {
		return admissionRest.countAccidentEmergencyTodayDischarge();

	}

	@ModelAttribute("countAccidentEmergencyTodayDeath")
	public String countAccidentEmergencyTodayDeath() {
		return admissionRest.countAccidentEmergencyTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countAccidentEmergencyYesterdayAdmission")
	public String countAccidentEmergencyYesterdayAdmission() {
		return admissionRest.countAccidentEmergencyYesterdayAdmission();

	}

	@ModelAttribute("countAccidentEmergencyYesterdayDischarge")
	public String countAccidentEmergencyYesterdayDischarge() {
		return admissionRest.countAccidentEmergencyYesterdayDischarge();

	}

	@ModelAttribute("countAccidentEmergencyYesterdayDeath")
	public String countAccidentEmergencyYesterdayDeath() {
		return admissionRest.countAccidentEmergencyYesterdayDeath();

	}

	/* couuting ends */

	/* counting opd admission and dishcarge */

	/*
	 * >>>>>>>>>>>>>>>======Counting admission fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countOpdAdmissionJanuary")
	public String countOpdAdmissionJanuary() {
		return admissionRest.countOpdAdmissionJanuary();
	}

	@ModelAttribute("countOpdAdmissionFebruary")
	public String countOpdAdmissionFebruary() {
		return admissionRest.countOpdAdmissionFebruary();
	}

	@ModelAttribute("countOpdAdmissionMarch")
	public String countOpdAdmissionMarch() {
		return admissionRest.countOpdAdmissionMarch();
	}

	@ModelAttribute("countOpdAdmissionApril")
	public String countOpdAdmissionApril() {
		return admissionRest.countOpdAdmissionApril();
	}

	@ModelAttribute("countOpdAdmissionMay")
	public String countOpdAdmissionMay() {
		return admissionRest.countOpdAdmissionMay();
	}

	@ModelAttribute("countOpdAdmissionJune")
	public String countOpdAdmissionJune() {
		return admissionRest.countOpdAdmissionJune();
	}

	@ModelAttribute("countOpdAdmissionJuly")
	public String countOpdAdmissionJuly() {
		return admissionRest.countOpdAdmissionJuly();
	}

	@ModelAttribute("countOpdAdmissionAugust")
	public String countOpdAdmissionAugust() {
		return admissionRest.countOpdAdmissionAugust();
	}

	@ModelAttribute("countOpdAdmissionSeptember")
	public String countOpdAdmissionSeptember() {
		return admissionRest.countOpdAdmissionSeptember();
	}

	@ModelAttribute("countOpdAdmissionOctober")
	public String countOpdAdmissionOctober() {
		return admissionRest.countOpdAdmissionOctober();
	}

	@ModelAttribute("countOpdAdmissionNovember")
	public String countOpdAdmissionNovember() {
		return admissionRest.countOpdAdmissionNovember();
	}

	@ModelAttribute("countOpdAdmissionDecember")
	public String countOpdAdmissionDecember() {
		return admissionRest.countOpdAdmissionDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Discharge fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countOpdDischargeJanuary")
	public String countOpdDischargeJanuary() {
		return admissionRest.countOpdDischargeJanuary();
	}

	@ModelAttribute("countOpdDischargeFebruary")
	public String countOpdDischargeFebruary() {
		return admissionRest.countOpdDischargeFebruary();
	}

	@ModelAttribute("countOpdDischargeMarch")
	public String countOpdDischargeMarch() {
		return admissionRest.countOpdDischargeMarch();
	}

	@ModelAttribute("countOpdDischargeApril")
	public String countOpdDischargeApril() {
		return admissionRest.countOpdDischargeApril();
	}

	@ModelAttribute("countOpdDischargeMay")
	public String countOpdDischargeMay() {
		return admissionRest.countOpdDischargeMay();
	}

	@ModelAttribute("countOpdDischargeJune")
	public String countOpdDischargeJune() {
		return admissionRest.countOpdDischargeJune();
	}

	@ModelAttribute("countOpdDischargeJuly")
	public String countOpdDischargeJuly() {
		return admissionRest.countOpdDischargeJuly();
	}

	@ModelAttribute("countOpdDischargeAugust")
	public String countOpdDischargeAugust() {
		return admissionRest.countOpdDischargeAugust();
	}

	@ModelAttribute("countOpdDischargeSeptember")
	public String countOpdDischargeSeptember() {
		return admissionRest.countOpdDischargeSeptember();
	}

	@ModelAttribute("countOpdDischargeOctober")
	public String countOpdDischargeOctober() {
		return admissionRest.countOpdDischargeOctober();
	}

	@ModelAttribute("countOpdDischargeNovember")
	public String countOpdDischargeNovember() {
		return admissionRest.countOpdDischargeNovember();
	}

	@ModelAttribute("countOpdDischargeDecember")
	public String countOpdDischargeDecember() {
		return admissionRest.countOpdDischargeDecember();
	}

	/*
	 * >>>>>>>>>>>>>>>======Counting Death fom january to
	 * december=====<<<<<<<<<<<<<<<<<
	 */

	@ModelAttribute("countOpdDeathJanuary")
	public String countOpdDeathJanuary() {
		return admissionRest.countOpdDeathJanuary();
	}

	@ModelAttribute("countOpdDeathFebruary")
	public String countOpdDeathFebruary() {
		return admissionRest.countOpdDeathFebruary();
	}

	@ModelAttribute("countOpdDeathMarch")
	public String countOpdDeathMarch() {
		return admissionRest.countOpdDeathMarch();
	}

	@ModelAttribute("countOpdDeathApril")
	public String countOpdDeathApril() {
		return admissionRest.countOpdDeathApril();
	}

	@ModelAttribute("countOpdDeathMay")
	public String countOpdDeathMay() {
		return admissionRest.countOpdDeathMay();
	}

	@ModelAttribute("countOpdDeathJune")
	public String countOpdDeathJune() {
		return admissionRest.countOpdDeathJune();
	}

	@ModelAttribute("countOpdDeathJuly")
	public String countOpdDeathJuly() {
		return admissionRest.countOpdDeathJuly();
	}

	@ModelAttribute("countOpdDeathAugust")
	public String countOpdDeathAugust() {
		return admissionRest.countOpdDeathAugust();
	}

	@ModelAttribute("countOpdDeathSeptember")
	public String countOpdDeathSeptember() {
		return admissionRest.countOpdDeathSeptember();
	}

	@ModelAttribute("countOpdDeathOctober")
	public String countOpdDeathOctober() {
		return admissionRest.countOpdDeathOctober();
	}

	@ModelAttribute("countOpdDeathNovember")
	public String countOpdDeathNovember() {
		return admissionRest.countOpdDeathNovember();
	}

	@ModelAttribute("countOpdDeathDecember")
	public String countOpdDeathDecember() {
		return admissionRest.countOpdDeathDecember();
	}

	/* counting admission and discharge to date */

	@ModelAttribute("countOpdAdmissionToDate")
	public String countOpdAdmissionToDate() {
		return admissionRest.countOpdAdmissionToDate();

	}

	@ModelAttribute("countOpdDischarge")
	public String countOpdDischarge() {
		return admissionRest.countOpdDischarge();

	}

	@ModelAttribute("countOpdDeath")
	public String countOpdDeath() {
		return admissionRest.countOpdDeath();

	}

	/* counting admission and discharge for today */

	@ModelAttribute("countOpdTodayAdmission")
	public String countOpdTodayAdmission() {
		return admissionRest.countOpdTodayAdmission();

	}

	@ModelAttribute("countOpdTodayDischarge")
	public String countOpdTodayDischarge() {
		return admissionRest.countOpdTodayDischarge();

	}

	@ModelAttribute("countOpdTodayDeath")
	public String countOpdTodayDeath() {
		return admissionRest.countOpdTodayDeath();

	}

	/* counting admission and discharge for yesterday */

	@ModelAttribute("countOpdYesterdayAdmission")
	public String countOpdYesterdayAdmission() {
		return admissionRest.countOpdYesterdayAdmission();

	}

	@ModelAttribute("countOpdYesterdayDischarge")
	public String countOpdYesterdayDischarge() {
		return admissionRest.countOpdYesterdayDischarge();

	}

	@ModelAttribute("countOpdYesterdayDeath")
	public String countOpdYesterdayDeath() {
		return admissionRest.countOpdYesterdayDeath();

	}

	/* couuting ends */

	@ModelAttribute("countTotalNumberOfBabies")
	public String countTotalNumberOfBabie() {
		return newbornRest.countTotalNumberOfBabies();

	}

	/* Counting Newborn from january to december */

	@ModelAttribute("/countNewbornJanuary")
	public String countNewbornJanuary() {
		return newbornRest.countNewbornJanuary();
	}

	@ModelAttribute("countNewbornFebruary")
	public String countNewbornFebruary() {
		return newbornRest.countNewbornFebruary();
	}

	@ModelAttribute("countNewbornMarch")
	public String countNewbornMarch() {
		return newbornRest.countNewbornMarch();
	}

	@ModelAttribute("countNewbornApril")
	public String countNewbornApril() {
		return newbornRest.countNewbornApril();
	}

	@ModelAttribute("countNewbornMay")
	public String countNewbornMay() {
		return newbornRest.countNewbornMay();
	}

	@ModelAttribute("countNewbornJune")
	public String countNewbornJune() {
		return newbornRest.countNewbornJune();
	}

	@ModelAttribute("countNewbornJuly")
	public String countNewbornJuly() {
		return newbornRest.countNewbornJuly();
	}

	@ModelAttribute("countNewbornAugust")
	public String countNewbornAugust() {
		return newbornRest.countNewbornAugust();
	}

	@ModelAttribute("countNewbornSeptember")
	public String countNewbornSeptember() {
		return newbornRest.countNewbornSeptember();
	}

	@ModelAttribute("countNewbornOctober")
	public String countNewbornOctober() {
		return newbornRest.countNewbornOctober();
	}

	@ModelAttribute("countNewbornNovember")
	public String countNewbornNovember() {
		return newbornRest.countNewbornNovember();
	}

	@ModelAttribute("countNewbornDecember")
	public String countNewbornDecember() {
		return newbornRest.countNewbornDecember();
	}

	
	
	/* Count type of delivery */
	@ModelAttribute("countSpontaneousDelivery")
	public String countSpontaneousDelivery() {
		return deliveryRest.countSpontaneousVaginalDelivery();
		
		
	}
	
	@ModelAttribute("countCs")
	public String  countCs() {
		return deliveryRest.countCs();
		
	}
	
	@ModelAttribute("countSVDWithEpis")
	public String countSVDWithEpis() {
		return deliveryRest.countSVDWithEpis();
		
	}
	@ModelAttribute("countVacuumExtraction")
	public String countVacuumExtraction() {
		return deliveryRest.countVacuumExtraction();
	}
	
	@ModelAttribute("countSVDAugument")
	public String countSVDAugument() {
		return deliveryRest.SVDAugument();
	}
	
	@ModelAttribute("contSVDInduce")
	public String countSVDInduce() {
		return deliveryRest.countSVDInduce();
	}
	
	@ModelAttribute("countDelivery")
	public String countDelivery() {
		return deliveryRest.countDelivery();
	}
	
	
	/* Counting delivery from january to december */
	
	@ModelAttribute("countDeliveryJanuary")
	public String countDeliveryJanuary() {
		return deliveryRest.countDeliveryJanuary();
	}
	
	
	
	@ModelAttribute("countDeliveryFebruary")
	public String countDeliveryFebruary() {
		return deliveryRest.countDeliveryFebruary();
	}
	
	
	@ModelAttribute("countDeliveryMarch")
	public String countDeliveryMarch() {
		return deliveryRest.countDeliveryMarch();
	}
	
	
	@ModelAttribute("countDeliveryApril")
	public String countDeliveryApril() {
		return deliveryRest.countDeliveryApril();
	}
	
	
	@ModelAttribute("countDeliveryMay")
	public String countDeliveryMay() {
		return deliveryRest.countDeliveryMay();
	}
	
	
	@ModelAttribute("countDeliveryJune")
	public String countDeliveryJune() {
		return deliveryRest.countDeliveryJune();
	}
	
	
	@ModelAttribute("countDeliveryJuly")
	public String countDeliveryJuly() {
		return deliveryRest.countDeliveryJuly();
	}
	
	
	@ModelAttribute("countDeliveryAugust")
	public String countDeliveryAugust() {
		return deliveryRest.countDeliveryAugust();
	}
	
	
	@ModelAttribute("countDeliverySeptember")
	public String countDeliverySeptember() {
		return deliveryRest.countDeliverySeptember();
	}
	
	
	@ModelAttribute("countDeliveryOctober")
	public String countDeliveryOctober() {
		return deliveryRest.countDeliveryOctober();
	}
	
	
	@ModelAttribute("countDeliveryNovember")
	public String countDeliveryNovember() {
		return deliveryRest.countDeliveryNovember();
	}
	
	
	@ModelAttribute("countDeliveryDecember")
	public String countDeliveryDecember() {
		return deliveryRest.countDeliveryDecember();
	}
	
	
	@RequestMapping(value ="/displayAllEvents", method = RequestMethod.GET)
	public String displayEvents(Events events, ModelMap model) {
		Events[] eventsD = eventsRest.getAllEvents(events);
		model.addAttribute("eventsD", eventsD);

		return "eventsTable";
	}
	
	/*
	 * >>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<
	 * <<<<<<<<
	 */
/* Counting Newborn death from january to december */
	
	@ModelAttribute("countNewbornDeathJanuary")
	public String countNewbornDeathJanuary() {
		return newbornRest.countNewbornDeathJanuary();
	}
	
	
	
	@ModelAttribute("countNewbornDeathFebruary")
	public String countNewbornDeathFebruary() {
		return newbornRest.countNewbornDeathFebruary();
	}
	
	
	@ModelAttribute("countNewbornDeathMarch")
	public String countNewbornDeathMarch() {
		return newbornRest.countNewbornDeathMarch();
	}
	
	
	@ModelAttribute("countNewbornDeathApril")
	public String countNewbornDeathApril() {
		return newbornRest.countNewbornDeathApril();
	}
	
	
	@ModelAttribute("countNewbornDeathMay")
	public String countNewbornDeathMay() {
		return newbornRest.countNewbornDeathMay();
	}
	
	
	@ModelAttribute("countNewbornDeathJune")
	public String countNewbornDeathJune() {
		return newbornRest.countNewbornDeathJune();
	}
	
	
	@ModelAttribute("countNewbornDeathJuly")
	public String countNewbornDeathJuly() {
		return newbornRest.countNewbornDeathJuly();
	}
	
	
	@ModelAttribute("countNewbornDeathAugust")
	public String countNewbornDeathAugust() {
		return newbornRest.countNewbornDeathAugust();
	}
	
	
	@ModelAttribute("countNewbornDeathSeptember")
	public String countNewbornDeathSeptember() {
		return newbornRest.countNewbornDeathSeptember();
	}
	
	
	@ModelAttribute("countNewbornDeathOctober")
	public String countNewbornDeathOctober() {
		return newbornRest.countNewbornDeathOctober();
	}
	
	
	@ModelAttribute("countNewbornDeathNovember")
	public String countNewbornDeathNovember() {
		return newbornRest.countNewbornDeathNovember();
	}
	
	
	@ModelAttribute("countNewbornDeathDecember")
	public String countNewbornDeathDecember() {
		return newbornRest.countNewbornDeathDecember();
	}
	
	
	 //@RequestMapping("/eventTry")
	  @ModelAttribute("eventsT") 
	  public List<Events> eventTry(ModelMap model) throws  SQLException {
	  
	  List<Events> events = new ArrayList<>();
	  
	  Connection conn =
	  DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root",
	  "Physics1//,"); PreparedStatement ps = conn.prepareStatement(
	  "select event_id, event_name, venue, event_date, participant from events order by event_date desc limit 3 ");
	  
	  
	  ResultSet rs = ps.executeQuery();
	  
	  while (rs.next()) { Events event = new Events();
	  event.setEvent_id(rs.getLong(1)); event.setEvent_name(rs.getString(2));
	  event.setVenue(rs.getString(3)); event.setEvent_date(rs.getDate(4));
	  event.setParticipant(rs.getString(5));
	  
	  events.add(event);
	  
	  //model.addAttribute("eventsT", events);
	  
	  }
	  
	  return events;
	  
	  }

}
