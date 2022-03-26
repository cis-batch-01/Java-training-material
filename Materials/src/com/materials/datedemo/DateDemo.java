package com.materials.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter the valid Date:");
		String dateString = scan.nextLine();
		boolean isValidDate = DateValidator.dateValidator(dateString);
		System.out.println(isValidDate ? "valid" : "Invalid");
		Date dateObj = sdf.parse(dateString);
	}

}
