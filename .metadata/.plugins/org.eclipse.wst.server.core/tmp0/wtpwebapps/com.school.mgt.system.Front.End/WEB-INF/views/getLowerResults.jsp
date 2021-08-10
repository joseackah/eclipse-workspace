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
<title>Display Users</title>
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
<div> <h2> <ins>Students Enrollments</ins></h2></div>
<div> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em;"> </div>
<div  ><input type="button" value="Enroll New Student" style='padding:.5em 2em; border-radius:5em; cursor:pointer;' onclick="window.location.href='${pageContext.request.contextPath}/schoolStudents/moreStudentsForm'" /></div>
	</div>	 
	<div>
		<table border="1" id="name" style="width: 100%;">
			<thead>
				<tr>
					<th>RESULT ID</th>
					<th>STUDENT ID</th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>SUBJECT</th>
					<th>MARKS</th>
					<th>GRADE</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody id="myTable">
				<c:forEach items="${three1}" var="three1">
					<c:url value="update1" var="updateURL">
						<c:param value="${three1.results_id}" name="results_id"></c:param>
						<c:param value="${three1.student_id}" name="student_id"></c:param>
					 	<c:param value="${three1.first_name}" name="first_name"></c:param>
						<c:param value="${three1.last_name}" name="last_name"></c:param>
						<c:param value="${three1.subjects}" name="subjects"></c:param>
						<c:param value="${three1.marks}" name="marks"></c:param>
						<c:param value="${three1.grade}" name="grade"></c:param>
						 
						
					</c:url>

					<c:url value="deleteStudents/${three1.results_id}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>
					
					<c:url value="" var="results">
					<c:param value="${three1.results_id}" name="results_id"></c:param>
					 	<c:param value="" name="firstName"></c:param>
						<c:param value="" name="lastName"></c:param>
						<c:param value="" name="sex"></c:param>
						<c:param value="" name="age"></c:param>
						<c:param value="" name="classLevel"></c:param>
					</c:url>

					<tr>
						<td>${three1.results_id}</td>
						<td>${three1.student_id}</td>
						<td>${three1.first_name}</td>
						<td>${three1.last_name}</td>
						<td>${three1.subjects}</td>
						<td>${three1.marks} </td>
						<td>${three1.grade} </td>
						 
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a> | 
							<a href="${results}">Results</a>
							
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>
</div>
<div>

<table border="1" id="name" style="width: 100%;">
			<thead>
				<tr>
					<th>RESULT ID</th>
					<th>STUDENT ID</th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>SUBJECT</th>
					<th>MARKS</th>
					<th>GRADE</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody id="myTable">
				<c:forEach items="${three2}" var="three2">
					<c:url value="update1" var="updateURL">
						<c:param value="${three2.results_id}" name="results_id"></c:param>
						<c:param value="${three2.student_id}" name="student_id"></c:param>
					 	<c:param value="${three2.first_name}" name="first_name"></c:param>
						<c:param value="${three2.last_name}" name="last_name"></c:param>
						<c:param value="${three2.subjects}" name="subjects"></c:param>
						<c:param value="${three2.marks}" name="marks"></c:param>
						<c:param value="${three2.grade}" name="grade"></c:param>
						 
						
					</c:url>

					<c:url value="deleteStudents/${three2.results_id}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>
					
					<c:url value="" var="results">
					<c:param value="${three2.results_id}" name="results_id"></c:param>
					 	<c:param value="" name="firstName"></c:param>
						<c:param value="" name="lastName"></c:param>
						<c:param value="" name="sex"></c:param>
						<c:param value="" name="age"></c:param>
						<c:param value="" name="classLevel"></c:param>
					</c:url>

					<tr>
						<td>${three2.results_id}</td>
						<td>${three2.student_id}</td>
						<td>${three2.first_name}</td>
						<td>${three2.last_name}</td>
						<td>${three2.subjects}</td>
						<td>${three2.marks} </td>
						<td>${three2.grade} </td>
						 
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a> | 
							<a href="${results}">Results</a>
							
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>
</div>

<div>

<table border="1" id="name" style="width: 100%;">
			<thead>
				<tr>
					<th>RESULT ID</th>
					<th>STUDENT ID</th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>SUBJECT</th>
					<th>MARKS</th>
					<th>GRADE</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody id="myTable">
				<c:forEach items="${three3}" var="three3">
					<c:url value="update1" var="updateURL">
						<c:param value="${three3.results_id}" name="results_id"></c:param>
						<c:param value="${three3.student_id}" name="student_id"></c:param>
					 	<c:param value="${three3.first_name}" name="first_name"></c:param>
						<c:param value="${three3.last_name}" name="last_name"></c:param>
						<c:param value="${three3.subjects}" name="subjects"></c:param>
						<c:param value="${three3.marks}" name="marks"></c:param>
						<c:param value="${three3.grade}" name="grade"></c:param>
						 
						
					</c:url>

					<c:url value="deleteStudents/${three3.results_id}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>
					
					<c:url value="" var="results">
					<c:param value="${three3.results_id}" name="results_id"></c:param>
					 	<c:param value="" name="firstName"></c:param>
						<c:param value="" name="lastName"></c:param>
						<c:param value="" name="sex"></c:param>
						<c:param value="" name="age"></c:param>
						<c:param value="" name="classLevel"></c:param>
					</c:url>

					<tr>
						<td>${three3.results_id}</td>
						<td>${three3.student_id}</td>
						<td>${three3.first_name}</td>
						<td>${three3.last_name}</td>
						<td>${three3.subjects}</td>
						<td>${three3.marks} </td>
						<td>${three3.grade} </td>
						 
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a> | 
							<a href="${results}">Results</a>
							
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


</div>

${student}

	
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>


</body>
</html>