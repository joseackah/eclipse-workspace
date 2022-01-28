<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
nav li:hover{
background-color:red;
}
.welcome:hover{
background-color: green;
color: gold;
transition: 5s;
}

</style>
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
<meta charset="ISO-8859-1">
<title>Teachers List</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/index">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/showForm">LOG OUT</a></li>
            <%-- <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="">to assign</a></li>
             --%>
            
        </ul>

    </nav>
<br />
<br />

<h1 class="welcome" style='text-align: center;'>Welcome Bernice's School Enrollment</h1>
	<hr />
	<hr />
	<br>
	<br />
<br />
<div style='display: flex; place-content: space-between;'>
<div> <h2> <ins>Add Teacher</ins></h2></div>
<div  ><input type="button" value="Enroll New Student" style='padding:.5em 2em; border-radius:5em; cursor:pointer;' onclick="window.location.href='${pageContext.request.contextPath}/schoolStudents/moreStudentsForm'" /></div>
	</div>	 
		<table border="1" id="name" style="width: 100%;">
			<thead>
				<tr>
					<th> ID</th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>DATE OF BIRTH</th>
					<th>QUALIFICATION</th>
					<th>EMAIL</th>
					<th>PHONE NUMBER</th>
					<th>GENDER</th>
					<th>ADDRESS</th>
					<th>SALARY</th>
					<th>APPOINTMENT DATE</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${teacher}" var="teacher">
					<c:url value="teacherUpdate" var="updateURL">
						<c:param value="${teacher.teacherId}" name="teacherId"></c:param>
					 	<%-- <c:param value="${teacher.fName}" name="fName"></c:param>
						<c:param value="${teacher.lName}" name="lName"></c:param>
						<c:param value="${teacher.dateOfBirth}" name="dateOfBirth"></c:param>
						<c:param value="${teacher.qualification}" name="qualification"></c:param>
						<c:param value="${teacher.email}" name="email"></c:param>
						<c:param value="${teacher.phoneNumber}" name="phoneNumber"></c:param>
						<c:param value="${teacher.gender}" name="gender"></c:param>
						<c:param value="${teacher.address}" name="address"></c:param>
						<c:param value="${teacher.salary}" name="salary"></c:param>
						<c:param value="${teacher.appointmentDate}" name="appointmentDate"></c:param> --%>
						 
						
					</c:url>

					<c:url value="deleteTeachers/${teacher.teacherId}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>

					<tr>
						<td>${teacher.teacherId}</td>
						<td>${teacher.fName}</td>
						<td>${teacher.lName}</td>
						<td>${teacher.dateOfBirth}</td>
						<td>${teacher.qualification}</td>
						<td>${teacher.email}</td>
						<td>${teacher.phoneNumber}</td>
						<td>${teacher.gender}</td>
						<td>${teacher.address}</td>
						<td>${teacher.salary} </td>
						<td>${teacher.appointmentDate} </td>
						
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


${teacher}

	
<script type="text/javascript">
$(document).ready(function(){
	$('name').DataTable();
});


</script>

</body>
</html>