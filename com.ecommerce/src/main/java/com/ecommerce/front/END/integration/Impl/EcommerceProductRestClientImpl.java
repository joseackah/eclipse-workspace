package com.ecommerce.front.END.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.front.END.integration.EcommerceProductRestClient;
import com.ecommerce.front.END.integration.dto.EcommerceProduct;

@Component
public class EcommerceProductRestClientImpl implements EcommerceProductRestClient {

	@Override
	public void save(EcommerceProduct eproduct) {
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct ecommerceProduct = new EcommerceProduct();
		ecommerceProduct.setId(eproduct.getId());
		ecommerceProduct.setName(eproduct.getName());
		ecommerceProduct.setDesc(eproduct.getDesc());
		ecommerceProduct.setPrice(eproduct.getPrice());
		//ecommerceProduct.setCategory(eproduct.getCategory().setCategoryId());
		restTemplate.postForObject("http://localhost:9090/ecommerce", ecommerceProduct, EcommerceProduct.class);

	}

	@Override
	public void update(EcommerceProduct eproduct) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Long> productUpdate = new HashMap<String, Long>();
		productUpdate.put("id", eproduct.getId());
		restTemplate.put("http://localhost:9090/ecommerce", eproduct, productUpdate);

	}

	@Override
	public void delete(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:9090/ecommerce/" + id);

	}

	@Override
	public EcommerceProduct[] findAll(EcommerceProduct eproduct) {
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct[] ecproduct = restTemplate.getForObject("http://localhost:9090/ecommerce",
				EcommerceProduct[].class);
		
		    
		
		return ecproduct;
	}

	

	@Override
	public EcommerceProduct search(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct ecProduct = restTemplate.getForObject("http://localhost:9090/ecommerce/search/"+id, EcommerceProduct.class);
		return ecProduct;
	}

	@Override
	public EcommerceProduct[] allName(String name) {
		Integer name1= Integer.parseInt(name);
		RestTemplate restTemplate = new RestTemplate();
		EcommerceProduct[] ecommProduct = restTemplate.getForObject("http://localhost:9090/ecommerce/searchName/"+name1, EcommerceProduct[].class);
		return ecommProduct;
	}

}
