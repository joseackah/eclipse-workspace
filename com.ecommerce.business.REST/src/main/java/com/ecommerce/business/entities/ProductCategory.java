package com.ecommerce.business.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//@Table(name = "product_category", uniqueConstraints={@UniqueConstraint(columnNames={"categoryId"})})
public class ProductCategory {

	@Id
	@Column(name="categoryId")
	private Long categoryId;
	@Column(name="categoryName")
	private String categoryName;

	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "productCategory")
	private List<EcommerceProduct> eproduct = new ArrayList<>();

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
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
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", eproduct=" + "]";
	}

}
