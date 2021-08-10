package com.aiti.spring.springorm.product.dao.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aiti.spring.springorm.product.dao.ProductDAO;
import com.aiti.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aiti/spring/springorm/product/dao/test/config.xml");
		
		ProductDAO pdao = (ProductDAO) ctx.getBean("productdao");
		Product product = new Product();
		/*product.setId(3);
		product.setName("SHARP SYSTEM");
		product.setDesc("GOOD");
		product.setPrice(5050d);
		pdao.create(product);
		
		product.setId(4);
		product.setName("TCL CURVE TV");
		product.setDesc("GOOD");
		product.setPrice(10_000.45d);
		pdao.create(product);
		
		product.setId(5);
		product.setName("WASHING MACHINE");
		product.setDesc("GOOD");
		product.setPrice(3500d);
		pdao.create(product);
		
		product.setId(6);
		product.setName("AKAI TV");
		product.setDesc("SCREEN ISSUE");
		product.setPrice(2000.25d);
		pdao.create(product);*/
		
		//product.setId(3);
		//product.setName("SAMSUNG TV");
		//product.setDesc("EXCELLENT");
		//product.setPrice(9000d);
		//pdao.create(product);
		//pdao.update(product);
		//pdao.delete(product);
		//List<Product> read = pdao.read(product);
		//System.out.println(read);
		
		//Product find = pdao.find(2);
		
		//System.out.println(find);
		
		List<Product> findAll = pdao.findAll();
		System.out.println(findAll);
	}
}
