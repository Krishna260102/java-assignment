package com.assignment7.app;

public class Figure {
	
	int dim1, dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public float area() {
		return 2*dim1*dim2;
	}

}
