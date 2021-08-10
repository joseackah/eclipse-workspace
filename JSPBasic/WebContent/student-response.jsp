<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student response form</title>
</head>
<body>
Name: <%= request.getParameter("name") %> <br/>
Gender: <%= request.getParameter("gender") %> <br/>


Language Known: 

<ul>
<%

String [] lang = request.getParameterValues("language");

if (lang !=null){
	
	//for(int i=0; i<lang.length; i++){
		for(String temp: lang){
		//out.print("<br/>");
		out.println("<li>" + temp + "</li>");
	}
	
}
else 
	out.println("No Language selected.");



%> 
</ul>
Country: ${param.country}<%--<%= request.getParameter("country") --%>
</body>
</html>