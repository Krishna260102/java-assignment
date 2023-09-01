package com.assignment5.app;

public class BoxWeight extends BOX {
	
	private double weight;

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + "]";
	}
	
	public double volume() {
        // Calculate the volume including weight
        return super.volume() + weight;
    }

    public double getWeight() {
        return weight;
    }

}
