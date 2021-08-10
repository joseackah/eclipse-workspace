<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp page</title>
</head>
<body>


<%  

String id = (String)session.getAttribute("empId");

if(id!=null)
{
%>
<a href = "viewprofile.jsp">view profile</a> <br/>
<a href = "change.html">Change Password</a> <br/>
<a href = "applyleave.html">Apply for Leave</a> <br/>
<a href = "logout.jsp">Log out</a> <br/>
<%
}
else
	response.sendRedirect("loginform.jsp");
%>

</body>
</html>