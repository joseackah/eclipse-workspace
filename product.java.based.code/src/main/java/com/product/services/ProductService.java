package com.product.services;

import java.util.List;

import com.product.entity.Product;


public interface ProductService {
	
	void createProduct(Product product);
	public Product updateProduct(Product product);
	
	void deleteProduct(int id);
	List<Product> getProduct();

}
