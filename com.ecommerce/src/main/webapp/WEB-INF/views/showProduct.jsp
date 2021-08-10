<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Search Product</title>
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


 <div class="wrapper"><h2>Product Details</h2>
<form:form action="updateProduct" modelAttribute="ecProduct"
		method="post">
		<table class="form">
			<tr>
				<td><label>Product Id</label></td>
				<td><form:input path="id" value="${ecProduct.id}" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>Product Name</label></td>
				<td><form:input path="name" value="${ecProduct.name }"/></td>
			</tr>
			<tr>
				<td><label>Product Description</label></td>
				<td><form:input path="desc" value="${ecProduct.desc}" /></td>
			</tr>
			<tr>
				<td><label>Price</label></td>
				<td><form:input path="price" value="${ecProduct.price }"/></td>
			</tr> 
			<tr id= "sub">
				<td><label></label></td>
				<td id="sub">
				<div id="sub">	<button ><h2 style="padding:5px;">Update Product</h2></button></div>
				</td>
			</tr>
		</table>

	</form:form>
	<a href="${pageContext.request.contextPath}/ecommerce/indexForm"> <button><h2 style="padding:10px;">Exit</h2></button> </a>
	</div>
	
	
	${ecommerceProduct}

</body>
</html>