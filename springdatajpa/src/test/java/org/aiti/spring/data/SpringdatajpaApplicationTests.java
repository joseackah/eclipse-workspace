package org.aiti.spring.data;

import java.util.List;

import org.aiti.spring.data.entities.Product;
import org.aiti.spring.data.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	ProductRepository repository;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(16L);
		product.setName("Dell");
		product.setDesc("Laptop");
		product.setPrice(8500d);
		//repository.save(product);
		
		
		//read single record from the database
		
		
		//Optional<Product> result = repository.findById(10L);
		//System.out.println(result);
		
		
		//update and read all
		
		//List<Product> products = (List<Product>) repository.findAll();
		//products.forEach(p -> System.out.println(p.toString()));
		
		//repository.findAll().forEach(p->{System.out.println(p.getPrice());});
		
		//result.get().setPrice(70000d);
		//repository.save(result);
		
	}
	
	//read a single record
	
	@Test
	public void testRead() {
		Product product = repository.findById(16L).get();
		System.out.println(">>>>>>>>>>>>>"+product.toString());
		
	}
	
	//perform update on a record
	
	@Test
	public void testUpdate() {
		Product product = repository.findById(14L).get();
		product.setDesc("Washing Machine");
		product.setPrice(4500D);
		product.setName("samsung");
		repository.save(product);
		
	}
	
	@Test
	public void readAll() {
		List<Product> product = (List<Product>) repository.findAll();
		//product.forEach(p-> {System.out.println(p.toString());});
		//product.forEach(p-> System.out.println(p.toString()));
		product.forEach(p-> System.out.println(p.getName()));
	}
	
	@Test
	public void delete() {
		repository.deleteById(16L);
	}
	
	@Test
	public void testDelete() {
		if(repository.existsById(15L)) {
			System.out.println("*********Deleting a product******");
			repository.deleteById(15L);
		}
		
	}
	
	@Test
	public void testCount() {
		long count = repository.count();
		System.out.println(count);
	}
	
	@Test
	public void testFindByName() {
		
		System.out.println(repository.findByName("hp"));
	}
	
	@Test
	public void testFindByNamePrice(){
		System.out.println("$$$$$$$$$" + repository.findByNameAndPrice("hp", 785D));
		
	}

}
