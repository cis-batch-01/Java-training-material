package com.exception.samples.userdefined;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<User> userList=new ArrayList<User>();
		userList.add(new User(1, "manoj", 26));
		userList.add(new User(2, "arun", 28));
		userList.add(new User(3, "loganathan", 25));
		
		System.out.println("Enter user id");
		int id=Integer.parseInt(scan.nextLine());
		User resUser=null;
		for(User user:userList)
		{
			if(user.getId()==id)
			{
				resUser=user;
			}
		}
		try
		{
			if(resUser==null)
			{
				throw new UserNotFoundException("user data for "+id +" not found");
			}
		}
		catch(UserNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(resUser);
	}
}
