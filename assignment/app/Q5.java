package com.assignment.app;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scan.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scan.nextInt();

	        int quotient = num1 / num2;
	        int remainder = num1 % num2;

	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	        scan.close();

	}

}
