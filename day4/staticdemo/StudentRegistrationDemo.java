package com.technocis.staticdemo;

import java.util.Scanner;

import com.technocis.model.ClassRoom;
import com.technocis.model.Student;
import com.technocis.service.ClassRoomService;

public class StudentRegistrationDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ClassRoom [] classRoomList;
		int index=0;
		System.out.println("welcome to Student Registration");
		char option='n';
		System.out.println("Enter no of Class Rooms");
		int num=scan.nextInt();
		scan.nextLine();
		classRoomList=new ClassRoom[num];
		do
		{
		System.out.println("1.create a classRoom object\n2.view Class rooms\n3.logout");
		int choice=Integer.parseInt(scan.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter Class Room Details");
			System.out.println("Room no:");
			int roomNo=Integer.parseInt(scan.nextLine());
			System.out.println("Staff Name:");
			String staffName=scan.nextLine();
			System.out.println("Capasity:");
			int capasity=Integer.parseInt(scan.nextLine());
			ClassRoom classRoom=new ClassRoom(roomNo, staffName, capasity);
			classRoomList[index]=classRoom;
			index++;
			char studentOption='y';
			do
			{
			System.out.println("Actions");
			System.out.println("1.Add a Student\n2.View all Students\n3.Find a Student");
			int studentChoice=Integer.parseInt(scan.nextLine());
			switch(studentChoice)
			{
			case 1:
				Student student=new Student("mani", 86566656L, "10 C", 487);
				boolean flag=ClassRoomService.addStudent(student, classRoom);
				if(flag)
				{
					System.out.println("Student Added successfully");
				}
				break;
			case 2:
				Student [] studentList=classRoom.getStudentList();
				for(int i=0;i<classRoom.getSno();i++)
				{
					System.out.println(studentList[i]);
				}
				break;
			case 3:
				System.out.println("Enter the Student Name:");
				String name=scan.nextLine();
				Student stu=ClassRoomService.fetchStudent(name, classRoom);
				System.out.println("Student \n"+stu);
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to Logout(y/n)");
			studentOption=scan.nextLine().charAt(0);
			}while(studentOption=='n');
			break;
		case 2:
			for(int i=0;i<classRoomList.length;i++)
			{
				System.out.println(classRoomList[i]);
			}
			break;
		case 3:
			System.exit(0);
			break;
			default:
				System.out.println("Invalid Key");
		}
		System.out.println("Do you wnat to continue (y/n)");
		option=scan.nextLine().charAt(0);
		}while(option=='y');
		
		
//		ClassRoom classRoom=new ClassRoom(101, "manoj", 7);
//		Student student=new Student("mani", 86566656L, "10 C", 487);
//		Student student1=new Student("mani selvam", 8652345656L, "10 C", 467);
//		boolean flag=ClassRoomService.addStudent(student,classRoom);
//		ClassRoomService.addStudent(student1,classRoom);
//		
//			Student [] studentList=classRoom.getStudentList();
//			for(int i=0;i<classRoom.getSno();i++)
//			{
//				System.out.println(studentList[i]);
//			}
//			System.out.println("Enter the Student Name:");
//			String name=scan.nextLine();
//			Student stu=ClassRoomService.fetchStudent(name, classRoom);
//			System.out.println("Student \n"+stu.getName());
		
		
	}

}
