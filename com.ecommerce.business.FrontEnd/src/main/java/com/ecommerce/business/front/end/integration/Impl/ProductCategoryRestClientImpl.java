package com.ecommerce.business.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.ecommerce.business.front.end.integration.ProductCategoryRestClient;
import com.ecommerce.business.front.end.integration.dto.ProductCategory;

public class ProductCategoryRestClientImpl implements ProductCategoryRestClient {

	@Override
	public void saveCategory(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCate = new ProductCategory();
		productCate.setId(pcategory.getId());
		productCate.setCategoryName(pcategory.getCategoryName());
		restTemplate.postForObject("http://localhost:8081/ecommerce/category", productCate, ProductCategory.class);

	}

	@Override
	public void updateCategory(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long>categoryUpdate = new HashMap<String, Long>();
		categoryUpdate.put("id", pcategory.getId());
		restTemplate.put("http://localhost:8081/ecommerce/category",pcategory, categoryUpdate);

	}

	@Override
	public void deleteCategory(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8081/ecommerce/category/"+id);

	}

	@Override
	public ProductCategory getAll(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCategory = restTemplate.getForObject("http://localhost:8081/ecommerce/category", ProductCategory.class);
		return productCategory;
	}

	@Override
	public ProductCategory searchProductCategory(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCategory=restTemplate.getForObject("http://localhost:8081/ecommerce/category/"+id, ProductCategory.class);
		return productCategory;
	}

}
