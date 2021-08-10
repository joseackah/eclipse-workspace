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
<meta charset="ISO-8859-1">
<title>Display Users</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>S & A The Promise of God Enteprise <p>(<abbr title="S & A The Promise of God Enteprise">S&A TPG</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/ecommerce/indexForm">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/showForm">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
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

<h1 class="welcome" style='text-align: center;'>Welcome to Ecommerce Product Services Users</h1>
	<hr />
	<hr />
	<br>
	<br />
<br />
<div style='display: flex; place-content: space-between;'>
<div> <h2> <ins> All Users Table</ins></h2></div>
<div  ><input type="button" value="Add New User" style='padding:.5em 2em; border-radius:5em; cursor:pointer;' onclick="window.location.href='${pageContext.request.contextPath}/users/userForm'" /></div>
	</div>	 
		<table border="1">
			<thead>
				<tr>
					<th> ID</th>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>USERNAME</th>
					<th>EMAIL ADDRESS</th>
					
					<th>ACTION </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${usersTable}" var="user">
					<c:url value="lookUp" var="updateURL">
						<c:param value="${user.id}" name="id"></c:param>
						<c:param value="${user.firstName}" name="firstName"></c:param>
						<c:param value="${user.lastName}" name="lastName"></c:param>
						<c:param value="${user.userName}" name="userName"></c:param>
						<c:param value="${user.email}" name="email"></c:param>
						
						
					</c:url>

					<c:url value="deleteUser/${user.id}" var="removeURL">
				<!-- <c:param value="" name="id"></c:param> -->	
					</c:url>

					<tr>
						<td>${user.id}</td>
						<td>${user.firstName}</td>
						<td>${user.lastName}</td>
						<td>${user.userName}</td>
						<td>${user.email} </td>
						
						<td><a href="${updateURL }">Update</a> | <a
							href="${removeURL }"
							onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>




	


</body>
</html>