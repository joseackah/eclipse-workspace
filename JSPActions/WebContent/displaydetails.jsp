<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class= "com.trainings.jsp.Product">
<jsp:setProperty name="product" property="*" />

</jsp:useBean>

Product Detail<br/>

Id: <jsp:getProperty property ="id" name="product"/> <br/>
Name: <jsp:getProperty property="name" name="product"/><br/>
Description: <jsp:getProperty property="description" name="product"/><br/>
Price: <jsp:getProperty property="price" name="product"/><br/>


</body>
</html>