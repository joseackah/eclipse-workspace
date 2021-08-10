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
<title>Search Student</title>
</head>
<body>
<h3>SEARCH STUDENT</h3> <br/> <br/>

	<form action="home?page" method="get">
		<input type="hidden" name="page" value="searchForStudent">
		<table class="formtable">
		
		<tbody>
		<!-- <del></del> -->
		<tr> 
		<td class = "label"> <label>First Name</label> </td>
		<td> <input class="control" type="text" name="firstName" > </td>
		</tr>
		
		<tr> 
		<td class = "label"> <label>last Name</label> </td>
		<td> <input class="control" type="text" name="lastName" > </td>
		</tr>
		
		
		<tr> 
		<td class = "label"> <label></label> </td>
		<td> <input class= "control" type="submit"  value="search" onsubmit="window.location.href='searchStudent'"> </td>
				
		</tr>
		
		</tbody>

		</table>

	</form>

</body>
</html>