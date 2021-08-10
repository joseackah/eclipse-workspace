<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.formtable {
	padding: 10px;
	border: 1px solid blue;
	width: 400px;
}

input[type=text] {
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
</style>
<meta charset="ISO-8859-1">
<title>Edit Users</title>
</head>
<body>
	<h3>EDIT USERS</h3>
	<br />
	<br />

	<form action="userEdit"  method="post">

		<input type="hidden" name="" value="editForm"> 
		<input type="text" name="id" value="${param.id }">
		<table class="formtable">
			<tbody>
				<del></del>
				<tr>
					<td class="label"><label>Name</label></td>
					<td><input class="control" type="text" name="name"
						value="${param.name }" required></td>
				</tr>

				<tr>
					<td class="label"><label>Email</label></td>
					<td><input class="control" type="email" name="email"
						value="${param.email }" required></td>
				</tr>
				<tr>
					<td class="label"><label></label></td>
					<td><input class="control" type="submit" value="submit">
					</td>
				</tr>
			</tbody>
		</table>

	</form>
	${result}


	<!--  
	<form:form action="editForm" method="get">
	<c:forEach items="${users}" var="user">
	Id: <form:input path="id"  value="${user.id}" />
	Name: <form:input path="name" value="${user.name}" />
	Email: <form:input path="email" value="${user.email}" />
				<form:button>Edit</form:button>
			</c:forEach>
			
	</form:form>
	${result}
    
	<form action="${users }" method="post">
	
		<input type="hidden" name="users" value="editUser">
		<input type ="hidden" name="id" value="${param.id }">
		<table class="formtable">
		
		<tbody>
		<del></del>
		<tr> 
		<td class = "label"> <label>Name</label> </td>
		<td> <input class="control" type="text" name="name" value="${param.name }" required> </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>Email</label> </td>
		<td> <input class="control" type="email" name="email" value ="${param.email }" required> </td>
				
		</tr>
		<tr> 
		<td class = "label"> <label></label> </td>
		<td> <input class= "control" type="submit"  value="submit"> </td>
		
		
		</tr>
		
		</tbody>

		</table>

	</form>
-->
</body>
</html>