package com.technosys.datatypes;

public class User {
	
	public static int sno=0;
	private int id;
	private String name;
	private String email;
	private long mobile;

	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, long mobile) {
		super();
		sno++;
		this.id = sno;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	
	
	

}
