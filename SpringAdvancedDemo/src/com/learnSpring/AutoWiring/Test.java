package com.learnSpring.AutoWiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnSpring/AutoWiring/config.xml");
	
		
		//Instructor instructor = context.getBean("inst", Instructor.class);
		
		
		Instructor instructor = (Instructor)context.getBean("instructor");
		System.out.println(instructor);
		
	}

}
