<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
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
String id = request.getParameter("student_id");
String firstName = request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String subject = request.getParameter("subjects");
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
	 ;

int di = 0;

try{
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schools", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("insert into primary_one_results values (?,?,?,?,?,?,?)");
ps.setInt(1, di++);
ps.setString(2, firstName);
ps.setString(3, grade);
ps.setString(4, lastName);
ps.setDouble(5, mark);
ps.setString(6, id);
ps.setString(7, subject);


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