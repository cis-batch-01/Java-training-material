package com.materials.stringsamples;

public class StringConcat {

	public static void main(String[] args) {
		String firstName="Manoj";
		String lastname="Johnson";
		//Using + operator
		String fullName=firstName+" "+lastname;
		System.out.println("Full Name is : "+fullName);
		//Using String concat Method
		fullName=firstName.concat(lastname);
		System.out.println("Full Name is : "+fullName);
	}

}
