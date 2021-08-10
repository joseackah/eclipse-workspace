package com.ecommerce.front.END.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.front.END.integration.ProductCategoryRestClient;
import com.ecommerce.front.END.integration.dto.EcommerceProduct;
import com.ecommerce.front.END.integration.dto.ProductCategory;

@Component
public class ProductCategoryRestClientImpl implements ProductCategoryRestClient {

	@Override
	public void saveCategory(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCate = new ProductCategory();
		productCate.setCategoryId(pcategory.getCategoryId());
		productCate.setCategoryName(pcategory.getCategoryName());
		restTemplate.postForObject("http://localhost:9090/ecommerce/category", productCate, ProductCategory.class);

	}

	@Override
	public void updateCategory(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long>categoryUpdate = new HashMap<String, Long>();
		categoryUpdate.put("id", pcategory.getCategoryId());
		restTemplate.put("http://localhost:9090/ecommerce/category",pcategory, categoryUpdate);

	}

	@Override
	public void deleteCategory(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:9090/ecommerce/category/"+id);

	}

	@Override
	public ProductCategory getAll(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCategory = restTemplate.getForObject("http://localhost:9090/ecommerce/category", ProductCategory.class);
		return productCategory;
	}

	@Override
	public ProductCategory searchProductCategory(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory productCategory=restTemplate.getForObject("http://localhost:9090/ecommerce/category/"+id, ProductCategory.class);
		return productCategory;
	}

	@Override
	public ProductCategory[] findAll(ProductCategory pcategory) {
		RestTemplate restTemplate = new RestTemplate();
		ProductCategory[] pcCategory = restTemplate.getForObject("http://localhost:9090/ecommerce/category",
				ProductCategory[].class);
		
		    
		
	
		return pcCategory;
	}

}
