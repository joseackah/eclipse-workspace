package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDAO {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(url, "root", "Physics1//,");
			
			//System.out.println("Database connection Successful!");
			System.out.println(conn);
			System.out.println("INSERTING NEW ACCOUNT DETAILS\n");
			stmt = conn.createStatement();
			int result = stmt.executeUpdate("insert into accounts(lastName,firstName,balance) values('solo', 'oky', 1000)");
			int result1 = stmt.executeUpdate("insert into accounts(lastName,firstName,balance) values('Bismark', 'Otu', 2000)");
			int result2 = stmt.executeUpdate("insert into accounts(lastName,firstName,balance) values('Akeem', 'Amosu', 3000)");
			int result3 = stmt.executeUpdate("insert into accounts(lastName,firstName,balance) values('Eugene', 'Asante', 4000)");
			System.out.println(result + " "+ "row(s) affected");
			System.out.println(result1 + " "+ "row(s) affected");
			System.out.println(result2 + " "+ "row(s) affected");
			System.out.println(result3 + " "+ "row(s) affected");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
