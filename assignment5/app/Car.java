package com.assignment5.app;

public class Car extends Vehicle {
	
	private String carBrand;
    private String carColor;
	
    
    public Car(String carBrand, String carColor) {
		super(carBrand, carColor);
		this.carBrand = carBrand;
		this.carColor = carColor;
	}


	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carColor=" + carColor + "]";
	}
	
    
}
