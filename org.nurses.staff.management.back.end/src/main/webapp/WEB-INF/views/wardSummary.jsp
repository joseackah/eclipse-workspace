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
<%@include file="links.jsp" %>
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

<nav class="navbar navbar-expand-sm bg-dark navbar-dark"
		id="navbar_top">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">M</span>MW
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/maleMedical">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaleMedicalRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalMaleMedical">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckMaleMedicalSchedule">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>

			</ul>

			<button id="b1"
				style="float: right; border-radius: 5em; display: flex; flex-direction: row-reverse; margin-left: 35em;"
				class="btn btn-primary"
				onclick="window.location.href='${pageContext.request.contextPath}/'">log
				out</button>

		</div>
	</nav>

<div class="wrapper">
<aside style="width:30%; height:800px; " class="aside_body w3-padding">

<div  style="">
				<h3>Administrator</h3>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/person-icon-male.jpg"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Administrator</p>
			<p>	<%=(new java.util.Date()).toLocaleString()%></p>
				<!--   academic record start here -->
				<div class="dropdown">
					<h3>Hospital/Ward Records</h3>
					<p></p>
					<div class="nav-item nav nav-pills flex-colmn">
						<div class="nav-link active">Report Display</div>
					</div>

					<div class="dropdown-content">
						<ul class="nav nav-pills flex-column">
							<!-- <li class="nav-item"><a class="nav-link active"
						style="width: 100%;">Report Display</a></li> -->
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/maleMedical">Admission</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyMaleMedical">Discharge</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDeathMaleMedical">Death</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/bedStateFront/displayAllMaleMedicalWard_Bed_State">Ward
									State</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeMaleMedical">Admission/Discharge</a>
							</li>
						</ul>
					</div>

				</div>
				<hr class="d-sm" style="width: 100%;">

				<div class="nav-item nav nav-pills flex-colmn">
					<button
						onclick="document.getElementById('id01').style.display='block'"
						class="nav-link active">Discharge Summary</button>
				</div>


				<hr class="d-sm-none">

				<hr class="d-sm" style="width: 100%;">

				<div class="nav-item nav nav-pills">
					<form
						action="${pageContext.request.contextPath}/generalFront/wardSummary"
						method="post">
						<input type="text" value="Male Medical" name="wardName"
							hidden="true">

						<button type="submit" onclick="'" class="nav-link active">Discharge
							Summary</button>
					</form>

				</div>
				
				
		<hr class="d-sm" style="width: 100%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardTopTen" method="post">
		<input type="text" value="Male Medical" name="wardName" hidden="true">
		
		<button type="submit" onclick="" class="nav-link active">Top Ten</button>
		</form>
									
								</div>	

			</div>





</aside>



<main style="width:100%;">


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
				
			<div style=""><h2 style="grid-area: main;">Ward Name: </h2>  <h1> <%=rs.getString(1)%></h1></div>	
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
	
	
</main>
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