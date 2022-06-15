package exercises;

import java.util.Scanner;

public class Exe012 {

	public static void main(String[] args) {
		
		System.out.println("Obtaining the height data of a person, write an algorithm that calculates the ideal weight,\n"
				+ " using the formula (72.7*height) - 58.");
		System.out.println("----------------------------------------------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.println("Type the person height: ");
		float height = scankb.nextFloat();
		
		double weight = (height*72.7) - 58;
		
		System.out.println("This person average weight might be: " + weight + ".");

	}

}
