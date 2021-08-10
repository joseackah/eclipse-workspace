<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Grades Upload</title>
</head>
<body>


	<form action="studentGrade" method="post">

		<table>
			<tr>
				<td><label>Student Id</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>Course</label></td>
				<td><input type="text" name="course"></td>
			</tr>
			<tr>
				<td><label>Cumulative GPA</label></td>
				<td><input type="text" name="ccgpa"></td>
			</tr>
			<tr>
				<td><label>Final GPA</label></td>
				<td><input type="text" name="finalGpa"></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Upload"></td>
			</tr>

		</table>


	</form>
	${sgrades}

</body>
</html>