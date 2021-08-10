package com.ecommerce.business.front.end.integration;

import com.ecommerce.business.front.end.integration.dto.ProductCategory;

public interface ProductCategoryRestClient {
	
	public void saveCategory(ProductCategory pcategory);
	public void updateCategory(ProductCategory pcategory);
	public void deleteCategory(Long id);
	public ProductCategory getAll(ProductCategory pcategory);
	public ProductCategory searchProductCategory(Long id);

}
