package com.materials.pf;

public class AdditionMultipleNum {
	public static int add(int num1,int num2)
	{
		return num1+num2;
	}
	public static int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		System.out.println("Addition with two or More Num");
		int result=add(10,20);
		int result1=add(5,10,15);
		System.out.println("Addition of Two Numbers Result is : "+result);
		System.out.println("Addition of Three Numbers Result is: "+result1);
	}

}
