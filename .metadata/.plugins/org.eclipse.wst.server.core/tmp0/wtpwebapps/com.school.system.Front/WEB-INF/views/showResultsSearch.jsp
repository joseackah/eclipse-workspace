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
<title>Student Record Update</title>
</head>
<body>
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
       
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Back</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="">to assign</a></li>
            
            
        </ul>

    </nav>

 <br />
    <br />
<h1 style='text-align: center;'>Welcome to Bernice's International Preparatory School Record Update</h1>
 <br />
    <br />


 <div class="wrapper"><h2>Student Details</h2>
<form:form action="savePrimaryOne" 	modelAttribute = "student" method="post">
		<table class="form">
			<tr>
				<td><label>Student Id</label></td>
				<td><form:input path="studentId"  value="${student.studentId }" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input path="firstName" value="${student.firstName}" /></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input path="lastName" value="${student.lastName}" /></td>
			</tr>
			<tr>
				<td><label>Subject</label></td>
				<td><form:input path="" value="" /></td>
			</tr> 
			<tr>
				<td><label>Marks</label></td>
				<td><form:input path="" value="" /></td>
			</tr> 
			<tr>
				<td><label>Grade</label></td>
				<td><form:input path="" value="" /></td>
			</tr> 
			<tr id= "sub">
				<td><label></label></td>
				<td id="sub">
				<div id="sub">	<button ><h2 style="padding:5px;">Update Results</h2></button></div>
				</td>
			</tr>
		</table>

	</form:form>
	<a href="${pageContext.request.contextPath}/schoolStudents/index"> <button><h2 style="padding:10px;">Exit</h2></button> </a>
	</div>
	
	
	

</body>
</html>