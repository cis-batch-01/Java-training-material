package com.materials.pf;

public class AdditionWithNumArgum {

	public static int add(int ...nums) {
		int total=0;
		for(int num:nums) {
			total=total+num;
		}
		return total;
	}
	public static void main(String args[])
	{
		int result1=add(2,3);
		int result2=add(2,5,10,15,20);
		System.out.println("Addition of Two Numbers: "+result1);
		System.out.println("Addition of Three Numbers: "+result2);
	}
}
