package com.assignment4.app;

import java.util.ArrayList;
import java.util.Scanner;


public class STAFFLIBRARY {
	static ArrayList<STAFF> staffArray = new ArrayList<STAFF>(5);

	public void addStaff() {

		try {
			Scanner in = new Scanner(System.in);
			STAFF obj = new STAFF();
			obj.setStaffID((int) (Math.random() * 1000));
			System.out.println("Enter Name: ");
			obj.setStaffname(in.next());
			System.out.println("Enter Number: ");
			obj.setMobileNo(in.next());
			staffArray.add(obj);
			System.out.println("Record Added Successfully!!");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

	public int searchStaff(String name) {
		try {
			for (int i = 0; i < staffArray.size(); i++) {
				if (staffArray.get(i).getStaffname().contains(name)) {
					return i;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return -1;
	}

	public void deleteStaff(String name) {
		try {
			for (int i = 0; i < staffArray.size(); i++) {
				if (staffArray.get(i).getStaffname().contains(name)) {
					staffArray.remove(i);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

	public void displayStaffs() {
		try {
			for (int i = 0; i < staffArray.size(); i++) {
				System.out.println("Staff ID: "
						+ (staffArray.get(i).getStaffID()));
				System.out.println("Staff Name: "
						+ (staffArray.get(i).getStaffname()));
				System.out.println(("Staff Contact No: " + staffArray.get(i)
						.getMobileNo()));
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

	public void displayStaff(int index) {
		try {
			System.out.println("Staff ID: "
					+ (staffArray.get(index).getStaffID()));
			System.out.println("Staff Name: "
					+ (staffArray.get(index).getStaffname()));
			System.out.println(("Staff Contact No: " + staffArray.get(index)
					.getMobileNo()));
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}


}
