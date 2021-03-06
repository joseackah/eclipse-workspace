<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/java.css" rel="stylesheet">



<meta charset="ISO-8859-1">
<title>Teacher LogIn Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            <li><a href="">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/general/example">example</a></li>
            <li><a href="${pageContext.request.contextPath}/general/log">log</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add More Product</a></li>
            <li><a href="">to assign</a></li>
                        
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome Bernice's International Preparatory School Teacher Log In</h1>
     <br />
    <br />
    <hr>
	<div class="wrapper"><button type="button" class="close" data-dismiss="modal">&times;</button>
	<h1 style="text-align: center;"><span style="color: blue;">BI</span>PS</h1>
		<h2>Teacher Log In form</h2>
		<form action="teacherHome" method="post" id="main_form"
			class="main_form">
			<div class="form">
				Teacher Id: <input type="text" name="id" placeholder="Teacher Id" />
			</div>
			<div class="form">
				Password: <input type="text" name="password"
					placeholder="Password" />
			</div>
			
			<div class="" id="sub">
				<input type="submit" value="Log In" />
			</div>
		</form>
		<div id="sub">
			<a
				href="${pageContext.request.contextPath}/">
				<input type="submit" value="clear">
			</a> <a href="${pageContext.request.contextPath}/">
				<input type="submit" value="Exit">
			</a>
			<a class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">test</a>
			<a><button type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">Add Student</button>
		</a>
		</div>
	</div>
	
	<!-- register form start here -->
	
	 <div class="container">
		
		<!-- Modal -->
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-header">
					<h4 class="modal-title text-primary">TEACHER REGISTRATION</h4>
					
						<button type="button" class="close" data-dismiss="modal">&times;</button>						
					</div>
					
					<div class="modal-body">


<h1 style="text-align: center;"><span style="color: blue;">BI</span>PS</h1>

						<form action="${pageContext.request.contextPath }/schoolTeachers/saveTeachers" method="post">

							<div class="modal-body">
							
						<div class="row">
   							 <div class="col">

								<div class="form-group">
					
									<input name="firstName" type="text" class="form-control checking_student_id" id="student_id" value="" placeholder="First Name" required>
									<span class="error_student_id" id="student_id_error_message" style="color:red;"></span>
								</div>
								</div>
							<div class="col">	

								<div class="form-group">
									 <input name="lastName"
										type="text" class="form-control" id="student_name" value="" placeholder="Last Name" required>
										<span id ="student_name_error_message" style="color:red;"></span>
								</div>
							
							
					</div>
					
					
					
					
					
					
					
					
					</div>	
					
					

								<div class="form-group">
									<label>Qualification</label> 
									<select class="form-control" name="qualification">
										<option value="">Select Qualification</option>
										<option value="Diploma in Basic Education">Diploma in Basic Education</option>
										<option value="Bsc. Basic Education">Bsc. Basic Education</option>
										<option value="Diploma in Information Technology">Diploma in Information Technology</option>
										<option value="Bsc. Information Technology">Bsc. Information Technology</option>
										<option value="Bsc. Advanced Education">Bsc. Advanced Education</option>
										<!-- <option value="Network Information Security">Network Information Security</option>
										<option value="Certified Information System Auditor">Certified Information System Auditor</option>
										<option value="Big Data Analytics">Big Data Analytics</option>
										<option value="Web Technologies">Web Technologies</option>
										<option value="Java Programming">Java Programming</option>
										<option value="Computing Infrastructure Systems & Security">Computing Infrastructure Systems & Security</option> -->
									</select>
								</div>


					
					<div class="row">
    <div class="col">



								<div class="form-group">
								<label>COURSE LEVEL</label> <input name="course_level"
										type="text" class="form-control" id="course_level" value="" placeholder="CSD1.5" disabled>
										<span id ="course_level_error_message" style="color:red;"></span>
								</div>
							
						
						</div>
				
   <div class="col">
								
								<div class="form-group">
									<label>DATE OF BIRTH</label> <input name="dateOfBirth" type="date"
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
								<label>PHONE NUMBER</label>	<input name="phoneNumber" type="text"
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
									<label>APPOINTMENT DATE</label> <input name="appointmentDate" type="date"
										class="form-control checking_date_of_birth" id="course_start_date" value="" placeholder="example@play.com" required>
										<span class="error_date_of_birth" id="date_of_birth_error_message" style="color:red;"></span>
								</div>

</div>
  <div class="col">


								<div class="form-group">
									<label>COURSE END DATE</label> <input name="course_end_date" type="date"
										class="form-control checking_date_of_birth" id="course_end_date" value="" placeholder="example@play.com" disabled>
										<span class="error_date_of_birth" id="date_of_birth_error_message" style="color:red;"></span>
								</div>
								<div class="modal-footer">
								    <button type="submit" class="btn btn-primary" onclick="return validate()" id="alert">Add</button>
									<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
								</div>
							</div>

						</form>

</div>
</div>
<!-- register form ends here -->
</body>
</html>