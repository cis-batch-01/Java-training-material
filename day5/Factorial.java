package com.technocis.pfsamples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int result=1;
		while(num>0)
		{
			result=result*num;
			num--;
		}
		System.out.println("Factorial is :"+result);
		
	}
	
}
