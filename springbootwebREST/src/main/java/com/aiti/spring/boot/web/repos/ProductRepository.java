package com.aiti.spring.boot.web.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiti.spring.boot.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
	
	
	List<Product> findByName(String name);
	List<Product> findByPrice(Double price);
	
	List<Product> findByNameAndPrice(String name, Double price);
	
	
	

}
