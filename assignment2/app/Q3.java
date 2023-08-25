package com.assignment2.app;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();

        String season;

        if (month >= 1 && month <= 12) {
            if (month >= 1 && month <= 2 || month == 12) {
                season = "winter";
            } else if (month >= 3 && month <= 5) {
                season = "spring";
            } else if (month >= 6 && month <= 8) {
                season = "summer";
            } else {
                season = "autumn";
            }
            System.out.println("The month " + month + " is in the " + season + " season.");
        } else {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }

        scan.close();

	}

}
