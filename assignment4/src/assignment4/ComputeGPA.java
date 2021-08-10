package assignment4;

public class ComputeGPA {
	
	double assign;
	double quiz;
	double test;
	double gpa;
	
	ComputeGPA(double assign, double quiz, double test){
		
		this.assign = assign;
		this.quiz = quiz;
		this.test = test;
	}
	
	public double getComputeGpa(){
		
		return gpa = (assign * 0.2) + (quiz +0.3) + (test * 0.5);
	}

}
