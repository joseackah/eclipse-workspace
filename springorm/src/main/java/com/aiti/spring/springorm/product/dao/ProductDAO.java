package com.aiti.spring.springorm.product.dao;

import java.util.List;

import com.aiti.spring.springorm.product.entity.Product;

public interface ProductDAO {
	
	int create (Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> read(Product product);
	List<Product>findAll();

}
