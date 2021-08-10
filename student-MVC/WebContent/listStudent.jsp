<%@page import="com.aiti.entities.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/main.css">
<meta charset="ISO-8859-1">


<title>Student List</title>
</head>

<%
List<Student> thestudent = (List<Student>)request.getAttribute("list_student");


%>





<body>
<div id="wrapper">
<div id="header">

<h2>STUDENT LIST</h2>
</div>
</div>
<br/> <br/>
<div id = "container">
<div id= "content">

	  <input type = "hidden" name ="page" class="add-button" value="addStudent">
	  <input class="add-button" type="button" value="Add Student" onclick="window.location.href='addStudent-form.jsp'">
	<!--<form action="" >
	<input class="add-button" type="search"> 
	</form>
	 <br/> <br/>--><br/> <br/>
	 
	 <form action="home" method = "get" >
	 <input type = "hidden" name ="page" class="add-button" value="search"> 
	<input placeholder="Search Student" class="add-button" type="text" value="" name="searchName" style="align-content:left;">
	<input type="submit" value="search" class = "add-button">
		 
	 </form>
	
	<table border ="1">
		<thead>
			<tr> 
			<th> Student ID </th>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Email </th>
			<th>Action </th>
			
			</tr>
	 	</thead>
		<tbody>
		<c:forEach items="${list_student}" var = "list">
		<c:url value="home" var="updateURL">
		<c:param name="page" value="editStudent"></c:param>
		<c:param name="studentId" value="${list.studentId }"></c:param>
		<c:param name="firstName" value="${list.firstName }"></c:param>
		<c:param name="lastName" value="${list.lastName }"></c:param>
		<c:param name="email" value="${list.email }"></c:param>
		</c:url>
		<!--  
		<c:url value="home" var="deleteURL">
		<c:param name="page" value="deleteStudent"></c:param>
		<c:param name="studentId" value="${list.studentId }"></c:param>
		<c:param name="firstName" value="${list.firstName }"></c:param>
		<c:param name="lastName" value="${list.lastName }"></c:param>
		<c:param name="email" value="${list.email }"></c:param>
		</c:url>
		-->
		<c:url value="home" var="deleteURL">
		<c:param name="page" value="deletStudent"></c:param>
		<c:param name="studentId" value="${list.studentId }"></c:param>
		<c:param name="firstName" value="${list.firstName }"></c:param>
		<c:param name="lastName" value="${list.lastName }"></c:param>
		<c:param name="email" value="${list.email }"></c:param>
		</c:url>
		<!--  
		<c:url value="home" var="searchURL">
		<c:param name="page" value="searchForStudent"></c:param>
		<c:param name="studentId" value="${list.studentId }"></c:param>
		<c:param name="firstName" value="${list.firstName }"></c:param>
		<c:param name="lastName" value="${list.lastName }"></c:param>
		<c:param name="email" value="${list.email }"></c:param>
		</c:url>
		-->
		<tr> <td> ${list.studentId} </td> 
		<td> ${list.firstName } </td>
		<td> ${list.lastName } </td>
		<td> ${list.email } </td>
		<td> <a href="${updateURL }">Edit</a>|
		     <a href="${deleteURL }" onclick = "if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
		</td>
		<!--<td>  </td>  -->
		
		</tr>
		</c:forEach>
			 		
		</tbody>
		
	</table>
	
	</div>
	</div>

</body>
</html>