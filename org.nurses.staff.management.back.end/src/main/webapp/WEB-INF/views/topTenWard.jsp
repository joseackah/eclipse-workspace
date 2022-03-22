

<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>

<%
Gson gsonObj = new Gson();
Map<Object, Object> map = null;
List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
String dataPoints = null;

try {
	
	String wardName = request.getParameter("wardName");
	//Class.forName("com.mysql.jdbc.Driver"); 
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
	//Statement statement = connection.createStatement();

	PreparedStatement ps = conn
	.prepareStatement("select diagnosis, count(*) as number from admission_discharge where ward_name =? group by diagnosis;");
	ps.setString(1, wardName);
	String xVal, yVal;

	ResultSet resultSet = ps.executeQuery();

	while (resultSet.next()) {
		xVal = resultSet.getString("diagnosis");
		yVal = resultSet.getString("number");
		map = new HashMap<Object, Object>();
		map.put("x", xVal);
		map.put("y", yVal);
		list.add(map);
		dataPoints = gsonObj.toJson(list);
	}
	conn.close();
} catch (SQLException e) {
	out.println(
	"<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
	dataPoints = null;
}
%>

<!DOCTYPE HTML>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
   
   <script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
	crossorigin='anonymous'></script>

<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">
 <style type="text/css">

@media print {
  body * {
    visibility: visible;
  }
  #print, h1,h2, #print * {
    visibility: visible;
    margin-top: 0;
  }
  #print {
    position: absolute;
    left:010%;
    top: 050%;
    margin-top:5%;
  }
  
   #chartContainer {
    position: absolute;
    left:010%;
    top: 0%;
    margin-top:5%;
  }
  
  #b1, #b2 {
  
  visibility:hidden;
  
  }
  
  #myInput, #action, #action1, #action2, #action3  {
  
  visibility:hidden;
  
  }
}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	window.onload = function() {
<%if (dataPoints != null) {%>
	var chart = new CanvasJS.Chart("chartContainer", {
			animationEnabled : true,
			exportEnabled : true,
			title : {
				text : "Causes of Admission"
			},
			data : [ {
				type : "pie", //change type to bar, line, area, pie, etc
				showInLegend : true,
				legendText : "{y}",
				legendText : "{x}",
				startAngle : 40,
				dataPoints :
<%out.print(dataPoints);%>
	} ]
		});
		chart.render();
<%}%>
	}
</script>
</head>
<body>

<div style="text-align:center; width:50%;" id="print">
<h1> <ins>
<%
	String ward = request.getParameter("wardName");
	
	out.print(ward);
	%>
</ins></h1>
</div>

	<div id="chartContainer" style="height: 370px; width: 50%;"></div>
	<script
		src="${pageContext.request.contextPath}/resources/js/canvasjs.min.js"></script>
	<!-- https://canvasjs.com/assets/script/canvasjs.min.js -->
	<!-- /org.nurses.staff.management.back.end/src/main/resources/ -->
	
	<div class="container" style="margin-left: 3em; float:left; margin-top:5em; width:50%;" id="print">
	
	<button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="history.back()">back</button>
     <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>

<div  style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
      
	
	
	<table class="table table-bordered table-hover"
			style="background-color: antiquewhite;">
		<thead class="table-warning">
			<tr >
				<th  style="margin-right:2%;">cause</th>
				<th style="margin-right:2%;">number</th>
				<th>percentage</th>

			</tr>


		</thead>

		<tbody>

			<%
			try {
				String wardName = request.getParameter("wardName");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
	//Statement statement = connection.createStatement();

	PreparedStatement ps = conn
	.prepareStatement("select diagnosis, count(*) as number from admission_discharge where ward_name = ? group by diagnosis;");
	ps.setString(1, wardName);
	String xVal, yVal;

	ResultSet resultSet = ps.executeQuery();

	while (resultSet.next()) {
	resultSet.getString(1);
	int g = Integer.parseInt(resultSet.getString(2));
	
	double j = g+g;
			%>	
			<tr>
			<td style="margin-right:2%;"><%=resultSet.getString(1) %></td>
			<td style="margin-right:2%;"><%=resultSet.getString(2) %></td>
			<td><%=j %></td>
			
			
			</tr>
				
				
				
				
				
<% }
			} catch (Exception e) {

			}
			%>




		</tbody>




	</table>
</div>


</body>
</html>