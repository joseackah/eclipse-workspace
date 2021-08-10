package assignment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(5);

		/*
		 * System.out.println(circle.calculateArea(5, Math.PI));
		 * System.out.println(circle.calculatePerimeter(5, Math.PI));
		 * System.out.println(circle.getArea()); System.out.println(25 * Math.PI);
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("how many objects do you want to add.");
		int number = input.nextInt();

		Circle[] circle1 = new Circle[number];
		Rectangle[] rectangle = new Rectangle[number];

		int objCount = 0;

		while (true) {

			System.out.println("1. Add Circe. \n2. Add Rectangle.\n 3. Display Area and Perimeter.");
			int choice = input.nextInt();
			switch (choice) {

			case 1: {
				circle1[objCount++] = new Circle(input.nextDouble());
				System.out.println("circle added");
			}
				break;

			case 2: {
				rectangle[objCount++] = new Rectangle(input.nextInt(), input.nextInt());
				System.out.println("Rectangle added.");

			}
				break;

			case 3: {
				System.out.println(
						"1. Display area of a circle.\n 2. Display perimeter of a circle.\n 3. Display area of rectangle.\n 4. Display perimeter of a Rectangle.");
				double dis = input.nextDouble();
				if (dis == 1) {
					System.out.println("enter radius");
					double radius = input.nextDouble();
					System.out.println(circle1[(int) circle.calculateArea(radius, Math.PI)]);
				} else if (dis == 2)
					return;
			}
				break;

			}

		}

	}

}
