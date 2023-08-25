package com.assignment2.app;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Train Name: ");
        String trainName = scanner.nextLine();

        System.out.print("Enter Passenger Name: ");
        String passengerName = scanner.nextLine();

        SeatReservation seatReservation = new SeatReservation(trainName, passengerName);

        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        seatReservation.confirmSeat(trainId);

        scanner.close();

	}

}
