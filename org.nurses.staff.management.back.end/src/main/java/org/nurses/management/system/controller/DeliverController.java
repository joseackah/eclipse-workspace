package org.nurses.management.system.controller;

import org.nurses.management.system.integration.Delivery_tableRestClient;
import org.nurses.management.system.integration.Newborn_tableRestClient;
import org.nurses.management.system.integration.dto.Delivery_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/deliveryFront")
public class DeliverController {

	@Autowired
	Delivery_tableRestClient deliveryRest;
	
	@Autowired
	Newborn_tableRestClient newbornRest;

	/*
	 * @Autowired WardRestClient wardRest;
	 */
	@RequestMapping("/form")
	public String deliveryForm(ModelMap model) {

		return "deliveryForm";

	}

	@RequestMapping("/deliveryProfile")
	public String accountsDetails(ModelMap model) {

		return "profilesTry";

	}

	@RequestMapping("/nursedelivery")
	public String nurseProfile(ModelMap model) {

		return "staffProfile";

	}

	@RequestMapping("/delivery")
	public String accounts(ModelMap model) {

		return "addAccounts";

	}

	@RequestMapping("/updateDelivery_table")
	public String updateDelivery_table(@RequestParam("id") Integer id, ModelMap model) {

		Delivery_table delivery = deliveryRest.findDelivery_table(id);
		model.addAttribute("delivery", delivery);
		return "redirect:/deliveryFront/displayAllAdmission_Discharge";
	}

	@RequestMapping(value = "updateDelivery_table1/{id}", method = RequestMethod.GET)
	public String searchDelivery_table1(@PathVariable("id") Integer id, ModelMap model) {
		Delivery_table delivery = deliveryRest.findDelivery_table(id);
		model.addAttribute("delivery", delivery);
		return "deliveryFormUpdate";

	}

	@RequestMapping(value = "inchargeDelivery_table", method = RequestMethod.GET)
	public String searchLDelivery_table(@RequestParam("id") Integer id, ModelMap model) {
		Delivery_table delivery = deliveryRest.findDelivery_table(id);
		model.addAttribute("delivery", delivery);
		return "deliveryUpdateIncharge";
	}

	@RequestMapping("updateDelivery_tableDischarge")
	public String updateDelivery_table(Delivery_table delivery) {
		deliveryRest.updateDelivery_table(delivery);
		return "redirect:/deliveryFront/displayAllDelivery_table";
	}

	@RequestMapping("updateIncharge")
	public String updateInchargeDelivery_table(Delivery_table delivery) {
		deliveryRest.updateDelivery_table(delivery);
		return "redirect:/deliveryFront/displayAllDelivery_table";
	}

	@RequestMapping("/saveDelivery_table")
	public String saveDelivery_table(Delivery_table delivery) {
		deliveryRest.saveDelivery_table(delivery);

		return "redirect:/deliveryFront/displayAllDelivery_table";

	}

	@RequestMapping("/deleteDelivery_table/{id}")
	public String deleteDelivery_table(@PathVariable("id") Integer id) {
		deliveryRest.deleteDelivery_table(id);

		return "redirect:/deliveryFront/displayAllDelivery_table";
	}

	@RequestMapping(value = "/displayAllDelivery_table", method = RequestMethod.GET)
	public String displayDelivery_table(Delivery_table deliveryD, ModelMap model) {
		Delivery_table[] delivery = deliveryRest.getAllDelivery_table(deliveryD);
		model.addAttribute("delivery", delivery);

		return "deliveryTable";

	}

	@RequestMapping(value = "/displayAllDelivery_tableManager", method = RequestMethod.GET)
	public String displayDelivery_tableManager(Delivery_table deliveryD, ModelMap model) {
		Delivery_table[] delivery = deliveryRest.getAllDelivery_table(deliveryD);
		model.addAttribute("delivery", delivery);

		return "deliveryManagerTable";

	}

	@RequestMapping(value = "/displayDelivery_table", method = RequestMethod.GET)
	public String inchargeDelivery_table(Delivery_table deliveryD, ModelMap model) {
		Delivery_table[] delivery = deliveryRest.getAllDelivery_table(deliveryD);
		model.addAttribute("delivery", delivery);

		return "deliveryTableIncharge";

	}

	
	/*>>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<<<<<<<<<*/

	@RequestMapping(value = "searchDelivery_table/{id}", method = RequestMethod.POST)
	public String searchLeave(@PathVariable("id") Integer id, ModelMap model) {
		Delivery_table delivery = deliveryRest.findDelivery_table(id);
		model.addAttribute("delivery", delivery);
		return "";
	}

	@RequestMapping(value = "/accDelivery_table/{id}", method = RequestMethod.GET)
	public String searchAdmission_Discharge(@PathVariable("id") Integer id, @PathVariable("id") Integer ids,
			ModelMap model) {
		Delivery_table deliveryId = deliveryRest.findDelivery_table(ids);
		model.addAttribute("deliveryId", deliveryId);
		return "";
	}

	@RequestMapping(value = "/retrieveDelivery_table{Id}", method = RequestMethod.GET)
	public String retriveId(@PathVariable("Id") Integer id, ModelMap model) {

		// Students[] students = studentsRestClient.getAllStudents(student);
		Delivery_table deliveryids = deliveryRest.findDelivery_table(id);
		model.addAttribute("deliveryids", deliveryids);

		return null; // "search";
	}

	@RequestMapping("/updateDelivery_table2/{Id}")
	public String searchh(@RequestParam("Id") Integer id, ModelMap model) {
		Delivery_table delivery = deliveryRest.findDelivery_table(id);
		model.addAttribute("delivery", delivery);
		return "";
	}

	

	/*
	 * >>>>>>>>>>>>>>>>>>=========================================<<<<<<<<<<<<<<<<<<
	 * <<<<<<<<
	 */
	
	
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
	
	@ModelAttribute("countSVDInduce")
	public String countSVDInduce() {
		return deliveryRest.countSVDInduce();
	}
	
	@ModelAttribute("countDelivery")
	public String countDelivery() {
		return deliveryRest.countDelivery();
	}
	
	
	/* Counting delivery from january to december */
	
	@ModelAttribute("/countDeliveryJanuary")
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


}
