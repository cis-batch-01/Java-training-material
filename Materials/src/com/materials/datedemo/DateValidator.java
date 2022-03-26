package com.materials.datedemo;

import java.util.regex.Pattern;

public class DateValidator {
	
	public static boolean dateValidator(String dateString)
	{
	//date valodation without leap year check and feb 30 not checked and days 30 and 31 not chaecked
		String regex="(0[1-9]|1[0-9]|2[0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})";
		return Pattern.matches(regex, dateString);
	}

}
