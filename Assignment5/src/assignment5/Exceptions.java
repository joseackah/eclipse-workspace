package assignment5;

import java.util.Scanner;

public class Exceptions {
	
	public static void th_excep() throws IllegalAccessException{
		
		throw new IllegalAccessException("trying to gain illegal access");
	}

	
	public static void main(String[] args) {
		
		try {
			
			th_excep();
		}catch(IllegalAccessException i) {
			System.out.println(i);
		}
		
		

	
		
	}
}
