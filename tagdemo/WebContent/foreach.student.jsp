<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.*, com.trainings.jsp.tagdemo.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
List<Student> data = new ArrayList<>();

data.add(new Student("solomon", "Okyere", false));
data.add(new Student("Bismark", "Otu", false));
data.add(new Student("Eugene", "Asante", true));
data.add(new Student("Akeem", "Amosu", false));
data.add(new Student("Jane", "Doe", true));

pageContext.setAttribute("myStudent", data);


%>
<body>
<table border = "1">
<tr>
<th> First Name</th>
<th> Last Name</th>
<th> Fees Discount</th>

 </tr>




<c:forEach var = "tempStudent" items = "${myStudent }">
<tr>
<td>${tempStudent.firstName } </td> 
<td>${tempStudent.lastName }</td>  
<td>${tempStudent.feesDiscount}</td>
</tr>
</c:forEach>
</table>
</body>
</html>