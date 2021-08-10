package com.aiti.spring.boot.web.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiti.spring.boot.web.entities.Product;
import com.aiti.spring.boot.web.repos.ProductRepository;

@RestController
@RequestMapping("/product")
public class RESTController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public List<Product> getProduct(){
		return repository.findAll();
	}
	
	
	
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		
		return repository.save(product);
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		
		return repository.save(product);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Product product) {
		
		repository.delete(product);
	}
	
	@DeleteMapping("/{id}")
	public void delet(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	
	@PatchMapping
	public Product updateAll(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getSingleProduct(@PathVariable("id") Long id) {
		return repository.findById(id).get();
	}

}
