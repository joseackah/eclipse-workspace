package com.learnSpring.Spring.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/learnSpring/Spring/springJDBC/config.xml");
		
		JdbcTemplate jdbctemplate = (JdbcTemplate) ctx.getBean("jdbctemplate");
		
		String sql = "insert into employee values(?,?,?)";
		//int result = jdbctemplate.update(sql, 2, "Bismark", "Otu");
		//int result1 = jdbctemplate.update(sql, 3, "Eugene", "Asante");
		//int result2 = jdbctemplate.update(sql, 4, "Akeem", "Amosu");
		int result3 = jdbctemplate.update(sql, 5, "solomon", "okyere");
		//System.out.println(result + " record inserted successfully");
		//System.out.println(result1 + " record inserted successfully");
		//System.out.println(result2 + " record inserted successfully");
		System.out.println(result3 + " record inserted successfully");

	}

}
