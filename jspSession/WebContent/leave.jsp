<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leave application</title>
</head>
<body>
<% 
String emplyId = (String)session.getAttribute("empId");
//String emplyId = request.getParameter("Id");
String dateOfLeave = request.getParameter("date");
String leaveApplyFor = request.getParameter("laf");
String reasonForLeave = request.getParameter("rol");
String daysApplyFor = request.getParameter("daf");
String dateLeaveEnd = request.getParameter("datele");


try{
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Physics1//,");
	PreparedStatement ps = conn.prepareStatement("insert into ems_leave(empId,dateOfLeave,leaveApplyFor,reasonForLeave,daysApplyFor,dateLeaveEnd ) values (?,?,?,?,?,?)");
	
	ps.setString(1, emplyId);
	ps.setString(2, dateOfLeave);
	ps.setString(3, leaveApplyFor);
	ps.setString(4, reasonForLeave);
	ps.setString(5, daysApplyFor);
	ps.setString(6, dateLeaveEnd);
	ps.execute();
	
	
	
	
	
	response.sendRedirect("userpage.jsp");
	
}catch(Exception e){
	out.println(e + "wrong details entry");
}



%>


</body>
</html>