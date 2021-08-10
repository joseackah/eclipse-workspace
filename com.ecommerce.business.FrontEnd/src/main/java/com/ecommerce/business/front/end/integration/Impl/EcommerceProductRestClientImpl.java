package com.ecommerce.business.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.ecommerce.business.front.end.integration.EcommerceProductRestClient;
import com.ecommerce.business.front.end.integration.dto.EcommerceProduct;

public class EcommerceProductRestClientImpl implements EcommerceProductRestClient {

	@Override
	public void save(EcommerceProduct eproduct) {
	RestTemplate restTemplate = new RestTemplate();
	EcommerceProduct ecommerceProduct = new EcommerceProduct();
	ecommerceProduct.setName(eproduct.getName());
	ecommerceProduct.setDesc(eproduct.getDesc());
	ecommerceProduct.setPrice(eproduct.getPrice());
	restTemplate.postForObject("http://localhost:8081/ecommerce", ecommerceProduct, EcommerceProduct.class);

	}

	@Override
	public void update(EcommerceProduct eproduct) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long> productUpdate = new HashMap<String, Long>();
		productUpdate.put("id", eproduct.getId());
		restTemplate.put("http://localhost:8081/ecommerce", eproduct, productUpdate);

	}

	@Override
	public void delete(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8081/ecommerce/"+id);

	}

	@Override
	public EcommerceProduct findAll(EcommerceProduct eproduct) {
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct ecproduct = restTemplate.getForObject("http://localhost:8081/ecommerce",	EcommerceProduct.class);
		return ecproduct;
	}

	@Override
	public EcommerceProduct search(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct ecProduct = restTemplate.getForObject("http://localhost:8081/ecommerce/"+id, EcommerceProduct.class);
		return ecProduct;
	}

}
