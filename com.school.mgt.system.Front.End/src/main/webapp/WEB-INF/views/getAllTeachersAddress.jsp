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
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/main.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
<meta charset="ISO-8859-1">
<title>Display Teachers Address</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/index">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/showForm">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="">to assign</a></li>
            <form action="${pageContext.request.contextPath}/users/find" method="post" id="searchForm">
            	<input type="text" name="id" id="input" />
                <input type="submit" id="input" class="form-control" value="Search" />
            </form>
            
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
<div> <h2> <ins>Teachers Address List</ins></h2></div>
<div  ><input type="button" value="Enroll New Student" style='padding:.5em 2em; border-radius:5em; cursor:pointer;' onclick="window.location.href='${pageContext.request.contextPath}/schoolStudents/moreStudentsForm'" /></div>
	</div>	 
		<table border="1" id="name">
			<thead>
				<tr>
					<th> ID</th>
					<th>TOWN</th>
					<th>CITY</th>
					<th>POSTAL CODE</th>
					<th>RESIDENCE ADDRESS/NUMBER</th>
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${teacherAddresses}" var="teacherAddresses">
					<c:url value="update1" var="updateURL">
						<c:param value="${teacherAddresses.teacherAddressId}" name="studentAddId"></c:param>
					 	<c:param value="${teacherAddresses.town}" name="town"></c:param>
						<c:param value="${teacherAddresses.city}" name="city"></c:param>
						<c:param value="${teacherAddresses.postalCode}" name="postalCode"></c:param>
						<c:param value="${teacherAddresses.resNumber}" name="resNumber"></c:param>
						
						 
						
					</c:url>

					<c:url value="deleteStudents/${teacherAddresses.studentAddressId}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>

					<tr>
						<td>${teacherAddresses.studentAddressId}</td>
						<td>${teacherAddresses.town}</td>
						<td>${teacherAddresses.city}</td>
						<td>${teacherAddresses.postalCode}</td>
						<td>${teacherAddresses.resNumber} </td>
					
						
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


${teacherAddresses}

	
<script type="text/javascript">
$(document).ready(function(){
	$('name').DataTable();
});


</script>

</body>
</html>