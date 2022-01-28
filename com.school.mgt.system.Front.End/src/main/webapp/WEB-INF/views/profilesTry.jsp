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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/w3.css">
<!-- https://www.w3schools.com/w3css/4/w3.css -->
<link href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/profile.js"></script>

<script type="text/javascript"
		src="${pageContext.request.contextPath }/resources/js/loader.js"></script>


<style type="text/css">

</style>





<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>profiles</title>
</head>
<body class=""> <!-- body class = "cont" -->
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

			<div style="display: -webkit-flex; -webkit-flex-direction: row; flex-direction:row; float: right;">
				<ul
					style="align-content: center; justify: center; display: inline-block;">
					<li><a
						href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
					
					
					<%-- <li><a href="${pageContext.request.contextPath}/lowerPrimary/saveResults">Add Results</a></li> --%>
					
					<%-- <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %> --%>
					
				</ul>
				
				<!-- <ul > <li style="background-color: blue;"> </li> <li style="background-color: blue;"> </li> </ul> -->
				<div class="dropdown" style="width: 50px; position: absolute; right: 10%; top: 15%;">
			<button  style="width: 50px; position: absolute; right: 2%; top: 15%;  " type="button" data-toggle="dropdown"  class="btn btn-primary dropdown-toggle">   &#9776; <span class="caret"></span></button>
			 
			 <ul class="dropdown-menu dropdown-menu-sm-right"  id="menu" style="align-content:left;">
			 
			 <li> <a>change password</a> </li>
			 <li> <a>log out</a> </li>
			 </ul>
			 
			 </div>
			</div>
		</div>
	</nav>

	<!--   test nav begins here -->

	<div class="w3-bar w3-red">
		<a href="${pageContext.request.contextPath}/general/homePage" class="w3-bar-item w3-button">Home</a> 
		<a href="${pageContext.request.contextPath}/schoolStudents/moreStudentsForm"
			class="w3-bar-item w3-button w3-hide-small">Enroll Student</a> 
			<a
			href="${pageContext.request.contextPath}/schoolParents/showParentForm" class="w3-bar-item w3-button w3-hide-small">Enroll
			Parent</a> 
			<a href="${pageContext.request.contextPath}/schoolStudents/displayStudents" class="w3-bar-item w3-button w3-hide-small">Display
			Student</a> 
			<a href="${pageContext.request.contextPath}/schoolTeachers/showTeacherForm" class="w3-bar-item w3-button w3-hide-small">Enroll
			Teacher</a> 
			<a href="${pageContext.request.contextPath}/schoolTeachers/displayTeachers" class="w3-bar-item w3-button w3-hide-small">Display
			Teacher</a> 
			<a href="#" class="w3-bar-item w3-button w3-hide-small">Display
			results </a> 
			<a href="${pageContext.request.contextPath}/schoolAccounts/displayAccounts" class="w3-bar-item w3-button w3-hide-small">Accounts </a> 
			<a href="${pageContext.request.contextPath}/schoolAccounts/accounts" class="w3-bar-item w3-button w3-hide-small">Accounts forms </a> 
			<a href="${pageContext.request.contextPath}/schoolAccounts/accountsDetails" class="w3-bar-item w3-button w3-hide-small">Accounts Details </a> 
			<a href="javascript:void(0)"
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

				<div class="profile" style=""  >

					<div
						class=" w3-margin w3-green w3-padding w3-border w3-card w3-round-large"
						style="width: 250px; height: 1500px;" id="col">

						<div class="w3-center">
							<img class="w3-circle w3-center"
								style="width: 200px; height: 200px;" alt=""
								src="${pageContext.request.contextPath}/resources/png/mission.png">
							<p>admin profile</p>

						</div>

						<div class="w3-teal" style="width: 100%;">
							<button class="w3-btn w3-aqua w3-margin" type="button">Display Students</button>
							<br>
							<button class="btn btn-primary w3-margin">Get Teachers</button>
							<br>
							<button class="btn btn-warning w3-margin">Parents</button>

<!-- enrollment starts here -->



							<!-- <h3>Enrollment</h3> -->
				<div class="dropdown">
				<div > <h4 class="nav-link active">Enrollment </h4></div>
				<div class="dropdown-content">		
							<ul class="nav nav-pills flex-column">
								<!-- <li class="nav-item"><a class="nav-link active" href="#" class="dropbtn">Enrollment</a></li> -->
								<li class="nav-item"><a class="nav-link" href="moreStudentsForm">Student Enrollment</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Staff Enrollment</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Parent Enrollment</a></li>
								<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
								</li>
							</ul>
							</div>	
							<hr class="d-sm-none">
						</div>

<!-- enrollment ends here -->

						</div>
						
				 		
						
					
<br>
<!-- academic record area  starts here-->
						<div class="try">

							<!-- <button class="nav-item">Results Entry</button> -->
							<div class="dropdown">
							<div class="nav-item nav nav-pills flex-colmn">
							<div class="nav-link active"> results
										entry</div>
										</div>
							<div class="dropdown-content">
							
							<ul class="nav nav-pills flex-column">
							
										
								<li class="nav-item"><a class="nav-link" href="#">Year
										One</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Year
										Two</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Year
										Three</a></li>
								<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
								</li>
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
								<li class="nav-item"><a class="nav-link active"
									href="${pageContext.request.contextPath}/general/certificateForm">Generate
										Certificate</a></li>
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
			<div
				class="< w3-margin w3-aqua w3-padding w3-card w3-round-large" style="height:1500px;">
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
							<p>total students:  ${countYear3}</p>
							<p>total males:  ${countYear3Male}</p>
							<p>total females:  ${countYear3Female}</p>
							</div>
						<div class="w3-card-2 w3-blue w3-margin"
							style="height: 12em; width: 20%">
							Year results entries:
							
							</div>
						<div class="w3-card-2 w3-black w3-margin"
							style="height: 12em; width: 20%">
							
							Year results entries:
							</div>
						<div class="w3-card-2 w3-green w3-margin"
							style="height: 12em; width: 20%">
							
							Year pass students:
							</div>
						<div class="w3-card-2 w3-teal w3-margin w3-round-large"
							style="height: 12em; width: 20%">
							<p> Total Teachers : ${countTeachers } </p> 
						<p>	Males		   : ${countTeacherMale }</p> 
						<p>	females		   : ${countTeacherFemale}</p>  
							
							</div>
					</div>



				</div>


				<!-- card ends here -->
				<hr>
				<!-- get all students table starts here -->
				<div style="float:; position: relative; left: 5%;">
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
										| <a href="${results}">Results</a> |
										<a href="accounts" data-toggle="modal" data-target="#myModal">accounts</a>
										<!-- <button type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">Add Student</button> -->
										</td>
								</tr>

							</c:forEach>
						</tbody>

					</table>
				</div>

				<!-- get all students table ends here -->
				<hr>
				<!-- pie chart starts here -->
<div style="display: flex;">
				<div id="piechart" style="margin-right: 2px;"></div>
				<!-- pie chart ends here -->

<!-- trend chart starts here -->

				<div id="trendchart" style="margin-right: 2px; background-color: green;"></div>
<!-- trend chart ends here -->

<!-- comparison line chart starts here -->

<div id="curve_chart" style="width: 1000px; height: 400px"></div>

<!-- comparison line chart ends here -->
</div>



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
				<span onclick="document.getElementById('id01').style.display='none'"
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
					name="studentId" required  class="input">


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
				<span onclick="document.getElementById('id02').style.display='none'"
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

<script 
		src="${loaderJs}"></script>

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
			var data = google.visualization.arrayToDataTable([
					[ 'Task', 'Hours per Day' ], [ 'Year 1', ${countYear1} ], [ 'Year 2', ${countYear2} ],
					[ 'Year 3', ${countYear3} ], [ 'Total P.', ${count} ]/* , [ 'Sleep', 8 ] */]);

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
	<script type="text/javascript" >
		// Load google charts
		google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		google.charts.setOnLoadCallback(drawChart);

		// Draw the chart and set the chart values
		function drawChart() {
			var data = google.visualization.arrayToDataTable([
					[ 'Task', 'Hours per Day' ], [ 'Year 1', ${countYear1} ], [ 'Year 2', ${countYear2} ],
					[ 'Year 3', ${countYear3} ], [ 'Total P.', ${count} ]/* , [ 'Sleep', 8 ] */]);

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
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/loader.js"></script>
	<!-- https://www.gstatic.com/charts/loader.js -->
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Presented', 'Pass', 'Referral'],
          ['2004',  100, 80,      20],
          ['2005',  120, 110,      10],
          ['2006',  150, 80,       70],
          ['2007',  157, 103,      54]
        ]);

        var options = {
          title: 'Examination Performance',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    </script>
  
  
    <!-- <div id="curve_chart" style="width: 900px; height: 500px"></div> -->
  
	
	<!-- comparison line trend javascripts ends here -->
	
</body>
</html>