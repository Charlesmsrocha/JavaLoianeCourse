package exercises;

import java.util.Scanner;

public class Exe004 {

	public static void main(String[] args) {
		
		System.out.println("Write software that asks for the 4 grades and then displays the average.");
		System.out.println("------------------------------------------------------------------------");
		
		Scanner scankb = new Scanner (System.in);
		
		System.out.print("Insert the first grade: ");
		double grade1 = scankb.nextDouble();
		
		System.out.print("Insert the second grade: ");
		double grade2 = scankb.nextDouble();
		
		System.out.print("Insert the third grade: ");
		double grade3 = scankb.nextDouble();
		
		System.out.print("Insert the last grade: ");
		double grade4 = scankb.nextDouble();
		
		Double average = (grade1 + grade2 + grade3 + grade4) / 4;
		
		System.out.print("Your average grade is " + average);
			

	}

}
