<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>
    

<!-- test form -->

	<!-- <a class="btn btn-primary" data-toggle="modal" href='#modal-id'>Leave Application</a> -->
	<div class="modal fade" id="modal-id">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header table-primary" id="form_color" style="">
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
					<div class="modal-footer table-danger">
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
				<div class="modal-header table-primary">
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
					<div class="modal-footer table-danger">
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
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header table-primary">
					<h4 class="modal-title">Ward/Bed State Form</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form action="">
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