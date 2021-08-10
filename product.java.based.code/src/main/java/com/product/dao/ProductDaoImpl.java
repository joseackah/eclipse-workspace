package com.product.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveProduct(Product product) {
		Session session =  sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);

	}

	@Override
	public Product updateProduct(Product product) {
		 Session session = sessionFactory.getCurrentSession();
		 session.saveOrUpdate(product);
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = session.get(Product.class, id);
		session.delete(product);

	}

	@Override
	@Transactional
	public List<Product> getProduct() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = builder.createQuery(Product.class);
		cq.from(Product.class);
		List<Product> product = session.createQuery(cq).getResultList();
		return product;
	}

}
