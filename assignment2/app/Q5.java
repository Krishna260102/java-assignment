package com.assignment2.app;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for");
            System.out.println("6. Exit");
            System.out.print("Choose one: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The if:\nif (condition) {\n    statement;\n}");
                    break;
                case 2:
                    System.out.println("The switch:\nswitch (expression) {\n    case constant:\n        statement;\n        break;\n    // More cases\n}");
                    break;
                case 3:
                    System.out.println("The while:\nwhile (condition) {\n    statement;\n}");
                    break;
                case 4:
                    System.out.println("The do-while:\ndo {\n    statement;\n} while (condition);");
                    break;
                case 5:
                    System.out.println("The for:\nfor (initialization; condition; iteration) {\n    statement;\n}");
                    break;
                case 6:
                    System.out.println("Exiting the help system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.println(); // Empty line for separation

        } while (choice != 6);

        scan.close();
		

	}

}
