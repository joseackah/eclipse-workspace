<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Profile</title>
</head>
<body>

<%
try{
	String id = (String)session.getAttribute("empId");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Physics1//,");
	PreparedStatement ps = conn.prepareStatement("select * from ems_login where empId=?");
	ps.setString(1, id);
	ResultSet rs = ps.executeQuery();
	if(rs.next()){
		out.println(rs.getString(1) +" "+ rs.getString(2)+ " "+ rs.getString(3)+ " " + rs.getString(4));
	}
	
}catch(Exception e){
	out.println(e);
	
}

%>


</body>
</html>