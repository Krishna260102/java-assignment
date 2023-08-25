package com.assignment2.app;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter customer type (D for Domestic, I for Industrial): ");
        char customerType = scan.next().charAt(0);

        System.out.print("Enter consumption units: ");
        int units = scan.nextInt();

        double billAmount = 0.0;

        if (customerType == 'D' || customerType == 'd') {
            if (units <= 100) {
                billAmount = units * 1;
            } else if (units <= 200) {
                billAmount = units * 1.5;
            } else if (units <= 500) {
                billAmount = units * 2;
            } else {
                billAmount = units * 5;
            }
        } else if (customerType == 'I' || customerType == 'i') {
            billAmount = units * 10;
        } else {
            System.out.println("Invalid customer type. Please enter D for Domestic or I for Industrial.");
            return;
        }

        System.out.println("Bill Amount: Rs." + billAmount);

        scan.close();

	}

}
