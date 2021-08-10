package com.learnSpring.Spring.passengerJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/learnSpring/Spring/passengerJDBC/config.xml");
		
		JdbcTemplate jdbctemplate = (JdbcTemplate) ctx.getBean("jdbctemplate");
		
		String sql = "insert into passenger values(?,?,?,?,?)";
		//int result = jdbctemplate.update(sql, 2, "Bismark", "Otu" "0245698741", "Accra");
		//int result1 = jdbctemplate.update(sql, 3, "Eugene", "Asante","0265698741", "Kumasi");
		//int result2 = jdbctemplate.update(sql, 4, "Akeem", "Amosu","0275698741","Tamale");
		//int result3 = jdbctemplate.update(sql, 4, "Solomon", "Okyere","0205698741","Wa");
		//int result4 = jdbctemplate.update(sql, 4, "Harrison", "William","0235698741","Koforidua");
		int result3 = jdbctemplate.update(sql, 5, "solomon", "okyere");
		//System.out.println(result + " record inserted successfully");
		//System.out.println(result1 + " record inserted successfully");
		//System.out.println(result2 + " record inserted successfully");
		System.out.println(result3 + " record inserted successfully");

	}

}
