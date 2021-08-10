<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logon confirmation</title>
</head>
<body>
<%
	String u = request.getParameter("user");
	String p = request.getParameter("pass");

	if(u.equals("admin") && p.equals("admin")){
		//out.println("Welcome  " + u + "  "+ p);
		request.getRequestDispatcher("userpage.jsp").forward(request, response);
	}
	else {
		response.sendRedirect("logonform.jsp");
		//out.println("wrong log in details, try again.");
	}



%>
</body>
</html>