package solo.user.group.controller;

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

import solo.user.group.repos.UsersTableRepository;
import solo.user.group.users.UsersTable;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersTableRepository repo;
	 

	@RequestMapping("/form")
	public String form() {

		return "addUser";
	}

	@PostMapping("/save")
	public UsersTable saveUsers(@RequestBody UsersTable users) {

		return repo.save(users);
	}

	@PutMapping("/update")
	public UsersTable updateUsers(@RequestBody UsersTable users) {
		return repo.save(users);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUsers(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

	@GetMapping("getAll")
	public List<UsersTable> allUsers() {

		return repo.findAll();
	}

	@GetMapping("/find/{id}")
	public Optional<UsersTable> findById(@PathVariable("id") Integer id) {
		return repo.findById(id);
	}

}
