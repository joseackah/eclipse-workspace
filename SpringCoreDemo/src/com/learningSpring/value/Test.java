package com.learningSpring.value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learningSpring/value/config.xml");
	
		
		//Instructor instructor = context.getBean("inst", Instructor.class);
		
		
		Instructor instructor = (Instructor)context.getBean("value");
		System.out.println(instructor);
		
	}

}
