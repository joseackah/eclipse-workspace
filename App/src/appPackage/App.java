package appPackage;

import java.util.Scanner;


public class App {
	//class
	//<data type><variable_name>
	//declaring variables
	
	
	/*String lname = "Kwame";
	String fname = "OKyere";
	int age = 25;
	


	public void disp() {
		
		System.out.println("God is good all the time");
	}
	*/
	/*
	double num1;
	double num2;
	int ans;
	
	public void mult() {
		
		num1 = 23;
		num2 = 2;
		ans = (int)(num1 * num2);
		
		System.out.println("The ans is: " + ans);		
		
	}
	
	
	public void multi(double num1, double num2) {
		
		ans = (int)(num1 * num2);
		
		System.out.println("The ans is: " + ans);
	}
	
	
	public int mult2(int num1, int num2) {
		
		return ans = num1 * num2;
	}
	*/
	
	
	//create a program that will do addition: get and set and this
	
	int num1;
	int num2;
	int ans;
	
	public void setNum1(int num1) {
		
		this.num1 = num1;
	}
	
	
	public void setNum2(int num2) {
		
		this.num2 = num2;
		
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		
		return num2;
	}
	
	
	public int multip() {
		return num1 * num2;
	}
	
	public int add() {
		return num1 + num2;
	}
	
	
	public int div() {
		if (num1 == 0) {
			
			System.out.println("Please your numerator should be greater than zero");
			return 0;
		}
		
	else{
		return num1/num2;
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}