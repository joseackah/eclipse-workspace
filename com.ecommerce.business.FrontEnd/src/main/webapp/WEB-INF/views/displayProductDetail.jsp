<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
<h2>Product Detail</h2>
<form action="updateproduct" method="post">
Product Id: <input type="text" name="id" value="${ecomProduct.id}" readonly /><br/>
Product Name: <input type="text" name="name" value="${ecomProduct.name}" /><br/>
Product Desc:<input type="text" name="desc" value="${ecomProduct.desc}" /><br/>
Product Price: <input type="text" name="price" value="${ecomProduct.price}" /><br/>
 <input type="submit" value="update" />
</form>
<a href="${pageContext.request.contextPath}/deleteProduct/${ecomProduct.id}">Delete</a>
</body>
</html>