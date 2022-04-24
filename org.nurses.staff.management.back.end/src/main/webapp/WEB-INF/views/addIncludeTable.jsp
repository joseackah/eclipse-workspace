<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>

<!DOCTYPE html>
<html>
<head> 
<link href="${pageContext.request.contextPath}/resources/css/projectCss.css"
	rel="stylesheet">
	
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
    
   
    
    <link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 -->

<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>


<%-- 
	<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
 --%>

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
    margin: 0.5em;
  }
  #print {
    position: absolute;
    left: 5%;
    top: 0;
    margin: ;
  }
  
  #b1, #b2 {
  
  visibility:hidden;
  
  
  }
  
  #myInput , #action , #action1 , #action2 , #action3 , s1  {
  
  visibility:hidden;
  
  }
}


</style>
<meta charset="ISO-8859-1">
<title></title>
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


<%-- <div class="wrapper">
<aside class="aside_body w3-padding" style="width:30%; ">

<div  style="">
				<h3>Administrator</h3>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/color_person_male.png"
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



<main style="width: 100%;">










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
</script> --%>





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
											class="form-control" name="ward_name" id="lets">

											<option>select</option>

											<%
											try {

												Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
												//Statement statement = connection.createStatement();

												PreparedStatement ps = conn.prepareStatement("select ward_name from ward;");

												ResultSet resultSet = ps.executeQuery();

												while (resultSet.next()) {
													resultSet.getString(1);
													//resultSet.getString(2);
											%>

											<option value="<%=resultSet.getString(1)%>">
												<%=resultSet.getString(1)%></option>
											<%
											}
											} catch (Exception e) {

											}
											%>

										</select>

										<!-- <select
											>
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
										</select> -->
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
											name="incharge_recom" class="form-control" id="">
											<option value="select">select</option>
											<option value="annual leave">Yes</option>
											<option value="maternity leave">No</option>


										</select>
									</div>
								</div>

							</div>


							<div class="row" style="display: none">
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





							<div class="row" style="display: none">
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



						<div class="thirdContainer" style="display: none">
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
		
		<div class="modal fade" id="modal-id4">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Admission Form2</h4>
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
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Admit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
		
	<%-- <div class="modal fade" id="modal-id1">
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

									<div class="form-group">
										<label for="age">Age</label> <input type="number" name="age"
											class="form-control" min="0">
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
											type="date" class="form-control" name="date_admitted" id="">
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
							<div class="row" style="display:none;">
								<div class="col">
									<div class="form-group">
										<label for="final_diagnosis">Final Diagnosis</label> <input
											type="text" class="form-control" name="final_diagnosis" id=""
											disabled>
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
											type="text" oninput="nextOfKin()" class="form-control" name="next_of_kin" id="next">
									</div>
								</div>

								<div class="col" id="nextNumber" style="display:none;">
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
											class="form-control" id="" onchange="displayH(this.value)">
											<option value="">Select</option>
											<option value="Yes" id="yes">Yes</option>
											<option value="No" id="no">No</option>
										</select>
									</div>
								</div>

								<div class="col" id="hid" style="display:none;">

									<div class="form-group" id="">
										<label for="insurance_number">Insurance Number</label> <input
											type="number" name="insurance_number" class="form-control"
											min="0" onKeyPress="if(this.value.length!=8) return false;">
									</div>
								</div>



							</div>

							<div class="row">
								<div class="col" hidden="true" style="display: none;">
									<div class="form-group">
										<label for="date_discharge">Date Discharge</label> <input
											type="date" class="form-control" name="ward_name" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="ward_name">ward Name</label> <select
											name="ward_name" class="form-control">



											<option>select</option>

											<%
											try {

												Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
												//Statement statement = connection.createStatement();

												PreparedStatement ps = conn.prepareStatement("select ward_name from ward;");

												ResultSet resultSet = ps.executeQuery();

												while (resultSet.next()) {
													resultSet.getString(1);
													//resultSet.getString(2);
											%>

											<option value="<%=resultSet.getString(1)%>">
												<%=resultSet.getString(1)%></option>
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
											<option value="Childrens ward">Children's Ward</option>
											<option value="Maternity">Maternity</option>
											<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option> -->
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

 --%>




	<!-- admission ends here -->



	<!-- ward/bed state starts here -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id2'>Trigger
		modal</a> -->
	<div class="modal fade" id="modal-id2" ng-app="">
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
										<label for="ward_name">Ward Name</label> <select
											class="form-control" name="ward_name">

											<option>select</option>

											<%
											try {

												Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
												//Statement statement = connection.createStatement();

												PreparedStatement ps = conn.prepareStatement("select ward_name from ward;");

												ResultSet resultSet = ps.executeQuery();

												while (resultSet.next()) {
													resultSet.getString(1);
													//resultSet.getString(2);
											%>

											<option value="<%=resultSet.getString(1)%>">
												<%=resultSet.getString(1)%></option>
											<%
											}
											} catch (Exception e) {

											}
											%>

										</select>

										<!-- <input type="text"
											class="form-control" name="ward_name" id=""> -->
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_admission">Total Admission</label> <input
											ng-model="admission" type="number" class="form-control"
											name="total_admission" id="">

									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="total_discharge">Total Discharge</label> <input
											type="number" ng-model="discharge" class="form-control"
											name="total_discharge" id="">
									</div>
								</div>
							</div>

						</div>


						<div class="secondContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_trans_in">Total Trans In</label> <input
											type="number" ng-model="transin" class="form-control"
											name="total_trans_in" placeholder="" id="" min="0"
											onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>


								<div class="col">
									<div class="form-group">
										<label for="total_trans_out">Total Trans Out</label> <input
											type="number" ng-model="transout" class="form-control"
											name="total_trans_out" id="">
									</div>
								</div>
							</div>



							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="total_death">Total Death</label> <input
											type="number" ng-model="death" class="form-control"
											name="total_death" id="">

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
											type="number" ng-model="abscond" class="form-control"
											name="total_absconded" id="">
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
											value="{{(admission + transin)-(discharge + transout + abscond + death)}}"
											name="total_remained_at_midnight" class="form-control"
											min="0" onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>

								<div class="col" id="">

									<div class="form-group" id="">
										<label for="nurse_incharge">Nurse Incharge(shift)</label> <input
											type="text" name="nurse_incharge" class="form-control">
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




	<!-- ward summary -->


	<div id="id01" class="modal1">

		<form class="modal-content1 animate"
			action="${pageContext.request.contextPath}/generalFront/wardSummary"
			method="post">
			<div class="imgcontainer">
				<span onclick="document.getElementById('id01').style.display='none'"
					class="close" title="Close Modal">&times;</span>
				<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
				<h2 class="avatar">
					<strong> <span style="color: blue;">Ward Summary</span>
					</strong>
				</h2>
			</div>

			<div class="container1">
				<label for="uname"><b>Ward Name</b></label>
				<!-- <input style="width: 60%;"
						type="text" placeholder="Enter Ward Name"
						name="wardName" required class="input"> -->

				<select class="input" name="wardName" style="width: 60%;">

					<option>select</option>

					<%
					try {

						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
						//Statement statement = connection.createStatement();

						PreparedStatement ps = conn.prepareStatement("select ward_name from ward;");

						ResultSet resultSet = ps.executeQuery();

						while (resultSet.next()) {
							resultSet.getString(1);
							//resultSet.getString(2);
					%>

					<option value="<%=resultSet.getString(1)%>">
						<%=resultSet.getString(1)%></option>
					<%
					}
					} catch (Exception e) {

					}
					%>

				</select>


				<button class="button1" type="submit">Generate</button>

			</div>

			<div class="container1" style="background-color: #f1f1f1;">
				<button type="button"
					onclick="document.getElementById('id01').style.display='none'"
					class="cancelbtn">Cancel</button>
			</div>
		</form>
	</div>

	<!-- ward summary ends -->
</body>
</html>