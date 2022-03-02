package com.exception.samples;

import java.util.Scanner;

public class ExcepArrayHandling {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numbers[]={1,2,3,4,5};
		try
		{
			System.out.println(numbers[1]/0);
			System.out.println("stmts");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			numbers=null;
			scan.close();
			System.out.println("If any exception try with other value");
		}
		
		
	}

}
