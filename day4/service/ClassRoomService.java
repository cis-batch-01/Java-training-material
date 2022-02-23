package com.technocis.service;

import com.technocis.model.ClassRoom;
import com.technocis.model.Student;

public class ClassRoomService {
	
	public static boolean addStudent(Student student,ClassRoom classRoom)
	{
		boolean flag=false;
		Student [] studentList=classRoom.getStudentList();
		int index=classRoom.getSno();
		studentList[index]=student;
		classRoom.setSno(index+1);
		flag=true;
		return flag;
		
	}
	public static Student fetchStudent(String name,ClassRoom classRoom)
	{
		Student student=null;
		Student[] studentList=classRoom.getStudentList();
		for(int i=0;i<studentList.length;i++)
		{
			Student tempStudent=studentList[i];
			if(name.equals(tempStudent.getName()))
			{
				student=tempStudent;
				break;
			}
		}
		return student;
		
	}
	//syn: access static returnType methodName(int number){ sttms}
	//1.no return type no arguments
//	2.with argument with out return type
//			3.with return type with out argument
//					4.with return type and with argument

}
