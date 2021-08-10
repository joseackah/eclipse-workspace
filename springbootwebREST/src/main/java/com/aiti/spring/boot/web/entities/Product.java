package com.aiti.spring.boot.web.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Long id;
	private String name;
	@Column(name="description")
	private String desc;
	private Double price;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}
	
	

}
