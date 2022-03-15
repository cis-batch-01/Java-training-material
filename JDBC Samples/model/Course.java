package com.technocis.model;

public class Course {
	private int id;
	private String name;
	private String desc;
	private int duration;
	
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(int id, String name, String desc, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.duration = duration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, String desc, int duration) {
		super();
		this.name = name;
		this.desc = desc;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course \n" + id + "\nname=" + name + "\ndesc=" + desc + "\nduration=" + duration  ;
	}
	
	
	

}
