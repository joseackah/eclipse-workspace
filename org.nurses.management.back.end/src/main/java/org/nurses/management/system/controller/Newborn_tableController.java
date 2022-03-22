package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Newborn_table;
import org.nurses.management.system.repos.Newborn_tableRepository;
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
@RequestMapping("/newborn")
public class Newborn_tableController {

	@Autowired
	Newborn_tableRepository newbornRepos;

	@PostMapping("/saveNewborn")
	public Newborn_table saveNewborn(@RequestBody Newborn_table newborn) {

		return newbornRepos.save(newborn);
	}

	@PutMapping("/updateNewborn")
	public Newborn_table updateNewborn(@RequestBody Newborn_table newborn) {

		return newbornRepos.save(newborn);
	}

	@DeleteMapping("/deleteNewborn/{id}")
	public void deleteNewborn(@PathVariable("id") int id) {
		newbornRepos.deleteById(id);
	}

	@GetMapping("/getAllNewborn")
	public List<Newborn_table> getAllNewborn() {

		return newbornRepos.findAll();
	}

	@GetMapping("/findNewbornById/{id}")
	public Optional<Newborn_table> findNewbornById(@PathVariable("id") int id) {

		return newbornRepos.findById(id);

	}

	
	@GetMapping("countTotalNumberOfBabies")
	public String countTotalNumberOfBabies() {
		return newbornRepos.countTotalNumberOfBabies();
		
	}
	
/* Counting Newborn from january to december */
	
	@GetMapping("/countNewbornJanuary")
	public String countNewbornJanuary() {
		return newbornRepos.countNewbornJanuary();
	}
	
	
	
	@GetMapping("countNewbornFebruary")
	public String countNewbornFebruary() {
		return newbornRepos.countNewbornFebruary();
	}
	
	
	@GetMapping("countNewbornMarch")
	public String countNewbornMarch() {
		return newbornRepos.countNewbornMarch();
	}
	
	
	@GetMapping("countNewbornApril")
	public String countNewbornApril() {
		return newbornRepos.countNewbornApril();
	}
	
	
	@GetMapping("countNewbornMay")
	public String countNewbornMay() {
		return newbornRepos.countNewbornMay();
	}
	
	
	@GetMapping("countNewbornJune")
	public String countNewbornJune() {
		return newbornRepos.countNewbornJune();
	}
	
	
	@GetMapping("countNewbornJuly")
	public String countNewbornJuly() {
		return newbornRepos.countNewbornJuly();
	}
	
	
	@GetMapping("countNewbornAugust")
	public String countNewbornAugust() {
		return newbornRepos.countNewbornAugust();
	}
	
	
	@GetMapping("countNewbornSeptember")
	public String countNewbornSeptember() {
		return newbornRepos.countNewbornSeptember();
	}
	
	
	@GetMapping("countNewbornOctober")
	public String countNewbornOctober() {
		return newbornRepos.countNewbornOctober();
	}
	
	
	@GetMapping("countNewbornNovember")
	public String countNewbornNovember() {
		return newbornRepos.countNewbornNovember();
	}
	
	
	@GetMapping("countNewbornDecember")
	public String countNewbornDecember() {
		return newbornRepos.countNewbornDecember();
	}
	
	
	
	/* Counting death for newborn */
	
	
/* Counting Newborn from january to december */
	
	@GetMapping("/countNewbornDeathJanuary")
	public String countNewbornDeathJanuary() {
		return newbornRepos.countNewbornDeathJanuary();
	}
	
	
	
	@GetMapping("countNewbornDeathFebruary")
	public String countNewbornDeathFebruary() {
		return newbornRepos.countNewbornDeathFebruary();
	}
	
	
	@GetMapping("countNewbornDeathMarch")
	public String countNewbornDeathMarch() {
		return newbornRepos.countNewbornDeathMarch();
	}
	
	
	@GetMapping("countNewbornDeathApril")
	public String countNewbornDeathApril() {
		return newbornRepos.countNewbornDeathApril();
	}
	
	
	@GetMapping("countNewbornDeathMay")
	public String countNewbornDeathMay() {
		return newbornRepos.countNewbornDeathMay();
	}
	
	
	@GetMapping("countNewbornDeathJune")
	public String countNewbornDeathJune() {
		return newbornRepos.countNewbornDeathJune();
	}
	
	
	@GetMapping("countNewbornDeathJuly")
	public String countNewbornDeathJuly() {
		return newbornRepos.countNewbornDeathJuly();
	}
	
	
	@GetMapping("countNewbornDeathAugust")
	public String countNewbornDeathAugust() {
		return newbornRepos.countNewbornDeathAugust();
	}
	
	
	@GetMapping("countNewbornDeathSeptember")
	public String countNewbornDeathSeptember() {
		return newbornRepos.countNewbornDeathSeptember();
	}
	
	
	@GetMapping("countNewbornDeathOctober")
	public String countNewbornDeathOctober() {
		return newbornRepos.countNewbornDeathOctober();
	}
	
	
	@GetMapping("countNewbornDeathNovember")
	public String countNewbornDeathNovember() {
		return newbornRepos.countNewbornDeathNovember();
	}
	
	
	@GetMapping("countNewbornDeathDecember")
	public String countNewbornDeathDecember() {
		return newbornRepos.countNewbornDeathDecember();
	}


}
