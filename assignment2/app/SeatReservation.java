package com.assignment2.app;

public class SeatReservation {
	private String trainName;
    private String passengerName;

    public SeatReservation(String trainName, String passengerName) {
        this.trainName = trainName;
        this.passengerName = passengerName;
    }

    public void confirmSeat(String trainId) {
        if (trainId.equals("123")) {
            System.out.println("Seat confirmed for passenger: " + passengerName);
        } else {
            System.out.println("Seat not available for passenger: " + passengerName);
        }
    }
}
