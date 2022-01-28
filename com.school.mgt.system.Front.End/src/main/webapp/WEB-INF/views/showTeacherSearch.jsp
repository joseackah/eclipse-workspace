<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Teacher Record Update</title>
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


 <div class="wrapper"><h2>Teacher Details</h2>
<form:form action="updateTeachers" 	modelAttribute="teacher" method="post">
		<table class="form">
			<tr>
				<td><label>Teacher Id</label></td>
				<td><form:input path="teacherId"  value="${teacher.teacherId }" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input path="fName" value="${teacher.fName}" /></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input path="lName" value="${teacher.lName}" /></td>
			</tr>
			
			
			<tr>
				<td><label>DOB</label></td>
				<td><form:input path="dateOfBirth" value="${teacher.dateOfBirth}" /></td>
			</tr> 
			
			<tr>
				<td><label>Qualification</label></td>
				<td><form:input path="qualification" value="${teacher.qualification}" /></td>
			</tr> 
			
			
			<tr>
				<td><label>Email</label></td>
				<td><form:input path="email" value="${teacher.email}" /></td>
			</tr> 
			
			
			<tr>
				<td><label>Phone Number</label></td>
				<td><form:input path="phoneNumber" value="${teacher.phoneNumber}" /></td>
			</tr> 
			
			<tr>
				<td><label>Gender</label></td>
				<td><form:input path="gender" value="${teacher.gender}" /></td>
			</tr> 
			
			<tr>
				<td><label>Address</label></td>
				<td><form:input path="address" value="${teacher.address}" /></td>
			</tr> 
			
			<tr>
				<td><label>Salary</label></td>
				<td><form:input path="salary" value="${teacher.salary}" /></td>
			</tr> 
			<tr>
				<td><label>Appointment Date</label></td>
				<td><form:input path="appointmentDate" value="${teacher.appointmentDate}" /></td>
			</tr> 
			<tr id= "sub">
				<td><label></label></td>
				<td id="sub">
				<div id="sub">	<button ><h2 style="padding:5px;">Update Teacher Record</h2></button></div>
				</td>
			</tr>
		</table>

	</form:form>
	<a href="${pageContext.request.contextPath}/schoolStudents/profiles"> <button><h2 style="padding:10px;">Exit</h2></button> </a>
	</div>
	
	
	

</body>
</html>