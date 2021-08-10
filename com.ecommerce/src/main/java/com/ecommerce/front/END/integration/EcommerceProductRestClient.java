package com.ecommerce.front.END.integration;

import com.ecommerce.front.END.integration.dto.EcommerceProduct;

public interface EcommerceProductRestClient {
	
	public void save(EcommerceProduct eproduct);
	public void update(EcommerceProduct eproduct);
	public void delete(Long id);
	public EcommerceProduct[] findAll(EcommerceProduct eproduct);
	public EcommerceProduct search(Long id);
	public EcommerceProduct[] allName(String name);
	
	

}
