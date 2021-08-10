package com.ecommerce.business.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.business.entities.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
