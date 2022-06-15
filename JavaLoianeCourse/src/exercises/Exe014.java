package exercises;

import java.util.Scanner;

public class Exe014 {

	public static void main(String[] args) {
		
		Scanner scankb = new Scanner(System.in);
		
		System.out.println("Type the file size: ");
		double sizeFile = scankb.nextDouble();
		
		System.out.println("Type the download speed: ");
		double internetSpeed = scankb.nextDouble();
		
		double time = sizeFile / internetSpeed;
		
		System.out.println("Download time: " + time);
	}

}
