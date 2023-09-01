package com.assignment5.app;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grad g=new Grad("Raju", 1, 50, 21, "Trivandrum");
		System.out.println(g);
		if(g.isPassed(g.grade)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		Undergrad u=new Undergrad();
		System.out.println(u);
		if(u.isPassed(u.grade)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}


	}

}
