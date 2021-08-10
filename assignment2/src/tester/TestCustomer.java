package tester;

import java.util.Scanner;

import customer.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust = new Customer();
		Customer cust1 = new Customer("ama", "djlkajk", 12, 1452);
		
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.println("Please Enter your age: ");
		int age = input.nextInt();
		System.out.println("Please Enter your name: ");
		String name = input.next();
		System.out.println("Please Enter your email: ");
		String email = input.next();
		
		cust.setAge(age);
		cust.setName(name);
		cust1.getAge(age);
		*/
		//System.out.println(cust1.getDetail(name, age));
		
		//System.out.println(cust());
		
		
		
		String detail = cust.toString();
		
		System.out.println(detail);
		
	}



	

	

	


	

}
