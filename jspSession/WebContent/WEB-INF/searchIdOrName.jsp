<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String searchName = request.getParameter("search");

try{
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschool", "root", "Physics1//,");
	PreparedStatement ps = conn.prepareStatement("select * from students where student_id = ? or first_name = ?");
	
	ps.setString(1, searchName);
	ps.setString(2, searchName);

	ps.execute();
	
	
	
	
	
	response.sendRedirect("userpage.jsp");
	
}catch(Exception e){
	out.println(e + "wrong details entry");
}



%>

</body>
</html>