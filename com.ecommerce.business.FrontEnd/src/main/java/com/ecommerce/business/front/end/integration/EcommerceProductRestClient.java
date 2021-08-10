package com.ecommerce.business.front.end.integration;

import com.ecommerce.business.front.end.integration.dto.EcommerceProduct;

public interface EcommerceProductRestClient {
	
	public void save(EcommerceProduct eproduct);
	public void update(EcommerceProduct eproduct);
	public void delete(Long id);
	public EcommerceProduct findAll(EcommerceProduct eproduct);
	public EcommerceProduct search(Long id);
	

}
