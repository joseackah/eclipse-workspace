<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.io.*"%>
<%@ page import="javax.servlet.http.Part" %>
<%@ page import="javax.servlet.annotation.MultipartConfig" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>image saving</title>
</head>
<body>
 <%
//int id = 1234;




	

try{
	
String username = request.getParameter("username");
String password = request.getParameter("password");
String file = request.getParameter("file");
String email = request.getParameter("email");
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schools", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("insert into user_login(user_name, password, email,user_pic) values (?,?,?,?)");
//ps.setInt(1, id++);
ps.setString(1, username);
ps.setString(2, password);
ps.setString(3, email);

File fil= new File(file);
FileInputStream  fiS= new FileInputStream(file);
//InputStream fiS = part.getInputStream();
ps.setBinaryStream(4,fiS, fiS.available());
//ps.setBlob(4, fiS);



ps.executeUpdate();



response.sendRedirect("homePage");

}catch(Exception e){
out.println(e);
}



%>


</body>
</html>