package com.learningSpring.collectionType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learningSpring/collectionType/config.xml");
	
		
		//Instructor instructor = context.getBean("inst", Instructor.class);
		
		
		Instructor instructor = (Instructor)context.getBean("collection");
		System.out.println(instructor);
		
	}

}
