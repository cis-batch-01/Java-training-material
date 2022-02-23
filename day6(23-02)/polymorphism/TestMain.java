package com.technocis.polymorphism;

public class TestMain {
	
	public static void main(String[] args) {
		User user1=new User(101, "manoj", "chennai", "mail@gmail.com");
		
		User user2=new User(102, "manoj", "chennai", "mail@gmail.com");
		
		System.out.println(user1);
		UserService userService=new UserServiceImple();
		
		
	}

}
