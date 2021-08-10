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
<title>Display Product</title>
</head>
<body>
	
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>DESCRIPTION</th>
					<th>PRICE</th>
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product}" var="product">
					<c:url value="formUpdate" var="updateProductURL">
						<c:param value="${product.id}" name="id"></c:param>
						<c:param value="${product.name}" name="name"></c:param>
						<c:param value="${product.desc}" name="desc"></c:param>
						<c:param value="${product.price}" name="price"></c:param>
					</c:url>

					<c:url value="delete" var="deleteProductURL">
						<c:param value="${product.id}" name="id"></c:param>
					</c:url>

					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.desc}</td>
						<td>${product.price}</td>
						<td><a href="${updateProductURL }">Update</a> | <a
							href="${deleteProductURL }"
							onclick="if (!confirm('Are you sure you want to delete this record/student?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>


			</tbody>




		</table>




	


</body>
</html>