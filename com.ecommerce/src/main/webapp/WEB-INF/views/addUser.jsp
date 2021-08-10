<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>

 
<div class="wrapper" >
<h2>Add New User</h2>
<form action="saveUser" method="post" id="main_form" class="main_form">
<!--  <div class="form"> Id: <input type="text" name="id" placeholder="Id"  hidden= "hidden"/></div>  -->
<div class="form">First Name: <input type="text" name="firstName" placeholder="firstName" required= "required" /></div>
<div class="form">Last Name: <input type="text" name="lastName" placeholder="lastName" required="required" /></div>
<div class="form">User Name: <input type="text" name="userName" placeholder="userName" required="required"/></div>
<div class="form">email Address: <input type="text" name="email" placeholder="email" required="required"/></div>


<div class="" id="sub"> <input type="submit" value="Save" /></div>
</form>
<div id="sub"> <a href="${pageContext.request.contextPath}/users/userForm"> <input type="submit" value="clear"> </a> <a href="${pageContext.request.contextPath}/ecommerce/indexForm"> <input type="submit" value="Exit"> </a></div>
</div>
</body>
</html>