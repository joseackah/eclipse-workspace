<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Update</title>
</head>
<body>


	<form:form action="userEdit" modelAttribute="users" method="post">
		<table>
			<tr>
				<td><label>Id:</label></td>
				<td><form:input path="id" readonly="true" /> </td>
			</tr>
			<tr>
				<td><label>Name:</label></td>
				<td><form:input path="name" /> </td> 
			</tr>
			<tr>
				<td><label> Email:</label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><form:button>Update</form:button></td>
			</tr>
		</table>
	</form:form>
	${result}

</body>
</html>