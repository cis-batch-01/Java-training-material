package sample;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num of students");
		int noOfStudents=Integer.parseInt(scan.nextLine());
		
		
		
		System.out.println("Enter tamil mark:");
		int tamil=Integer.parseInt(scan.nextLine());
		System.out.println("Enter english mark:");
		int english=Integer.parseInt(scan.nextLine());
		System.out.println("Enter maths mark:");
		int maths=Integer.parseInt(scan.nextLine());
		System.out.println("Enter science mark:");
		int science=Integer.parseInt(scan.nextLine());
		System.out.println("Enter social mark:");
		int social=Integer.parseInt(scan.nextLine());
		
		Student stu1=new Student(tamil, english, maths, science, social);
		
		System.out.println("Total "+stu1.calTotal());
		
		

	}

}
