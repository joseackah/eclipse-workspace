<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">
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

<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/loader.js"></script>


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
<style type="text/css">
</style>





<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>profiles</title>
</head>
<body class="">
	<!-- body class = "cont" -->
	<div id='firstHeader' class='firstHeader' name='firstHeader'>

		<h1 style="text-align: center; font-weight: bold;">
			<ins>
				Bernice's International Preparatory School
				<p>
					(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)
				</p>
			</ins>
		</h1>
	</div>
	<nav style="align: right;">
		<div style="display: flex;">
			<div>
				<ul>
					<h1 style="color: gold; font-weight: 900;">
						<span class="" style="color: white;">BI</span>PS
					</h1>
				</ul>
			</div>

			<div
				style="display: -webkit-flex; -webkit-flex-direction: row; flex-direction: row; float: right;">
				<ul
					style="align-content: center; justify: center; display: inline-block;">
					<li><a
						href="${pageContext.request.contextPath}/leaveFront/profile">HOME</a></li>


					<%-- <li><a href="${pageContext.request.contextPath}/lowerPrimary/saveResults">Add Results</a></li> --%>

					<%-- <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %> --%>

				</ul>

				<!-- <ul > <li style="background-color: blue;"> </li> <li style="background-color: blue;"> </li> </ul> -->
				<div class="dropdown"
					style="width: 50px; position: absolute; right: 10%; top: 15%;">
					<button
						style="width: 50px; position: absolute; right: 2%; top: 15%;"
						type="button" data-toggle="dropdown"
						class="btn btn-primary dropdown-toggle">
						&#9776; <span class="caret"></span>
					</button>

					<ul class="dropdown-menu dropdown-menu-sm-right" id="menu"
						style="margin-left: 10px;">

						<a href="#" style="margin-left: 10px;">change password</a>
						<br>
						<br>
						<a href="${pageContext.request.contextPath}/"
							style="margin-left: 10px;">log out</a>
					</ul>

				</div>
			</div>
		</div>
	</nav>

	<!--   test nav begins here -->

	<div class="w3-bar w3-red">
		<a href="${pageContext.request.contextPath}/leaveFront/profile"
			class="w3-bar-item w3-button">Home</a> <a href="#modal-id"
			data-toggle="modal" class="w3-bar-item w3-button w3-hide-small">Add
			User</a> <a href="#modal-id1" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Ward</a> <a
			href="#modal-id2" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Nurse</a> <a
			href="#modal-id3" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">PIN/AIN</a> <a
			href="#modal-id4" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Schedule Nurse</a> <a
			href="#modal-id5" data-toggle="modal" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Apply for Leave </a> <a
			href="${pageContext.request.contextPath}/scheduleFront/displayAll"
			class="w3-bar-item w3-button w3-hide-small">schedule </a> <a
			href="${pageContext.request.contextPath}/leaveFront/nurseProfile"
			class="w3-bar-item w3-button w3-hide-small"> Nurse Profile</a> 
			<a
			href="${pageContext.request.contextPath}/admissionFront/displayAdmissionOnlyManager"
			class="w3-bar-item w3-button w3-hide-small">Admissions</a> 
			
			
			<a
			href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyManager"
			class="w3-bar-item w3-button w3-hide-small">Discharges</a> 
			
			<a
			href="${pageContext.request.contextPath}/admissionFront/displayManagerDeath"
			class="w3-bar-item w3-button w3-hide-small">Death</a> 
			
			<a
			href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeManager"
			class="w3-bar-item w3-button w3-hide-small">Admission/Discharge</a> 
			
			
			<a
			href="javascript:void(0)"
			class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium"
			onclick="myFunction()">&#9776;</a>

	</div>

	<div id="demo"
		class="w3-bar-block w3-red w3-hide w3-hide-large w3-hide-medium">
		<a href="#" class="w3-bar-item w3-button">Enroll Student</a> <a
			href="#" class="w3-bar-item w3-button">Enroll Parent</a> <a href="#"
			class="w3-bar-item w3-button">Display Student</a> <a href="#"
			class="w3-bar-item w3-button">Enroll Teacher</a> <a href="#"
			class="w3-bar-item w3-button">Display Teacher</a> <a href="#"
			class="w3-bar-item w3-button">Display results</a>

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
								src="${pageContext.request.contextPath}/resources/png/mission.png">
							<p>admin profile</p>

						</div>
						
						<hr class="d-sm">
								<h4>Hospital/Ward Records</h4>
				<!-- <p>Enter Examination records here.</p> -->
				<hr class="d-sm">		
<div class="dropdown">

<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">General  Display</div>
								</div>
<div class="dropdown-content">

						<div class="w3-tea" style="width: 100%;">
							<%-- <a class="w3-btn w3-aqua w3-margin" type="" 
								onclick="window.location.href='${pageContext.request.contextPath}/nurseFront/displayAllNurse'">Display
								Nurses</a>
							<br>
							<button class="btn btn-primary w3-margin"
								onclick="window.location.href='${pageContext.request.contextPath}/wardFront/displayAllWard'">Display
								ward</button>
							<br>
							<button class="btn btn-warning w3-margin"
								onclick="window.location.href='${pageContext.request.contextPath}/leaveFront/displayAllLeave'">Display
								Leave Applied</button>
							<br>
							<button class="btn btn-primary w3-margin"
								onclick="window.location.href='${pageContext.request.contextPath}/scheduleFront/displayAllSchedule'">Ward
								Schedule</button>

							<button class="btn btn-danger w3-margin"
								onclick="window.location.href='${pageContext.request.contextPath}/pinFront/displayAllPin'">Display
								Pin/Ain</button>
							<button class="btn btn-secondary w3-margin"
								onclick="window.location.href='${pageContext.request.contextPath}/userFront/displayAllUser'">User
								Display</button> --%>
								
								<ul class="nav nav-pills flex-column">


										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/nurseFront/displayAllNurse">Display Nurses</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/wardFront/displayAllWard">Display Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/leaveFront/displayAllLeave">Display Leave Applied</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/scheduleFront/displayAllSchedule">Display Ward Schedule</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/pinFront/displayAllPin">Pin/Ain</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/userFront/displayAllUser">Users</a></li>
										<%-- <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/generalWard">General Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/religiousWard">Religious Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/nicu">NICU</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/accidentEmergency">Accident/Emergency</a></li> --%>
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
						<!-- academic record area  starts here-->
						<div class="try">

							<!-- <button class="nav-item">Results Entry</button> -->
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
						<!-- academic record area  ends here-->
						<!-- certificate column starts -->
						<div>
							<ul>
								<%-- <li class="nav-item"><a class="nav-link active"
									href="${pageContext.request.contextPath}/general/certificateForm">Generate
										Certificate</a></li> --%>
							</ul>
							<button class="button1"
								onclick="document.getElementById('id01').style.display='block'"
								style="width: auto;">Generate Certificate</button>

							<button class="button2"
								onclick="document.getElementById('id02').style.display='block'"
								style="width: auto;">Generate Transcript</button>
						</div>

						<!-- certificate column ends -->

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
					style="margin: 10px; position: relative; left: 4em;">
					<div class="row w3-padding " style="width: 100">

						<div class="w3-card-2 w3-yellow w3-margin"
							style="height: 12em; width: 20%">
							<strong> <ins> Total Population </ins></strong>
							<p>total students: ${count}</p>
							<p>total males: ${countMale}</p>
							<p>total females: ${countFemale}</p>

						</div>

						<div class="w3-card-2 w3-green w3-margin w3-middle"
							style="height: 12em; width: 20%">
							<strong> <ins> Year/Level 1</ins></strong>
							<p>total students: ${countYear1}</p>
							<p>total males: ${countYear1Male}</p>
							<p>total females: ${countYear1Female}</p>
						</div>
						<div class="w3-card-2 w3-red w3-margin"
							style="height: 12em; width: 20%">
							<strong> <ins> Year/Level 2</ins></strong>
							<p>total students: ${countYear2}</p>
							<p>total males: ${countYear2Male}</p>
							<p>total females: ${countYear2Female}</p>
						</div>
						<div class="w3-card-2 w3-teal w3-margin"
							style="height: 12em; width: 20%">

							<strong> <ins> Year/Level 3</ins></strong>
							<p>total students: ${countYear3}</p>
							<p>total males: ${countYear3Male}</p>
							<p>total females: ${countYear3Female}</p>
						</div>
						<div class="w3-card-2 w3-blue w3-margin"
							style="height: 12em; width: 20%">Year results entries:</div>
						<div class="w3-card-2 w3-black w3-margin"
							style="height: 12em; width: 20%">Year results entries:</div>
						<div class="w3-card-2 w3-green w3-margin"
							style="height: 12em; width: 20%">Year pass students:</div>
						<div class="w3-card-2 w3-teal w3-margin w3-round-large"
							style="height: 12em; width: 20%">
							<p>Total Teachers : ${countTeachers }</p>
							<p>Males : ${countTeacherMale }</p>
							<p>females : ${countTeacherFemale}</p>

						</div>
					</div>



				</div>


				<!-- card ends here -->
				<hr>
				<!-- get all students table starts here -->
				<%-- <div style="float:; position: relative; left: 5%;">
					<table border="1" id="name" style="width: 90%;">
						<thead>
							<tr>
								<th>ID</th>
								<th>FIRST NAME</th>
								<th>LAST NAME</th>
								<th>SEX/GENDER</th>
								<th>AGE</th>
								<th>CLASS LEVEL</th>

								<th>ACTION</th>
							</tr>
						</thead>
						<tbody id="myTable">
							<c:forEach items="${student}" var="student">
								<c:url value="update1" var="updateURL">
									<c:param value="${student.studentId}" name="studentId"></c:param>
									<c:param value="${student.firstName}" name="firstName"></c:param>
									<c:param value="${student.lastName}" name="lastName"></c:param>
									<c:param value="${student.sex}" name="sex"></c:param>
									<c:param value="${student.age}" name="age"></c:param>
									<c:param value="${student.classLevel}" name="classLevel"></c:param>


								</c:url>

								<c:url value="deleteStudents/${student.studentId}"
									var="removeURL">
									<!-- <c:param value="" name="id"></c:param> -->
								</c:url>

								<c:url value="results" var="results">
									<c:param value="${student.studentId}" name="studentId"></c:param>
									<c:param value="${student.firstName}" name="firstName"></c:param>
									<c:param value="${student.lastName}" name="lastName"></c:param>
									<c:param value="${student.sex}" name="sex"></c:param>
									<c:param value="${student.age}" name="age"></c:param>
									<c:param value="${student.classLevel}" name="classLevel"></c:param>
								</c:url>

								<tr>
									<td>${student.studentId}</td>
									<td>${student.firstName}</td>
									<td>${student.lastName}</td>
									<td>${student.sex}</td>
									<td>${student.age}</td>
									<td>${student.classLevel}</td>


									<c:url value="" var="accounts">
										<c:param value="${student.studentId}" name="studentId"></c:param>



									</c:url>



									<td><a href="${updateURL }">Update</a> | <a
										href="${removeURL }"
										onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a>
										| <a href="${results}">Results</a> | <a href="accounts"
										data-toggle="modal" data-target="#myModal">accounts</a> <!-- <button type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">Add Student</button> -->
									</td>
								</tr>

							</c:forEach>
						</tbody>

					</table>
				</div> --%>

				<!-- get all students table ends here -->
				<hr>
				<!-- pie chart starts here -->
				<div style="display: flex;">
					<div id="piechart" style="margin-right: 2px;"></div>
					<!-- pie chart ends here -->

					<!-- trend chart starts here -->

					<div id="trendchart"
						style="margin-right: 2px; background-color: green;"></div>
					<!-- trend chart ends here -->
					<hr>
					<!-- comparison line chart starts here -->

				

					<!-- comparison line chart ends here -->
				</div>

	<div id="curve_chart" style="width:; height: 400px; margin-top: 1em;"></div>

				<!-- trend starts here -->

				<!-- <div id="chartContainer" style="height: 300px; width: 40%;"></div> -->


				<!-- trend ends here -->



			</div>

		</main>



		<!-- </div> -->


		<!-- modal to generate certificate form starts here -->

		<!-- modal form -->



		<div id="id01" class="modal1">

			<form class="modal-content1 animate"
				action="${pageContext.request.contextPath}/schoolStudents/certificate"
				method="post">
				<div class="imgcontainer">
					<span
						onclick="document.getElementById('id01').style.display='none'"
						class="close" title="Close Modal">&times;</span>
					<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
					<h2 class="avatar">
						<strong> <span style="color: blue;">BI</span>PS
						</strong>
					</h2>
				</div>

				<div class="container1">
					<label for="uname"><b>Student Id/Index Number</b></label> <input
						type="text" placeholder="Enter Student Id/Index Number"
						name="studentId" required class="input">


					<button class="button1" type="submit">Generate</button>

				</div>

				<div class="container1" style="background-color: #f1f1f1">
					<button type="button"
						onclick="document.getElementById('id01').style.display='none'"
						class="cancelbtn">Cancel</button>
				</div>
			</form>
		</div>

		<script>
			// Get the modal
			var modal = document.getElementById('id01');

			// When the user clicks anywhere outside of the modal, close it
			window.onclick = function(event) {
				if (event.target == modal) {
					modal.style.display = "none";
				}
			}
		</script>
		<!-- modal form ends -->
		<!-- modal to generate certificate form end here -->


		<!-- transcript form starts here -->

		<div id="id02" class="modal1">

			<form class="modal-content1 animate"
				action="${pageContext.request.contextPath}/general/transcript"
				method="post">
				<div class="imgcontainer">
					<span
						onclick="document.getElementById('id02').style.display='none'"
						class="close" title="Close Modal">&times;</span>
					<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
					<h2 class="avatar">
						<strong> <span style="color: blue;">BI</span>PS
						</strong>
					</h2>
				</div>

				<div class="container1">
					<label for="uname"><b>Student Id/Index Number</b></label> <input
						type="text" placeholder="Enter Student Id/Index Number"
						name="studentId" required class="input">


					<button class="button2" type="submit">Generate Transcript</button>

				</div>

				<div class="container1" style="background-color: #f1f1f1">
					<button type="button"
						onclick="document.getElementById('id02').style.display='none'"
						class="cancelbtn1">Cancel</button>
				</div>
			</form>
		</div>

		<script>
			// Get the modal
			var modal = document.getElementById('id02');

			// When the user clicks anywhere outside of the modal, close it
			window.onclick = function(event) {
				if (event.target == modal) {
					modal.style.display = "none";
				}
			}
		</script>



		<!-- transcript form ends here -->










		<!-- pie chart javascript start here -->
		<spring:url value="/resources/js/loader.js" var="loaderJs" />

		<script src="${loaderJs}"></script>

		<%-- <script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/js/loader.js"></script> --%>
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
						.arrayToDataTable([ [ 'Task', 'Hours per Day' ],
								[ 'Year 1', 86 ], [ 'Year 2', 90 ],
								[ 'Year 3', 75 ], [ 'Total P.', 65 ] /* , [ 'Sleep', 8 ] */]);

				// Optional; add a title and set the width and height of the chart
				var options = {
					'title' : 'BIPS POPULATION',
					'width' : 550,
					'height' : 400
				};

				// Display the chart inside the <div> element with id="piechart"
				var chart = new google.visualization.PieChart(document
						.getElementById('piechart'));
				chart.draw(data, options);
			}
		</script>

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
						.arrayToDataTable([ [ 'Task', 'Hours per Day' ],
								[ 'Year 1', 78 ], [ 'Year 2', 59 ],
								[ 'Year 3', 14 ], [ 'Total P.', 54 ] /* , [ 'Sleep', 8 ] */]);

				// Optional; add a title and set the width and height of the chart
				var options = {
					'title' : 'BIPS POPULATION',
					'width' : 550,
					'height' : 400
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
					[ 'Jan', 100, 80, 20 ], [ 'Feb', 120, 110, 10 ],
					[ 'March', 140, 54, 77 ], [ 'April', 157, 103, 54 ],
					[ 'May', 157, 103, 54 ],[ 'June', 127, 103, 64 ],
					[ 'July', 132, 93, 24 ],[ 'Aug', 162, 153, 14 ],
					[ 'Sept', 187, 123, 54 ],[ 'Oct', 156, 113, 34 ],
					[ 'Nov', 197, 143, 54 ],[ 'Dec', 167, 123, 14 ]]);

			var options = {
				title : 'Admission and Discharge Performance',
				curveType : 'function',
				legend : {
					position : 'right'
				}
			};

			var chart = new google.visualization.LineChart(document
					.getElementById('curve_chart'));

			chart.draw(data, options);
		}
	</script>


	<!-- <div id="curve_chart" style="width: 900px; height: 500px"></div> -->


	<!-- comparison line trend javascripts ends here -->



	<!-- forms starts here -->

	<!-- user forms starts here -->


	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Users</a> -->
	<div class="modal fade" id="modal-id">
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
										name="image" id="" multiple>
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
	<div class="modal fade" id="modal-id2">
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
										class="form-control" id="">
										<option value="select">select</option>
										<option value="Reg. Gen. Nurse(Diploma)">Reg. Gen.
											Nurse(Diploma)</option>
										<option value="Reg. Gen. Nurse(Degree)">Reg. Gen.
											Nurse(Degree)</option>
										<option value="Reg. Midwife(Diploma)">Reg.
											Midwife(Diploma)</option>
										<option value="Reg. Midwife(Degree)">Reg.
											Midwife(Degree)</option>
										<option value="NAC">NAC</option>
										<option value="NAP">NAP</option>
										<option value="Others">Others</option>

									</select>
								</div>
							</div>


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
	<div class="modal fade" id="modal-id5">
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
											<option value="Children's Ward">Children's Ward</option>
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


								<div class="col">
									<div class="form-group">
										<label for="incharge_recom">Incharge Recommendation</label> <select
											name="incharge_recom" class="form-control" id="" readonly>
											<option value="select">select</option>
											<option value="annual leave">Yes</option>
											<option value="maternity leave">No</option>


										</select>
									</div>
								</div>

							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="incharge_name">Incharge Name</label> <input
											type="text" class="form-control" name="incharge_name"
											readonly>
									</div>
								</div>
								<!-- <div class="col">
                                    <div class="form-group">
                                        <label for="">Name</label>
                                        <input type="text" class="form-control" name="name" id="">
                                    </div>
                                </div> -->
							</div>





							<div class="row">
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



						<div class="thirdContainer">
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
	<div class="modal fade" id="modal-id3">
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
										<option value="select">select</option>
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
	<div class="modal fade" id="modal-id1">
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
	<div class="modal fade" id="modal-id4">
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
									<label for="ward_name">Ward Name</label> <input type="text"
										class="form-control" name="ward_name" id="">

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
									<label for="staff_id">Staff Id</label> <input type="text"
										class="form-control" name="staff_id" id="" required>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="nurse_cate">Nurse Category</label> <select
										name="nurse_cate" id="" class="form-control">
										<option value="selected">select</option>
										<option value="RGN">RGN</option>
										<option value="MIDWIFE">MIDWIFE</option>
										<option value="NAP">NAP</option>
										<option value="NAC">NAC</option>

									</select>

								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="wardIncharge">Ward Incharge</label> <input
										type="text" class="form-control" name="" id="myInput" hidden>

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





	<!-- ward schedule form ends here -->


	<!-- forms ends here -->







</body>
</html>