package com.school.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.system.entities.Accounts;
import com.school.system.repos.AccountsRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountsRepository accountsRepos;
	
	
	
	@PostMapping("/saveAccounts")
	public Accounts saveAccount(@RequestBody Accounts accounts) {
		
		return accountsRepos.save(accounts);
		
	}
	
	@PutMapping("/updateAccounts")
	public Accounts updateAccount(@RequestBody Accounts accounts) {
		
		
		return accountsRepos.save(accounts);
	}
	
	
	@DeleteMapping("/deleteAccounts/{id}")
	public void deleteAccount(@PathVariable("id") int id) {
		
		accountsRepos.deleteById(id);
	}
	
	
	@GetMapping("/allAccounts")
	public List<Accounts> getAllAccounts(){
		
		return accountsRepos.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Accounts> findById(@PathVariable("id") int id) {
		
		return accountsRepos.findById(id);
	}
	
	
	@GetMapping("/details/{id}")
	public List<Accounts> accountsDetail(@PathVariable("id") Integer id){
		
		return accountsRepos.findAllById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
