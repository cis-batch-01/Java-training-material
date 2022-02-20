package com.technocis.sample;

public class StaticDemo {
	public static void main(String[] args) {
		
		// call a static method
		int number1=50,number2=20;
		int sumResult=Calculator.sum(number1, number2);
		System.out.println("Sum of those numbers :"+sumResult);
		
	}

}
