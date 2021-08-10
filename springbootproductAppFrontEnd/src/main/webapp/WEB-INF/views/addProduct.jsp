<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h2>Add New Product</h2>
<form action="saveProduct" method="post">
Product Id: <input type="text" name="id" /> <br />
Product Name: <input type="text" name="name" /><br />
Product Description: <input type="text" name="desc" /><br />
Product Price: <input type="text" name="price" /><br />
<input type="submit" value="Save" />

</form>
</body>
</html>