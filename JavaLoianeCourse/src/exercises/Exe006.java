package exercises;

import java.util.Scanner;

public class Exe006 {

	public static void main(String[] args) {
		
		System.out.println("Write software that asks for a circle radius, then calculate and show its area.");
		System.out.println("-------------------------------------------------------------------------------");
		
		Scanner scankb = new Scanner(System.in);
		
		System.out.print("Type the circle radius: ");
		float radius = scankb.nextFloat();
		
		float pi = 3.1415f;
		float area = pi * (radius*radius);
		
		// double area = Math.PI * Math.pow(radius, 2);
		
		System.out.print("The circle area is " + area);

	}

}
