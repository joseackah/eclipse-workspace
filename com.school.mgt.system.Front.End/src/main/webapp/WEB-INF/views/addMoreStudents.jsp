<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/java.css" rel="stylesheet">

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
	<style type="text/css">
	
	body{background-color: aqua;}
	span{color: blue;
	
	}
	.logo{ display: flex;
	justify-content: center;
	}
	</style>
	
<meta charset="ISO-8859-1">
<title>Enroll Student Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/index">HOME</a></li>
            <%-- <li><a href=""></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href=""></a></li> --%>
            
            
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>BIPS STUDENT ENROLLMENT</h1>
     <br />
    <br />
    <%-- <div class="true" role="dialoque">
	<div class="wrapper"> <button type="button" style="font-size:1.2em; position: absolute; right:2em;" data-dismiss="true">&times;</button>
		<h2>Enroll Student</h2> 
		
		<form action="moreStudents" method="post" id="main_form"
			class="main_form">
			<div class="form">
				First Name: <input type="text" name="firstName" placeholder="First Name" />
			</div>
			<div class="form">
				Last Name: <input type="text" name="lastName"
					placeholder="Last Name" />
			</div>
			<div class="form">
				Sex/Gender: <input type="text" name="sex"
					placeholder="Sex/Gender" />
			</div>
			<div class="form">
				Age: <input type="text" name="age"
					placeholder="Age" />
			</div>
			<div class="form">
				Class: <input type="text" name="classLevel"
					placeholder="Class" />
			</div>
			<div class="" id="sub">
				<input type="submit" value="Save" />
			</div>
		</form>
		
		<div id="sub">
			<a
				href="${pageContext.request.contextPath}/">
				<input type="submit" value="clear">
			</a> <a href="${pageContext.request.contextPath}/">
				<input type="submit" value="Exit">
			</a>
		</div>
	</div>
</div> --%>



<div class="container">
		<!-- <button type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">Update Student</button> -->

		<!-- Modal -->
		<div class="" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
					<h4 class="modal-title text-primary">ENROLL STUDENT</h4>
						<button type="button" class="close" data-dismiss="modal" onclick="window.location.href='profiles'">&times;</button>						
					</div>
					<h2 class="logo"> <span>BI</span>PS</h2>
					<div class="modal-body">

						<form action="${pageContext.request.contextPath }/" method="post">

							<div class="modal-body">
							
						<div class="row">
   							 <div class="col">

								<div class="form-group">
					<label>FIRST NAME</label>
									<input name="firstName" type="text" class="form-control checking_studentId" id="studentId" value="" placeholder="Student first Name" required>
									<span class="error_student_id" id="student_id_error_message" style="color:red;"></span>
								</div>
								</div>
							<div class="col">	

								<div class="form-group">
								<label>LAST NAME</label>
									 <input name="student_name"
										type="text" class="form-control" id="lastName" value="" placeholder="Student last Name" required>
										<span id ="student_name_error_message" style="color:red;"></span>
								</div>
					</div>
	
					</div>	

								<div class="form-group">
									<label>COURSE</label> 
									<select class="form-control" name="course">
										<option value="">Select Course</option>
										<option value="Diploma in Nursing">DIPLOMA IN GENERAL NURSING(RGN)</option>
										<option value="Nurse Assistant(clinical)">NURSE ASSISTANT CLINICAL</option>
										<option value="Nurse Assistant(Preventive)">NURSE ASSISTANT PREVENTIVE</option>
										<option value="Diploma in Community Health Nursing">DIPLOMA IN COMMUNITY HEALTH NURSE(RCN)</option>
										
									</select>
								</div>


					
					<div class="row">
    					<div class="col">
								<div class="form-group">
								<label>COURSE LEVEL</label> <input name="course_level"
										type="text" class="form-control" id="course_level" value="" placeholder="CSD1.5" required>
										<span id ="course_level_error_message" style="color:red;"></span>
								</div>
							
						
						</div>
				
   						<div class="col">
								
								<div class="form-group">
									<label>DATE OF BIRTH</label> <input name="date_of_birth" type="date"
										class="form-control checking_date_of_birth" id="date_of_birth" value="" placeholder="example@play.com" required>
										<span class="error_date_of_birth" id="date_of_birth_error_message" style="color:red;"></span>
								</div>


						</div>
						</div>


								<div class="form-group">
								<label>EMAIL</label> <input name="email" type="email"
										class="form-control checking_email" id="email" value="" placeholder="example@play.com" required>
										<span class="error_email" id ="email_error_message" style="color:red;"></span>
								</div>
								

				<div class="row">
    <div class="col">


								<div class="form-group">
								<label>PHONE NUMBER</label>	<input name="phone" type="text"
										class="form-control checking_phone" id="phone" value="" placeholder="0*************" required>
										<span class="error_phone" id ="phone_error_message" style="color:red;"></span>
								</div>
			</div>					
 <div class="col">
								<div class="form-group">
									<label>GENDER</label> 
									<select class="form-control" name="gender">
										<option>Select</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
									</select>
								</div>

</div>
</div>

		<div class="form-group">
									<label>ADDRESS</label> <input name="address"
										type="text" class="form-control" id="address" value="" placeholder="Tema Comm 1" required>
										<span id ="course_level_error_message" style="color:red;"></span>
								</div>


			<div class="row">
    <div class="col">


								<div class="form-group">
									<label>COURSE START DATE</label> <input name="course_start_date" type="date"
										class="form-control checking_date_of_birth" id="course_start_date" value="" placeholder="example@play.com" required>
										<span class="error_date_of_birth" id="date_of_birth_error_message" style="color:red;"></span>
								</div>

</div>
  <div class="col">


								<div class="form-group">
									<label>COURSE END DATE</label> <input name="course_end_date" type="date"
										class="form-control checking_date_of_birth" id="course_end_date" value="" placeholder="example@play.com" required>
										<span class="error_date_of_birth" id="date_of_birth_error_message" style="color:red;"></span>
								</div>

</div>
</div>

								<div class="modal-footer">
								    <button type="submit" class="btn btn-primary" onclick="return validate()" id="alert">Add</button>
									<button type="button" class="btn btn-secondary" data-dismiss="modal"  onclick="window.location.href='profiles'">Close</button>
								</div>
							</div>

						</form>
						



					</div>
				</div>

			</div>
		</div>

	</div>


<!-- modal form for student updates ends here -->
	



</body>
</html>