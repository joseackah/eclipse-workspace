<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.formtable {
	padding: 10px;
	border: 1px solid blue;
	width: 400px;
	background-color: green;
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
<title>User Registration</title>
</head>
<body>

<form action="registerUser" method="post">
<table class="formtable">
<tr> 
<td class="label"> <label>User Id</label> </td>
<td> <input class="control" type="text" name="id" /> </td>
</tr>
<tr> 
<td class="label"> <label>Name</label> </td>
<td> <input class="control" type="text" name="name" /> </td>
</tr>
<tr> 
<td class="label"> <label>Email</label> </td>
<td> <input class="control" type="email" name="email" /> </td>
</tr>
<tr> 
<td class="label"> <label></label> </td>
<td> <input type="submit" value="Register" /> </td>
</tr>
</table>
</form>
 ${result}


<!--  
<form:form action="registerUser" modelAttribute="users" method="POST">
Id:<form:input path="id"/> <br/><br/>
Name:<form:input path="name"/><br/><br/>
Email:<form:input path="email"/><br/><br/>
<form:button>Register</form:button>
</form:form>-->


</body>
</html>