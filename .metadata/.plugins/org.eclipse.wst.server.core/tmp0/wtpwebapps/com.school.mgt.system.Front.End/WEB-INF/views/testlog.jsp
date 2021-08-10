<%@ page import="java.sql.*"%>

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
String username = request.getParameter("username");
//String password = request.getParameter("password");
Integer id = Integer.parseInt(username);

try{

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("select * from user_login where user_id=?");
ps.setInt(1, id);
//ps.setString(2, password);
ResultSet rs = ps.executeQuery();

while(rs.next() ){
	//out.println( rs.getInt(1) + rs.getString (2) + rs.getString(3)+ rs.getString(4));
response.sendRedirect("home");
}
}catch(Exception e){
	out.println(e);
	//response.sendRedirect("homePage");
	
}
%>
</body>
</html>