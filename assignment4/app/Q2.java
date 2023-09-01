package com.assignment4.app;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			Account acc = new Account();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Acc. Bal: ");
			acc.setBalance(in.nextDouble());
			
			char choice='n';
			do{
				//Scanner in = new Scanner(System.in);
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				int inp = in.nextInt();
				if(inp==1){
					System.out.println("Amount to Withdraw: ");
					acc.withdraw(in.nextDouble());
				}
				else if(inp==2){
					System.out.println("Amount to Deposit: ");
					acc.deposit(in.nextDouble());
				}
				else if(inp==3){
					System.out.println("Account Balance: "+acc.getBalance());
				}
				else{
					System.exit(0);
				}
				System.out.println("Do you wish to continue? ");
				choice = in.next().charAt(0);
			}
			while(choice=='y'||choice=='Y');
			
			
		}


	}

