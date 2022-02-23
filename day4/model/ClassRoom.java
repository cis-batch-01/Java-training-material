package com.technocis.model;

import java.util.Arrays;

public class ClassRoom {
	//declaration instance variable
	private int sno=0;//student List index total no of Students Added in the Class room
	private int roomNo;
	private String staffName;
	private  Student[] studentList;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	//init const
	public ClassRoom(int roomNo, String staffName,  int size) {
		super();
		this.roomNo = roomNo;
		this.staffName = staffName;
		this.studentList = new Student[size];
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Student[] getStudentList() {
		return studentList;
	}
	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Strength=" + sno + "\nRoom No=" + roomNo + "\nStaff Name=" + staffName + "\nStudent List="
				+ Arrays.toString(studentList);
	}
	
	
	

}
