package com.materials.pf;

public class MovieWithFeilds {
	String name;
	
	public MovieWithFeilds(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("Constructor With Feilds ");
		MovieWithFeilds conObj=new MovieWithFeilds("Class Name");
		System.out.println("Initialized Name is : "+conObj.name);
	}

}
