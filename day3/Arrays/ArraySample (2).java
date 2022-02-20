package com.technoicis.array;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements :");
		int noOfElements=Integer.parseInt(scan.nextLine());
		int intArray[]=new int[noOfElements];
		System.out.println("Enter the elements one by one");
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=Integer.parseInt(scan.nextLine());
		}
		int total=0;
		for(int i=0;i<intArray.length;i++)
		{
			total+=intArray[i];
		}
		int average=total/intArray.length;
		System.out.println("Average of the array elements :"+average);
		
	}

}
