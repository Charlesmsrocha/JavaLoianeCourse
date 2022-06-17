package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scankb = new Scanner(System.in);
		
		/*System.out.println("Type your age: ");
		
		int age = scankb.nextInt();
		
		if (age>= 18) {
			System.out.println("Your are an adult.");
		} else {
			System.out.println("You need to grow up.");
		}*/
		
		//cheap <= 10
		//10 < price < 15 - ask for discount
		//15 <= price < 17 - go to another research
		//>= 17 - Too expensive
		
		System.out.println("Type the item price: ");
		double price = scankb.nextDouble();
		
		if (price <=10){
			System.out.println("You can buy it. It is cheap.");
		} else if (price > 10 && price < 15){
			System.out.println("You could ask for a discount...");
		} else if (price >=15 && price < 17){
			System.out.println("You should search in another place.");
		} else { // price >= 17 
			System.out.println("Too expensive.");
		}

	}
}
