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
<div> <h2> <ins>Students Accounts</ins></h2></div>
<div> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em;"> </div>
<div  ><input type="button" value="Enroll New Student" style='padding:.5em 2em; border-radius:5em; cursor:pointer;' onclick="window.location.href='${pageContext.request.contextPath}/schoolStudents/moreStudentsForm'" /></div>
	</div>	 
		<table border="1" id="name" style="width: 100%;">
			<thead>
				<tr>
					<th> ID</th>
					<th> STUDENT ID </th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>AMOUNT DUE</th>
					<th>AMOUNT PAID</th>
					<th>BALANCE</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody id="myTable">
				<c:forEach items="${accountss}" var="accountss">
					<c:url value="update1" var="updateURL">
						<c:param value="${accountss.account_id}" name="account_id"></c:param>
						<c:param value="${accountss.id}" name="id"></c:param>
					 	<c:param value="${accountss.first_name}" name="firstName"></c:param>
						<c:param value="${accountss.last_name}" name="lastName"></c:param>
						<c:param value="${accountss.amount_due}" name="amount_due"></c:param>
						<c:param value="${accountss.amount_paid}" name="amount_paid"></c:param>
						<c:param value="${accountss.balance}" name="balance"></c:param>
						 
						
					</c:url>

					<c:url value="deleteStudents/${accountss.account_id}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>
					  
					<c:url value="schoolAccounts/accDetail/${accountss.id}" var="details">
					<%--<c:param value="${accountss.id}" name="id"></c:param>
					 <c:param value="${accountss.id}" name="id"></c:param>
					 	<c:param value="${accountss.first_name}" name="firstName"></c:param>
						<c:param value="${accountss.last_name}" name="lastName"></c:param>
						<c:param value="${accountss.amount_due}" name="sex"></c:param>
						<c:param value="${accountss.amount_paid}" name="age"></c:param>
						<c:param value="${accountss.balance}" name="classLevel"></c:param> --%>
					</c:url>

					<tr>
						<td>${accountss.account_id}</td>
						<td>${accountss.id}</td>
						<td>${accountss.first_name}</td>
						<td>${accountss.last_name}</td>
						<td>${accountss.amount_due}</td>
						<td>${accountss.amount_paid} </td>
						<td>${accountss.balance} </td>
						 
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a> | 
							<a href="${details}">Details</a>
							
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>
 <div class="modal-footer" >
    
        <button style="width: 90px; height: 40px;" type="button" class="btn btn-default" data-dismiss="modal" onclick="window.location.href='${pageContext.request.contextPath}/schoolStudents/profilesTry'"> Back </button>
        <button style="width: 90px; height: 40px;" type="button" class="btn btn-primary" onclick="window.print()">Print</button>
    </div>

${student}

<span Style="color:red;">${count}</span>	
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