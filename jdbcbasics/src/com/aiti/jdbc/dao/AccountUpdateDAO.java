package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountUpdateDAO {
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "Physics1//,";
		String sql="update accounts set balance = 3000 where acctNo = 1";
	// get a connection to the database
		try {
			connection = DriverManager.getConnection(url, username, password);
			
			stmt = connection.createStatement();
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + " " + "row(s) affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//create statement 
		
		//execute queries 
		//process the results
		
	}

}
