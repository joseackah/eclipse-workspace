<%@page import="com.mysql.cj.exceptions.RSAException"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
  #print, h1,h2, #print * {
    visibility: visible;
    margin-top: 0;
  }
  #print {
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
   
<meta charset="ISO-8859-1">
<title>Ward Summary</title>
</head>
<body>
	<div>
	
	
	<%
				try {

					String wardName = request.getParameter("wardName");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
					PreparedStatement ps = conn.prepareStatement(
					"select ward_name, count(date_discharge) from admission_discharge where ward_name = ? and year(date_discharge) = year(current_date) and month(date_discharge) = month(now())-1");
					ps.setString(1, wardName);

					ResultSet rs = ps.executeQuery();

					while (rs.next()) {
				%>
				
				<div class="container mt-5" style="display: grid; grid-template-column: auto auto;">
				
			<div style=""><h2 style="grid-area: main;">Ward Name: </h2>  <%=rs.getString(1)%></div>	
			<div>	<h2>Total Discharge:</h2> <h5>	<%=rs.getString(2)%></h5></div>
					<%-- <td><%=rs.getString(3)%></td>
					<td><%=rs.getString(4)%></td> --%>
				</div>


				<%
				}

				} catch (SQLException e) {

				}
				%>
	
	
	
	</div>

<hr class="d-sm">

	<div class="container mt-3" id="print">
	
	<button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="history.back()">back</button>
     <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>

<div  style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
       

		<table class="table table-bordered table-hover"
			style="background-color: antiquewhite;">

			<thead class="table-warning">
				<tr>
					<th>Patient Number</th>
					<th>Patient Name</th>
					<th>Date Admitted</th>
					<th>Date Discharge</th>


				</tr>
			</thead>

			<tbody id="myTable">
				<%
				try {

					String wardName = request.getParameter("wardName");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
					PreparedStatement ps = conn.prepareStatement(
					"select patient_number, patient_name, date_admitted, date_discharge from admission_discharge where ward_name = ? and year(date_discharge) = year(current_date) and month(date_discharge) = month(now())-1 ");
					ps.setString(1, wardName);

					ResultSet rs = ps.executeQuery();

					while (rs.next()) {
				%>
				<tr>
					<td><%=rs.getString(1)%></td>
					<td><%=rs.getString(2)%></td>
					<td><%=rs.getString(3)%></td>
					<td><%=rs.getString(4)%></td>
				</tr>


				<%
				}

				} catch (SQLException e) {

				}
				%>

			</tbody>




		</table>
		
		<div>



</div>
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