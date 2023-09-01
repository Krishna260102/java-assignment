package com.assignment5.app;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight box1 = new BoxWeight(7, 11, 4, 20);
        BoxWeight box2 = new BoxWeight(10, 6, 3, 40);

        System.out.println("Box 1 - Volume: " + box1.volume() + ", Weight: " + box1.getWeight());
        System.out.println("Box 2 - Volume: " + box2.volume() + ", Weight: " + box2.getWeight());

	}

}
