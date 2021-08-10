<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
       
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add product</a></li>
            
            
            
        </ul>

    </nav>

 <br />
    <br />
<h1 style='text-align: center;'>Welcome to Bernice's International Preparatory School Admin Login Form</h1>
 <br />
    <br />


 <div class="wrapper"><h2 style="text-align: center;">Admin Details</h2>
<form action="home"  method="post">
		<table class="form">
			<tr>
				<td><label>Admin Id : </label></td> 
				<td><input style="border-radius: 3em; margin-bottom: 1em; height:3.5em; width: 120%" type="text" placeholder="Id" value=""  /></td>
			</tr>
			<tr>
				<td><label>Password : </label></td>
				<td><input style="border-radius: 3em; height: 3.5em; width: 120%;" type="text"  placeholder="Password" value="" /></td>
			</tr>
		
			
			<tr id= "sub">
				<td><label></label></td>
				<td id="sub">
				<div id="sub">	<button style=" border-radius: 5em;  width: 95%; height: 100%; padding: 0.40em; margin-top: 1em;"><h2 style="padding:5px; ">Log In</h2></button></div>
				
				</td>
			</tr>
		</table>

	</form>
	<div style="display:; align-content: inline-block;">
	<a href="${pageContext.request.contextPath}/schoolStudents/index"> <button style=" border-radius: 5em; display: right; width: 95%; margin-bottom: 1em;"><h2 style="padding:10px;">Exit</h2></button> </a> <br />
	<a href="${pageContext.request.contextPath}/general/logIn"> <button style=" border-radius: 5em; display: right; width: 95%;"><h2 style="padding:10px; display:;">Clear</h2></button> </a>
	</div>
	</div>
	
	
	

</body>
</html>