<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<form action="RegisterUser" method="post"> <br/><br/>
Id: <input type="text" name="id"><br/><br/>
Name: <input type="text" name="name"><br/><br/>
Email: <input type="email" name="email"><br/><br/>
		<input type="submit" value="Register">

</form>

 ${result}

</body>
</html>