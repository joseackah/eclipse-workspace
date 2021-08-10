package assignment4;

public class Students {
	private int id;
	private String name;
	private String email;
	private int age;
	private double gpa;
	private static int counter;
	
	
	
	Students(String name, String email, int age){
		this.id = ++counter;
		this.name = name;
		this.email = email;
		this.age = age;
		
	}
	
	public double computeGpa(double assign, double quiz, double test) {
		
		return gpa = ((assign * 0.3) + (quiz * 0.2) + (test * 0.5));
	}
	
	
	
	public String getDetails() {
		return "Student id: " + id + ", name: " + name + ", email: " + ", age: " + age+ ".";
		
		
	}

	@Override
	public String toString() {
		return "Students id: " + id + ", name: " + name + ", email: " + email + ", age: " + age + ", gpa: ";
	}

}
