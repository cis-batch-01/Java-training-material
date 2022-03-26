package com.materials.stringsamples;

public class StringMethods {
	public static void main(String[] args) {
		String name="   Manoj   ";
		System.out.println("Name is "+name);
		System.out.println("Length is "+name.length());
		System.out.println("Upper case of name "+name.toUpperCase());
		System.out.println("Lower case of name "+name.toLowerCase());
		System.out.println("Without trim - Name:"+name+" length:"+name.length());
		System.out.println("Using trim Methid - Name: "+name.trim()+" Length:"+name.length());
		name=name.trim();
		System.out.println("Name length "+name.length());
		System.out.println("First Letter of Name: "+name.charAt(0));
		System.out.println("Last Letter of Name: "+name.charAt(name.length()-1));
	}

}
