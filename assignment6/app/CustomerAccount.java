package com.assignment6.app;

public class CustomerAccount {
	
	private long accNo;
	private String name;
	private int age;
	private String place;
	private String accType;
	public CustomerAccount(long accNo, String name, int age, String place, String accType) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.age = age;
		this.place = place;
		this.accType = accType;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "CustomerAccount [accNo=" + accNo + ", name=" + name + ", age=" + age + ", place=" + place + ", accType="
				+ accType + "]";
	}

}
