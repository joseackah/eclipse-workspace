<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Results Processing</title>
</head>
<body>
 <%
String courseLevel = request.getParameter(" ");
/* String  = request.getParameter(" ");
String  = request.getParameter(" ");
String  = request.getParameter(" ");
String  = request.getParameter(" ");
double mark = Double.parseDouble( marks); */
//String grade = request.getParameter("grade");
 String grade = "";  
 

int di = 0;

try{
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schools", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("select * from admission_table where course_level =?");
ps.setInt(1, di++);
//ps.setString(2, firstName);
//ps.setString(3, grade);
//ps.setString(4, lastName);
//ps.setDouble(5, mark);
//ps.setString(6, id);
//ps.setString(7, subject);


ResultSet rs = ps.executeQuery();

/* ps= conn.prepareStatement("insert into ems_details values (?,?,?,?,?,?)");
ps.setString(1, empId);
ps.setString(2, address);
ps.setString(3, education);
ps.setString(4, mobile);
ps.setString(5, deptno);
ps.setString(6, mid);
ps.execute();
conn.commit(); */

response.sendRedirect("homePage");

}catch(Exception e){
out.println(e);
}



%>


</body>
</html>