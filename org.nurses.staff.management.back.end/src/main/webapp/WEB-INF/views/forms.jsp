<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>
    
<!-- <!DOCTYPE html>

<html>
<head> -->

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">


<%-- <link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet"> --%>
<%-- <link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet"> --%>


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
<style>
/* .modal {
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
} */


#content{

background-color: aqua;
height: 88%;

}
#content1{
height: 60%;
}




</style>
<!-- </head>
</html> -->
<!-- test form -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a> -->
	<div class="modal fade try" id="modal-id">
		<div class="modal-dialog" id="dialog">
			<div class="modal-content" id="content1">
				<div class="modal-header btn-primary" id="form_color" style="">
					<h4 class="modal-title">Leave Application</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/leaveFront/saveLeave">
					<div class="modal-body table-warning">



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
					<div class="modal-footer btn-danger">
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
			<div class="modal-content" id="content">
				<div class="modal-header btn-primary">
					<h4 class="modal-title">Admission Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/admissionFront/saveAdmission_Discharge">
					<div class="modal-body table-warning">



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
										</select>
									</div>
								</div>
							</div>

						</div>


					</div>
					<div class="modal-footer btn-danger">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Admit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
		



	<!-- admission ends here -->



	<!-- ward/bed state starts here -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id2'>Trigger
		modal</a> -->
	<div class="modal fade" id="modal-id2" ng-app="">
		<div class="modal-dialog ">
			<div class="modal-content" id="content">
				<div class="modal-header btn-primary">
					<h4 class="modal-title">Ward/Bed State Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form  class="table-danger" action="${pageContext.request.contextPath}/bedStateFront/saveWard_Bed_State" method="post">
			
					<div class="modal-body table-warning">



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
					<div class="modal-footer btn-danger">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Record</button>
					</div>
				</form>
			</div>
		</div>
	</div>





	<!-- ward/bed state ends here -->




<!-- delivery form starts here -->


	<div class="modal fade" id="modal-id5">
		<div class="modal-dialog">
			<div class="modal-content" id="content">
				<div class="modal-header btn-primary">
					<h4 class="modal-title">Delivery Entry Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>
				<form
					action="${pageContext.request.contextPath}/deliveryFront/saveDelivery_table">
					<div class="modal-body table-warning">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="name">Client Name</label> <input type="text"
											class="form-control" name="name" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="gestation_of_pregnancy">Gestation</label> <input
											type="text" required class="form-control"
											name="gestation_of_pregnancy" id="">
									</div>
								</div>

							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="date_labour_started">Date Labour Started</label> <input
											type="date" class="form-control" name="date_labour_started"
											id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="date_of_delivery">Date of Delivery</label> <input
											type="date" class="form-control" name="date_of_delivery"
											id="">
									</div>
								</div>


							</div>

							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="time_of_delivery">Time of Delivery</label> <input
											type="time" class="form-control" name="time_of_delivery"
											id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="time_of_placenta">Time of Placenta</label> <input
											type="time" class="form-control" name="time_of_placenta">
									</div>
								</div>


							</div>


							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="duration_of_delivery">Duration of Labour</label> <input
											type="time" class="form-control" name="duration_of_delivery"
											id="">

									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="condition_of_placenta">Condition of
											Placenta</label> <select name="condition_of_placenta"
											class="form-control" id="">
											<option value="">select</option>
											<option value="Normal">Normal</option>
											<option value="Abnormal">Abnormal</option>
											<!-- 				<option value="casual leave">Casual Leave</option>
											<option value="paternity leave">Paternity Leave</option>
											<option value="sick leave">Sick Leave</option>
											<option value="bereavement leave">Bereavement Leave</option>
 -->
										</select>
									</div>
								</div>





							</div>




						</div>


						<div class="secondContainer">
							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="type_of_delivery">Type of Delivery</label> <select
											name="type_of_delivery" class="form-control" id="lets">
											<option value="">Select</option>
											<option value="cesaerean Section">Cesserean Section</option>
											<option value="Spontaneous V. delivery">Spontaneous
												V. Delivery</option>
											<option value="Vacuum Extraction">Vacuum Extraction</option>
											<option value="SVD with episiotomy">SVD with
												episiotomy</option>
											<option value="SVD(Augumented)">SVD(Augumented)</option>
											<option value="SVD(Induced)">SVD(Induced)</option>
											<!--<option value="General Ward">General Ward</option>
											<option value="NICU">NICU</option>
											<option value="Religious Ward">Religious Ward</option>
											<option value="Accident/Emergency">Accident/Emergency</option> -->
										</select>
									</div>

								</div>




								<div class="col">
									<div class="form-group">
										<label for="indication_of_cs">(If CS..)Indication of
											CS</label> <select name="indication_of_cs" class="form-control" id="">
											<option value="None">select</option>
											<option value="Post Date">Post Date</option>
											<option value="Foetal Distress">Foetal Distress</option>
											<option value="Pelvic Dystocia">Pelvic Dystocia</option>
											<option value="Maternal Complication">Maternal
												Complication</option>
											<option value="Foetal Complication">Foetal
												Complication</option>

										</select>
									</div>
								</div>

							</div>


							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="cs_conducted_by">CS Conducted By</label> <input
											type="text" class="form-control" name="cs_conducted_by" id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="state_of_perineum">State of Perineum</label> <select
											name="state_of_perineum" class="form-control" id="">
											<option value="">select</option>
											<option value="Intact">Intact</option>
											<option value="Sutured">Sutured</option>
											<option value="min. tear">Mini. Tear</option>
											<option value="Tear(not sutured)">Tear(not sutured)</option>
											<!-- <option value="ANXILLARY">Anxillary</option> -->

										</select>
									</div>
								</div>

							</div>





							<div class="row">


								<div class="col">
									<div class="form-group">
										<label for="condition_of_mother">Condition of Mother</label> <input
											type="text" class="form-control" name="condition_of_mother"
											id="">

									</div>


								</div>

								<div class="col">
									<div class="form-group">
										<label for="complication_of_delivery">Complication</label> <input
											type="text" class="form-control"
											name="complication_of_delivery" id="">
									</div>
								</div>
							</div>

						</div>



						<div class="thirdContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="midwife_conducting_delivery">Midwife
											Conducting Delivery</label> <input type="text" class="form-control"
											name="midwife_conducting_delivery" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="assisstant">Assistant</label> <input type="text"
											class="form-control" name="assisstant" id="">
									</div>
								</div>
							</div>

						</div>

						<div class="fourContainer">
							<div class="row">

								<!-- <div class="col">
									<div class="form-group">
										<label for="date_approved">Date Approved</label> <input
											type="date" class="form-control" name="date_approved" id=""
											disabled>
									</div>
								</div> -->
							</div>

						</div>

					</div>
					<div class="modal-footer btn-danger">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save Record</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<!-- delivery form ends here -->



	<!-- newborn form starts here -->


	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Trigger modal</a> -->
	<div class="modal fade " id="modal-id6">
		<div class="modal-dialog ">
			<div class="modal-content" id="content">
				<div class="modal-header btn-primary">
					<h4 class="modal-title">Newborn Entry Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/newbornFront/saveNewborn_table">
					<div class="modal-body table-warning">



						<div class="firstContainer">

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="delivery_id">Delivery Id(Mother Delivery
											Id)</label> <input type="text" class="form-control"
											name="delivery_id" id="">
									</div>
								</div>
								<div class="col">
									<div class="form-group">
										<label for="baby_name">Baby Name(Mother Name)</label> <input
											type="text" class="form-control" name="baby_name" id="">
									</div>
								</div>
							</div>


							<fieldset>
								<legend> apgar score</legend>
								<div class="row">


									<div class="col">
										<div class="form-group">
											<label for="first_apgar_score">First Minute(1
												minutes)</label> <select name="first_apgar_score"
												class="form-control" id="">
												<option value="">select</option>
												<option value="0/10">0/10</option>
												<option value="1/10">1/10</option>
												<option value="2/10">2/10</option>
												<option value="3/10">3/10</option>
												<option value="4/10">4/10</option>
												<option value="5/10">5/10</option>
												<option value="6/10">6/10</option>
												<option value="7/10">7/10</option>
												<option value="8/10">8/10</option>
												<option value="9/10">9/10</option>
												<option value="10/10">10/10</option>


											</select>
										</div>
									</div>

									<div class="col" id="">

										<div class="form-group" id="dis">
											<label for="second_apgar_score">Fifth Minute(5
												minute)</label> <select name="second_apgar_score"
												class="form-control" id="">
												<option value="">select</option>
												<option value="0/10">0/10</option>
												<option value="1/10">1/10</option>
												<option value="2/10">2/10</option>
												<option value="3/10">3/10</option>
												<option value="4/10">4/10</option>
												<option value="5/10">5/10</option>
												<option value="6/10">6/10</option>
												<option value="7/10">7/10</option>
												<option value="8/10">8/10</option>
												<option value="9/10">9/10</option>
												<option value="10/10">10/10</option>


											</select>
										</div>
									</div>


								</div>
						</div>
						</fieldset>


						<div class="secondContainer">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="outcome_of_delivery">Outcome of Delivery</label> <input
											type="text" class="form-control" name="outcome_of_delivery"
											id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="cause_of_death">(If not alive) Cause of
											Death</label> <input type="text" class="form-control"
											name="cause_of_death" placeholder="" id="" min="0"
											onKeyPress="if(this.value.length==10) return false;">
									</div>
								</div>



							</div>



							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="sex">Sex of Baby</label> <select name="sex"
											class="form-control" id="">
											<option value="">select</option>
											<option value="Male">Male</option>
											<option value="Female">Female</option>
											<!-- <option value="Trans-out">Trans-out</option>
                                            <option value="Absconded">Absconded</option>
                                            <option value="Death">Death</option> -->
										</select>
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="number_of_baby">Number of Baby</label> <input
											type="number" class="form-control" name="number_of_baby"
											id="">

									</div>
								</div>


							</div>

						</div>



						<div class="thirdContainer">
							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="resuscitation">Resuscitation</label> <select
											name="resuscitation" class="form-control" id="">
											<option value="">select</option>
											<option value="yes">Yes</option>
											<option value="no">No</option>
											<!-- <option value="Trans-out">Trans-out</option>
                                            <option value="Absconded">Absconded</option>
                                            <option value="Death">Death</option> -->
										</select>
									</div>


								</div>

								<div class="col">
									<div class="form-group">
										<label for="condition_of_baby">Condition of Baby</label> <input
											type="text" class="form-control" name="condition_of_baby"
											id="">
									</div>
								</div>

							</div>

							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="head_circumference">Head circumference</label> <input
											type="number" class="form-control" name="head_circumference"
											id="">
									</div>
								</div>

								<div class="col">
									<div class="form-group">
										<label for="full_length">Full Length</label> <input
											type="number" class="form-control" name="full_length" id="">
									</div>
								</div>

							</div>

							<div class="row">

								<div class="col">
									<div class="form-group">
										<label for="congenital">Abnormality</label> <select
											name="congenital" class="form-control" id="lets"
											onclick="myDisplay()">
											<option value="">Select</option>
											<option value="Congenital" id="yes">Congenital</option>
											<option value="Deformity" id="no">Deformity</option>
										</select>
									</div>
								</div>

								<div class="col" id="">

									<div class="form-group" id="dis">
										<label for="type_of_abnormality">Type of Abnormality</label> <input
											type="text" name="type_of_abnormality" class="form-control">
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col">
									<div class="form-group">
										<label for="complication">Complication</label> <input
											type="text" class="form-control" name="complication" id="">
									</div>
								</div>
							
								<div class="col">
									<div class="form-group">
										<label for="date_of_delivery">Date of Delivery</label> <input
											type="date" name="date_of_delivery" class="form-control">

									</div>
								</div>
							</div>

						</div>

					</div>
					<div class="modal-footer btn-danger">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Register</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<!-- newborn form ends here -->






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
	
	
	
	
	
	<!-- admission form updates starts here -->
	
	
	
	
	
	<!-- admission form update ends here -->
	
	
	
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
	
	
	<!-- Manager forms starts here -->
	
	
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
				<div class="modal-header table-success">
					<h4 class="modal-title">Nurse Staff</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/nurseFront/saveNurse">
					<div class="modal-body table-primary">

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
					<div class="modal-footer btn-warning">
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
									<label for="wardIncharge">Ward Incharge</label> <input
										type="text" class="form-control" name="" id="myInput" hidden=true>

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
	
	
	<!-- manager forms ends here -->
	
	
	
	
	
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

		function hidden() {
			document.getElementById("hid").style.display = "none";
		}
		
		function nextOfKin(){
			var	nxt = document.getElementById("next");
			var nxtN = document.getElementById("nextNumber");
			var error = "Please Enter a valid name!"
			
			if(nxt.value.length >= 3){
				nxtN.style.display = "block"
					document.getElementById("errorOfNext").style.display = "none";
			}else if(nxt.value.length <=2){
				
				document.getElementById("errorOfNext").innerHTML = error;
				/* nxtN.style.display = "none" */
			}else if(nxt.value.length = ""){
				nxtN.style.display = "none";
				document.getElementById("errorOfNext").innerHTML = error;
			}else{
				nxtN.style.display = "none";
			}
		}
	</script>
	