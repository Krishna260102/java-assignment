package com.assignment7.app;

public class Triangle extends Figure {
	
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public float area() {
		return (dim1*dim2)/2;
	}

}
