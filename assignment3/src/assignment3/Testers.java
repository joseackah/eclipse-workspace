package assignment3;

import java.util.Scanner;

public class Testers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Employee employee = new Employee("kwame", "sdkjkdf", 23, 234.3);
		Worker worker = new Worker("ama", "dfjkdjk", 12, 6789.2,23, 123);
		Manager manager = new Manager("John", "eiwfj", 12, 2345.3, "mang", 12);
		
		
		System.out.println(employee.toString());
		System.out.println(worker.toString());
		System.out.println(manager.toString());
		System.out.println(manager.computeSalary());*/
		
		
		
		
		Scanner input = new Scanner(System.in);
		int arrayCount = 0;
		System.out.println("how many workers do you want to employ: \n");
		
		int number = input.nextInt();
		Employee[] employee = new Employee[number];
		boolean exit;
		while (true) {
		System.out.println("enter number: ");
		
		System.out.println(" 1. Hire Manager.\n 2. Hire Worker.\n 3. Display Employee net salary details.\n 4. salary increment.\n 5. display employee information.\n 6. exit.");
		//int choice = input.nextInt();
		
		switch(input.nextInt()){
		case 1: {System.out.println("enter Manager information: name, email,departmentId basic salary, department, performance bonus");
			employee[arrayCount++] = new Manager(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.next(), input.nextDouble());
			System.out.println("Manager added");
		};break;
		case 2: {
			System.out.println("enter worker information: name, email,departmentId basic salary, department, performance bonus");
			employee[arrayCount++] = new Worker(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.nextInt(), input.nextInt());
			
			
		};break;
		
		case 3:{
			for (Employee em :employee) {
				System.out.println(em.toString() + ((Manager)em).computeSalary());
				//System.out.println(manager.computeSalary());
			}
		}break;
		
		case 4:{
			System.out.print("enter your id number: ");
			int eid = input.nextInt();
			
			System.out.println("update salary: ");
			double update = input.nextDouble();
			if (eid%100<=number) {
			employee[eid%100-1].getUpDateSalary(update);
			System.out.println(employee[eid%100-1].toString());
			System.out.println("your update salary is: " + update);
		}else
			System.out.println("invalid id.");
		}break;
		case 5: {System.out.println("enter your id for your details");
				int eid = input.nextInt();
				
				if(eid%100 <= number) {
					System.out.println(employee[eid%100-1].toString());
				}else {
					System.out.println("invalid number");
				}
		}break;
		
		case 6: {
					exit = true;
			System.out.println("you have exited.");
					break;
		}
	}

//break;	
} 

}
}
	