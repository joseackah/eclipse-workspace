package com.aiti.integration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aiti.integration.dto.Product;

@Component
public class ProductRestClientImpl implements ProductRestClient {

	@Override
	public Product findProduct(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8081/product/"+id, Product.class);
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		RestTemplate restTemplate = new RestTemplate();
		Product newProduct = new Product();
		newProduct.setId(product.getId());
		newProduct.setName(product.getName());
		newProduct.setDesc(product.getDesc());
		newProduct.setPrice(product.getPrice());
		restTemplate.postForObject("http://localhost:8081/product", newProduct, Product.class);

	}

	@Override
	public void updateProduct(Product product) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long>params = new HashMap<String, Long>();
		params.put("id", product.getId());
		restTemplate.put("http://localhost:8081/product", product, params);

	}

	@Override
	public void deleteProduct(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8081/product/"+id);
		
	}

}
