<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Product Category</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
		
			style='height: 60px; width: 60px;'>
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
<div class="wrapper">
<h2>Add Product Category</h2>
<form action="saveCategory" method="post">
<div class="form">Category Id: <input type="text" name="categoryId" required="required" /></div> 
<div class="form">Category Name: <input type="text" name="categoryName" /></div>
<div id= "sub"> <input type="submit" value="Save" /></div>
</form>
</div>
</body>
</html>