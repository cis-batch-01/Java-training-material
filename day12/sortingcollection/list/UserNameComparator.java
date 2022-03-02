package com.sortingcollection.list;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

	public int compare(User user1, User user2) {
		// TODO Auto-generated method stub
		return user1.getName().compareTo(user2.getName());
	}

}
