package org.nurses.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.nurses.management.system.entity.Users;
import org.nurses.management.system.repos.UsersRepository;
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
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersRepository usersRepos;
	
	
	@PostMapping("/saveUsers")
	public Users saveUsers(@RequestBody Users users) {
		
		return usersRepos.save(users);
	}
	
	
	@PutMapping("/updateUsers")
	public Users updateNurses(@RequestBody Users users) {
		return usersRepos.save(users);
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers(){
		return usersRepos.findAll();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteNurses(@PathVariable("id") int id	) {
		usersRepos.deleteById(id);
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Users> findNurseById(@PathVariable("id") int id){
		return usersRepos.findById(id);
	}

}
