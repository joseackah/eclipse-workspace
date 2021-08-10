package student_mgt_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentMgt {
	int studentId;
	String studentName;
	String address;
	String className;
	float marks;
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Scanner input = new Scanner(System.in);
	
	public StudentMgt() {
		
	}
	
	public void addStudent() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentMgtSystem", "root", "Physics1//,");
			ps = connection.prepareStatement("insert into studentMgt values(?,?,?,?,?)");
			System.out.println("Enter student ID: ");
			studentId = input.nextInt();
			ps.setInt(1, studentId);
			
			System.out.println("Enter student name: ");
			studentName = input.next();
			ps.setString(2, studentName);
			
			System.out.println("Enter student address: ");
			address = input.next();
			ps.setString(3, address);
			
			System.out.println("Enter student class: ");
			className = input.next();
			ps.setString(4, className);
			
			System.out.println("Enter student marks: ");
			marks = input.nextFloat();
			ps.setFloat(5, marks);
			
			boolean h = ps.execute();
			int hh = (h)?0:1;
			System.out.println(hh + " row(s) affected.");
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void updateAddress() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentMgtSystem", "root", "Physics1//,");
			ps = connection.prepareStatement("update studentMgt set address =? where studentId=?");
			System.out.println("Enter Student address: ");
			address = input.next();
			ps.setString(1, address);
			System.out.println("Enter Student ID: ");
			studentId = input.nextInt();
			ps.setInt(2, studentId);
			int j = ps.executeUpdate();
			System.out.println(j + " row(s) affected.");
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentMgtSystem", "root", "Physics1//,");
			ps = connection.prepareStatement("delete from studentMgt where studentId=?");
			
			System.out.println("Enter student ID: ");
			studentId = input.nextInt();
			ps.setInt(1, studentId);
			int i = ps.executeUpdate();
			System.out.println(i + " row(s) affected.");
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void displayAll() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentMgtSystem", "root", "Physics1//,");
			ps = connection.prepareStatement("select * from studentMgt");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+ "   "+ rs.getString(2)+ "   "+ rs.getString(3)+ "   " + rs.getString(4) + "   "+ rs.getFloat(5));
				
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		StudentMgt smgt = new StudentMgt();
		
		//smgt.addStudent();		
		//smgt.updateAddress();
		//smgt.deleteStudent();
		//smgt.displayAll();
	}
		
}
