package student_mgt_system;

import java.util.Scanner;

public class StudentBaseDb {

	public static void main(String[] args) {
		
		StudentMgt smgt = new StudentMgt();
		
		//smgt.addStudent();		
		//smgt.updateAddress();
		//smgt.deleteStudent();
		//smgt.displayAll();
		Scanner input = new Scanner(System.in);
		boolean tru = true;
		
		while(tru) {
			System.out.println("Please select on an option.\n1. Add Student.\n2. Delete Student.\n3. Update Student Address.\n4. View All Student.\n5. Exit\nEnter Choice: ");
			switch(input.nextInt()) {
			
			case 1: {
				
				smgt.addStudent();
				System.out.println("Student(s) added Successful.");
				
			}break;
			case 2: {
				smgt.deleteStudent();
				System.out.println("Student(s) deleted Successful.");
				
			}break;
			case 3: {
				smgt.updateAddress();
				System.out.println("Student(s) record(s) updated Successful.");
				
			}break;
			case 4: {
				System.out.print("Std.ID  Std. Name  address    class  marks\n");
				smgt.displayAll();
				
			}break;
			
			case 5: tru= false;
			System.out.println("Your have exited the application.");
			
			
			
			
			
			
			
			
			
			}
		}

	}

}
