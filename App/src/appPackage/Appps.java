package appPackage;

import java.util.Scanner;

public class Appps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			//App app = new App();
			
			//app.disp();
		
		Scanner input = new Scanner(System.in);
		
		App mul = new App();
		
		/*mul.mult();
		mul.multi(2.3, 3.4);
		System.out.println(mul.mult2(2,3));	*/
			
		//mul.setNum1(15);
		//mul.setNum2(0);
		
		System.out.println("Please your option of calculation:\n 1. Multiplication\n 2. addition\n 3. Division");
		
		int choice = input.nextInt();
		
		switch(choice) {
		
		case 1: {
			System.out.println("enter two numbers: ");
			int num1  = input.nextInt();
			int num2 = input.nextInt();
			
			mul.setNum1(num1);
			mul.setNum2(num2);
			System.out.println("multiplication is: " + mul.multip());
		};break;
		
		case 2: {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			mul.setNum1(num1);
			mul.setNum2(num2);
			System.out.println("divide is: " + mul.div());
		};break;
		
		case 3: {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			mul.setNum1(num1);
			mul.setNum2(num2);
			System.out.println("divide is: " + mul.div());
		};break;
		
		default:{System.out.println("Please select the right method.");}
		
		}
		
		/*int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		mul.setNum1(num1);
		mul.setNum2(num2);
		
		
		System.out.println("divide is: " + mul.div());
		System.out.println("divide is: " + mul.div());
		System.out.println("multiplication is: " + mul.multip());*/
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
