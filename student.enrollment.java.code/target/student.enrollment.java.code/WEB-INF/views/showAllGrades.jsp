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
<title>Display Grades of Students</title>
</head>
<body>
	
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>COURSE</th>
					<th>CUMULATIVE GPA</th>
					<th>FINAL GPA</th>
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${grades}" var="grades">
					<c:url value="updateGrade" var="updateGradeURL">
						<c:param value="${grades.id}" name="id" ></c:param>
						<c:param value="${grades.course}" name="course"></c:param>
						<c:param value="${grades.ccgpa}" name="ccgpa"></c:param>
						<c:param value="${grades.finalGpa}" name="finalGpa"></c:param>
					</c:url>

					<c:url value="delete" var="deleteGradeURL">
						<c:param value="${grades.id}" name="id"></c:param>
					</c:url>

					<tr>
						<td>${grades.id}</td>
						<td>${grades.course}</td>
						<td>${grades.ccgpa}</td>
						<td>${grades.finalGpa}</td>
						<td><a href="${updateGradeURL }">Update</a> | <a
							href="${deleteGradeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>


			</tbody>




		</table>




	


</body>
</html>