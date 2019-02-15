package com.suraj.example;
import java.sql.*;

public class LoginDAO {
	private static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
							"system", "orcl11g");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	/*public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
*/
	public boolean checkLogin(String uname, String pass) throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
							"system", "orcl11g");
		String str="select * from customer where name=? and password=?";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		preparedStatement.setString(1, uname);
		preparedStatement.setString(2, pass);
		ResultSet rs=preparedStatement.executeQuery();
		if(rs.next()){
			return true;
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}


