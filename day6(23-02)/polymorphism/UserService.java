package com.technocis.polymorphism;

public interface UserService {
	
	public boolean insertUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);
	public User getUser(int id);
	public int findId(String mailId);
	public String findAdress(String mailId);

}
