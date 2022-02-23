package com.technocis.model;

public class Student {

	static int noStudents=0;// total number of Student Object created
	
	private int id;
	private String name;
	private long mobile;
	private String section;
	private int rank;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Student( String name, long mobile, String section, int rank) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.section = section;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "\nSno =" + id + "\nName=" + name + "\nMobile=" + mobile + "\nSection=" + section + "\nRank=" + rank;
	}
	
	
	
	
	

}
