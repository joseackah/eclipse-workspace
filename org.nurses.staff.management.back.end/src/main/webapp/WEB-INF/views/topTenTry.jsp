

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
	//Class.forName("com.mysql.jdbc.Driver"); 
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
	//Statement statement = connection.createStatement();

	PreparedStatement ps = conn
	.prepareStatement("select diagnosis, count(*) as number from admission_discharge  group by diagnosis;");
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
	<div id="chartContainer" style="height: 370px; width: 50%;"></div>
	<script
		src="${pageContext.request.contextPath}/resources/js/canvasjs.min.js"></script>
	<!-- https://canvasjs.com/assets/script/canvasjs.min.js -->
	<!-- /org.nurses.staff.management.back.end/src/main/resources/ -->
	
	<div style="margin-left: 3em; float:left;">
	<table>
		<thead>
			<tr>
				<th>cause</th>
				<th>number</th>
				<th>percentage</th>

			</tr>


		</thead>

		<tbody>

			<%
			try {
				
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
	//Statement statement = connection.createStatement();

	PreparedStatement ps = conn
	.prepareStatement("select diagnosis, count(*) as number from admission_discharge group by diagnosis;");
	String xVal, yVal;

	ResultSet resultSet = ps.executeQuery();

	while (resultSet.next()) {
	resultSet.getString(1);
	int g = Integer.parseInt(resultSet.getString(2));
	
	double j = g+g;
			%>	
			<tr>
			<td><%=resultSet.getString(1) %></td>
			<td><%=resultSet.getString(2) %></td>
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