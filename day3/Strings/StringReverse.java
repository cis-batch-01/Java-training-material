package com.technoicis.array;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String data=scan.nextLine();
									//StringBuilder StringBuffer
		StringBuilder sb=new StringBuilder(data);
		String reversedData=sb.reverse().toString(); //reverse the array StringBuilderObject.reverse()
		System.out.println(reversedData);
	}

}
