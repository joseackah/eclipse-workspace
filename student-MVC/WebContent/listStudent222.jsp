<%@page import="com.aiti.entities.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<%
List<Student> thestudent = (List<Student>)request.getAttribute("list_student");


%>





<body>

	
	
	<table border ="1">
		<thead>
			<tr> 
			<th> Student ID </th>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Email </th>
			</tr>
	 	</thead>
		<tbody>
		<c:forEach items="${list_student}" var = "list">
		
		<tr> <td> ${list.studentId} </td> 
		<td> ${list.firstName } </td>
		<td> ${list.lastName } </td>
		<td> ${list.email } </td>
		
		
		</tr>
		</c:forEach>
		
		
		
		 <%
		for(Student tempStudent:thestudent){ %>
			
			<tr> 
			
			<td><%=tempStudent.getStudentId()%> </td>
			<td> <%=//tempStudent.getFirstName()  %> </td>
			<td><%=//tempStudent.getLastName() %> </td>
			<td> <%=//tempStudent.getEmail() %> </td>
			
			</tr>		
			
			-->
			
	 		<%//}	%>
	 		
		</tbody>
		
	</table>

</body>
</html>