package com.technocis.pf;

public class UserService {
	private static int index = 0;
	private static User[] userList = new User[10];

	/**
	 * @return User Array all the user data
	 */
	public static User[] getUsers() {

		return userList;
	}

	/**
	 * @param user
	 * @return true if user data inserted in the table
	 */
	public static boolean register(User user) {
		userList[index] = user;
		index++;
		return true;
	}

	/**
	 * @param user
	 * @return true if user data in the table
	 */
	public static boolean login(User user) {
		boolean flag = false;
		for (int i = 0; i < userList.length; i++) {
			if (userList[i].getName().equals(user.getName()))
				flag = true;
		}
		return flag;
	}

	public static int getIndex() {
		return index;
	}
	

}
