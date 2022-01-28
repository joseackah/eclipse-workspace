package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Newborn_tableRestClient;
import org.nurses.management.system.integration.dto.Newborn_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/newbornFront")
public class NewbornController {

	@Autowired
	Newborn_tableRestClient newbornRest;

	/*
	 * @Autowired WardRestClient wardRest;
	 */
	@RequestMapping("/form")
	public String leaveForm(ModelMap model) {

		return "newbornForm";

	}

	@RequestMapping("/newbornProfile")
	public String accountsDetails(ModelMap model) {

		return "profilesTry";

	}

	@RequestMapping("/nurseNewborn")
	public String nurseProfile(ModelMap model) {

		return "staffProfile";

	}

	@RequestMapping("/newborn")
	public String accounts(ModelMap model) {

		return "addAccounts";

	}

	@RequestMapping("/updateNewborn_table")
	public String updateNewborn_table(@RequestParam("id") Integer id, ModelMap model) {

		Newborn_table admission = newbornRest.findNewborn_table(id);
		model.addAttribute("newborn", admission);
		return "redirect:/admissionFront/displayAllAdmission_Discharge";
	}

	@RequestMapping(value = "updateNewborn_table1/{id}", method = RequestMethod.GET)
	public String searchNewborn_table1(@PathVariable("id") Integer id, ModelMap model) {
		Newborn_table newborn = newbornRest.findNewborn_table(id);
		model.addAttribute("newborn", newborn);
		return "newbornUpdateForm";

	}

	@RequestMapping(value = "inchargeNewborn_table", method = RequestMethod.GET)
	public String searchLNewborn_table(@RequestParam("id") Integer id, ModelMap model) {
		Newborn_table admission = newbornRest.findNewborn_table(id);
		model.addAttribute("newborn", admission);
		return "leaveUpdateIncharge";
	}

	@RequestMapping("updateNewborn")
	public String updateNewborn_table(Newborn_table newborn) {
		newbornRest.updateNewborn_table(newborn);
		return "redirect:/newbornFront/displayAllNewborn_table";
	}

	@RequestMapping("updateIncharge")
	public String updateInchargeNewborn_table(Newborn_table newborn) {
		newbornRest.updateNewborn_table(newborn);
		return "redirect:/admissionFront/displayAllNewborn_table";
	}

	@RequestMapping("/saveNewborn_table")
	public String saveAdmission_Discharge(Newborn_table newborn) {
		newbornRest.saveNewborn_table(newborn);

		return "redirect:/generalFront/maternity";

	}

	@RequestMapping("/deleteNewborn_table/{id}")
	public String deleteNewborn_table(@PathVariable("id") Integer id) {
		newbornRest.deleteNewborn_table(id);

		return "redirect:/admissionFront/displayAllNewborn_table";
	}

	@RequestMapping(value = "/displayAllNewborn_table", method = RequestMethod.GET)
	public String displayNewborn_table(Newborn_table newbornD, ModelMap model) {
		Newborn_table[] newborn = newbornRest.getAllNewborn_table(newbornD);
		model.addAttribute("newborn", newborn);

		return "newbornTable";

	}

	@RequestMapping(value = "/displayAllNewborn_tableManager", method = RequestMethod.GET)
	public String displayAdmission_DischargeManager(Newborn_table newbornD, ModelMap model) {
		Newborn_table[] newborn = newbornRest.getAllNewborn_table(newbornD);
		model.addAttribute("newborn", newborn);

		return "admissionManagerTable";

	}

	@RequestMapping(value = "/displayNewborn_table", method = RequestMethod.GET)
	public String inchargeNewborn_table(Newborn_table newbornD, ModelMap model) {
		Newborn_table[] newborn = newbornRest.getAllNewborn_table(newbornD);
		model.addAttribute("newborn", newborn);

		return "newbornTableIncharge";

	}

	@RequestMapping(value = "/displayNewborn_tableOnly", method = RequestMethod.GET)
	public String admissionOnly(Newborn_table newborn, ModelMap model) {
		Newborn_table[] newbornOnly = newbornRest.getAllNewborn_table(newborn);
		model.addAttribute("newbornOnly", newbornOnly);

		return "newbornOnlyTable";
	}

	@RequestMapping(value = "/displayNewborn_tableManager", method = RequestMethod.GET)
	public String newbornOnlyManager(Newborn_table newborn, ModelMap model) {
		Newborn_table[] newbornOnly = newbornRest.getAllNewborn_table(newborn);
		model.addAttribute("newbornOnly", newbornOnly);

		return "newbornOnlyManagerTable";
	}

	

	@RequestMapping(value = "searchNewborn_table/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Newborn_table newborn = newbornRest.findNewborn_table(id);
		model.addAttribute("newborn", newborn);
		return "";
	}

	@RequestMapping(value = "/accNewborn_table/{id}", method = RequestMethod.GET)
	public String searchnewborn(@PathVariable("id") Integer id, @PathVariable("id") Integer ids,
			ModelMap model) {
		// Leave[] accounts = nurseRest.getAllLeave(id);
		// model.addAttribute("accounts", accounts);

		Newborn_table newbornId = newbornRest.findNewborn_table(ids);
		model.addAttribute("newbornId", newbornId);
		return "";
	}

	@RequestMapping(value = "/retrieveNewborn_table{Id}", method = RequestMethod.GET)
	public String retriveId(@PathVariable("Id") Integer id, ModelMap model) {

		// Students[] students = studentsRestClient.getAllStudents(student);
		Newborn_table newbornids = newbornRest.findNewborn_table(id);
		model.addAttribute("newbornids", newbornids);

		return null; // "search";
	}

	@RequestMapping("/updateNewborn_table2/{Id}")
	public String searchh(@RequestParam("Id") Integer id, ModelMap model) {
		Newborn_table newborn = newbornRest.findNewborn_table(id);
		model.addAttribute("newborn", newborn);
		return "";
	}

	
	
	@ModelAttribute("countTotalNumberOfBabies")
	public String countTotalNumberOfBabie() {
		return newbornRest.countTotalNumberOfBabies();
		
	}
	
/* Counting Newborn from january to december */
	
	@ModelAttribute("countNewbornJanuary")
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

	

	/*
	 * >>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<
	 * <<<<<<<<
	 */
	

	/*
	 * >>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<
	 * <<<<<<<<
	 */

}
