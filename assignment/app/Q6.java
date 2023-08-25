package com.assignment.app;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter the distance between two cities in kilometers: ");
        double distanceKm = scan.nextDouble();

        final double METERS_PER_KM = 1000.0;
        final double FEET_PER_METER = 3.28084;
        final double INCHES_PER_FEET = 12.0;
        final double CM_PER_METER = 100.0;

        double distanceMeters = distanceKm * METERS_PER_KM;
        double distanceFeet = distanceMeters * FEET_PER_METER;
        double distanceInches = distanceFeet * INCHES_PER_FEET;
        double distanceCentimeters = distanceMeters * CM_PER_METER;

        System.out.println("Distance in meters: " + distanceMeters + " m");
        System.out.println("Distance in feet: " + distanceFeet + " ft");
        System.out.println("Distance in inches: " + distanceInches + " in");
        System.out.println("Distance in centimeters: " + distanceCentimeters + " cm");

        scan.close();

	}

}
