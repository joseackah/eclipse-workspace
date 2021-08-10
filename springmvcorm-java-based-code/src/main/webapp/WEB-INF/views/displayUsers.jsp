<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
<!--   <style type="text/css">
.formtable {
	padding: 10px;
	border: 1px solid blue;
	width: 400px;
	background-color: green;
}

input[type=text,button] {
	width: 250px;
}

input[type=email] {
	width: 250px;
}

.label {
	text-align: right;
	vertical-align: top;
}

.control {
	margin-left: 10px;
}
</style>-->
<meta charset="ISO-8859-1">
<title>Registered Users</title>
</head>
<body>
	<div id="header" style="width:50%; text-align:center"> 
	<h2>Registered Users</h2> 
	</div> <br/><br/>

	<input type="hidden" name="users" class="add-button"
		value="RegistrationPage">
	<input class="add-button" type="button" value="Add User"
		onclick="window.location.href='RegistrationPage'">
	<div id="container">
		<table border="1">
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>email</th>
					<th>action</th>
				</tr>

			</thead>

			<tbody>
				<c:forEach items="${users}" var="user">
					<c:url value="updateForm" var="updateURL">

						<c:param name="userId" value="${user.id }"></c:param>

					</c:url>

					<c:url value="delete" var="deleteURL">

						<c:param name="userId" value="${user.id }"></c:param>

					</c:url>


					<tr>
						<td>${user.id}</td>
						<td>${user.name}</td>
						<td>${user.email}</td>
						<td><a href="${updateURL }">Edit</a> | <a href="${deleteURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>







</body>
</html>