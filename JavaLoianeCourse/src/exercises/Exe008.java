package exercises;

import java.util.Scanner;

public class Exe008 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that asks how much a employee earns per hour \n"
				+ "and how many hours worked per month. Show the final salary");
		System.out.println("-----------------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.print("How much do you earn per hour? ");
		float earnPerHour = scankb.nextFloat();
		
		System.out.print("How many hours do you work per month? ");
		int daysPerMonth = scankb.nextInt();
		
		double salary = earnPerHour*daysPerMonth;
		
		System.out.println("If you work " + daysPerMonth + ", your salary will be " + earnPerHour + ".");


	}

}
