<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Grades</title>
</head>
<body>

	<form:form action="gradesUpdate" modelAttribute="grades" method="post">
		<table>
			<tr>
				<td><label>STUDENT ID</label></td>
				<td><form:input path="id" readonly="true"/></td>
			</tr>
			<tr>
				<td><label>COURSE</label></td>
				<td><form:input path="course" /></td>
			</tr>
			<tr>
				<td><label>CUMULATIVE GPA</label></td>
				<td><form:input path="ccgpa" /></td>
			</tr>
			<tr>
				<td><label>FINAL GPA</label></td>
				<td><form:input path="finalGpa" /></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td>
					<button>Update Grade</button>
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>