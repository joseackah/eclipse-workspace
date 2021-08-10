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
String a = request.getParameter("numbera");

String b = request.getParameter("numberb");

int c = Integer.parseInt(a);
int d = Integer.parseInt(b);


%>

<body>
<h1>welcome user</h1>

page count is <%

if(c/d <= 49){
		
	out.println(c/d + " " + "F");
}
else if(c/d >=50 && c/d <65){
	
	out.println(c/d + " " + "E");
}
else{
	out.println(c/d + " " + "pass");
}


%>

</body>
</html>