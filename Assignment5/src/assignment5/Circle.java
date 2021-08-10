package assignment5;

import java.awt.Point;

public class Circle implements Objects{
	public double radius = 0;
	public Point origin;
	
	
	
	public Circle() {
		 origin = new Point(0,0);
	}
	
	public Circle(Point p) {
		origin = p;
	}
	
	public Circle(double radi) {
		origin = new Point(0,0);
		 radius = radi;
	}
	
	public Circle(Point p, double radi) {
		origin = p;
		radius = radi;
	}
	
	public double getArea() {
		return PI * (radius * radius);
	}
	
	public void drawArc() {
		System.out.println("Drawing arc: ");
	}

	

	@Override
	public double calculateArea(double radius, double PI) {
		
		return PI * (radius * radius);
	}

	@Override
	public double calculatePerimeter(double radius, double PI) {
		
		return 2 * (radius * PI);
	}
	
	
	

}
