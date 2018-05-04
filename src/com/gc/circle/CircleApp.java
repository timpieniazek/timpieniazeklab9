package com.gc.circle;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		// Circle circle1 = new Circle()
		System.out.println("Welcome to the Circle Tester!");

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			System.out.print("\nEnter radius: ");
			Circle circle1 = new Circle(scan.nextDouble());

			counter++;

			System.out.println("Circumference: " + circle1.getFormattedCircumference());

			System.out.println("Area: " + circle1.getFormattedArea());
			
			System.out.print("Continue? (y/n) ");
			cont = scan.next();
		}
		
		System.out.printf("%nYou created %s Circles!%nGoodbye!", counter);
	}

}
