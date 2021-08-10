package com.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productdao;

	public ProductDao getProductDao() {
		return productdao;
	}

	public void setProductDao(ProductDao productdao) {
		this.productdao = productdao;
	}

	@Override
	@Transactional
	public void createProduct(Product product) {
		productdao.saveProduct(product);

	}

	@Override
	@Transactional
	public Product updateProduct(Product product) {
		
		return productdao.updateProduct(product);
	}

	

	@Override
	@Transactional
	public void deleteProduct(int id) {
		productdao.deleteProduct(id);

	}

	@Override
	@Transactional
	public List<Product> getProduct() {
		
		return productdao.getProduct();
	}

}
