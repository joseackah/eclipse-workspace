package com.ecommerce.business.front.end.integration.dto;

public class ProductCategory {
	
	private Long categoryId;
	private String categoryName;
	public Long getId() {
		return categoryId;
	}
	public void setId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	

}
