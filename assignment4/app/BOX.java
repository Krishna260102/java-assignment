package com.assignment4.app;

public class BOX {
	private double width;
    private double height;
    private double depth;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double calculateVolume() {
        return width * height * depth;
    }

}
