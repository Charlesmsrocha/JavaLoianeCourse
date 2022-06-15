package exercises;

import java.util.Scanner;

public class Exe011 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that asks for 2 integers and 1 float number. Then shows: \n"
				+ "a - Double the first multiplied by half the second.\n"
				+ "b - The sum of the third plus triple the first.\n"
				+ "c - The third powered by 3.");
		System.out.println("---------------------------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.println("Type a integer number: ");
		int firstNumber = scankb.nextInt();
		
		System.out.println("Type a second integer number: ");
		int secondNumber = scankb.nextInt();
		
		System.out.println("Type a float number: ");
		float thirdNumber = scankb.nextFloat();
		
		float a = (firstNumber*2) * (secondNumber/2);
		float b = (firstNumber*3) + thirdNumber;
		float c = thirdNumber*thirdNumber*thirdNumber; //Math.pow (num3, 3)
		
		System.out.println("a: " + a + "\n"
				+ "b: " + b + "\n"
				+ "c: " + c);

	}

}
