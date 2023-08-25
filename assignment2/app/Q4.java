package com.assignment2.app;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();
        String season;

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println("The month " + month + " is in the " + season + " season.");

        scan.close();

	}

}
