package com.ecommerce.front.END.integration;

import com.ecommerce.front.END.integration.dto.ProductCategory;

public interface ProductCategoryRestClient {
	
	public void saveCategory(ProductCategory pcategory);
	public void updateCategory(ProductCategory pcategory);
	public void deleteCategory(Long id);
	public ProductCategory getAll(ProductCategory pcategory);
	public ProductCategory searchProductCategory(Long id);
	public ProductCategory[] findAll(ProductCategory pcategory);

}
