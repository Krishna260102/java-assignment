package com.assignment5.app;

public class Student {
	static String name;
	int ID;
	double grade;
	int age;
	String address;
	
	public Student(String name, int iD, double grade, int age, String address) {
		super();
		this.name = name;
		ID = iD;
		this.grade = grade;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", grade=" + grade
				+ ", age=" + age + ", address=" + address + "]";
	}

	boolean isPassed (double grade){
		if(grade>40){
			return true;
		}
		else{
			return false;
		}
	}


	
	

}
