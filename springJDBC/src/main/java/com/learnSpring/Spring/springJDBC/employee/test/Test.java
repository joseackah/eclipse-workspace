package com.learnSpring.Spring.springJDBC.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.learnSpring.Spring.entities.Employee;
import com.learnSpring.Spring.springJDBC.employee.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/learnSpring/Spring/springJDBC/config.xml");
		
		EmployeeDAO edao = (EmployeeDAO) ctx.getBean("EDAO");
		
		//Employee employee = new Employee();
		//employee.setId(7);
		//employee.setFirstName("ama");
		//employee.setLastName("kofi");
		
		//int result = edao.create(employee);
		
		//int result = edao.update(employee);
		//int result = edao.delete(7);
		
		//Employee employee = edao.read(2);
		List<Employee> result = edao.read();
		
		//String sql = "insert into employee values(?,?,?)";
		//int result = jdbctemplate.update(sql, 2, "Bismark", "Otu");
		//int result1 = jdbctemplate.update(sql, 3, "Eugene", "Asante");
		//int result2 = jdbctemplate.update(sql, 4, "Akeem", "Amosu");
		//int result3 = jdbctemplate.update(sql, 5, "solomon", "okyere");
		System.out.println("Employee record: " + result);
		//System.out.println(result1 + " record inserted successfully");
		//System.out.println(result2 + " record inserted successfully");
		//System.out.println(result3 + " record inserted successfully");

	}

}
