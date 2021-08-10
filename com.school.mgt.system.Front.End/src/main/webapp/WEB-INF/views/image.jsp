<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.io.*"%>
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
String username = request.getParameter("username");
String password = request.getParameter("password");
String file = request.getParameter("file");
String email = request.getParameter("email");

/* String subject = request.getParameter("subjects");
String marks = request.getParameter("marks");
double mark = Double.parseDouble( marks);	
//String grade = request.getParameter("grade");
 String grade = "";  
 if(mark >=80){
	 grade = "A";
 }else if(mark >=75 && mark <80){
	 grade = "B+";
 }else if(mark >=70 && mark <74){
	 grade = "B";
 }else if(mark >=65 && mark <70){
	 grade = "C+";
 }else if(mark >=60 && mark <65){
	 grade = "C";
 }else if(mark >=55 && mark <60){
	 grade = "D+";
 }else if(mark >=50 && mark <55){
	 grade = "D";
 }else if(mark >=45 && mark < 50){
	 grade = "E";
 }else 
	 grade = "F";
	 ; */



try{
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schools", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("insert into user_login(user_id, user_name, password, email) values (?,?,?,?)");
//ps.setInt(1, id++);
ps.setString(1, username);
ps.setString(2, password);
ps.setString(3, email);

File fil= new File("our mission.png");
FileInputStream  fiS= new FileInputStream(fil);
ps.setBinaryStream(4, fiS, fiS.available());



ps.execute();

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