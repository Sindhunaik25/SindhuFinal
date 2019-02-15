package com.sindhu.dao;

import java.util.ArrayList;

import com.sindhu.pojo.User;

public class UserDAO implements IUserDAO{
	String msg;

	ArrayList<User> userList;
	public UserDAO()
	{
		userList=new ArrayList<>();
		userList.add(new User("Sindhu", "java", "Admin"));
		userList.add(new User("Sachin", "sql", "User"));
		userList.add(new User("Nitin", "java", "Admin"));
	}
	public String getUserType(String userName,String password)
	{
		//userList.stream().map(user->user.getUserName())
		for(User user:userList)
		{
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException(msg);
	}
	@Override
	public void addUser(User user) {
	
		
	}
	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		
		
	}
	@Override
	public void removeUser(String userName) {
	
		
	}
}
