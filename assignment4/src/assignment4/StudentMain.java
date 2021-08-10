package assignment4;

import java.util.Scanner;
import java.util.stream.Stream;

public class StudentMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		int studCount = 0;
		int gpaCount = 0;
		
		System.out.print("Please how many students do you want to admit: ");
		int mit = input.nextInt();
		Students[] students = new Students[mit];
		
		
		
		while(true) {
			
			System.out.print(" 1. Admit Student.\n 2. Other services.");
			int admit = input.nextInt();
			if (admit ==1) {
				System.out.println("Please enter Student's Name, Email and Age.");
			students[studCount++] = new Students(input.next(), input.next(), input.nextInt());
			System.out.println("Student admitted.");
			System.out.println(Stream.of(students[0], students[1]));
			}else if (admit ==2) {
				System.out.print("1. Student details.\n2. Student GPA.");
				int det = input.nextInt();
				if (det == 1) {
					System.out.println("Please enter student id: ");
					String sdd = input.next();
					int sd = Integer.parseInt(sdd);
					System.out.println(students[sd-1].toString());
					
				}else if (det ==2) {
					System.out.println("How many students gpa do you want to enter: ");
					int gpaNum = input.nextInt();
					ComputeGPA[] gpa = new ComputeGPA[gpaNum];
					while (true) {
					System.out.println("Please enter student ID: ");
					int stid = input.nextInt();
					System.out.println("Enter Assignment, quiz, and Test.");
					gpa[gpaCount++] = new ComputeGPA(input.nextDouble(), input.nextDouble(), input.nextDouble());
					System.out.println(students[stid - 1] +""+ ""+ gpa[stid -1].getComputeGpa());
				break;
				}					
					
					}
			}else break;
			
		//break;
			}

		
	}

}
