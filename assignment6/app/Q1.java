package com.assignment6.app;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings obj = new Savings();
		obj.setUserName("Ramu");
		obj.setPrinciple(10000);
		obj.setTime(2);
		obj.setRate(7);
		
		FixedDeposit obj2 = new FixedDeposit();
		obj2.setUserName("Rahul");
		obj2.setPrinciple(10000);
		obj2.setTime(2);
		obj2.setRate(7);
		
		
		System.out.println(obj.toString());
		System.out.println(obj2.toString());


	}

}
