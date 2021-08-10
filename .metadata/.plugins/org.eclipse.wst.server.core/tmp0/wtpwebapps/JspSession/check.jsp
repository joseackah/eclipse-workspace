<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Page</title>
</head>
<body>
<% 
String u = request.getParameter("empId");
String p = request.getParameter("pass");
try{
	
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Physics1//,");

PreparedStatement ps = c.prepareStatement("select * from ems_login where empId =? and pass=?");

ps.setString(1, u);
ps.setString(2, p);

ResultSet rs = ps.executeQuery();

if(rs.next()){
	session.setAttribute("empId", u);
	session.setAttribute("pass", p);
	
	RequestDispatcher rd = request.getRequestDispatcher("userpage.jsp");
	rd.forward(request, response);
}
else
	response.sendRedirect("loginform.jsp");

}catch(Exception e){
	
}

%>


</body>
</html>