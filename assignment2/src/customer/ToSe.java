package customer;

import java.util.Scanner;

public class ToSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
		Customer cust = new Customer();
		
		int age = input.nextInt();
		String name = input.next();
		String email = input.next();
		
		cust.setAge(age);
		cust.setName(name);
		
		System.out.println(cust.toString());
		
		//System.out.println(cust());
		System.out.println(cust.getDetail(name, email));
		

	}

}
