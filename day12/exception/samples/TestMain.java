package com.exception.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args)  {
		Scanner scan=new  Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		System.out.println("Enter a date:");
		String inputData=scan.nextLine();
		try
		{
		Date date=sdf.parse(inputData);
		int res=10/0;
		}
		catch(ParseException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
