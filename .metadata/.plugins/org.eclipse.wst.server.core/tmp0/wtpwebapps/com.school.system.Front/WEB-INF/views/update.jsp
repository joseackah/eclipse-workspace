<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<div id='firstHeader' class='firstHeader' name='firstHeader'>
	
		<h1 style="text-align: center">
			<ins>
				S & A The Promise of God Enteprise
				<p>
					(<abbr title="S & A The Promise of God Enteprise">S&A TPG</abbr>)
				</p>
			</ins>
		</h1>
	</div>
	<nav>
		<ul>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/indexForm">HOME</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/showForm">Add
					product</a></li>
			<li><a
				href="${pageContext.request.contextPath}/category/showCate">Add
					Cate</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
			<li><a
				href="${pageContext.request.contextPath}/category/displaycate">Display
					Cate</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add
					More Product</a></li>
			<li><a href="">to assign</a></li>
			<form action="${pageContext.request.contextPath}/ecommerce/search"
				method="post" id="searchForm">
				<input type="text" name="id" id="input" /> <input type="submit"
					id="input" class="form-control" value="Search" />
			</form>

		</ul>

	</nav>
	 <br />
    <br />
	<h1 style='text-align: center;'>Welcome to Ecommerce Product
		Services</h1>
		 <br />
    <br />
<hr/>
	<h2>Update Student Detail</h2>
	<form action="updateStudents" method="post">
		Student Id: <input type="text" name="studentId" value="${student.studentId}" readonly /><br /> 
		First Name: <input type="text" name="firstName" value="${student.firstName}" /><br />
		Last Name:<input type="text" name="lastName" value="${student.lastName}" /><br /> 
		Sex/Gender: <input type="text" name="sex" value="${student.sex}" /><br />
		Age: <input type="text" name="age" value="${student.age}" /><br />
		Class/Level: <input type="text" name="classLevel" value="${student.classLevel}" /><br />

		<input type="submit" value="update" />
	</form>
	<a href="deleteStudents/${student.studentId}"> Delete</a>
	${student}
</body>
</html>