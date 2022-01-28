package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Delivery_table;
import org.nurses.management.system.repos.Delivery_tableRepository;
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
@RequestMapping("/delivery")
public class Delivery_tableController {

	@Autowired
	Delivery_tableRepository deliveryRepos;

	@PostMapping("/saveDelivery")
	public Delivery_table saveDelivery(@RequestBody Delivery_table delivery) {

		return deliveryRepos.save(delivery);
	}

	@PutMapping("/updateDelivery")
	public Delivery_table updateDelivery(@RequestBody Delivery_table delivery) {

		return deliveryRepos.save(delivery);
	}

	@DeleteMapping("/deleteDelivery/{id}")
	public void deleteDelivery(@PathVariable("id") int id) {
		deliveryRepos.deleteById(id);
	}

	@GetMapping("/getAllDelivery")
	public List<Delivery_table> getAllDelivery() {

		return deliveryRepos.findAll();
	}

	@GetMapping("/findDeliveryById/{id}")
	public Optional<Delivery_table> findDeliveryById(@PathVariable("id") int id) {

		return deliveryRepos.findById(id);

	}
	
	@GetMapping("countSpontaneousDelivery")
	public String countSpontaneousDelivery() {
		return deliveryRepos.countSpontaneousVaginalDelivery();
		
		
	}
	
	@GetMapping("countCs")
	public String  countCs() {
		return deliveryRepos.countCs();
		
	}
	
	@GetMapping("countSVDWithEpis")
	public String countSVDWithEpis() {
		return deliveryRepos.countSVDWithEpis();
		
	}
	@GetMapping("countVacuumExtraction")
	public String countVacuumExtraction() {
		return deliveryRepos.countVacuumExtraction();
	}
	
	@GetMapping("countSVDAugument")
	public String countSVDAugument() {
		return deliveryRepos.SVDAugument();
	}
	
	@GetMapping("countSVDInduce")
	public String countSVDInduce() {
		return deliveryRepos.countSVDInduce();
	}
	
	@GetMapping("countDelivery")
	public String countDelivery() {
		return deliveryRepos.countDelivery();
	}
	
	
	/* Counting delivery from january to december */
	
	@GetMapping("countDeliveryJanuary")
	public String countDeliveryJanuary() {
		return deliveryRepos.countDeliveryJanuary();
	}
	
	
	
	@GetMapping("countDeliveryFebruary")
	public String countDeliveryFebruary() {
		return deliveryRepos.countDeliveryFebruary();
	}
	
	
	@GetMapping("countDeliveryMarch")
	public String countDeliveryMarch() {
		return deliveryRepos.countDeliveryMarch();
	}
	
	
	@GetMapping("countDeliveryApril")
	public String countDeliveryApril() {
		return deliveryRepos.countDeliveryApril();
	}
	
	
	@GetMapping("countDeliveryMay")
	public String countDeliveryMay() {
		return deliveryRepos.countDeliveryMay();
	}
	
	
	@GetMapping("countDeliveryJune")
	public String countDeliveryJune() {
		return deliveryRepos.countDeliveryJune();
	}
	
	
	@GetMapping("countDeliveryJuly")
	public String countDeliveryJuly() {
		return deliveryRepos.countDeliveryJuly();
	}
	
	
	@GetMapping("countDeliveryAugust")
	public String countDeliveryAugust() {
		return deliveryRepos.countDeliveryAugust();
	}
	
	
	@GetMapping("countDeliverySeptember")
	public String countDeliverySeptember() {
		return deliveryRepos.countDeliverySeptember();
	}
	
	
	@GetMapping("countDeliveryOctober")
	public String countDeliveryOctober() {
		return deliveryRepos.countDeliveryOctober();
	}
	
	
	@GetMapping("countDeliveryNovember")
	public String countDeliveryNovember() {
		return deliveryRepos.countDeliveryNovember();
	}
	
	
	@GetMapping("countDeliveryDecember")
	public String countDeliveryDecember() {
		return deliveryRepos.countDeliveryDecember();
	}
}
