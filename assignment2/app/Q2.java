package com.assignment2.app;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int storedPin = 1234;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your PIN code: ");
        int userPin = scan.nextInt();

        if (userPin == storedPin) {
            System.out.println("PIN code verified. Access granted!");
        } else {
            System.out.println("Incorrect PIN code. Access denied!");
        }

        scan.close();

	}

}
