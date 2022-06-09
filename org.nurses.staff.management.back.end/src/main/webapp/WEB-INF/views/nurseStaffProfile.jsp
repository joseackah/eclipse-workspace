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

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>


<meta charset="ISO-8859-1">
<title>Nurse Staff Profile</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>
	
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
	
	<link href="${pageContext.request.contextPath}/resources/css/projectCss.css"
	rel="stylesheet">
<style>

.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>

<script type="text/javascript">
function onLoadSubmit() {
	document.Try.submit();
}
</script>


</head>
<body ng-app="myApp" ng-controller="myCtrl">

<%

String name = request.getParameter("userId");


%>

<%-- <form:form name="Try" action="${pageContext.request.contextPath}/generalFront/vali" id="form1" modelAttribute="fere" method="POST"> 
			
			<input hidden="true" class="form-control" type="text" name="userId" value="24" >
			
			
			</form:form>
 --%>

	<div class="jumbotron text-center" style="margin-bottom: 0">
		<h1>Welcome</h1> <h2> Staff Dashboard</h2>
		<p></p>
	</div>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">S</span>D
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/nurseStaffProfile">Home</a>
					</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaternityRecom">Recommend
						Leave</a></li> --%>
				<li class="nav-item"><a class="nav-link"
					 onclick="document.getElementById('id08').style.display='block'">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					onclick="document.getElementById('id09').style.display='block'">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/admissionFront/form">Birth (Neonate)</a>
				</li> --%>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaleMedicalLeave">Death (Neonate)</a>
				</li> --%>
				
				<li class="nav-item"> </li>
			</ul>
						        <button id="b1" style="float:right; border-radius: 5em; display:flex; flex-direction:row-reverse; margin-left: 35em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
		</div>
	</nav>

	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-sm-4">
				<h2>Staff</h2>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/color_person_male.png"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>${userId}</p>
				<p>${name}</p>
				<p>
				
					
				</p>

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
						href="${pageContext.request.contextPath}/admissionFront/maternity">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyMaternity">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeathMaternity">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeMaternity">Admission/Discharge</a>
					</li>
				</ul>
				</div>
				
</div>
<hr class="d-sm">
				
				
				
			
				 <hr class="d-sm-none">
				
			</div>

			
			<div class="col-xl">
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
				<c:forEach items="${eventsT}" var="even">
				<c:url value="eventsUpdate1/${even.event_id}" var="updateURL">
				
				</c:url>
				
				
				<c:url value="deleteEvents/${even.event_id}"
									var="removeURL">
									
								</c:url>
				
				<tr>
				<td hidden="true">${even.event_id}</td>
				<td>${even.event_name}</td>
				<td>${even.venue}</td>
				<td>${even.event_date}</td>
				<td>${even.participant}</td>
				</tr>
				</c:forEach>
				
				
				
				</tbody>
				
				</table>
				
				
				</div>
				<p></p>
				<p></p>

				

				<br>
				<h2>NOTICE</h2>
				<h5>Information</h5>
				<div class="fakeimg">
					<img alt=""
						
						style="width: 100%; height: 100%;">
				</div>
				<p></p>
				<p></p>
			</div>
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

<%-- ${eventsT} --%>
	<!-- test form -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a> -->
	<div class="modal fade" id="modal-id">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader">
					<h4 class="modal-title">Leave Application</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/leaveFront/saveLeave">
					<div class="modal-body" id="modalBody">



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
										<label for="ward_name">Ward Name</label> <select
											name="ward_name" class="form-control" id="lets">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Children Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
											<option value="Outpatient Department">Outpatient Department</option>
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


								<div class="col" style="display: none">
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


							<div class="row" style="display:none">
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





							<div class="row" style="display:none">
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
							<div class="row" style="display:none">
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
					<div class="modal-footer" id="modalFooter">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Apply</button>
					</div>
				</form>
			</div>
		</div>
	</div>



	<!-- leave form ends here -->



	<!-- admission starts here -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id1'>Trigger
		modal</a> -->
	<div class="modal fade" id="modal-id1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader">
					<h4 class="modal-title">Admission/Discharge Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/admissionFront/saveAdmission_Discharge">
					<div class="modal-body" id="modalBody">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="patien_number">Folder Number</label> <input
											type="text" class="form-control" name="patient_number" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="patient_name">Patient Name</label> <input
											type="text" class="form-control" name="patient_name" id="">
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="sex">Sex/Gender</label> <select name="sex"
											class="form-control" id="">
											<option value="">select</option>
											<option value="Male">Male</option>
											<option value="Female">Female</option>


										</select>
									</div>

								</div>
								<div class="col" id="">

									<div class="form-group" >
										<label for="age">Age</label> <input type="number" name="age"
											class="form-control" min="0"
											>
									</div>
								</div>

							</div>

						</div>


						<div class="secondContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="address">Address</label> <input type="text"
											class="form-control" name="address" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="phone_number">Phone Number</label> <input
											type="number" class="form-control" name="phone_number"
											placeholder="" id="" min="0"
											onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>



							</div>



							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="date_admitted">Date Admitted</label> <input
											type="date" class="form-control" name="date_admitted" id=""
											>
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="createdBy">Provisional Diagnosis</label> <input
											type="text" class="form-control" name="diagnosis" id="">

									</div>
								</div>


							</div>

						</div>



						<div class="thirdContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="final_diagnosis">Final Diagnosis</label> <input
											type="text" class="form-control" name="final_diagnosis" id=""
											readonly>
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="outcome_of_admission">Outcome of Admission</label>

										<select name="outcome_of_admission" class="form-control" id=""
											disabled>
											<option value="">select</option>
											<option value="Discharge">Discharge</option>
											<option value="Referred">Referred</option>
											<option value="Trans-out">Trans-out</option>
											<option value="Absconded">Absconded</option>
											<option value="Death">Death</option>
										</select>
									</div>


								</div>



							</div>

							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="next_of_kin">Next of Kin</label> <input
											type="text" class="form-control" name="next_of_kin" id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="next_of_kin_number">Next of Kin Number</label> <input
											type="text" class="form-control" name="next_of_kin_number"
											id="">
									</div>
								</div>

							</div>

							<div class="row">


								<div class="col">
									<div class="form-group">
										<label for="insured">Insured</label> <select name="insured"
											class="form-control" id="" >
											<option value="">Select</option>
											<option value="Yes" id="yes" >Yes</option>
											<option value="No" id="no" >No</option>
										</select>
									</div>
								</div>

								<div class="col" id="insurance_number">

									<div class="form-group" id="">
										<label for="insurance_number">Insurance Number</label> <input
											type="number" name="insurance_number" class="form-control"
											min="0" onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>



							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="date_discharge">Date Discharge</label> <input
											type="date" class="form-control" name="ward_name" id=""
											readonly>
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="ward_name">ward Name</label> 
										
										
										<select
											name="ward_name" class="form-control">
											<option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Childrens ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
										</select>
									</div>
								</div>
							</div>

						</div>


					</div>
					<div class="modal-footer" id="modalFooter">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Record</button>
					</div>
				</form>
			</div>
		</div>
	</div>



	


	<!-- admission ends here -->



	<!-- ward/bed state starts here -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id2'>Trigger
		modal</a> -->
	<div class="modal fade" id="modal-id2">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader">
					<h4 class="modal-title">Ward/Bed State Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form action="${pageContext.request.contextPath}/bedStateFront/saveWard_Bed_State" method="post">
					<div class="modal-body" id="modalBody">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="date">Date</label> <input type="date"
											class="form-control" name="date" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="ward_name">Ward Name</label> <input type="text"
											class="form-control" name="ward_name" id="">
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_admission">Total Admission</label> <input
										class="form-control"	type="number" name="total_admission" id="">

									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="total_discharge">Total Discharge</label> <input
											type="number" class="form-control" name="total_discharge"
											id="">
									</div>
								</div>
							</div>

						</div>


						<div class="secondContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_trans_in">Total Trans In</label> <input
											type="number" class="form-control" name="total_trans_in"
											placeholder="" id="" min="0"
											onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>


								<div class="col">
									<div class="form-group">
										<label for="total_trans_out">Total Trans Out</label> <input
											type="number" class="form-control" name="total_trans_out"
											id="" >
									</div>
								</div>
							</div>



							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_death">Total Death</label> <input
											type="number" class="form-control" name="total_death" id="">

									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="total_critical_ill">Critical Ill</label> <input
											type="number" class="form-control" name="total_critical_ill"
											id="">
									</div>


								</div>
							</div>

						</div>



						<div class="thirdContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_floor_patient">Floor Patients</label> <input
											type="number" class="form-control" name="total_floor_patient"
											id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="total_absconded">Abscond</label> <input
											type="number" class="form-control" name="total_absconded"
											id="">
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_insured">Total Insured</label> <input
											type="number" class="form-control" name="total_insured" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="total_non_insured">Total Non-Insured</label> <input
											type="number" class="form-control" name="total_non_insured"
											id="">
									</div>
								</div>
							</div>

							<div class="row">

								<div class="col" id="insurance_number">

									<div class="form-group" id="dis">
										<label for="total_remained_at_midnight">Total Remained
											At Midnight</label> <input type="number"
											name="total_remained_at_midnight" class="form-control"
											min="0" onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>

								<div class="col" id="">

									<div class="form-group" id="">
										<label for="nurse_incharge">Nurse Incharge(shift)</label> <input
											type="text" name="nurse_incharge" class="form-control"
											>
									</div>
								</div>
							</div>

						</div>


					</div>
					<div class="modal-footer" id="modalFooter">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Record</button>
					</div>
				</form>
			</div>
		</div>
	</div>



	

	<!-- ward/bed state ends here -->



<!-- check leave approval here --> 

<!-- <button class="button1"
								onclick="document.getElementById('id01').style.display='block'"
								style="width: auto;">Generate Certificate</button> -->

<!-- check leave approval here ends -->


<!-- check leave approval here --> 

<div id="id08" class="modal1">

			<form class="modal-content1 animate"
				action="${pageContext.request.contextPath}/generalFront/staffCheckLeave"
				method="post">
				<div class="imgcontainer" id="">
					<span
						onclick="document.getElementById('id08').style.display='none'"
						class="close" title="Close Modal">&times;</span>
					<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
					<h2 class="avatar">
						<strong> <span style="color: blue;">S</span>D
						</strong>
					</h2>
				</div>

				<div class="container1">
					<label for="uname"><b>Staff Id/Number</b></label> 
					<input style="width: 60%;"
						type="text" placeholder="Enter Staff Id/Number"
						name="staff_id" required class="input">


					<button class="button1" type="submit">Generate</button>

				</div>

				<div id="modalHeader" class="container1" style="background-color: #f1f1f1;">
					<button  type="button"
						onclick="document.getElementById('id08').style.display='none'"
						class="cancelbtn">Cancel</button>
				</div>
			</form>
		</div>
<!-- check leave approval here ends -->

<!-- staff ward checker starts here -->

<div id="id09" class="modal1">

			<form class="modal-content1 animate"
				action="${pageContext.request.contextPath}/generalFront/staffCheckWard"
				method="post">
				<div class="imgcontainer" id="">
					<span
						onclick="document.getElementById('id09').style.display='none'"
						class="close" title="Close Modal">&times;</span>
					<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
					<h2 class="avatar">
						<strong> <span style="color: blue;">S</span>D
						</strong>
					</h2>
				</div>

				<div class="container1">
					<label for="uname"><b>Staff Id/Number</b></label> 
					<input style="width: 60%;"
						type="text" placeholder="Enter Staff Id/Number"
						name="staff_id" required class="input">


					<button class="button1" type="submit">Generate</button>

				</div>

				<div class="container1" style="background-color: #f1f1f1;">
					<button  type="button"
						onclick="document.getElementById('id09').style.display='none'"
						class="cancelbtn">Cancel</button>
				</div>
			</form>
		</div>

<!-- staff ward checker ends here -->


<!-- admission try form starts here -->

<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a> -->
	<div class="modal fade" id="modal-id4">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader">
					<h4 class="modal-title">Admission Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/admissionFront/saveAdmission_Discharge">
					<div class="modal-body" id="modalBody">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="patient_number">Patient Number/Id</label> <input type="text"
											class="form-control" name="patient_number" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="patient_name">Patient Name</label> <input type="text"
											class="form-control" name="patient_name" id="">
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="sex">Sex/Gender</label> <select
											name="sex" class="form-control" id="lets">
											<option value="">Select</option>
											<option value="Male">Male</option>
											<option value="Female ">Female</option>
										</select>
									</div>

								</div >
								
								<div class="col">
								<div class="form-group">
								<label for="age">Age</label>
								<input type="number" class="form-control" name="age">
								</div>
								</div>

							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="address">Address</label> 

										<input type="text" class="form-control" name="address">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="phone_number">Phone Number</label> 

										<input type="text" class="form-control" name="phone_number">
									</div>
								</div>
							</div>


							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="date_admitted">Date Admitted</label> <input
											type="date" class="form-control" name="date_admitted"
											id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="diagnosis">Provisional Diagnosis</label> <input
											type="text" class="form-control" name="diagnosis"
											id="">
									</div>
								</div>


							</div>




						</div>


						<div class="secondContainer">
							<div class="row">



								<div class="col">
									<div class="form-group">
										<label for="next_of_kin">Next Of Kin</label> <input type="text"
											class="form-control" name="next_of_kin" id="">
									</div>
								</div>


								<div class="col">
									<div class="form-group">
										<label for="next_of_kin_number">Next Of Kin Number</label> 
										<input type="number" class="form-control" name="next_of_kin_number">
									</div>
								</div>

							</div>


							<div class="row" hidden="true">
								<div class="col">
									<div class="form-group">
										<label for="final_diagnosis">Final Diagnosis</label> <input
											type="text" class="form-control" name="final_diagnosis"
											readonly>
									</div>
								</div>
								<div class="col" >
									<div class="form-group">
										<label for="outcome_of_admission">Outcome of Admission</label> 
										<select class="form-control" name="outcome_of_admission">
										
										<option value="">Select</option>
										<option value="Discharge">Discharge</option>
										<option value="Death">Death</option>
										<option value="Abscond">Abscond</option>
										<option value="Referred">Referred</option>
										<option value="Trans-out">Trans-out</option>
										<option value="Discharge(against Medical Advice)">Discharge(against Medical Advice)</option>
										
										</select>

									</div>
								</div>
								
							</div>





							<div class="row">
							<div class="col">
									<div class="form-group">
										<label for="insured">Insured</label> 
										<select class="form-control" name="insured" onchange="displayH(this.value)">
										<option>select</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
										
										</select>

									</div>


								</div>
								<div class="col" id="hid" style="display:none;">
                                    <div class="form-group">
                                        <label for="insurance_number">Insurance Number</label>
                                        <input type="number" class="form-control" name="insurance_number" id="">
                                    </div>
                                </div>

								
							</div>

						</div>



						<div class="thirdContainer">
							<div class="row">
								<div class="col" hidden="true">
									<div class="form-group">
										<label for="date_discharge">Date Discharge</label> <input
											type="date" class="form-control" name="date_discharge" id=""
											disabled>
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="ward_name">Ward Name</label> 
										<select
											name="ward_name" class="form-control" id="lets">
											 <option>select</option>
						 
						 <%
									try {

										Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
										//Statement statement = connection.createStatement();

										PreparedStatement ps = conn.prepareStatement(
										"select ward_name from ward;");

										ResultSet resultSet = ps.executeQuery();

										while (resultSet.next()) {
											resultSet.getString(1);
											//resultSet.getString(2);
									%>
									
									<option value="<%=resultSet.getString(1)%>"> <%=resultSet.getString(1)%></option>
									<%
									}
									} catch (Exception e) {

									}
									%>
											<!-- <option value="">Select</option>
											<option value="Male Medical">Male Medical</option>
											<option value="Female Medical">Female Medical</option>
											<option value="Female Surgical">Female Surgical</option>
											<option value="Male Surgical">Male Surgical</option>
											<option value="Children Ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option>
											<option value="Outpatient Department">Outpatient Department</option> -->
										</select>
									</div>
								</div>
							</div>

						</div>


					</div>
					<div class="modal-footer" id="modalFooter">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Admit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	
	
	
	<script>
		function displayH(val) {
			var hd = document.getElementById("hid");

			if (val == "") {
				hd.style.display = "none"
			} else if (val == "Yes") {
				hd.style.display = "block"
			} else {
				hd.style.display = "none"
			}
		}

		/* function hidden() {
			document.getElementById("hid1").style.display = "none";
		} */
	</script>
	
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl',['$scope', '$state', '$timeout', function($scope, $state, $timeout) {
  
  $timeout(function () {
     $state.go('www.google.com')
  }, 2000);
}]);
</script>
</body>
</html>