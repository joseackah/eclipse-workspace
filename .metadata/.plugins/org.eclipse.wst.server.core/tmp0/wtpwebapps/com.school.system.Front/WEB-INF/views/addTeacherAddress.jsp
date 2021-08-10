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
<title>Teacher Address Form</title>
</head>
<body>

 
<div class="wrapper" >
<h2>Add Teacher Address</h2>
<form action="saveUser" method="post" id="main_form" class="main_form">
<!--  <div class="form"> Id: <input type="text" name="id" placeholder="Id"  hidden= "hidden"/></div>  -->
<div class="form">Town: <input type="text" name="town" placeholder="Town" required= "required" /></div>
<div class="form">City: <input type="text" name="city" placeholder="City" required="required" /></div>
<div class="form">Postal Code: <input type="text" name="postalCode" placeholder="Postal Code" required="required"/></div>
<div class="form">Residence Address/No.: <input type="text" name="resNumber" placeholder="Residence Address/No." required="required"/></div>


<div class="" id="sub"> <input type="submit" value="Save" /></div>
</form>
<div id="sub"> <a href="${pageContext.request.contextPath}//userForm"> <input type="submit" value="clear"> </a> <a href="${pageContext.request.contextPath}/ecommerce/indexForm"> <input type="submit" value="Exit"> </a></div>
</div>
</body>
</html>