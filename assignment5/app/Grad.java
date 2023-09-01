package com.assignment5.app;

public class Grad extends Student {
	
	public Grad(String name, int iD, double grade, int age, String address) {
		super(name, iD, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gradname=" + name + ", ID=" + ID + ", grade=" + grade
				+ ", age=" + age + ", address=" + address;
	}

	boolean isPassed (double grade){
		if(grade>80){
			return true;
		}
		else{
			return false;
		}
	}


}
