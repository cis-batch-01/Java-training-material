package com.technocis.pf;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no elements");
		int num = Integer.parseInt(scan.nextLine());
		int [] intArray=new int[num];
		int max=0;
		for(int i=0;i<num;i++)
		{
			intArray[i]=Integer.parseInt(scan.nextLine());
			if(intArray[i]>max) //checks max once value inserted
			{
				max=intArray[i];
			}
		}
//		for(int i=1;i<intArray.length;i++)
//		{
//			if(max<intArray[i])
//			{
//				max=intArray[i];
//			}
//		}
		System.out.println(max);
		
//		int max=(intArray[0]>intArray[1]&&intArray[0]>intArray[2]&&intArray[0]>intArray[3])?intArray[0]
//				:(intArray[1]>intArray[2]&&intArray[1]>intArray[3])?intArray[1]:
//					(intArray[2]>intArray[3])?intArray[2]:intArray[3];
//					System.out.println(max);
	
	}

}
