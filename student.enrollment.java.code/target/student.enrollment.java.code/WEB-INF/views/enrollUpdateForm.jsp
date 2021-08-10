<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>

	<form:form action="enrollUpdate" modelAttribute="enroll"
		method="post">
		<table>
			<tr>
				<td><label>Student Id</label></td>
				<td><form:input path="id" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><label>Academic Level</label></td>
				<td><input type="text" name="academicLevel"></td>
			</tr>
			<tr>
				<td><label>Programme</label></td>
				<td><input type="text" name="programme"></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td>
					<button>Update Enrollment</button>
				</td>
			</tr>
		</table>



	</form:form>

</body>
</html>