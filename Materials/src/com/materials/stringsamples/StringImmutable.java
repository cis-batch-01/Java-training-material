package com.materials.stringsamples;

public class StringImmutable {
	public static void main(String[] args) {
		
		String name="Manoj";
		//String is immutable 
		System.out.println("Name in Lower case "+name.toLowerCase());
		System.out.println("Name is "+name);
		//Store the value in another Variable to get the new String
		String upperCaseName=name.toUpperCase();
		System.out.println(upperCaseName);
	}
}
