package com.assignment5.app;

public class Undergrad extends Student {
	
	static double grade;
	private static int age;
	private static int iD;
	private static String address;

	public Undergrad() {
		super(name, iD, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	public void UnderGrad(String name, int iD, double grade, int age, String address) {
		//super(name, iD, grade, age, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UnderGradname=" + name + ", ID=" + ID + ", grade=" + grade
				+ ", age=" + age + ", address=" + address;
	}

	boolean isPassed (double grade){
		if(grade>70){
			return true;
		}
		else{
			return false;
		}
	}


}
