<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NICU Home</title>
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
<style>

.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>
</head>
<body>
	<div class="jumbotron text-center" style="margin-bottom: 0">
		<h1>St. Joseph's Hospital, Jirapa</h1> <h2>Neonatal Intensive Care Unit (NICU)</h2>
		<p></p>
	</div>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark" id="navbar_top">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">NI</span>CU
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
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllNicuRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalNicu">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckNicuSchedule">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id1'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/admissionFront/form">form</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaleMedicalLeave">leave check</a>
				</li> --%>
			</ul>
						        <button id="b1" style="float:right; border-radius: 5em; display:flex; flex-direction:row-reverse; margin-left: 35em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
		</div>
	</nav>

	<div class="container" style="margin: 30px">
		<div class="row">
			<div class="col-sm-4">
				<h2>Administrator</h2>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/png/mission.png"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Administrator of BIPS..</p>
<%=(new java.util.Date()).toLocaleString() %>
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
						href="${pageContext.request.contextPath}/admissionFront/nicu">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyNicu">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeathNicu">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllNicuWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeNicu">Admission/Discharge</a>
					</li>
				</ul>
				</div>
				
</div>
<hr class="d-sm">
				<!-- academic record ends here -->

				<!-- student starts here -->
			<%-- 	<h3 style="background-color: gold;">Students enrollment</h3>
				<p>students here.</p>
				<ul class="nav nav-pills flex-column">
					<li class="nav-item"><a class="nav-link active">Admissions</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maleMedical">Male Medical</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year Two</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Year
							Three</a></li>
					<li class="nav-item">
						<!-- <a class="nav-link disabled" href="#">Disabled</a> -->
						<button type="button" class="btn btn-info float-left"
							data-toggle="modal" data-target="#myModal">Add Student</button>
					</li>
				</ul> --%>
				
				
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
				<hr class="d-sm-none">
				<!--   students ends here -->
			</div>

			<!-- mission start here -->
			<div class="col-xl">
				<!-- card starts here -->
			<div class="w3-container w3-padding w3-center"
				style="margin: 10px; position: relative; left: 4em;">
				<div class="row w3-padding " style="width:200%;">

					<div class="w3-card-2 w3-yellow w3-margin"
						style="height: 12em; width: 20%">
						<strong> <ins> Total Nurses </ins></strong>
						<p style="text-align: left;">total Nurses: ${countNurses}</p>
						<p style="text-align: left;">total males: ${countMale}</p>
						<p style="text-align: left;">total females: ${countFemale}</p>

					</div>

					<div class="w3-card-2 w3-green w3-margin w3-middle"
						style="height: 12em; width: 20%">
						<strong> <ins> Nurse Category</ins></strong>
						<p></p>


						<table width="200">

							<thead>
								<tr>
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
									.prepareStatement("select nurse_cate, count(*) as number from ward_schedule where ward_name = 'NICU' group by nurse_cate;");

									ResultSet resultSet = ps.executeQuery();

									while (resultSet.next()) {
										resultSet.getString(1);
										resultSet.getString(2);
								%>
								<tr>
									<td style="text-align: left;"><%=resultSet.getString(1)%></td>
									<td style="text-align: center;"><%=resultSet.getString(2)%></td>
								</tr>
								<%
								}
								} catch (Exception e) {

								}
								%>

							</tbody>

						</table>






						<%-- <div style="text-align: left;">total General Nurse: ${countYear1}</div> 
							<div style="text-align: left;">total Midwife: ${countYear1Male}</div>
							
							<div style="text-align: left;">total NAC: ${countYear1Female}</div>
							<div style="text-align: left;">total NAP: ${countYear1Female}</div>
							<div style="text-align: left;">total ANCILLARY: ${countYear1Female}</div> --%>
					</div>
					<div class="w3-card-2 w3-red w3-margin"
						style="height: 12em; width: 20%">
						<strong> <ins> Total Admission to date</ins></strong>
						<p style="text-align: left;">total Admission:
							${countNICUAdmissionToDate}</p>
						<p style="text-align: left;">total Discharge:
							${countNICUDischarge}</p>
						<p style="text-align: left;">total Death: ${countNICUDeath}</p>
					</div>
					<div class="w3-card-2 w3-teal w3-margin"
						style="height: 12em; width: 20%">

						<strong> <ins> Total Today's Admission/Discharge</ins></strong>
						<p style="text-align: left;">Total Admission:
							${countNICUTodayAdmission}</p>
						<p style="text-align: left;">Total Discharge:
							${countNICUTodayDischarge}</p>
						<p style="text-align: left;">Total Death: ${countNICUTodayDeath}</p>
					</div>
					
					
					
					
					<div class="w3-card-2 w3-blue w3-margin"
						style="height: 12em; width: 20%">
						<a class="w3-card-2 w3-blue w3-margin" style="" href="#"> <strong>
								<ins> Bed Capacity</ins>
						</strong>

								<table>
								
								<%
								try {

									Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
									//Statement statement = connection.createStatement();

									PreparedStatement ps = conn
									.prepareStatement("select bed_capacity from ward where ward_name = 'nicu';");

									ResultSet resultSet = ps.executeQuery();

									while (resultSet.next()) {
										resultSet.getInt(1);
									
										%>
										
									<tr>
										<th>Total Bed:</th>
										<td> <%=resultSet.getInt(1)%> </td>
									</tr>	
									
									
									<%
								}
								} catch (Exception e) {

								}
								%>
										
							
								
								
								
								
								<%
								
								
								
								
								try {

									Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
									//Statement statement = connection.createStatement();

									
									
									
									PreparedStatement ps1 = conn1
									.prepareStatement("select count(*) as a from admission_discharge where year(date_admitted) = year(curdate())  and ward_name = ',nicu' and outcome_of_admission is null or outcome_of_admission='';"); 

									ResultSet resultSet1 = ps1.executeQuery();

									while(resultSet1.next()) {
										 resultSet1.getInt(1);
										 
									
								%>
								
					
								
								
								
								
								<tr>
									<th style="text-align: left;">Occupied Bed: ${resultSet.getInt(1)}</th>
									<td style="text-align: center;"><%=resultSet1.getInt(1)%></td>
								
								</tr>
								
								<tr>
									
									<th>Vaccant Bed:</th>
									<td> <%=resultSet1.getInt(1)%> </td>
									</tr>
								
								<%
								}
								} catch (Exception e) {

								}
								%>
								
								
								
								
									
									<!-- <tr>
										<th>Occupied Bed:</th>
										<td>1</td>
									</tr> -->
									
									
									
									
								</table> 
								
								
								
								<%-- <p style="text-align: left;">Total Bed: ${bedCapacity}</p>
							<p style="text-align: left;">Total Occupied Bed:
								${bedOccupancy}</p>
							<p style="text-align: left;">Total Vacant Bed: ${bedCapacity - bedOccupancy}</p> --%>

						</a>
					</div>
					
					
					
					
					
					
					
					<div class="w3-card-2 w3-black w3-margin"
						style="height: 12em; width: 20%; float: left;">

						<strong> <ins> Ward/Bed State</ins></strong>
						<p style="text-align: left;">Remain at Midnight:
							${midnightRmain}</p>
						<p style="text-align: left;">Critical Ill: ${criticalPatient}</p>
						<p style="text-align: left;">Floor patient: ${floorPatient}</p>
						<p style="text-align: left;">Abscond patient:
							${abscondedPatient}</p>


					</div>
					<div class="w3-card-2 w3-green w3-margin"
						style="height: 12em; width: 20%">Year pass students:</div>
					<div class="w3-card-2 w3-teal w3-margin w3-round-large"
						style="height: 12em; width: 20%; text-align:;">
						<strong> <ins> Total Yesterday's
								Admission/Discharge</ins></strong>
						<p style="text-align: left;">Total Admission:
							${countNICUYesterdayAdmission}</p>
						<p style="text-align: left;">Total Discharge:
							${countNICUYesterdayDischarge}</p>
						<p style="text-align: left;">Total Death:
							${countNICUYesterdayDeath}</p>

					</div>
				</div>



			</div>


			<!-- card ends here -->





			<!-- mission start here -->
			</div>
		</div>
		
		<div class="row" style="margin-left: 40%;">
				<!-- <h2>OUR VISION</h2>
				<h5>Title description, Dec 7, 2017</h5> -->
				<div class="col" style="width: 100%;">

					<!-- <div id="curve_chart"
						style="width: 100%; height: 300px; margin-top: 1em;"></div> -->
				</div>
				<div class="container" style="width: 150%">	
	<div  id="curve_chart"
						style="width: 100%; height: 300px; margin-top: 1em;"></div>
</div>
				

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

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a> -->
	<div class="modal fade" id="modal-id">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Leave Application</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/leaveFront/saveLeave">
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
				<div class="modal-header">
					<h4 class="modal-title">Admission/Discharge Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/admissionFront/saveAdmission_Discharge">
					<div class="modal-body">



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
					<div class="modal-footer">
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
				<div class="modal-header">
					<h4 class="modal-title">Ward/Bed State Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form action="">
					<div class="modal-body">



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
											type="number" name="total_admission" id="">

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
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Record</button>
					</div>
				</form>
			</div>
		</div>
	</div>



	

	<!-- ward/bed state ends here -->

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




<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/loader.js"></script>
	<!-- https://www.gstatic.com/charts/loader.js -->
	<script type="text/javascript">
		google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		google.charts.setOnLoadCallback(drawChart);

		function drawChart() {
			var data = google.visualization.arrayToDataTable([
					/* [ 'Year', 'Admission', 'Discharge', 'Death' ],
					[ 'Jan', 100, 80, 20 ], [ 'Feb', 120, 110, 10 ],
					[ 'March', 140, 54, 77 ], [ 'April', 157, 103, 54 ],
					[ 'May', 157, 103, 54 ], [ 'June', 127, 103, 64 ],
					[ 'July', 132, 93, 24 ], [ 'Aug', 162, 153, 14 ],
					[ 'Sept', 187, 123, 54 ], [ 'Oct', 156, 113, 34 ],
					[ 'Nov', 197, 143, 54 ], [ 'Dec', 167, 123, 14 ] ]); */
					
					[ 'Year', 'Admission', 'Discharge', 'Death' ],
					/* [0, 0, 0, 0], */
					[ 'Jan', ${countNICUAdmissionJanuary}, ${countNICUDischargeJanuary}, ${countNICUDeathJanuary}], 
					[ 'Feb', ${countNICUAdmissionFebruary}, ${countNICUDischargeFebruary}, ${countNICUDeathFebruary} ],
					[ 'March', ${countNICUAdmissionMarch}, ${countNICUDischargeMarch}, ${countNICUDeathMarch} ], 
					[ 'April', ${countNICUAdmissionApril}, ${countNICUDischargeApril}, ${countNICUDeathApril} ],
					[ 'May', ${countNICUAdmissionMay}, ${countNICUDischargeMay}, ${countNICUDeathMay} ],
					[ 'June', ${countNICUAdmissionJune}, ${countNICUDischargeJune}, ${countNICUDeathJune} ],
					[ 'July', ${countNICUAdmissionJuly}, ${countNICUDischargeJuly}, ${countNICUDeathJuly} ],
					[ 'Aug', ${countNICUAdmissionAugust}, ${countNICUDischargeAugust}, ${countNICUDeathAugust} ],
					[ 'Sept', ${countNICUAdmissionSeptember}, ${countNICUDischargeSeptember}, ${countNICUDeathSeptember} ],
					[ 'Oct', ${countNICUAdmissionOctober}, ${countNICUDischargeOctober}, ${countNICUDeathOctober} ],
					[ 'Nov', ${countNICUAdmissionNovember}, ${countNICUDischargeNovember}, ${countNICUDeathNovember} ],
					[ 'Dec', ${countNICUAdmissionDecember}, ${countNICUDischargeDecember}, ${countNICUDeathDecember} ]]);


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
	
	
	<script>
		function displayH(val) {
			var hd = document.getElementById("hid");

			if (val == "") {
				hd.style.display = "none"
			} else if (val == "Yes") {
				hid.style.display = "block"
			} else {
				hd.style.display = "none"
			}
		}

		function hidden() {
			document.getElementById("hid").style.display = "none";
		}
	</script>

</body>
</html>