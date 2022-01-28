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


 <%-- <div class="wrapper"><h2>Student Details</h2>
<form:form action="${pageContext.request.contextPath}/lowerPrimaryResults/saveLowerPrimaryResults" 	modelAttribute = "student" method="post">
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
				<td><label>Level/Class</label></td>
				<td><form:input path="classLevel" value="${student.classLevel }" name="level" /></td>
			</tr> 
			
			<tr>
				<td><label>Subject</label></td>
				<td><form:input path="" value="" name="subject" /></td>
			</tr> 
			<tr>
				<td><label>Marks</label></td>
				<td><form:input path="" value="" name="marks" /></td>
			</tr> 
			<tr>
				<td><label>Grade</label></td>
				<td><form:input path="" value="" name="grade" disabled="true" /></td>
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
	</div> --%>
	
	<!-- test update start here -->
	<div class="wrapper">
	<h2>Update Student Detail</h2>
	<form action="${pageContext.request.contextPath}/lowerPrimaryResults/saveLowerPrimaryResults" method="post" class="form">
		Student Id: <input type="text" name="studentId" value="${student.studentId}" readonly /><br /> 
		First Name: <input type="text" name="firstName" value="${student.firstName}" /><br />
		Last Name:<input type="text" name="lastName" value="${student.lastName}" /><br /> 
		Sex/Gender: <input type="text" name="sex" value="${student.sex}" /><br />
		Class/Level: <input type="text" name="classLevel" value="${student.classLevel}" /><br />
		Marks: <input type="text" name="marks" value="" /><br />
		<%-- Age: <input type="text" name="age" value="${student.age}" /><br /> --%>

<div id="sub">	<button ><h2 style="padding:5px;">Update Results</h2></button></div>
		<input type="submit" value="update" id="sub" />
	</form>
	<a href="deleteStudents/${student.studentId}"> Delete</a>
	<%-- ${student} --%>
</div>
</body>
</html>