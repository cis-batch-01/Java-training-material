package corejavasamples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCourseSample {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		List<Course> courseList=new  ArrayList<Course>();
		char choice='n';
		do
		{
		System.out.println("Add course");
		System.out.println("Enter course details:");
		String data=scan.nextLine();
		String[] userData=data.split(",");
		Course course=new Course(userData[0],
				userData[1], Integer.parseInt(userData[2]),
				Double.parseDouble(userData[3]), userData[4], userData[5], true);
		courseList.add(course);
		System.out.println("Do you want to continue(y/n)");
		choice=scan.nextLine().charAt(0);
	}while(choice=='y');
		
		for(Course course:courseList)
		{
			if(course.getTitle().equals("java"))
			{
				System.out.println(course);
			}
		}
		
		
	}

}
