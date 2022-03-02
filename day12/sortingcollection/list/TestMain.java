package com.sortingcollection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMain {
	
	public static void main(String[] args) {
		
		List<User> userList=new ArrayList<User>();
		userList.add(new User(4,"arun","arun@gmail.com"));
		userList.add(new User(1, "yasin", "arun@gmail.com"));
		userList.add(new User(1, "yasin", "arun@gmail.com"));
		userList.add(new User(2, "manoj", "manoj@gmail.com"));
		userList.add(new User(2, "manoj", "manoj@gmail.com"));
		userList.add(new User(2, "manoj", "manoj@gmail.com"));
		userList.add(new User(5,"lavanya","lavanya@gmail.com"));
		
		Map<String,Integer> userCountMap=new TreeMap<String, Integer>();
		
		for(User user:userList)
		{
			if(userCountMap.containsKey(user.getName()))
			{
				userCountMap.put(user.getName(),userCountMap.get(user.getName())+1);
			}
			else
			{
				userCountMap.put(user.getName(), 1);
			}
		}
		System.out.println(userCountMap);
		
		
		//get most frequent buy user
		String resUserName=null;
		int maxCount=10;
		
		for(Entry<String, Integer> entry:userCountMap.entrySet())
		{
			if(entry.getValue()<maxCount)
			{
				maxCount=entry.getValue();
				resUserName=entry.getKey();
			}
		}
		System.out.println(resUserName);
//		Map<String,User> userObjectMap=new TreeMap<String, User>();
//		
//		for(User user:userList)
//		{
//			userObjectMap.put(user.getName(), user);
//		}
//		System.out.println(userObjectMap.size());
//		System.out.println(userObjectMap.get("arun"));
//		for(Entry<String,User> entry:userObjectMap.entrySet())
//		{
//			System.out.println("Key="+entry.getKey());
//			System.out.println("Value="+entry.getValue());
//		}
//		
//		User[] userArray=new User[3];
//		userArray[0]=new User(1,"yasin","yasin@gmail.com");
//		userArray[2]=new User(2,"manoj","manoj@manoj,.com");
//		userArray[1]=new User(3,"loganathan","logu@gmail.com");
//		
//		Arrays.sort(userArray,new UserNameComparator());
//		System.out.println(Arrays.toString(userArray));
		
		
		
//		//Collections.reverse(userList);
//		Collections.sort(userList,Collections.reverseOrder()); //sort then get reverse
//		List<User> resList=new ArrayList<User>();
//		for(int i=0;i<=1;i++)
//		{
//			resList.add(userList.get(i)); //to get top 2 objects
//		}
//		System.out.println(resList);
		
		
//		User user1=new User(4,"arun","arun@gmail.com");
//		User user2 =new User(1, "yasin", "arun@gmail.com");
//		System.out.println(user1.compareTo(user2)>0?"user1 is greater":"user 2 is greter");
//		UserNameComparator userNameComparator=new UserNameComparator();
//		System.out.println(userNameComparator.compare(user1, user2)>0?"user1 is greater":"user 2 is greter");
		
		
//		List<String> list=new ArrayList<String>();
//		list.add("loganathan");
//		list.add("arun");
//		list.add("manoj");
//		list.add(new String("lavanya"));
//		String str1="manoj";
//		String str2="manoj";
//		System.out.println(str2.compareTo(str1));
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
		
		
		
	}

}
