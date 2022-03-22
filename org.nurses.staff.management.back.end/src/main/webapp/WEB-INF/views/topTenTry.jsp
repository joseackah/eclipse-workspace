

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

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
   
   <script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
	crossorigin='anonymous'></script>

<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">
   <style type="text/css">

@media print {
  body * {
    visibility: hidden;
  }
  #print, h1,h2, #chartContainer, #print * {
    visibility: visible;
    margin-top: 0;
  }
  #print, .print {
    position: absolute;
    left:010%;
    top: 015%;
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
	<div id="chartContainer" class="print" style="height: 370px; width: 50%;"></div>
	<script id="print"
		src="${pageContext.request.contextPath}/resources/js/canvasjs.min.js"></script>
	<!-- https://canvasjs.com/assets/script/canvasjs.min.js -->
	<!-- /org.nurses.staff.management.back.end/src/main/resources/ -->
	
	
	<div class=" mt-3" id="print">
	
   
	
	<div class="container">
		<button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="history.back()">back</button>
     <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>

<div  style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
    
	
	<table class="table table-bordered table-hover table-secondary"
			style="background-color: ;">
		<thead class="table-primary">
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
</div>
<div>

<%-- <%

// Create Chart
PieChart chart = new PieChartBuilder().width(800).height(600).title("My Pie Chart").theme(ChartTheme.GGPlot2).build();

// Customize Chart
chart.getStyler().setLegendVisible(false);
chart.getStyler().setAnnotationType(AnnotationType.LabelAndPercentage);
chart.getStyler().setAnnotationDistance(1.15);
chart.getStyler().setPlotContentSize(.7);
chart.getStyler().setStartAngleInDegrees(90);

// Series
chart.addSeries("Prague", 2);
chart.addSeries("Dresden", 4);
chart.addSeries("Munich", 34);
chart.addSeries("Hamburg", 22);
chart.addSeries("Berlin", 29);

// Show it
new SwingWrapper(chart).displayChart();

// Save it
BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapFormat.PNG);

// or save it in high-res
BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 300);



%> --%>

</div>




<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</body>
</html>