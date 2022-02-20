package com.technosys.datatypes;

import java.util.Scanner;

public class BranchingStatement {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice = Integer.parseInt(scan.nextLine());  //Integer parseInt convert string to int
		switch (choice) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		default:
			System.out.println("invalid input");

		}
		
	}
}
