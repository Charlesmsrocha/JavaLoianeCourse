package exercises;

import java.util.Scanner;

public class Exe007 {

	public static void main(String[] args) {
	
		System.out.println("Write a software that calculate a square area and then doubles the area.");
		System.out.println("------------------------------------------------------------------------");

		Scanner scankb = new Scanner(System.in);
		
		System.out.println("Type one square side: ");
		int side1 = scankb.nextInt();
		
		System.out.println("Type another square side: ");
		int side2 = scankb.nextInt();
		
		int area = side1*side2;
		int squareDouble = area*2;
		
		System.out.println("The square area is " + area + " and its double is " + squareDouble + ".");
		
	}

}
