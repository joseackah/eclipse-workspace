<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
</head>
<body>

<%
String user = request.getParameter("user");
String pass = request.getParameter("password");
String cpass = request.getParameter("cpassword");
String mail = request.getParameter("email");

if(pass.equals(cpass) && mail.equals("admin@aiti-kace.com.gh")){
	request.getRequestDispatcher("output.jsp").forward(request, response);
}
else
	out.println("Wrong Data");

%>

</body>
</html>