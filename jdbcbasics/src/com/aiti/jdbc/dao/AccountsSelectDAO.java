package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountsSelectDAO {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "Physics1//,";
		String sql = "select * from accounts";
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			
			stmt = conn.createStatement();
			 rs = stmt.executeQuery(sql);
			
			System.out.println(rs);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " "+ rs.getString("firstName")+ " "+ rs.getInt("Balance"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
