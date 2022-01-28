<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<meta charset="ISO-8859-1">
<title>Nurse Update Form</title>
</head>
<body>


<!--  <a class="btn btn-primary" data-toggle="modal" href='#modal-id2'>Nurse Staff</a> -->
	<div class="mo fad" id="modal-id2">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Update Nurse Staff</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>

				</div>

				<form
					action="${pageContext.request.contextPath}/nurseFront/update">
					<div class="modal-body">
<input type="text"	class="form-control" value="${nurse.id }" name="id" id="" hidden="true">
						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="staff_id">Staff Id</label> <input type="text"
										class="form-control" value="${nurse.staff_id }" name="staff_id" id="">
								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="name">Name</label> <input type="text"
										class="form-control" value="${nurse.name}" name="name" id="">
								</div>
							</div>
						</div>

						<div class="row">
						<div class="col">
								<div class="form-group">
									<label for="sex">Sex</label> 
									<input type="text"
										class="form-control" value="${nurse.sex }" name="sex" id="">

								</div>
							</div>
							<div class="col">
								<div class="form-group">
									<label for="address">Address</label> <input type="text"
										class="form-control" value="${nurse.address }" name="address" id="">

								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="ssnit">SSNIT Number</label> <input type="text"
										class="form-control" value="${nurse.ssnit}" name="ssnit" id="">
								</div>
							</div>


							<div class="col">
								<div class="form-group">
									<label for="date_of_birth">Date of Birth</label> <input
										type="date" class="form-control" value="${nurse.date_of_birth }" name="date_of_birth" id="">
								</div>
							</div>
						</div>



						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="category">Category</label> 
									<input type="text"
										class="form-control" value="${nurse.category }" name="category" id="">
								</div>
							</div>

							<div class="col">
								<div class="form-group">
									<label for="assumption_date">Assumption of Duty</label> <input
										type="date" class="form-control" value="${nurse.assumption_date }" name="assumption_date" id="">

								</div>


							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="basic_qualification">Basic Qualification</label> 
									<input type="text"
										class="form-control" value="${nurse.basic_qualification }" name="basic_qualification" id="">

								</div>
							</div>
							
							<div class="col">
								<div class="form-group">
									<label for="additional_qualification">Additional Qualification</label> 
									<input type="text"
										class="form-control" value="${nurse.additional_qualification }" name="additional_qualification" id="">

								</div>
							</div>
						</div>

						<div class="row">
							<div class="col">
								<div class="form-group">
									<label for="status">Status</label> 
									<select class="form-control" name="status" id="">
									<option value="${nurse.status }">${nurse.status}</option>
									<option value="at post">At Post</option>
									<option value="on study leave with pay">On study Leave with pay</option>
									<option value="on study leave without pay">On study Leave without pay</option>
									<option value="on transfer">On Transfer</option>
									
									
									
									</select>

								</div>
							</div>
							
							<div class="col">
								<div class="form-group">
									<label for="grade">Current Gade/Position</label> 
									<select class="form-control" name="grade" id="">
									<option value="${nurse.grade }">${nurse.grade }</option>
									<option value="SN">SN</option>
									<option value="SM">SM</option>
									<option value="SSN">SSN</option>
									<option value="SSM">SSM</option>
									<option value="NO">NO</option>
									<option value="MO">MO</option>
									<option value="SNO">SNO</option>
									<option value="SMO">SMO</option>
									<option value="PNO">PNO</option>
									<option value="PMO">PMO</option>
									<option value="DDNS">DDNS</option>
									<option value="DNS">DNS</option>
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

</body>
</html>