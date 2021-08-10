<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.formtable {
		padding: 10px;
		border: 1px solid blue;
		width: 400px;
		background-color: grey;

}

input [type = number]{
		padding: 10px;
		border: 15px solid blue;
		width: 5px;
		background-color: red;
}
input[type = text]{
		width: 250px;
		}
input[type=email]{
		width: 250px;
}
.label{
		text-align: right;
		vertical-align: top;
}

.control{
		margin-left: 10px;
}


</style>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
</head>
<body>
<h3>DELETE STUDENT</h3> <br/> <br/>
	<form action="home" method="post">
	
		<input type="hidden" name="from" value="deleteStudent">
		<input class="controli" type ="number" name="studentId" value="${param.studentId }" readonly="readonly">
		<table class="formtable">
		
		<tbody>
		<!-- <del></del> -->
		<tr> 
		<td class = "label"> <label>First Name</label> </td>
		<td> <input class="control" type="text" name="firstName" value="${param.firstName }" required> </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>last Name</label> </td>
		<td> <input class="control" type="text" name="lastName" value="${param.lastName }" required> </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>Email</label> </td>
		<td> <input class="control" type="email" name="email" value ="${param.email }" required> </td>
				
		</tr>
		<tr> 
		<td class = "label"> <label></label> </td>
		<td> <input class= "control" type="submit"  value="Delete"> </td>
		<td><input class= "control" type="reset"  value="Reset" onclick = "window.location.href='index.jsp'; return false"></td>
		
		</tr>
		
		</tbody>

		</table>

	</form>

</body>
</html>