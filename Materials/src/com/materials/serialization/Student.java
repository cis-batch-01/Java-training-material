package com.materials.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	public String name;
	public String email;
	public transient String password;

	public Student(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}
