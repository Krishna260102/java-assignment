package com.assignment5.app;

public class BOX {
	private double width;
    private double height;
    private double depth;
	
    public BOX(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "BOX [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}

	public double volume() {
		// TODO Auto-generated method stub
		return width * height * depth;
	}
    
    

}
