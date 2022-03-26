package com.materials.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		try
		{
		int result=num1/num2;
		System.out.println("Result Is "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error Message: "+e.getMessage());
			e.printStackTrace();
		}

	}

}
