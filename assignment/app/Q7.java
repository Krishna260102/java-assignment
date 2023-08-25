package com.assignment.app;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperatureFahrenheit = scan.nextDouble();

        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + temperatureCelsius + " °C");

        scan.close();

	}

}
