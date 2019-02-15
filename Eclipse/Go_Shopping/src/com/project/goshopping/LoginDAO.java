package com.project.goshopping;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

public class LoginDAO {
	private static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "orcl11g");
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public boolean checkLogin(String email, String pass) throws SQLException {
		boolean exist = false;
		try {
			Connection connection = LoginDAO.getConnection();
			
			PreparedStatement statement = connection
					.prepareStatement("select * from customer where email=? and password=?");
			statement.setString(1, email);
			statement.setString(2, pass);
			ResultSet set = statement.executeQuery();
			if (set.next()) {
				exist= true;
			}
			/*else{
				throw new InvalidUserException("Invalid user");
			}*/

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return exist;
	}

	
	public boolean checkExistingUser(String email) throws SQLException {
		boolean exist = false;
		try {
			Connection connection = LoginDAO.getConnection();
			
			PreparedStatement statement = connection
					.prepareStatement("select * from customer where email=?");
			statement.setString(1, email);
			ResultSet set = statement.executeQuery();
			if (set.next()) {
				exist= true;
			}
			/*else{
				throw new InvalidUserException("Invalid user");
			}*/

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return exist;
	}
	
	
	
	public String getInsertData(String firstName, String email,
			String password, String phone) {
		Connection connection = LoginDAO.getConnection();
		int userId = 0;
		Statement stmt = null;

		String insertTableSQL = "INSERT INTO customer"
				+ "(name,password,email,phone) VALUES" + "(?,?,?,?)";

		try {

			PreparedStatement ps = connection.prepareStatement(insertTableSQL);

			ps.setString(1, firstName);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.executeUpdate();

			return "done";

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "not done";
	}

}
