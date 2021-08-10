package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Trying {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//int arrayCount = 0;
		//System.out.println("how many workers do you want to employ: \n");
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		//System.out.println("enter number: ");
		
		System.out.println(" 1. Hire Manager.\n 2. Hire Worker.\n 3. Display Employee net salary details.\n 4. salary increment.\n 5. display employee information.\n 6. exit.");
		//int choice = input.nextInt();
		
		switch(input.nextInt()){
		
			
		case 1: {
			System.out.println("enter Manager information: name, email,departmentId basic salary, department, performance bonus");
			employee.add(new Manager(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.next(), input.nextDouble()));
			System.out.println("Manager added");
			System.out.println(employee.toString());
			
		};break;
		case 2: {
			System.out.println("enter worker information: name, email,departmentId basic salary, department, performance bonus");
			employee.add(new Worker(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.nextInt(), input.nextInt()));
			
			
		};break;
		
		/*case 3:{
			
				System.out.println(employee.toString() + ((Manager)em).computeSalary());
				System.out.println(((Manager) em).computeSalary());
			
		}*/
		
	
	}


	}

	private static boolean i(int j, boolean b, int k) {
		// TODO Auto-generated method stub
		return false;
	}

}
