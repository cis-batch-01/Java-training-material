package com.exception.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesMain01 {
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
		System.out.println(inputDate());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		} catch (ParseException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static Date inputDate() throws ParseException,NullPointerException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM-yyyy");
		Date resDate=null;
		//System.out.println(resDate.getDate());
		String input=scan.nextLine();
		resDate=sdf.parse(input);
		return resDate;
	}
}
