<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>


	<form action="enrollStudents" method="post">

		<table>
			<tr>
				<td><label>Student Id</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td><label>Academic Level</label></td>
				<td><input type="text" name="academicLevel"></td>
			</tr>
			<tr>
				<td><label>Programme of Study</label></td>
				<td><input type="text" name="programme"></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Enroll"></td>
			</tr>
		</table>
	</form>
	
	${senroll}

</body>
</html>