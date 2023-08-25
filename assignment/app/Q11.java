package com.assignment.app;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scan.nextInt();

        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input. Please enter a five-digit number.");
        } else {
            int reversedNumber = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                reversedNumber = reversedNumber * 10 + digit;
                tempNumber /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
        }

        scan.close();

	}

}
