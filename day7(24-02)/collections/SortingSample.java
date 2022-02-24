package corejavasamples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingSample {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Course> courseList=new  ArrayList<Course>();
		char choice='n';
		do
		{
		System.out.println("Add course");
		System.out.println("Enter course details:");
		String data=scan.nextLine();
		Course course=Course.createCourse(data);
		
		courseList.add(course);
		System.out.println("Do you want to continue(y/n)");
		choice=scan.nextLine().charAt(0);
	}while(choice=='y');
		System.out.println(courseList);
		System.out.println("Sorting options\n1.Title\n2.duration\n3.rating");
		int option=Integer.parseInt(scan.nextLine());
		switch(option)
		{
		case 1:
			Collections.sort(courseList,new CourseNameComparator());
			break;
		case 2:
			Collections.sort(courseList);
			break;
		case 3:
			Collections.sort(courseList,new CourseRatingComparator());
			break;
			default:
				System.out.println("Invalid choice");
		
		}
		System.out.println();
		for(Course course :courseList)
		{
			System.out.println(course);
		}
//		Collections.sort(courseList,new CourseRatingComparator());
//		
//		for(Course course :courseList)
//		{
//			System.out.println(course);
//		}
		
		
		
	}

}
