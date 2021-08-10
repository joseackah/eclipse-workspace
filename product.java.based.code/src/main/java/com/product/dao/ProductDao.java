package com.product.dao;

import java.util.List;

import com.product.entity.Product;

public interface ProductDao {
	void saveProduct(Product product);
	public Product updateProduct(Product product);
	void deleteProduct(int id);
	List<Product> getProduct();
	

}
