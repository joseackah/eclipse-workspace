package com.aiti.integration;

import com.aiti.integration.dto.Product;

public interface ProductRestClient {
	
	public Product findProduct(Long id);
	public void saveProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Long id);

}
