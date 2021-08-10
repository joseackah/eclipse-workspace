package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectPreparedStatement {
	
		Connection connn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "Physics1//,";
		
		public SelectPreparedStatement(){
			try{
			connn = DriverManager.getConnection(url, username, password);
			ps = connn.prepareStatement("select * from accounts where acctNo =?");
		}catch(SQLException e) {
			
		}
		
	}
		public void view_Record() throws SQLException{
			
			ps.setInt(1, 3);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString("lastName")+ " "+ rs.getString("firstName")+ " "+ rs.getString("balance"));
				
			}
		}
		
	public static void main(String[] args) {
		
		SelectPreparedStatement sp = new SelectPreparedStatement();
		try {
			sp.view_Record();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
