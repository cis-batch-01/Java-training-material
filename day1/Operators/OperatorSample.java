package com.technosys.datatypes;

public class OperatorSample {

	public static void main(String[] args) {
		
		// binary Operator two operands are needed a+b
		int number1=10,number2=20;
		System.out.println("Sum of two Numbers "+number1+number2);// Arithmetic operator +,-,*,/,%
		
		System.out.println("B Greater than A "+(number2>number1));// Relational Opertaor <,>,<=,>=,==,!=
		System.out.println("B Equal to A "+(number2==number1));// check operands are equal are not
		//logical operator
		System.out.println("Both Experssion are true "+((number1<=number2)&&(number1!=number2)));// Logical Operators && || !
		
		//unary operator ++ -- needed only one operand post and pre
		int number3=50;
		System.out.println(++number3);// post increment value get updated after the printing stmt
		System.out.println("After post increment"+number3);
		
		//ternary operator (expression eg:a>b)?"a is greater":"b is greater"
		
		System.out.println((number1>number2)?"number 1 is greater":"number 2 is greater");
	}
}


