package exercises;

import java.util.Scanner;

public class Exe002 {

	public static void main(String[] args) {
		
		System.out.println("Write a program that asks for a number and then displays \n"
				+ "the message: 'The number entered was: [number].'");
		System.out.println("------------------------------------------------------------");
		System.out.print("Type a number: ");

		try (Scanner scankb = new Scanner (System.in)) {
			int number = scankb.nextInt();
			
			System.out.println("The number entered was: " + number);
			
		}

	}

}
