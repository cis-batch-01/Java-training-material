package com.technoicis.array;

import java.util.Arrays;
import java.util.Scanner;

public class CharArraySample {
	public static void main(String[] args) {
		//String reverse with charArray
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String input=scan.nextLine();
		char [] data=input.toCharArray();// toCharArray() to convert String to char Array
		char []newData=new char[data.length];  //Empty Array to store the values
		for(int i=data.length-1,j=0;i>=0 && j<=data.length-1;i--,j++)
		{
		//	System.out.print(data[i]);
			newData[j]=data[i];
		}
	//	System.out.println();
		System.out.println(newData); // Arrays.toString(newData); || newData.toString()
		
	}

}
