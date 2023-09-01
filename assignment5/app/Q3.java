package com.assignment5.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		
		int patientNumber = 100;
		String hospital = "SP", address = "TVM";
		LocalDate dateObj1 = LocalDate.of(2021, 10, 13);
		
		  
		LocalDate dateObj = LocalDate.now();
        
        String date = dateObj.format(formatter);
        String date2 = dateObj1.format(formatter);
		
        int diff = Integer.parseInt(date)-Integer.parseInt(date2);
        
		Patient obj2 = new Patient(patientNumber, hospital, address, dateObj1, diff);
        
        System.out.println(obj2.toString());


	}

}
