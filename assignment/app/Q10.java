package com.assignment.app;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scan.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter a five-digit number.");
        } else {
            int digitSum = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                digitSum += digit;
                tempNumber /= 10;
            }

            System.out.println("Sum of digits: " + digitSum);
        }

        scan.close();

	}

}
