package com.learningSpring.demo;

public class MyApp {

	public static void main(String[] args) {
		
		//Coach theCoach = new FootBallCoach();
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getDailyTraining());
		

	}

}
