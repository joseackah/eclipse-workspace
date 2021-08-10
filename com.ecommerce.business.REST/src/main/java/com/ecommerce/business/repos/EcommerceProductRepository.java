package com.ecommerce.business.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.business.entities.EcommerceProduct;

public interface EcommerceProductRepository extends JpaRepository<EcommerceProduct, Long> {

	
	public List<EcommerceProduct> findByIdOrName( Long id, String name);
}
