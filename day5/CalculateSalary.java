package com.technocis.pfsamples;

import java.util.Scanner;

public class CalculateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the salary: ");
		int salary=Integer.parseInt(scan.nextLine());
		if(salary<=0)
		{
			System.out.println("Invalid Input");
		}
		else if(salary>80000)
		{
			System.out.println("Salary too high");
		}
		else if(salary<=10000)
		{
			System.out.println("Salary too low");
		}
		else
		{
		System.out.println("Enter no of shifts: ");
		int shifts=Integer.parseInt(scan.nextLine());
		int savings=calculateSalary(salary, shifts);
		System.out.println("Savings :"+savings);
		}
		

	}
	public static int calculateSalary(int salary, int shifts)
	{
//		int totalSalary=(int) (salary+((salary*0.02)*shifts));
//		
//		int forSaving= (totalSalary*50/100);
//		
		return (salary+((salary*2/100)*shifts))*50/100;
	}

}
