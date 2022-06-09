<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>



<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">


<%-- <link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet"> --%>
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<!-- https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css -->

<script
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

<!-- https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js -->

<script
	src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>

<!-- https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js -->
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<!-- https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/w3.css">
<!-- https://www.w3schools.com/w3css/4/w3.css -->
<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>

<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/loader.js"></script>
 --%>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>



<script type="text/javascript">
	
window.history.forward();
function noBack() {
    window.history.forward();
}
	</script>





<style type="text/css">



@media screen and (max-width: 600px){

.col, .row{

width: ;
display: block;
}

.row, .col{

width:500%;
background-color:;
display: block;
}


}

.modal {
    overflow-y: auto;
}

.modal-open {
    overflow: auto;
}

.modal-open[style] {
    padding-right: 0px !important;
}

body.modal-open-noscroll 
{
  padding-right: 0!important;
  overflow: hidden;
}
.modal-open-noscroll .navbar-default, .modal-open .navbar-default 
{
  padding-right: 0!important;
}

body {
padding-right:0px !important;
margin-right:0px !important;
}
</style>





<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>profiles</title>
</head>
<body style="padding:0px; margin:0px;">
	<!-- body class = "cont" -->
	<div id='firstHeade' class='firstHeade' name='firstHeader' style="margin-top: 1%; height: 5%;">

		<h1 style="text-align: center; font-weight: bold;font-size: 400%; height: 5%;">
			<ins>
				Hospital Staff(Nurses') 
				
				<p>Management System
				</p>
			</ins>
		</h1>
	</div>
	<nav style="align: right;" id="navbar_to">
		<div style="display: flex;">
			<div>
				<ul>
					<h1 style="color: gold; font-weight: 900;">
						<!-- <span class="" style="color: white;">HS</span>MS -->
					</h1>
				</ul>
			</div>

			<div
				style="display: -webkit-flex; -webkit-flex-direction: row; flex-direction: row; float: right;">
				<ul
					style="align-content: center; justify: center; display: inline-block;">
					
				</ul>

				
			</div>
		</div>
	</nav>

	<!--   test nav begins here -->

	<div class="w3-bar w3-red" id="navbar_top">
	<div style="display:flex">
	<div >
				<ul>
					<h1 style="color: gold; font-weight: 900;">
						<span class="" style="color: white;">HS</span>MS
					</h1>
				</ul>
			</div>
			<div style="float: lef;">
		<a href="${pageContext.request.contextPath}/leaveFront/profile"
			class="w3-bar-item w3-button">Home</a> <a href="#modal-id10"
			data-toggle="modal" class="w3-bar-item w3-button w3-hide-small">Add
			User</a> <a href="#modal-id11" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Ward</a> <a
			href="#modal-id12" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Nurse</a> <a
			href="#modal-id13" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">PIN/AIN</a> <a
			href="#modal-id14" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Schedule Nurse</a> <a
			href="#modal-id15" data-toggle="modal" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Apply for Leave </a> <a
			href="${pageContext.request.contextPath}/scheduleFront/displayAll"
			class="w3-bar-item w3-button w3-hide-small">schedule </a> <a
			href="${pageContext.request.contextPath}/leaveFront/nurseProfile"
			class="w3-bar-item w3-button w3-hide-small"> Nurse Profile</a> 
			
			<a
			href="${pageContext.request.contextPath}/generalFront/topTen"
			class="w3-bar-item w3-button w3-hide-small">Top Ten</a> 
			
			<a
			href="${pageContext.request.contextPath}/generalFront/nurseStaffProfile"
			class="w3-bar-item w3-button w3-hide-small">Staff Profile</a> 
			
			
			<button id="b1" style="float:right; border-radius: 5em; position: absolute; right: 2%; top: 25%; display:flex; flex-direction:row-reverse; margin-left: 35em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
			<a
			href="javascript:void(0)"
			class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium"
			onclick="myFunction()">&#9776;</a>
</div>





</div>
	</div>

		<!--  test nav ends here -->


	<div class="wrapper" style="border: solid gold;">


		<aside style="">


			<!-- admin profile column starts here -->
			<div class="check" style="">

				<div class="profile" style="">

					<div
						class=" w3-margin w3-green w3-padding w3-border w3-card w3-round-large"
						style="width: 250px; height: 1500px;" id="col">

						<div class="w3-center">
							<img class="w3-circle w3-center"
								style="width: 200px; height: 200px;" alt=""
								src="${pageContext.request.contextPath}/resources/icons/color_person_male.png">
							<p>admin profile</p>

						</div>
						
						<hr class="d-sm">
								<h4>Hospital/Ward Records</h4>
			
				<hr class="d-sm">		
<div class="dropdown">

<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">General  Display</div>
								</div>
<div class="dropdown-content">

						<div class="w3-tea" style="width: 100%;">
							
								<ul class="nav nav-pills flex-column">


										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/nurseFront/displayAllNurse">Display Nurses</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/wardFront/displayAllWard">Display Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/leaveFront/displayAllLeave">Display Leave Applied</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/scheduleFront/displayAllSchedule">Display Ward Schedule</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/pinFront/displayAllPin">Pin/Ain</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/userFront/displayAllUser">Users</a></li>
										</ul>
								
								
								
								
								
								
								
						</div>
						</div>
		</div>
		
		<hr class="d-sm">				
						
	<div>
						
				
				<div class="dropdown">
				
				<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">General Report Display</div>
								</div>
				<div class="dropdown-content">
				<ul class="nav nav-pills flex-column">
					<!-- <li class="nav-item"><a class="nav-link active"
						style="width: 80%;">Report Display</a></li> -->
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAdmissionOnly">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnly">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeath">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_Discharge">Admission/Discharge</a>
					</li>
				</ul>
				
				</div>
				
				</div>
						
						</div>


<hr class="d-sm">

						<!-- <br> -->
						
						<div class="try">

							
							<div class="dropdown">
								<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">Ward Admissions</div>
								</div>
								<div class="dropdown-content">

									<ul class="nav nav-pills flex-column">


										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maleMedical">Male Medical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/femaleMedical">Female Medical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maleSurgical">Male Surgical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/femaleSurgical">Female Surgical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maternity">Maternity</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/childrensWard">Children's Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/generalWard">General Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/religiousWard">Religious Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/nicu">NICU</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/accidentEmergency">Accident/Emergency</a></li>
									</ul>
								</div>
							</div>
							<hr class="d-sm-none">
						</div>
						<br>
						
						<div>
							<ul>
								
							</ul>
					<hr class="d-sm">	
					<div>
					<button onclick="document.getElementById('modal-id16').style.display='block'" data-toggle="modal"
			class="nav-item nav nav-pills flex-colmn nav-link active">Post An Event</button>	
				</div>			
<hr class="d-sm">
							
						</div>

						

					</div>
				</div>




			</div>
			<!-- admin profile column ends here -->
		</aside>
		<main style="width: 95%;">
			<div class="< w3-margin w3-aqua w3-padding w3-card w3-round-large"
				style="height: 1500px;">
				<!-- card starts here -->
				
				
				
				<div class="w3-container w3-padding w3-center"
					style="margin: 10px;">
					<div class="row w3-padding " style="width: 100">


						<div class="row">
					
						<div class="w3-card-2 w3-yellow w3-margin col" id="card"
							style="height: 12em; width: 20%">
							<strong> <ins> Total Nurses  </ins></strong>
							<p style="text-align: left;">total Nurses: ${countNurses}</p>
							<p style="text-align: left;">total males: ${countMale}</p>
							<p style="text-align: left;">total females: ${countFemale}</p>

						</div>
						

						
						<div class="w3-card-2 w3-green w3-margin w3-middle col" id="card"
							style="height: 12em; width: 20%">
							<strong> <ins> Nurse Category</ins></strong> <p></p>
							
							
							<table width="200">
							
							<thead >
							<tr >
							<th style="margin-right:; text-align: left;">Category</th>
							<th style="margin-left:; text-align: right;">Number</th>
							</tr>
							</thead>
							<tbody id="tbe">
							
							<%
			try {
				
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
	//Statement statement = connection.createStatement();

	PreparedStatement ps = conn
	.prepareStatement("select category, count(*) as number from nurses_staff group by category;");
	

	ResultSet resultSet = ps.executeQuery();

	while (resultSet.next()) {
	resultSet.getString(1);
	resultSet.getString(2);
	
	
				%>	
			<tr>
			<td style="text-align: left;"><%=resultSet.getString(1)%></td>
			<td style="text-align: center;"><%=resultSet.getString(2)%></td>
			</tr>
<% }
			} catch (Exception e) {

			}
%>
							
						</tbody>
							
						</table>
							
							
							
							
							
												
						
						</div>
						
						
						
						
						<div onclick="window.location.href='${pageContext.request.contextPath}/'" class="w3-card-2 w3-red w3-margin col" id="card"
							style="height: 12em; width: 20%; onmouseover:cursor;">
							<strong> <ins> Total Admission to date</ins></strong>
							<p style="text-align: left;">total Admission: ${countAdmissionToDate}</p>
							<p style="text-align: left;">total Discharge: ${countDischarge}</p>
							<p style="text-align: left;">total Death: ${countDeath}</p>
						</div>
						
						
						
						
						<div class="w3-card-2 w3-teal w3-margin col" id="card"
							style="height: 12em; width: 20%">

							<strong> <ins> Total Today's Admission/Discharge</ins></strong>
							<p style="text-align: left;">Total Admission: ${countTodayAdmission}</p>
							<p style="text-align: left;">Total Discharge: ${countTodayDischarge}</p>
							<p style="text-align: left;">Total Death: ${countTodayDeath}</p>
						</div>
						
						</div>
						
						
						<div class="row">
						
					<div class="w3-card-2 w3-blue w3-margin col" id="card"
							style="height: 12em; width: 20%">
							
							<strong> <ins> Bed Capacity</ins></strong>
							<p style="text-align: left;">Total Bed: ${bedCapacity}</p>
							<p style="text-align: left;">Total Occupied Bed: ${bedOccupancy}</p>
							<p style="text-align: left;">Total Vacant Bed: ${bedCapacity - bedOccupancy}</p>
							
							</div>	
							
							
							
							<div class="w3-card-2 w3-black w3-margin col" id="card"
							style="height: 12em; width: 20%;">
							
							<strong > <ins > Ward/Bed State</ins></strong>
							<p style="text-align: left;">Remain at Midnight: ${midnightRmain}</p>
							<p style="text-align: left;">Critical Ill: ${criticalPatient}</p>
							<p style="text-align: left;">Floor patient: ${floorPatient}</p>
							<p style="text-align: left;">Abscond patient: ${abscondedPatient}</p> 
							
							
							</div>
							
							
						<div class="w3-card-2 w3-green w3-margin col" id="card"
							style="height: 12em; width: 20%">Year
							
							
							
							</div>
							
							
							
							
							
						<div class="w3-card-2 w3-teal w3-margin w3-round-large col" id="card"
							style="height: 12em; width: 20%; text-align:;">
						<strong > <ins > Total Yesterday's Admission/Discharge</ins></strong>
							<p style="text-align: left;">Total Admission: ${countYesterdayAdmission}</p>
							<p style="text-align: left;">Total Discharge: ${countYesterdayDischarge}</p>
							<p style="text-align: left;">Total Death: ${countYesterdayDeath}</p>
 
						</div>
						</div>
					</div>



				</div>


				<!-- card ends here -->
				<!-- <hr>
				
				<hr> -->
				
				
				
				<!-- pie chart starts here -->
				<div class="row" style="display: flex;content:space-between;">
					<div class="col w3-card-2" id="piechart" style="margin-right:; width: 500; height: 300; "></div>
					<!-- pie chart ends here -->

					<!-- trend chart starts here -->

					<div class="col w3-card-2" id="trendchart"
						style="margin-left:-2%; background-color:; width: 15%;"></div>
					<!-- trend chart ends here -->
					
					<!-- comparison line chart starts here -->

				

					<!-- comparison line chart ends here -->
					
					<!-- event table -->
					<div class="col w3-card-2" style=" width:9%;">
						<h2>NOTICE</h2>
				<h5>Upcoming Events</h5>
				<div class="fake">
				
				<table class="table table-bordered table-hover"
			style="background-color: antiquewhite;">
				
				<thead class="table-warning">
				<tr>
				<!-- <th>Id</th> -->
				<th>Event</th>
				<th>Venue</th>
				<th>Date</th>
				<th>Participant</th>
				</tr>
				
				
				</thead>
				
				<tbody>
				<c:forEach items="${eventsT}" var="eventsD">
				<c:url value="eventsUpdate1/${eventsD.event_id}" var="updateURL">
				
				</c:url>
				
				
				<c:url value="deleteEvents/${eventsD.event_id}"
									var="removeURL">
									
								</c:url>
				
				<tr>
				<td hidden="true">${eventsD.event_id}</td>
				<td>${eventsD.event_name}</td>
				<td>${eventsD.venue}</td>
				<td>${eventsD.event_date}</td>
				<td>${eventsD.participant}</td>
				</tr>
				</c:forEach>
				
				
				
				</tbody>
				
				</table>
				
				
				</div>
				
				
				</div>
				<!-- events table ends -->
					
					
				</div>
				
				
	<div class="row">		
<div  style="display: flex;">
	<div class="col w3-card-2" id="curve_chart" style="width:60%; height: 400px; margin-top: 1em;"></div>
	
	
	<div class="col w3-card-2" id="mat_chart" style="width:60%; float:; height: 400px; margin-top: 1em;"></div>
	</div>
	
	</div>	
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/js/loader.js"></script>

				<!-- trend starts here -->

				<!-- <div id="chartContainer" style="height: 300px; width: 40%;"></div> -->


				<!-- trend ends here -->



			</div>

		</main>



		


	

	










	
		
		<!-- https://www.gstatic.com/charts/loader.js -->
		<script type="text/javascript">
			// Load google charts
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);

			// Draw the chart and set the chart values
			function drawChart() {
				var data = google.visualization
						.arrayToDataTable([ [ 'Task', 'Number' ],
								[ '2019', 86 ], [ '2020', 90 ],
								[ '2021', 75 ], [ '2022', 65 ] /* , [ 'Sleep', 8 ] */]);

				// Optional; add a title and set the width and height of the chart
				var options = {
					'title' : 'Admission',
					'width' : 450,
					'height' : 400
				};

				// Display the chart inside the <div> element with id="piechart"
				var chart = new google.visualization.PieChart(document
						.getElementById('piechart'));
				chart.draw(data, options);
			}
		</script>
		<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/static/js/loader.js"></script>
		<!-- pie chart javascript ends here -->


		<!-- trend chart javascript starts here -->

		<script type="text/javascript"
			src="${pageContext.request.contextPath }/resources/js/loader.js"></script>
		<!-- https://www.gstatic.com/charts/loader.js -->
		<script type="text/javascript">
			// Load google charts
			google.charts.load('current', {
				'packages' : [ 'corechart' ]
			});
			google.charts.setOnLoadCallback(drawChart);

			// Draw the chart and set the chart values
			function drawChart() {
				var data = google.visualization
						.arrayToDataTable([ [ 'Year', 'Admission', 'Discharge','Death' ],
								[ '2019', 78, 56, 10 ], [ '2020', 59, 75, 12 ],
								[ '2021', 14, 85, 6 ], [ '2022', 54, 63, 11 ] /* , [ 'Sleep', 8 ] */]);

				// Optional; add a title and set the width and height of the chart
				var options = {
					'title' : 'Admission and Discharge',
					'width' : 480,
					'height' : 400,
					legend : {
						position : 'bottom'
					}
				};

				// Display the chart inside the <div> element with id="piechart"
				var chart = new google.visualization.LineChart(document
						.getElementById('trendchart'));
				chart.draw(data, options);
			}
		</script>


		<!-- trend chart javascripts ends here -->


		<script>
			function myFunction() {
				var x = document.getElementById("demo");
				if (x.className.indexOf("w3-show") == -1) {
					x.className += " w3-show";
				} else {
					x.className = x.className.replace(" w3-show", "");
				}
			}
		</script>
	</div>


	<!-- 	
	trend starts here
	
	<script>
window.onload = function () {

var chart = new CanvasJS.Chart("chartContainer", {
	animationEnabled: true,
	theme: "light2",
	title:{
		text: "Simple Line Chart"
	},
	data: [{        
		type: "line",
      	indexLabelFontSize: 16,
		dataPoints: [
			{ y: 450 },
			{ y: 414},
			{ y: 520, indexLabel: "\u2191 highest",markerColor: "red", markerType: "triangle" },
			{ y: 460 },
			{ y: 450 },
			{ y: 500 },
			{ y: 480 },
			{ y: 480 },
			{ y: 410 , indexLabel: "\u2193 lowest",markerColor: "DarkSlateGrey", markerType: "cross" },
			{ y: 500 },
			{ y: 480 },
			{ y: 510 }
		]
	}]
});
chart.render();

}
</script>


<div id="chartContainer" style="height: 300px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script> -->


	<!-- trend ends here -->


	<!-- comparison line trend javascripts starts here -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/js/loader.js"></script>
	<!-- https://www.gstatic.com/charts/loader.js -->
	<script type="text/javascript">
		google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		google.charts.setOnLoadCallback(drawChart);

		 function drawChart() {
			var data = google.visualization.arrayToDataTable([
					[ 'Year', 'Admission', 'Discharge', 'Death' ],
					/* [0, 0, 0, 0], */
					[ 'Jan', ${countAdmissionJanuary}, ${countDischargeJanuary}, ${countDeathJanuary}], 
					[ 'Feb', ${countAdmissionFebruary}, ${countDischargeFebruary}, ${countDeathFebruary} ],
					[ 'Mar', ${countAdmissionMarch}, ${countDischargeMarch}, ${countDeathMarch} ], 
					[ 'Apr', ${countAdmissionApril}, ${countDischargeApril}, ${countDeathApril} ],
					[ 'May', ${countAdmissionMay}, ${countDischargeMay}, ${countDeathMay} ],
					[ 'Jun', ${countAdmissionJune}, ${countDischargeJune}, ${countDeathJune} ],
					[ 'Jul', ${countAdmissionJuly}, ${countDischargeJuly}, ${countDeathJuly} ],
					[ 'Aug', ${countAdmissionAugust}, ${countDischargeAugust}, ${countDeathAugust} ],
					[ 'Sep', ${countAdmissionSeptember}, ${countDischargeSeptember}, ${countDeathSeptember} ],
					[ 'Oct', ${countAdmissionOctober}, ${countDischargeOctober}, ${countDeathOctober} ],
					[ 'Nov', ${countAdmissionNovember}, ${countDischargeNovember}, ${countDeathNovember} ],
					[ 'Dec', ${countAdmissionDecember}, ${countDischargeDecember}, ${countDeathDecember} ]
					
					]);

			var options = {
				title : 'Admission and Discharge Performance',
				curveType : 'function',
				'width' : 700,
				'height' : 400,
				legend : {
					position : 'bottom'
				}
			};

			var chart = new google.visualization.LineChart(document
					.getElementById('curve_chart'));

			chart.draw(data, options);
		}
	</script>


	<!-- <div id="curve_chart" style="width: 900px; height: 500px"></div> -->
	
	<!-- maternal health chart -->
<script type="text/javascript">
		google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		google.charts.setOnLoadCallback(drawChart);

		 function drawChart() {
			var data = google.visualization.arrayToDataTable([
					[ 'Year', 'Delivery', 'Newborn', 'StillBirth/neonata death' ],
					/* [0, 0, 0, 0], */
					/* [ 'Jan', ${countAdmissionJanuary}, ${countDischargeJanuary}, ${countDeathJanuary}], 
					[ 'Feb', ${countAdmissionFebruary}, ${countDischargeFebruary}, ${countDeathFebruary} ],
					[ 'Mar', ${countAdmissionMarch}, ${countDischargeMarch}, ${countDeathMarch} ], 
					[ 'Apr', ${countAdmissionApril}, ${countDischargeApril}, ${countDeathApril} ],
					[ 'May', ${countAdmissionMay}, ${countDischargeMay}, ${countDeathMay} ],
					[ 'Jun', ${countAdmissionJune}, ${countDischargeJune}, ${countDeathJune} ],
					[ 'Jul', ${countAdmissionJuly}, ${countDischargeJuly}, ${countDeathJuly} ],
					[ 'Aug', ${countAdmissionAugust}, ${countDischargeAugust}, ${countDeathAugust} ],
					[ 'Sep', ${countAdmissionSeptember}, ${countDischargeSeptember}, ${countDeathSeptember} ],
					[ 'Oct', ${countAdmissionOctober}, ${countDischargeOctober}, ${countDeathOctober} ],
					[ 'Nov', ${countAdmissionNovember}, ${countDischargeNovember}, ${countDeathNovember} ],
					[ 'Dec', ${countAdmissionDecember}, ${countDischargeDecember}, ${countDeathDecember} ] */
					
					[ 'Jan', ${countDeliveryJanuary}, ${countNewbornJanuary}, ${countNewbornDeathJanuary}], 
					[ 'Feb', ${countDeliveryFebruary}, ${countNewbornFebruary}, ${countNewbornDeathFebruary} ],
					[ 'Mar', ${countDeliveryMarch}, ${countNewbornMarch},${countNewbornDeathMarch} ], 
					[ 'Apr', ${countDeliveryApril}, ${countNewbornApril}, ${countNewbornDeathApril} ],
					[ 'May', ${countDeliveryMay}, ${countNewbornMay}, ${countNewbornDeathMay} ],
					[ 'Jun', ${countDeliveryJune}, ${countNewbornJune}, ${countNewbornDeathJune} ],
					[ 'Jul', ${countDeliveryJuly}, ${countNewbornJuly}, ${countNewbornDeathJuly} ],
					[ 'Aug', ${countDeliveryAugust}, ${countNewbornAugust}, ${countNewbornDeathAugust}],
					[ 'Sep', ${countDeliverySeptember}, ${countNewbornSeptember}, ${countNewbornDeathSeptember} ],
					[ 'Oct', ${countDeliveryOctober}, ${countNewbornOctober}, ${countNewbornDeathOctober}],
					[ 'Nov', ${countDeliveryNovember}, ${countNewbornNovember}, ${countNewbornDeathNovember} ],
					[ 'Dec', ${countDeliveryDecember}, ${countNewbornDecember}, ${countNewbornDeathDecember} ]
					
					
					]);

			var options = {
				title : 'Delivery Performance',
				curveType : 'function',
				'width' : 700,
				'height' : 400,
				legend : {
					position : 'bottom'
				}
			};

			var chart = new google.visualization.LineChart(document
					.getElementById('mat_chart'));

			chart.draw(data, options);
		}
	</script>

	<!-- comparison line trend javascripts ends here -->



	<!-- forms starts here -->

	<!-- user forms starts here -->


	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Users</a> -->
	<div class="modal fade" id="modal-id10">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">User Enrollment</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/userFront/saveUsers"
					method="post" enctype="multipart/form-data">
					<div class="modal-body">

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="name">Name</label> <input type="text"
										class="form-control" name="name" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="userId">User Id</label> <input type="text"
										class="form-control" name="userId" id="">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="userType">User Type</label> <select name="userType"
										id="" class="form-control">
										<option value="">select</option>
										<option value="Incharge">Incharge</option>
										<option value="Manager">Manager</option>
										<option value="Staff">Staff</option>
										<option value="Admin Staff">Admin. Staff</option>
										<option value="Others">Others</option>
									</select>
</div>
								</div>
								<div class="col">
								<div class="form-group">
								<label for="ward_name">Department</label>
								<select
											name="ward_name" class="form-control" id="lets"
											onclick="myDisplay()">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Childrens Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
											<option value="Administration">Administration</option>
											<option value="Outpatient Department">Outpatient Department</option>
										</select>
								</div>
								</div> 
								
							
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="userPassword">Password</label> <input
										type="password" class="form-control" name="userPassword"
										id="myInput"> <input type="checkbox"
										onclick="myFunction()"> <label>Show Password</label>
								</div>
							</div>


							<div class="col">
								<div class="form-group">
									<label for="image">Image</label> <input type="file"
										accept="image/jpg, image/png" class="form-control"
										name="image" id="" multiple  disabled>
								</div>
							</div>
						</div>



						<div class="row">

							<div class="col">
								<div class="form-group">
									<label for="dateCreated">Date Created</label> <input
										type="date" class="form-control" name="dateCreated" id="">
								</div>
							</div>



							<div class="col">
								<div class="form-group">
									<label for="createdBy">Created By</label> <input type="text"
										class="form-control" name="createdBy" id="">

								</div>
							</div>
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>
		</div>
	</div>




	<script>
		function myFunction() {
			var x = document.getElementById("myInput");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
	</script>



	<!-- user forms ends here -->



	<!-- nurse form starts here -->



	<!--  <a class="btn btn-primary" data-toggle="modal" href='#modal-id2'>Nurse Staff</a> -->
	<div class="modal fade" id="modal-id12">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Nurse Staff</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/nurseFront/saveNurse">
					<div class="modal-body">

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="staff_id">Staff Id</label> <input type="text"
										class="form-control" name="staff_id" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="name">Name</label> <input type="text"
										class="form-control" name="name" id="">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="address">Address</label> <input type="text"
										class="form-control" name="address" id="">

								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="ssnit">SSNIT Number</label> <input type="text"
										class="form-control" name="ssnit" id="">
								</div>
							</div>


							<div class="col">
								<div class="form-group">
									<label for="date_of_birth">Date of Birth</label> <input
										type="date" class="form-control" name="date_of_birth" id="">
								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="sex">Sex</label> <select name="sex"
										class="form-control" id="">
										<option value="">Select</option>
										<option value="male">Male</option>
										<option value="female">Female</option>
									</select>

								</div>
							</div>

							<div class="col">
								<div class="form-group">
									<label for="assumption_date">Assumption of Duty</label> <input
										type="date" class="form-control" name="assumption_date" id="">

								</div>


							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="category">Category</label> <select name="category"
										class="form-control" id="" onchange="current(this.value)">
										<option value="">select</option>
										<option value="Reg. Gen. Nurse">Reg. Gen.
											Nurse</option>
										<!-- <option value="Reg. Gen. Nurse(Degree)">Reg. Gen.
											Nurse</option> -->
										<option value="Reg. Midwife">Reg.
											Midwife</option>
										<!-- <option value="Reg. Midwife(Degree)">Reg.
											Midwife</option> -->
										<option value="NAC">NAC</option>
										<option value="NAP">NAP</option>
										<option value="Ancillary">Ancillary</option>

									</select>
								</div>
							</div>
						<div class="col" id="">
								<div class="form-group">
									<label for="grade">Current Grade/Position</label> 
									<select class="form-control" name="grade" id="" style="display:;">
									<option value="">Select</option>
								
									<optgroup label="General Nurse" id="rgn" style="display: none;">
									<option value="SN">SN</option>
									<option value="SSN">SSN</option>
									<option value="NO">NO</option>
									<option value="SNO">SNO</option>
									<option value="PNO">PNO</option>
									<option value="DDNS">DDNS</option>
									<option value="DNS">DNS</option>
									</optgroup>
									
									<optgroup label="Midwife" id="mid" style="display: none;">
									<option value="SM">SM</option>
									<option value="SSM">SSM</option>
									<option value="MO">MO</option>
									<option value="SMO">SMO</option>
									<option value="PMO">PMO</option>
									<option value="DDMS">DDMS</option>
									<option value="DMS">DMS</option>
									</optgroup>
									
									<optgroup label="Nurse Assistant (Preventive)" id="nap" style="display: none;">
									<option value="CHN">CHN</option>
									<option value="SCHN">SCHN</option>
									<option value="PCHN">PCHNN</option>
									<option value="SuCHN">SuCHN</option>
									<!-- <option value="PNO">PNO</option>
									<option value="DDNS">DDNS</option>
									<option value="DNS">DNS</option> -->
									</optgroup>
									
									<optgroup label="Nurse Assistant (Curative)" id="nac" style="display: none;">
									<option value="EN">EN</option>
									<option value="SEN">SEN</option>
									<option value="PEN">PEN</option>
									<option value="SuEN">SuEN</option>
									<!-- <option value="PMO">PMO</option>
									<option value="DDMS">DDMS</option>
									<option value="DMS">DMS</option> -->
									</optgroup>
									
									
									</select>
								</div>
							</div>

							
						</div>
						
						<div class="row">
						
						<div class="col">
								<div class="form-group">
									<label for="basic_qualification">Basic Qualification</label> <select
										name="basic_qualification" class="form-control" id="">
										<option value="select">select</option>
										<option value="Diploma">Diploma</option>
										<option value="Degree">Degree</option>
										<option value="Certificate">Certificate</option>

										<option value="Others">Others</option>

									</select>




								</div>
							</div>
						
						
							<div class="col">
								<div class="form-group">
									<label for="status">Status</label> 
									<select class="form-control" name="status" id="">
									<option value="">Select</option>
									<option value="at post">At Post</option>
									<!-- <option value="on study leave with pay">On study Leave with pay</option>
									<option value="on study leave without pay">On study Leave without pay</option>
									<option value="on transfer">On Transfer</option> -->
									
									
									
									</select>

								</div>
							</div>
							
							
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>

				</form>
			</div>
		</div>
	</div>


	<!-- nurse form ends here -->


	<!-- leave form starts here -->


	<!--  <a class="btn btn-primary" data-toggle="modal" href='#modal-id5'>Leave Application</a> -->
	<div class="modal fade" id="modal-id15">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Leave Application</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/leaveFront/saveLeave"
					method="post">
					<div class="modal-body">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="staff_id">Staff Id</label> <input type="text"
											class="form-control" name="staff_id" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="name">Name</label> <input type="text"
											class="form-control" name="name" id="">
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="ward_name">Ward Name</label> 
										<select
											name="ward_name" class="form-control" id="lets"
											onclick="myDisplay()">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Childrens Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
										</select>
									</div>

								</div>
								
							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="">Leave Type</label> <select name="leave_type"
											class="form-control" id="">
											<option value="select">select</option>
											<option value="annual leave">Annual Leave</option>
											<option value="maternity leave">Maternity Leave</option>
											<option value="casual leave">Casual Leave</option>
											<option value="paternity leave">Paternity Leave</option>
											<option value="sick leave">Sick Leave</option>
											<option value="bereavement leave">Bereavement Leave</option>

										</select>
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="staff_cate">Staff Category</label> <select
											name="staff_cate" class="form-control" id="">
											<option value="select">select</option>
											<option value="RGN">Reg. Gen. Nurse</option>
											<option value="midwife">Reg. Midwife</option>
											<option value="NAC">NAC</option>
											<option value="NAP">NAP</option>
											<option value="ANXILLARY">Anxillary</option>

										</select>
									</div>
								</div>
							</div>


							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="leave_day_earn">Leave Days Earn</label> <input
											type="number" class="form-control" name="leave_day_earn"
											id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="leave_days_apply">Leave Days Apply</label> <input
											type="number" class="form-control" name="leave_days_apply"
											id="">
									</div>
								</div>


							</div>




						</div>


						<div class="secondContainer">
							<div class="row">



								<div class="col">
									<div class="form-group">
										<label for="leave_date">Leave Date</label> <input type="date"
											class="form-control" name="leave_date" id="">
									</div>
								</div>


								<div class="col" style="display: none;">
									<div class="form-group">
										<label for="incharge_recom">Incharge Recommendation</label> <select
											name="incharge_recom" class="form-control" id="" disabled>
											<option value="select">select</option>
											<option value="annual leave">Yes</option>
											<option value="maternity leave">No</option>


										</select>
									</div>
								</div>

							</div>


							<div class="row">
								<div class="col" style="display: none;">
									<div class="form-group">
										<label for="incharge_name">Incharge Name</label> <input
											type="text" class="form-control" name="incharge_name"
											disabled>
									</div>
								</div>
								<!-- <div class="col">
                                    <div class="form-group">
                                        <label for="">Name</label>
                                        <input type="text" class="form-control" name="name" id="">
                                    </div>
                                </div> -->
							</div>





							<div class="row" style="display: none;">
								<div class="col">
									<div class="form-group">
										<label for="leave_end_date">Leave End Date</label> <input
											type="date" class="form-control" name="leave_end_date" id=""
											disabled>

									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="resumption_date">Resumption Date</label> <input
											type="date" class="form-control" name="resumption_date" id=""
											disabled>

									</div>


								</div>
							</div>

						</div>



						<div class="thirdContainer" style="display: none;">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="approved_by">Approved By</label> <input
											type="text" class="form-control" name="approved_by" id=""
											disabled>
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="date_approved">Date Approved</label> <input
											type="date" class="form-control" name="date_approved" id=""
											disabled>
									</div>
								</div>
							</div>

						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Apply</button>
					</div>
				</form>
			</div>
		</div>
	</div>




	<!-- leave form ends here -->




	<!-- pin/ain form starts here -->





	<!--  <a class="btn btn-primary" data-toggle="modal" href='#modal-id3'>PIN/AIN </a> -->
	<div class="modal fade" id="modal-id13">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title">PIN/AIN DETAILS</h4>
				</div>

				<form action="${pageContext.request.contextPath}/pinFront/savePin">
					<div class="modal-body">





						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="staff_id">Staff Id</label> <input type="text"
										class="form-control" name="staff_id" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="pin_ain_number">PIN/AIN Number</label> <input
										type="text" class="form-control" name="pin_ain_number" id="">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="type">Card Type</label> <select name="type"
										class="form-control" id="">
										<option value="">select</option>
										<option value="PIN">PIN</option>
										<option value="AIN">AIN</option>



									</select>
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="date_issue">Date Issue</label> <input type="date"
										class="form-control" name="date_issue" id="">
								</div>
							</div>
						</div>




						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="renewal_date">Renewal Date</label> <input
										type="date" class="form-control" name="renewal_date" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="expire_date">Expire Date</label> <input type="date"
										class="form-control" name="expire_date" id="">
								</div>
							</div>
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Pin</button>
					</div>
				</form>

			</div>
		</div>
	</div>




	<!-- pin/ain form ends here -->





	<!--  ward form starts here -->



	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id1'>Ward form</a> -->
	<div class="modal fade" id="modal-id11">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Ward Enrollment</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form action="${pageContext.request.contextPath}/wardFront/saveWard">
					<div class="modal-body">

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="ward_name">Ward Name</label> <input type="text"
										class="form-control" name="ward_name" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="total_staff">Total Staff</label> <input type="text"
										class="form-control" name="total_staff" id="">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="bed_capacity">Bed Capacity</label> <select
										name="bed_capacity" id="" class="form-control">
										<option value="">select</option>
										<option value="5">5</option>
										<option value="10">10</option>
										<option value="20">20</option>
										<option value="22">22</option>
										<option value="23">23</option>
										<option value="24">24</option>
										<option value="25">25</option>
									</select>

								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="ward_incharge">Ward Incharge</label> <input
										type="text" class="form-control" name="ward_incharge"
										id="myInput">

								</div>
							</div>


							<div class="col">
								<div class="form-group">
									<label for=""></label> <input type="date" class="form-control"
										name="" id="" hidden>
								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for=""></label> <input type="text" class="form-control"
										name="" id="" hidden>

								</div>
							</div>
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>

			</div>
		</div>
	</div>



	<!--  ward form ends here -->






	<!-- ward schedule form starts here -->



	<!--  <a class="btn btn-primary" data-toggle="modal" href='#modal-id4'>Ward Schedule</a> -->
	<div class="modal fade" id="modal-id14">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Ward Schedule</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/scheduleFront/saveSchedule">
					<div class="modal-body">

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="staff_id">Staff Id</label> <input type="text"
										class="form-control" name="staff_id" id="">

									<%--  <select name="ward_name" id="" class="form-control">
                                       <option value="">select</option>
                                      <c:forEach items="${wardD}" var="wardD">
                                      
                                           
                                            <option value="${wardD.ward_name}">${wardD.ward_name}</option>
                                            </c:forEach>
                                    </select>
                                     --%>


								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="staff_name">Staff Name</label> <%-- <input type="text"
										class="form-control" name="staff_name" id="" value="${nurse.name }" required> --%>
										<select class="form-control">
										<option>select</option>
										
										<c:forEach items="${nurse}" var="nurse">
										
										<option value="${nurse.name}">${nurse.name }</option>
										
										</c:forEach>
										
										</select>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="nurse_cate">Nurse Category</label> <select
										name="nurse_cate" id="" class="form-control">
										<option value="">select</option>
										<option value="RGN">RGN</option>
										<option value="MIDWIFE">MIDWIFE</option>
										<option value="NAP">NAP</option>
										<option value="NAC">NAC</option>

									</select>

								</div>
							</div>
							
							<div class="col">
								<div class="form-group">
									<label for="effective_date">Effective Date</label> <input type="date"
										class="form-control" name="effective_date" id="" required>
								</div>
							</div>
							
							
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="ward_name">Ward Name</label> <input
										type="text" class="form-control" name="ward_name" id="myInput">

								</div>
							</div>


							<div class="col">
								<div class="form-group">
									<label for=""></label> <input type="date" class="form-control"
										name="" id="" hidden=true>
								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for=""></label> <input type="text" class="form-control"
										name="" id="" hidden=true>

								</div>
							</div>
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>

				</form>
			</div>
		</div>
	</div>





	<!-- ward schedule form ends here -->


	<!-- forms ends here -->



<!-- events form starts here -->

<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id1'>Ward form</a> -->
	<div class="modal" id="modal-id16">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Events</h4>
					<button type="button" onclick="document.getElementById('modal-id16').style.display='none'" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form action="${pageContext.request.contextPath}/eventsFront/saveEvents">
					<div class="modal-body">

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="event_name">Event Name/Title</label> <textarea 
										class="form-control" name="event_name" id=""></textarea>
								</div>
							</div>
							
						</div>

						<div class="row">
						
						<div class="col">
								<div class="form-group">
									<label for="venue">Event Venue</label> <input type="text"
										class="form-control" name="venue" id="">
								</div>
							</div>
						
						
						
							<div class="col">
								<div class="form-group">
									<label for="event_date">Event Date</label> <input type="date"
										name="event_date" id="" class="form-control">
										</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="participant">Participant</label> <input
										type="text" class="form-control" name="participant"
										id="myInput">

								</div>
							</div>


							<div class="col" style="display:none;">
								<div class="form-group">
									<label for=""></label> <input type="date" class="form-control"
										name="" id="" hidden>
								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for=""></label> <input type="text" class="form-control"
										name="" id="" hidden>

								</div>
							</div>
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" onclick="document.getElementById('modal-id16').style.display='none'" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Post</button>
					</div>
				</form>

			</div>
		</div>
	</div>

<!-- events form ends here -->








<!-- navbar top starts here -->

 <script>
        document.addEventListener("DOMContentLoaded", function() {
            window.addEventListener('scroll', function() {
                if (window.scrollY > 50) {
                    document.getElementById('navbar_top').classList.add('fixed-top');
                    // add padding top to show content behind navbar
                    navbar_height = document.querySelector('.navbar').offsetHeight;
                    document.body.style.paddingTop = navbar_height + 'px';
                } else {
                    document.getElementById('navbar_top').classList.remove('fixed-top');
                    // remove padding top from body
                    document.body.style.paddingTop = '0';
                }
            });
        });
    </script>

<!-- navbar to ends here -->



<div id="linechart_material"></div>

<!-- <script type="text/javascript">

google.charts.load('current', {'packages':['line']});
      google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

      var data = new google.visualization.DataTable();
      data.addColumn('number', 'Month');
      data.addColumn('number', 'Admission');
      data.addColumn('number', 'Discharge');
      data.addColumn('number', 'Death');

      data.addRows([
   /*      [1,  37.8, 80.8, 41.8],
        [2,  30.9, 69.5, 32.4],
        [3,  25.4,   57, 25.7],
        [4,  11.7, 18.8, 10.5],
        [5,  11.9, 17.6, 10.4],
        [6,   8.8, 13.6,  7.7],
        [7,   7.6, 12.3,  9.6],
        [8,  12.3, 29.2, 10.6],
        [9,  16.9, 42.9, 14.8],
        [10, 12.8, 30.9, 11.6],
        [11,  5.3,  7.9,  4.7],
        [12,  6.6,  8.4,  5.2],
        [13,  4.8,  6.3,  3.6],
        [14,  4.2,  6.2,  3.4] */
        
        [ 0, 0, 0, 0],
        [ 1, ${countAdmissionJanuary}, ${countDischargeJanuary}, ${countDeathJanuary}], 
			[ 2, ${countAdmissionFebruary}, ${countDischargeFebruary}, ${countDeathFebruary} ],
			[ 3, ${countAdmissionMarch}, ${countDischargeMarch}, ${countDeathMarch} ], 
			[ 4, ${countAdmissionApril}, ${countDischargeApril}, ${countDeathApril} ],
			[ 5, ${countAdmissionMay}, ${countDischargeMay}, ${countDeathMay} ],
			[ 6, ${countAdmissionJune}, ${countDischargeJune}, ${countDeathJune} ],
			[ 7, ${countAdmissionJuly}, ${countDischargeJuly}, ${countDeathJuly} ],
			[ 8, ${countAdmissionAugust}, ${countDischargeAugust}, ${countDeathAugust} ],
			[ 9, ${countAdmissionSeptember}, ${countDischargeSeptember}, ${countDeathSeptember} ],
			[ 10, ${countAdmissionOctober}, ${countDischargeOctober}, ${countDeathOctober} ],
			[ 11, ${countAdmissionNovember}, ${countDischargeNovember}, ${countDeathNovember} ],
			[ 12, ${countAdmissionDecember}, ${countDischargeDecember}, ${countDeathDecember} ]
      ]);

      var options = {
        chart: {
          title: 'Box Office Earnings in First Two Weeks of Opening',
          subtitle: 'in millions of dollars (USD)'
        },
        width: 900,
        height: 500
      };

      var chart = new google.charts.Line(document.getElementById('linechart_material'));

      chart.draw(data,options);
    }

</script> -->



<script>


		function current(val) {
			
			
			var rgn = document.getElementById("rgn");
			var mid = document.getElementById("mid");
			var nap = document.getElementById("nap");
			var nac = document.getElementById("nac");
			
			if(val == ""){
					rgn.style.display = "none";
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if(val == "Reg. Gen. Nurse"){
					rgn.style.display = "block";
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if(val == "Reg. Midwife"){
					mid.style.display = "block";
					rgn.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
			}else if (val == "NAC"){
					nac.style.display = "block";
					mid.style.display = "none";
					nap.style.display = "none";
					rgn.style.display = "none";
			}else if(val == "NAP"){
					nap.style.display = "block";
					mid.style.display = "none"
					rgn.style.display = "none"
					nac.style.display = "none"
			}else{
					mid.style.display = "none";
					nap.style.display = "none";
					nac.style.display = "none";
					rgn.style.display = "none"; 
					window.alert("check your input");
			}

			
		}
		
		
		
		  $(document).ready(function () {
			    $('.modal').on('show.bs.modal', function () {
			        if ($(document).height() > $(window).height()) {
			            // no-scroll
			            $('body').addClass("modal-open-noscroll");
			        }
			        else {
			            $('body').removeClass("modal-open-noscroll");
			        }
			    });
			    $('.modal').on('hide.bs.modal', function () {
			        $('body').removeClass("modal-open-noscroll");
			    });
			})
			
			
			

		
	</script>
	
	

</body>
</html>