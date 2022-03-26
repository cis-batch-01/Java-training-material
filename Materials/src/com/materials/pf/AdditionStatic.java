package com.materials.pf;

public class AdditionStatic {
	public static int add(int a,int b)
	{
		int result=a+b;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Addition with Static Method");
		int num1=5,num2=10;
		int result=add(num1,num2);
		System.out.println("Result is : "+result);
	}

}
