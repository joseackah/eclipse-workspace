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
<title>Add Product</title>
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
            <form action="${pageContext.request.contextPath}/ecommerce/search" method="post" id="searchForm">
            	<input type="text" name="id" id="input" />
                <input type="submit" id="input" class="form-control" value="Search" />
            </form>
            
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome to Ecommerce Product Services</h1>
     <br />
    <br />
	<div class="wrapper">
		<h2>Add New Product</h2>
		<form action="moreProduct" method="post" id="main_form"
			class="main_form">
			<div class="form">
				Product Id: <input type="text" name="id" placeholder="Product Id" />
			</div>
			<div class="form">
				Product Name: <input type="text" name="name"
					placeholder="Product Name" />
			</div>
			<div class="form">
				Product Description: <input type="text" name="desc"
					placeholder="Product Description" />
			</div>
			<div class="form">
				Product Price: <input type="text" name="price"
					placeholder="Product Price" />
			</div>
			<div class="" id="sub">
				<input type="submit" value="Save" />
			</div>
		</form>
		<div id="sub">
			<a
				href="${pageContext.request.contextPath}/ecommerce/moreProductForm">
				<input type="submit" value="clear">
			</a> <a href="${pageContext.request.contextPath}/ecommerce/indexForm">
				<input type="submit" value="Exit">
			</a>
		</div>
	</div>

</body>
</html>