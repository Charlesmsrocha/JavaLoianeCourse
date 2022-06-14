package exercises;

import java.util.Scanner;

public class Exe003 {

	public static void main(String[] args) {
		
		System.out.println("Write software that asks for two numbers and display their sum.");
		System.out.println("---------------------------------------------------------------");
		
		try (Scanner scankb = new Scanner (System.in)) {
			System.out.print("Type a number: ");		
			int number1 = scankb.nextInt();
			
			System.out.print("Type another number: ");
			int number2 = scankb.nextInt();
			
			int result = number1 + number2;
			
			System.out.println("The sum of " + number1 + " and " + number2 + " is " + result + ".");
		}


	}

}
