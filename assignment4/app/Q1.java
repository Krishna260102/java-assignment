package com.assignment4.app;

public class Q1 {

	public static void main(String[] args) {
		BOX box1 = new BOX();
        BOX box2 = new BOX();
        
        box1.setWidth(5.0);
        box1.setHeight(3.0);
        box1.setDepth(2.0);

        box2.setWidth(8.0);
        box2.setHeight(6.0);
        box2.setDepth(4.0);


        System.out.println("Volume of Box 1: " + box1.calculateVolume());
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
	}

}
