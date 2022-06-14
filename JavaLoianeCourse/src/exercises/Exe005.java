package exercises;

import java.util.Scanner;

public class Exe005 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that converts meters into centimeters.");
		System.out.println("--------------------------------------------------------");
		
		try (Scanner scankb = new Scanner (System.in)) {
			System.out.print("Type how many meters: ");
			double meters = scankb.nextDouble();
			
			double centimeters = meters * 100;
			
			System.out.print(meters + " meters has " + centimeters + " centimeters.");
		}

	}

}
