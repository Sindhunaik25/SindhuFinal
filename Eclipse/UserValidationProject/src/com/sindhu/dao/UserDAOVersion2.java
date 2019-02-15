package com.sindhu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sindhu.pojo.User;

public class UserDAOVersion2 implements IUserDAO{

	@Override
	public String getUserType(String userName, String password) {
	Connection connection=ConnectionFactory.getConnection();
	try {
		PreparedStatement statement=connection.prepareStatement("select * from user1 where userName=? and password=?");
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet set=statement.executeQuery();
		while(set.next()){
			if(set.getString("userName").equals(userName) && set.getString("password").equals(password)){
				return set.getString("userType");
			}
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
		throw new InvalidUserException("Username and password doesnot exist");
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
public static void main(String[] args) {
	System.out.println(new UserDAOVersion2().getUserType("Sindhu", "java"));
}
}

