<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style type="text/css">
@media ( max-width :800px) {
	.profile {
		display: none;
		color: yellow;
	}
	.cont {
		background-color: gold;
	}
}
/*
modal style
*/
body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Full-width input fields */
.input/* [type=text] */{
	width: 60%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* Set a style for all buttons */
.button1, .button2 {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 20%;
}

.button1, .button2:hover {
	opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn, .cancelbtn1 {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
}

.container1 {
	padding: 16px;
}

/* The Modal (background) */
.modal1 {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
	padding-top: 60px;
}

/* Modal Content/Box */
.modal-content1 {
	background-color: #fefefe;
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	border: 1px solid #888;
	width: 50%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
	position: absolute;
	right: 25px;
	top: 0;
	color: #000;
	font-size: 35px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: red;
	cursor: pointer;
}

/* Add Zoom Animation */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .cancelbtn1 {
		width: 100%;
	}
}

/* dropdown css starts here */
.dropbtn {
 /*  background-color: #4CAF50; */
  /* color: white; */
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  /* background-color: #3e8e41; */
}


/* dropdown css end here */

</style>





<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>profiles</title>
</head>
<body class="cont">

	<div id='firstHeader' class='firstHeader' name='firstHeader'>

		<h1 style="text-align: center">
			<ins>
				Bernice's International Preparatory School
				<p>
					(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)
				</p>
			</ins>
		</h1>
	</div>
<div style="overflow:hidden;" id="navbar" >
	<nav style="align-content: center; justify: center; ">
		<div style="display: flex;">
			<div>
				<ul>
					<h1 style="color: gold; font-weight: 900;">
						<span class="w3-aqua w3-padding">BI</span>PS
					</h1>
				</ul>
			</div>

			<div>
				<ul
					style="align-content: center; justify: center; display: inline-block;">
					<li><a
						href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolStudents/moreStudentsForm">Enroll
							Student</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolParents/showParentForm">Add
							Parent</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display
							Student</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolParents/displayParents">Display
							Parent</a></li>
					<li><a
						href="${pageContext.request.contextPath}/studentAddress/displayStudentAddress">Student
							Address</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolTeachers/showTeacherForm">Add
							Teacher</a></li>
					<li><a
						href="${pageContext.request.contextPath}/schoolTeachers/displayTeachers">All
							Teachers</a></li>
					<li><a
						href="${pageContext.request.contextPath}/general/lowerResults">getLowerResults</a></li>
					<%-- <li><a href="${pageContext.request.contextPath}/lowerPrimary/saveResults">Add Results</a></li> --%>
					<li>
						<div class="dropdown" style="background-color: blue;">
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">Add Results</button>
							<div class="dropdown-menu">
								<a class="dropdown-item"
									href="${pageContext.request.contextPath}/lowerPrimary/saveResults">Primary
									One</a> <a class="dropdown-item" href="#">Primary Two</a> <a
									class="dropdown-item" href="#">Primary Three</a> <a
									class="dropdown-item" href="#">Primary Four</a> <a
									class="dropdown-item" href="#">Primary Five</a> <a
									class="dropdown-item" href="#">Primary Six</a> <a
									class="dropdown-item" href="#">JHS One</a> <a
									class="dropdown-item" href="#">JHS Two</a> <a
									class="dropdown-item" href="#">JHS Three</a>
							</div>
						</div>
					</li>
					<li style="background-color: blue;">
						<form class="form-inline" action="searchIdOrName.jsp">
							<input class="form-control mr-sm-2" type="text" name="search"
								placeholder="Search"
								style="margin-top: 0.7em; height: 2.6em; border-radius: 0.8em;">
							<button class="btn btn-success" type="submit"
								style="height: 2.8em; padding: 0.5em; margin-top: 0.5em; width: 10em; border-radius: 0.8em;">Search</button>
						</form>

					</li>
				</ul>
				<!-- <ul > <li style="background-color: blue;"> </li> <li style="background-color: blue;"> </li> </ul> -->

			</div>
		</div>
	</nav>

	<!--   test nav begins here -->

	<div class="w3-bar w3-red">
		<a href="#" class="w3-bar-item w3-button">Home</a> <a href="#"
			class="w3-bar-item w3-button w3-hide-small">Enroll Student</a> <a
			href="#" class="w3-bar-item w3-button w3-hide-small">Enroll
			Parent</a> <a href="#" class="w3-bar-item w3-button w3-hide-small">Display
			Student</a> <a href="#" class="w3-bar-item w3-button w3-hide-small">Enroll
			Teacher</a> <a href="#" class="w3-bar-item w3-button w3-hide-small">Display
			Teacher</a> <a href="#" class="w3-bar-item w3-button w3-hide-small">Display
			results</a> <a href="javascript:void(0)"
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
	</div>

	<!--  test nav ends here -->

	<div class="">


		<div class="w3-row ">

			<!-- admin profile column starts here -->
			<div class="check">

				<div class="profile">

					<div
						class="w3-col w3-margin w3-green w3-padding w3-border w3-card w3-round-large"
						style="width: 250px; height: 1500px;" id="col">

						<div class="w3-center">
							<img class="w3-circle w3-center"
								style="width: 200px; height: 200px;" alt=""
								src="${pageContext.request.contextPath}/resources/png/mission.png">
							<p>admin profile</p>

						</div>

						<div class="w3-teal" style="width: 100%;">
							<button class="w3-btn w3-aqua w3-margin" type="button">good</button>
							<br>
							<button class="btn btn-primary w3-margin">better</button>
							<br>
							<button class="btn btn-warning w3-margin">best</button>

<!-- enrollment starts here -->



							<!-- <h3>Enrollment</h3> -->
				 <div class="dropdown">
				<div class=""> <h4 class="nav-link active">Enrollment </h4></div>
				<div class="dropdown-content">		
							<ul class="nav nav-pills flex-column">
								<!-- <li class="nav-item"><a class="nav-link active" href="#" class="dropbtn">Enrollment</a></li> -->
								<li class="nav-item"><a class="nav-link" href="moreStudentsForm">Student Enrollment</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Staff Enrollment</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Parent Enrollment</a></li>
								<!-- <li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a> -->
								</li>
							</ul>
							</div>	
							<hr class="d-sm-none">
						</div>

<!-- enrollment ends here -->

						</div>
						
						
						
						

<!-- academic record area  starts here-->
						<div class="try">

							<h3>Academic Records</h3>
							<p>Enter Examination records here.</p>
							<ul class="nav nav-pills flex-column">
								<li class="nav-item"><a class="nav-link active" href="#">results
										entry</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Year
										One</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Year
										Two</a></li>
								<li class="nav-item"><a class="nav-link" href="#">Year
										Three</a></li>
								<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
								</li>
							</ul>
							<hr class="d-sm-none">
						</div>

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


			<div
				class="w3-rest w3-margin w3-aqua w3-padding w3-card w3-round-large" style="height:1500px;">
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

									<td><a href="${updateURL }">Update</a> | <a
										href="${removeURL }"
										onclick="if (!confirm('Are you sure you want to delete this record?')) return false">Delete</a>
										| <a href="${results}">Results</a> |
										<a href="#myModal" data-toggle="modal" data-target="#myModal">addd</a>
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

				<div id="piechart"></div>
				<!-- pie chart ends here -->


			</div>

		</div>

	</div>


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



	<script type="text/javascript"
		src="https://www.gstatic.com/charts/loader.js"></script>

	<script type="text/javascript">
		// Load google charts
		google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		google.charts.setOnLoadCallback(drawChart);

		// Draw the chart and set the chart values
		function drawChart() {
			var data = google.visualization.arrayToDataTable([
					[ 'Task', 'Hours per Day' ], [ 'Year 1', ${countYear1} ], [ 'Year 2', 2 ],
					[ 'Year 3', 4 ], [ 'Total P.', 2 ], [ 'Sleep', 8 ] ]);

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
	
	<!-- stick scroll -->
	
	<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.display === "block") {
      panel.style.display = "none";
    } else {
      panel.style.display = "block";
    }
  });
}
</script>
	
</body>
</html>