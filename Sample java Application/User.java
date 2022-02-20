package com.technocis.pf;

public class User {
	private static int sno=0;
	private int id;
	private String name;
	
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
	public User( String name) {
		super();
		sno++;
		this.id=sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id= " + id + "\nName= " + name;
	}
	
	
	
	
}
