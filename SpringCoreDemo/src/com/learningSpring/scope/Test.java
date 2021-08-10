package com.learningSpring.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learningSpring/scope/config.xml");
	
		
		//Instructor instructor = context.getBean("inst", Instructor.class);
		
		
		Instructor instructor = (Instructor)context.getBean("inst2");
		System.out.println(instructor.hashCode());
		Instructor instructor2 = (Instructor)context.getBean("inst2");
		System.out.println(instructor2.hashCode());
	}

}
