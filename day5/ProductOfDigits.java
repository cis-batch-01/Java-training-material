package com.technocis.pfsamples;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		Integer number=Integer.parseInt(scan.nextLine());
		int result=1;
		for(;number>0;)
		{
		int digit=number%10;
		result*=digit;
		number=number/10;
		}
		System.out.println("Product of Digits"+result);
		

	}

}
//String str=Integer.toString(number);
//
//for(int i=0;i<str.length();i++)
//{
//	int digit=str.charAt(i);System.out.println(digit);
//	result=digit*result;
//}