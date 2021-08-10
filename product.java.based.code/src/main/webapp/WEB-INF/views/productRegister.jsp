<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>
</head>
<body>
<!-- 
<form:form  action="registerProduct" modelAttribute="product" method="POST">
Product Id: <form:input path="id"/> <br/><br/>
Product Name: <form:input path="name"/><br/><br/>
Product description: <form:input path="desc"/><br/><br/>
Product Price: <form:input path="price"/><br/><br/>
<form:button>Submit</form:button>
</form:form>
${registerProduct}
 -->

<form action="registerProduct" method="post">

<table>
<tr>
<td> <label>Product Id</label> </td>
<td> <input type="text" name="id"> </td>
</tr>
<tr>
<td> <label>Product Name</label> </td>
<td> <input type="text" name="name"> </td>
</tr>
<tr>
<td> <label>Description</label> </td>
<td> <input type="text" name="desc"> </td>
</tr>
<tr>
<td> <label>Price</label> </td>
<td> <input type="text" name="price"> </td>
</tr>
<tr>
<td> <label></label> </td>
<td> <input type="submit" value="Register"> </td>
</tr>

</table>


</form>
${registerProduct}

</body>
</html>