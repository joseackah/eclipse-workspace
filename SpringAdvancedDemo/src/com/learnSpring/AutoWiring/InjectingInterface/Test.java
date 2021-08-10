package com.learnSpring.AutoWiring.InjectingInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnSpring/AutoWiring/InjectingInterface/config.xml");
	
		
		//Instructor instructor = context.getBean("inst", Instructor.class);
		
		
		OrderBO bo = (OrderBO)context.getBean("BO");
		bo.placeOrder();
		
	}

}
