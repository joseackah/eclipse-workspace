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
<title>Add New Student</title>
</head>
<body>
<h2>ADD NEW STUDENT</h2> <br/> <br/>
	<form action="home" method="post">
	
		<input type="hidden" name="from" value="addRecord">
		<table class="formtable">
		<tbody>
		<tr> 
		<td class = "label"> <label>First Name</label> </td>
		<td> <input class= "control" type="text" name="firstName"> </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>last Name</label> </td>
		<td> <input class= "control" type="text" name="lastName"> </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>Email</label> </td>
		<td> <input class= "control" type="email" name="email"> </td>
				
		</tr>
		<tr> 
		<td class = "label"> <label></label> </td>
		<td> <input class= "control" type="submit"  value="submit"> </td>
		
		
		</tr>
		
		</tbody>

		</table>

	</form>

</body>
</html>