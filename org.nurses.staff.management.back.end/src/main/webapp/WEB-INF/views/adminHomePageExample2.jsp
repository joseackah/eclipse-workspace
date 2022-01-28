<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
	
	
<style>
.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>
</head>
<body>
	<div class="jumbotron text-center" style="margin-bottom: 0">
		<h1>Bernice's International Preparatory School</h1>
		<p>Where Wisdom is Acquired through Application of Knowledge!</p>
	</div>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">BI</span>PS
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/general/homePage">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolStudents/moreStudentsForm">Enroll
						Student</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolParents/showParentForm">Add
						Parent</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display
						Student</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolParents/displayParents">Display
						Parent</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolStudents/showStudentsForm">Add
						Teacher</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/studentAddress/displayStudentAddress">Add
						Student Address</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/schoolTeachers/displayTeachers">All
						Teachers</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/general/lowerResults">Get
						Results</a></li>
			</ul>
		</div>
	</nav>

	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-sm-4">
				<h2>Administrator</h2>
				<h5>Photo of me:</h5>
				<div class="fakeimg">
					<img alt="our mision"
						src="${pageContext.request.contextPath}/resources/png/mission.png"
						style="width: 100%; height: 100%;" />
				</div>
				<p>Administrator of BIPS..</p>

				<!--   academic record start here -->

				<h3>Academic Records</h3>
				<p>Enter Examination records here.</p>
				<ul class="nav nav-pills flex-column">
					<li class="nav-item"><a class="nav-link active" href="#">results
							entry</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Year One</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year Two</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year
							Three</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
					</li>
				</ul>
				<hr class="d-sm-none">

				<!-- academic record ends here -->

				<!-- student starts here -->
				<h3 style="background-color: gold;">Students enrollment</h3>
				<p>students here.</p>
				<ul class="nav nav-pills flex-column">
					<li class="nav-item"><a class="nav-link active">Enrollment</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year One</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year Two</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year
							Three</a></li>
					<li class="nav-item">
						<!-- <a class="nav-link disabled" href="#">Disabled</a> -->
						<button type="button" class="btn btn-info float-left"
							data-toggle="modal" data-target="#myModal">Add Student</button>
							
							
							<button type="button" class="btn btn-info float-left"
			data-toggle="table" data-target="#testTable">display Student</button>
					</li>
				</ul>
				<hr class="d-sm-none">
				<!--   students ends here -->
			</div>

			<!-- mission start here -->
			<div class="col-lg-8" id=testTeable >
				<h2>OUR VISION</h2>
				
				<table border="1" id="name" style="width: 100%;">
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
									| <a href="${results}">Results</a></td>
							</tr>

						</c:forEach>
					</tbody>

				</table>
${student}


				<!-- mission end here -->

				<br>
				
		</div>
	</div>

	<div class="jumbotron text-center"
		style="margin-bottom: 0; align-context: space-between;">
		<div style="justify-content: center;">
			<div style="display: flex; float: center; justify-content: center;">
				<p style="margin-right: 10em">
					address: <br /> Post Office Box SQ 90 Tema
				</p>
				<p
					style="border-left: 1px solid black; height: 80px; position: fix; left: 35%; padding-right: 2em;">
				</p>
				<p style="display: flex; float: right;">
					Location: <br /> Behind Baatsona Fuel Station, <br> Baatsona,
					Lashiba
				</p>
				<P
					style="border-left: 1px solid black; height: 80px; position: fix; right: 50%; margin-left: 6em;">
				</P>
				<p style="margin-left: 10em">
					contact us:<br /> 0207173313
				</p>
			</div>


		</div>
	</div>


	<!-- test form -->

	<div class="container">
		<button type="button" class="btn btn-info float-left"
			data-toggle="modal" data-target="#myModal">Add Student</button>

		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title text-primary">ADD NEW STUDENT</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<div class="modal-body">

						<form
							action=""
							method="post">

							<div class="modal-body">

								<div class="row">
									<div class="col">

										<div class="form-group">

											<input name="student_id" type="text"
												class="form-control checking_student_id" id="student_id"
												value="" placeholder="Student ID" required> <span
												class="error_student_id" id="student_id_error_message"
												style="color: red;"></span>
										</div>
									</div>
									<div class="col">

										<div class="form-group">
											<input name="student_name" type="text" class="form-control"
												id="student_name" value="" placeholder="Student Name"
												required> <span id="student_name_error_message"
												style="color: red;"></span>
										</div>


									</div>








								</div>



								<div class="form-group">
									<label>COURSE</label> <select class="form-control"
										name="course">
										<option value="">Select Course</option>
										<option value="Certificate in Software Development">Certificate
											in Software Development</option>
										<option value="Cisco Certified Network Associate">Cisco
											Certified Network Associate</option>
										<option value="Cisco Certified Network Professionals">Cisco
											Certified Network Professionals</option>
										<option value="International Computer Driving Licence">International
											Computer Driving Licence</option>
										<option value="Cyber Security">Cyber Security</option>
										<option value="Network Information Security">Network
											Information Security</option>
										<option value="Certified Information System Auditor">Certified
											Information System Auditor</option>
										<option value="Big Data Analytics">Big Data Analytics</option>
										<option value="Web Technologies">Web Technologies</option>
										<option value="Java Programming">Java Programming</option>
										<option value="Computing Infrastructure Systems & Security">Computing
											Infrastructure Systems & Security</option>
									</select>
								</div>



								<div class="row">
									<div class="col">



										<div class="form-group">
											<label>COURSE LEVEL</label> <input name="course_level"
												type="text" class="form-control" id="course_level" value=""
												placeholder="CSD1.5" required> <span
												id="course_level_error_message" style="color: red;"></span>
										</div>


									</div>

									<div class="col">

										<div class="form-group">
											<label>DATE OF BIRTH</label> <input name="date_of_birth"
												type="date" class="form-control checking_date_of_birth"
												id="date_of_birth" value="" placeholder="example@play.com"
												required> <span class="error_date_of_birth"
												id="date_of_birth_error_message" style="color: red;"></span>
										</div>


									</div>
								</div>


								<div class="form-group">
									<label>EMAIL</label> <input name="email" type="email"
										class="form-control checking_email" id="email" value=""
										placeholder="example@play.com" required> <span
										class="error_email" id="email_error_message"
										style="color: red;"></span>
								</div>


								<div class="row">
									<div class="col">


										<div class="form-group">
											<label>PHONE NUMBER</label> <input name="phone" type="text"
												class="form-control checking_phone" id="phone" value=""
												placeholder="0*************" required> <span
												class="error_phone" id="phone_error_message"
												style="color: red;"></span>
										</div>
									</div>
									<div class="col">
										<div class="form-group">
											<label>GENDER</label> <select class="form-control"
												name="gender">
												<option>Select</option>
												<option value="Male">Male</option>
												<option value="Female">Female</option>
											</select>
										</div>

									</div>
								</div>

								<div class="form-group">
									<label>ADDRESS</label> <input name="address" type="text"
										class="form-control" id="address" value=""
										placeholder="Tema Comm 1" required> <span
										id="course_level_error_message" style="color: red;"></span>
								</div>


								<div class="row">
									<div class="col">


										<div class="form-group">
											<label>COURSE START DATE</label> <input
												name="course_start_date" type="date"
												class="form-control checking_date_of_birth"
												id="course_start_date" value=""
												placeholder="example@play.com" required> <span
												class="error_date_of_birth" id="date_of_birth_error_message"
												style="color: red;"></span>
										</div>

									</div>
									<div class="col">


										<div class="form-group">
											<label>COURSE END DATE</label> <input name="course_end_date"
												type="date" class="form-control checking_date_of_birth"
												id="course_end_date" value="" placeholder="example@play.com"
												required> <span class="error_date_of_birth"
												id="date_of_birth_error_message" style="color: red;"></span>
										</div>

									</div>
								</div>
</body>
</html>