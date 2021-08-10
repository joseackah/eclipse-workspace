package com.aiti.model;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.aiti.entities.Student;

public class StudentModel {
	
	public List<Student> listAllStudent(DataSource datasource){
		
		List<Student> listStudents = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		
		try {
			conn = datasource.getConnection();
			
			stmt = conn.createStatement();
			String sql = "select * from students";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				listStudents.add(new Student(rs.getInt("student_id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email")));
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listStudents;
	}
	
	
	public void addNewStudent (DataSource datasource, Student newStudent) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = datasource.getConnection();
			
			String firstName = newStudent.getFirstName();
			String lastName = newStudent.getLastName();
			String email = newStudent.getEmail();
			
			String query = "insert into students (firstName, lastName, email) values(?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			
			ps.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
public void editStudent(DataSource datasource, Student editRecord) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = datasource.getConnection();
			int studentId = editRecord.getStudentId();
			String firstName = editRecord.getFirstName();
			String lastName = editRecord.getLastName();
			String email = editRecord.getEmail();
			
			String query = "update students set firstName=?, lastName=?, email=? where student_id=?";
			ps = con.prepareStatement(query);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			ps.setInt(4, studentId);
			
			ps.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
			//out.println(e.getMessage());
		}
	}
	
/*	
public void deleteStudent(DataSource datasource, Student deleteRecord) {
	
	Connection con = null;
	PreparedStatement ps = null;
	
	
	try {
		con = datasource.getConnection();
		int studentId = deleteRecord.getStudentId();
		//String firstName = deleteRecord.getFirstName();
		//String lastName = deleteRecord.getLastName();
		//String email = deleteRecord.getEmail();
		
		String query = "delete from students where student_id=?";
		ps = con.prepareStatement(query);
		//ps.setString(1, firstName);
		//ps.setString(2, lastName);
		//ps.setString(3, email);
		ps.setInt(1, studentId);
		
		ps.execute();
	} catch (SQLException e) {
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}*/

public void deleteStudent(DataSource datasource, int studentId) {
	
	Connection con = null;
	PreparedStatement ps = null;
	
	
	try {
		con = datasource.getConnection();
		//int studentId = deleteRecord.getStudentId();
		//String firstName = deleteRecord.getFirstName();
		//String lastName = deleteRecord.getLastName();
		//String email = deleteRecord.getEmail();
		
		String query = "delete from students where student_id=?";
		ps = con.prepareStatement(query);
		//ps.setString(1, firstName);
		//ps.setString(2, lastName);
		//ps.setString(3, email);
		ps.setInt(1, studentId);
		
		ps.execute();
	} catch (SQLException e) {
		
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}

public List<Student> searchRecord(DataSource datasource, String firstName){
	
	List<Student> searchStudent = new ArrayList<>();
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	
	
	try {
		conn = datasource.getConnection();
		
		
		String sql = "select * from students where firstName ='?%' or lastName = '?%'";
		ps = conn.prepareStatement(sql);
		//ps.setInt(1, stId);
		ps.setString(1, firstName);
		//ps.setString(2, lastName);
		
		rs = ps.executeQuery();
		
		while (rs.next()) {
			searchStudent.add(new Student(rs.getString("firstName"), rs.getString("lastName"), rs.getString("email")));
		}
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return searchStudent;
}





public void lookForStudent (DataSource datasource, Student newStudent) {
	
	Connection con = null;
	PreparedStatement ps = null;
	
	try {
		con = datasource.getConnection();
		
		String firstName = newStudent.getFirstName();
		String lastName = newStudent.getLastName();
		
		
		String query = "select * from students where firstName like '?%' OR lastName like '?%'";
		ps = con.prepareStatement(query);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		
		
		ps.execute();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}


public List<Student> searchStudentName(DataSource datasource, String searchName) {
	
	List<Student> student = new ArrayList<>();
	Connection myCon = null;
	PreparedStatement pst = null;
	ResultSet rss = null;
	
	try {
		myCon = datasource.getConnection();
		
		if(searchName != null && searchName.trim().length()> 0) {
		//create sql statment to handle search
		String sql = "select * from students where lower(firstName) like ? or lower(lastName) like ?";
		pst = myCon.prepareStatement(sql);
		String searchNameLike = "%" + searchName + "%";
		
		
		pst.setString(1, searchNameLike);
		pst.setString(2, searchNameLike);
		
		
		
		}
		else {
			String sql = "select * from students order by lastName";
			pst = myCon.prepareStatement(sql);
		
		}
		rss= pst.executeQuery();
		
		while(rss.next()) {
			int studentId = rss.getInt("student_id");
			String firstName = rss.getNString("firstName");
			String lastName = rss.getString("lastName");
			String email = rss.getString("email");
			
			Student tempStudent = new Student(studentId, firstName, lastName, email);
			
			student.add(tempStudent);		
			
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	
	return student;
}



}
