package firstAssignment;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Calculator call = new Calculator();
		
		System.out.print("Choose method of Calculation.\n 1. Addition\n 2. Multiplication.\n 3. Division.\n 4. Subtraction.\n 5. Exit.\n Enter:   ");
		
		
		
		int choice = input.nextInt();
		
		switch(choice) {
		
		case 1: {
			System.out.print("Enter two numbers to add. \n");
			System.out.print("first number : ");
			double number1 = input.nextDouble();
			System.out.print("second number : ");
			double number2 = input.nextDouble();
			
			call.setNumber1(number1);
			call.setNumber2(number2);
			
			System.out.println("The addition of " + number1 + " and " + number2 + " is : " + call.add()+".");
		}break;
		
		case 2:{
			System.out.print("Enter two numbers to multiply. \n");
			System.out.print("first number : ");
			double number1 = input.nextDouble();
			System.out.print("second number : ");
			double number2 = input.nextDouble();
			
			call.setNumber1(number1);
			call.setNumber2(number2);
			
			System.out.println("The Multiplication of " + number1 + " and " + number2 + " is : " + call.multiply()+".");
		}break;
		
		case 3: {
			System.out.print("Enter two numbers to divide. \n");
			System.out.print("decimals are accepted. \n");
			System.out.print("first number : ");
			double number1 = input.nextDouble();
			System.out.print("second number : ");
			double number2 = input.nextDouble();
			
			call.setNumber1(number1);
			call.setNumber2(number2);
			
			System.out.println("The Division of " + number1 + " by " + number2 + " is : " + call.division()+".");
		}break;
		
		
		case 4: {
			System.out.print("Enter two numbers to subtract. \n");
			System.out.print("first number : ");
			double number1 = input.nextDouble();
			System.out.print("second number : ");
			double number2 = input.nextDouble();
			
			call.setNumber1(number1);
			call.setNumber2(number2);
			
			System.out.println("The Subtraction of " + number2 + " from " + number1 + " is : " + call.subtract()+".");
		}break;
		
		case 5: System.out.println("You have cancelled your calculation.");
			return;
		
		}
		

	}

}
