package tester;

import java.util.Scanner;

public class TesterMain {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Scanner input = new Scanner(System.in);
		int pr=0;
		int pri=0;
		
		boolean tru = true;
		
		while(tru) {
			
			System.out.println("Food menu:\n1. fufu\n2. Banku\n3. Generate Bill");
			
			switch(input.nextInt()) {
			case 1:{
				System.out.println("Enter quantity of bowl of fufu(A Bowl is GHC 20)");
				int quant = input.nextInt();
				pr = (menu.fufu) * quant;
				
			break;}
			
			case 2:{
				System.out.println("Enter quantity of balls of banku(a ball is GHC 10)");
				int qua = input.nextInt();
				pri = menu.banku * qua;
			break;}
			
			case 3:{
				System.out.println("total price for fufu is: " + pr + "\nand total price for banku is: "+ pri);
				System.out.println("total price for all items: " + (pr + pri));
				tru = false;
			break;}
			
			}
				
	}
		


	}

}
