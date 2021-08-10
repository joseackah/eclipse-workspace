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

	<form:form action="productUpdateForm" modelAttribute="product" method="POST">
		<table>
			<tr>
				<td><label>ID</label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><label>NAME</label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><label>DESCRIPTION</label></td>
				<td><form:input path="desc" /></td>
			</tr>
			<tr>
				<td><label>PRICE</label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td>
					<button>Update</button>
				</td>
			</tr>
		</table>



	</form:form>

</body>
</html>