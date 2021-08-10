package com.ecommerce.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.business.entities.EcommerceProduct;
import com.ecommerce.business.entities.ProductCategory;
import com.ecommerce.business.repos.EcommerceProductRepository;
import com.ecommerce.business.repos.ProductCategoryRepository;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceProductController {
	
	@Autowired
	EcommerceProductRepository epRepository;
	@Autowired
	ProductCategoryRepository pcRepository;
	
	@GetMapping("/find")
	public List<EcommerceProduct> searchAll(@RequestBody String name, Long id){
		
		return epRepository.findByIdOrName(id, name);
	}

	@PostMapping
	public EcommerceProduct save(@RequestBody EcommerceProduct eproduct) {
		
		return epRepository.save(eproduct);
	}
	
	@PutMapping
	public EcommerceProduct update(@RequestBody EcommerceProduct eproduct) {
		
		return epRepository.save(eproduct);
	}
	
	@GetMapping
	public List<EcommerceProduct> allProduct(){
		
		return epRepository.findAll();
	}
	
	@GetMapping("/search/{id}")
	public EcommerceProduct findById(@PathVariable("id") Long id) {
		return epRepository.findById(id).get();
	}
	
	@GetMapping("/searchName/{name}")
	public List<EcommerceProduct> findByName(@PathVariable("name") String name) {
		return epRepository.findAll();
		
	}
	
	@DeleteMapping
	public void delete(@RequestBody EcommerceProduct eproduct) {
		epRepository.delete(eproduct);
	}
	
	@DeleteMapping("/{id}")
	public void delet(@PathVariable("id") Long id) {
		epRepository.deleteById(id);
	}
	
	@PostMapping("/category")
	public ProductCategory saveCategory(@RequestBody ProductCategory pcategory) {
		
		return pcRepository.save(pcategory);
	}
	
	@GetMapping("/category")
	public List<ProductCategory> getAllCategory(){
		return pcRepository.findAll();
	}
	
	@GetMapping("/category/{id}")
	public ProductCategory productCategoryufindById(@PathVariable("id") Long id) {
		return pcRepository.findById(id).get();
	}
	
	@PutMapping("/category")
	public ProductCategory updateCategory(@RequestBody ProductCategory pcategory) {
		return pcRepository.save(pcategory);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		pcRepository.deleteById(id);
	}
	
	@DeleteMapping("/category")
	public void deletCategory(@RequestBody ProductCategory pcategory) {
		pcRepository.delete(pcategory);
	}
	
	
	
	
}
