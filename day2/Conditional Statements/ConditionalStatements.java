package com.technosys.datatypes;

public class ConditionalStatements {

	public static void main(String[] args) {
		// if ,if else, if.. else if, if nested if
		// syntax   if(expression){ stmts; }
		int number1=10,number2=-20;
		
		if((number2>number1))
		{
			System.out.println("number 2 greater than number1");
		}
		else if(number1>0)
		{
			System.out.println("number 1 is greater");
		}
		else
		{
			System.out.println("number 1 and 2 are less than 0 and number 1 is greater");
		}
//		else if(number1>0)
//		{
//			System.out.println("number 1 is greater");
//		}
//		else
//		{
//			System.out.println("number 1 and number 2 are < 0");
//		}
		int number3 =30;
		if(number2>0)
		{
			System.out.println("number 2 greater than 0");
			if(number2>number1)
			{
				if(number2>number3)
				{
				System.out.println("number 2 is greater than number 1 and number 3");
				}
				else
				{
					System.out.println("number 2 greater thyan number 1 and less than number3");
				}
			}
			else
			{
				System.out.println("number 1 is greater");
			}
		}
	}
}
