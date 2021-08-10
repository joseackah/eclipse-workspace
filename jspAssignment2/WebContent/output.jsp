<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BioData</title>
</head>
<body>
Username: <%=request.getParameter("user") %> <br/>
Password: <%=request.getParameter("password") %><br/>
E-mail: <%=request.getParameter("email") %><br/>
Address: <%=request.getParameter("address") %><br/>
Phone Number: <%=request.getParameter("phone") %><br/>
Gender: <%=request.getParameter("gender") %><br/>
Education: <%=request.getParameter("education") %>
</body>
</html>