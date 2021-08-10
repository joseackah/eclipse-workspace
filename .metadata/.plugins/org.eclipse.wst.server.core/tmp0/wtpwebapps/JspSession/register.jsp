<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
<% 
String empId = request.getParameter("empId");
String user = request.getParameter("user");
String pass = request.getParameter("pass");
String email = request.getParameter("email");
String address = request.getParameter("address");
String education = request.getParameter("education");
String mobile = request.getParameter("mobile");
String mid = request.getParameter("mid");
String deptno = request.getParameter("deptno");

try{
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Physics1//,");
	PreparedStatement ps = conn.prepareStatement("insert into ems_login values (?,?,?,?)");
	ps.setString(1, empId);
	ps.setString(2, user);
	ps.setString(3, pass);
	ps.setString(4, email);
	ps.execute();
	
	ps= conn.prepareStatement("insert into ems_details values (?,?,?,?,?,?)");
	ps.setString(1, empId);
	ps.setString(2, address);
	ps.setString(3, education);
	ps.setString(4, mobile);
	ps.setString(5, deptno);
	ps.setString(6, mid);
	ps.execute();
	//conn.commit();
	
	response.sendRedirect("index.html");
	
}catch(Exception e){
	out.println(e);
}



%>

</body>
</html>