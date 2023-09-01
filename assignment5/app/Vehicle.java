package com.assignment5.app;

public class Vehicle {
	
	 public String brandName;
	 public String color;
	
	 
	public Vehicle(String brandName, String color) {
		super();
		this.brandName = brandName;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle [brandName=" + brandName + ", color=" + color + "]";
	}

	 
}
