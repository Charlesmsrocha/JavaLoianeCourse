package exercises;

import java.util.Scanner;

public class Exe010 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that asks temperature in Celsius, \n"
				+ "and then shows it in Farenheit degrees. ");
		System.out.println("--------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.print("Type how many Celsius degrees: ");
		double celsius = scankb.nextDouble();
		
		double farenheit = (celsius *1.8) + 32;
		
		System.out.print(celsius + " Celsius degrees is equal to " + farenheit + " Farenheit degrees.");
	}

}
