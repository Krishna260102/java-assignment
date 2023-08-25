package com.assignment.app;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scan = new Scanner(System.in);

	        System.out.print("Enter arjun's basic salary: ");
	        double basicSalary = scan.nextDouble();

	        double dearnessAllowance = 0.4 * basicSalary;

	        double houseRentAllowance = 0.2 * basicSalary;

	        double totalSalary = basicSalary + dearnessAllowance + houseRentAllowance;

	        System.out.println("Total Salary: " + totalSalary);

	        scan.close();

	}

}
