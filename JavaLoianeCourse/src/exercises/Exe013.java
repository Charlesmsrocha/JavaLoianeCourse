package exercises;

import java.util.Scanner;

public class Exe013 {

	public static void main(String[] args) {
		
		System.out.println("Write a software that asks how much a employee earns per hour \n"
				+ "and how many hours worked per month.\n"
				+ "Calculate and show the total of your salary in that month, \n"
				+ "knowing that 11% are deducted for the Income Tax, \n"
				+ "8% for the INSS and 5% for the union, make a program that gives us:\r\n"
				+ "a - Gross salary\r\n"
				+ "b - How much do you pay to the INSS\n"
				+ "c - How much do you pay the union\n"
				+ "d - Net salary\n"
				+ "e - Calculate the discounts and the net salary, \n"
				+ "according to the formula: Gross salary - IR (11%) - INSS (8%) - Union (5%) = Net salary.\n");
		System.out.println("----------------------------------------------------------------------------------------");

	
		Scanner scankb = new Scanner(System.in);
		
		System.out.print("How much do you earn per hour? ");
		double earnPerHour = scankb.nextDouble();
		
		System.out.print("How many hours do you work per month? ");
		double daysPerMonth = scankb.nextDouble();
		
		double grossSalary = earnPerHour*daysPerMonth;
		
		double inss = (grossSalary / 100) * 8;
		
		double union = (grossSalary / 100) * 5;
		
		double ir = (grossSalary / 100) * 11;
		
		double totalDiscounts = inss + union + ir;
		
		double netSalary = grossSalary - totalDiscounts;
		
		System.out.println("The gross salary is " + grossSalary);
		System.out.println("INSS: " + inss);
		System.out.println("Union: " + union);
		System.out.println("IR: " + ir);
		System.out.println("Total discounts: " + totalDiscounts);
		System.out.println("Net salary: " + netSalary);
				
	}

}