package com.technosys.datatypes;

import java.util.Scanner;

public class StaticSample {
	
	public static void main(String[] args) {
		//assume register two users
		User user1=new User("manoj", "manoj@manoj.com", 97886767);
		User user2=new User("mani","mani@mani.com",78787878);
		
		System.out.println("User 1 ID "+user1.getId()); //Auto incremented id
		System.out.println("User 2 ID "+user2.getId()); //static member sno is shared 
		System.out.println("Static Serail No "+User.sno);
		
		}

}
