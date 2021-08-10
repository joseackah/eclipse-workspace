package assignment5;

import java.awt.Point;

public class Rectangle implements Object1{
	public int width = 0;
	public int height = 0;
	public Point origin;	
	
	
	public Rectangle() {
		origin = new Point(0,0);
	}
	
	public Rectangle(Point p) {
		origin = p;
	}
	
	public Rectangle(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}
	
	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public void diagonals() {
		System.out.println("diagonals of rectangle are equal in length");
	}

	
	
	@Override
	public double calculateArea(int width, int height) {
		
		return width * height;
	}

	@Override
	public double calculatePerimeter(int width, int height) {
		
		return 2 * (width + height);
	}

}
