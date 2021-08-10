<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Display Students</title>
</head>
<body>
	
		<table border="1">
			<thead>
				<tr>
					<th> STUDENT ID</th>
					<th> FIRST NAME</th>
					<th> LAST NAME</th>
					<th>ADDRESS</th>
					<th>ACADEMIC LEVEL</th>
					<th>PROGRAMME</th>
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${enroll}" var="enroll">
					<c:url value="updateStudent" var="updateURL">
						<c:param value="${enroll.id}" name="id"></c:param>
						<c:param value="${enroll.firstName}" name="firstName"></c:param>
						<c:param value="${enroll.lastName}" name="lastName"></c:param>
						<c:param value="${enroll.address}" name="address"></c:param>
						<c:param value="${enroll.academicLevel}" name="academicLevel"></c:param>
						<c:param value="${enroll.programme}" name="programme"></c:param>
					</c:url>

					<c:url value="remove" var="removeURL">
						<c:param value="${enroll.id}" name="id"></c:param>
					</c:url>

					<tr>
						<td>${enroll.id}</td>
						<td>${enroll.firstName}</td>
						<td>${enroll.lastName}</td>
						<td>${enroll.address}</td>
						<td>${enroll.academicLevel}</td>
						<td>${enroll.programme}</td>
						<td><a href="${updateURL }">Update Enrollment</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete Enrollment</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>




	


</body>
</html>