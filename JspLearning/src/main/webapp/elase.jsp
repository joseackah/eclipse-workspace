<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%



%>

<body>
<h1>welcome user</h1>
<%@ include file="form.jsp" %>
<table border = 1>
<tr>
<td>page count is</td> 
<td> <%=2+3%></td>
</tr>
</table>
<%-- <%@ include file="learning.jsp" %>
 --%>
 
${param.name }



</body>
</html>