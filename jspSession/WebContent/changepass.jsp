<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<%
String u = (String)session.getAttribute("empId");
String np = request.getParameter("npass");
String cp = request.getParameter("cpass");

try{
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Physics1//,");
	if(np.equals(cp)){
	PreparedStatement ps = conn.prepareStatement("update ems_login set pass =? where empId=?");
	ps.setString(1, np);
	ps.setString(2, u);
	ps.execute();
	response.sendRedirect("userpage.jsp");
	}
	else
	{
		out.println("new password does not match.");
	}
	
	
}catch(Exception e){
	
}

%>

</body>
</html>