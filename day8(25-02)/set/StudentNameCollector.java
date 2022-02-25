package corejavasamples.collections.set;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentNameCollector {
	public static void main(String[] args) {
		
		Set<String> studentNameSet=new TreeSet();
		
		Scanner scan=new Scanner(System.in);
//		char choice='n';
//		do
//		{
//			System.out.println("Enter student Name:");
//			String name=scan.nextLine();
//			studentNameSet.add(name);
//			System.out.println("Do you want to continue (y/n)");
//			choice=scan.nextLine().charAt(0);
//		}while(choice=='y');
//		
//		System.out.println(studentNameSet);
		System.out.println("Enter no of students");
		int num=Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter student Name:");
			String name=scan.nextLine();
			studentNameSet.add(name);
		}
		System.out.println("the student names are");
		System.out.println(studentNameSet);
	}

}
