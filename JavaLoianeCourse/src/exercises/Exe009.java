package exercises;

import java.util.Scanner;

public class Exe009 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that asks temperature in Farenheit, \n"
				+ "and then shows it in Celsius degrees. ");
		System.out.println("---------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.print("Type the temperature in Farenheit: ");
		int temperatureF = scankb.nextInt();
		
		int temperatureC = (5*(temperatureF - 32) / 9);
		
		System.out.println(temperatureF + " Farenheit in Celsius is " + temperatureC + " degrees.");


	}

}
