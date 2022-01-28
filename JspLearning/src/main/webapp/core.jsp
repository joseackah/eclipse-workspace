<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

< --%>
<html>
<head>
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
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

<div ng-app="">
<p> Name: <input type="text" ng-model="name"> </p>

<p>{{name}}</p>
</div>

</body>
</html>