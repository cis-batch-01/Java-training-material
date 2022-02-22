package com.technocis.pfsamples;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=Integer.parseInt(scan.nextLine());
		if(year<0)
		{
			System.out.println("Invalid Input");
		}
		else if(year%4==0)
		{
			System.out.println("Year is Leap Year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}

	}

}
