<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
	<link href="${pageContext.request.contextPath}/resources/css/java.css"
	rel="stylesheet">
	
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<style type="text/css">
	
	body{
	background-color:gold;
	}
	
	
	span{color: blue;
	
	}
	.logo{ display: flex;
	justify-content: center;
	}
	
	
	</style>
<meta charset="ISO-8859-1">
<title>Student Record Update</title>
</head>
<body>
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
       
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Back</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="">to assign</a></li>
            
            
        </ul>

    </nav>

 <br />
    <br />
<h1 style='text-align: center;'>Welcome to Bernice's International Preparatory School Record Update</h1>
 <br />
    <br />


 <%-- <div class="wrapper"><h2>Student Details</h2>
<form:form action="update" 	modelAttribute = "student" method="post">
		<table class="form">
			<tr>
				<td><label>Student Id</label></td>
				<td><form:input path="studentId"  value="${student.studentId }" readonly="true" /></td>
			</tr>
			<tr>
				<td><label>First Name</label></td>
				<td><form:input path="firstName" value="${student.firstName}" /></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><form:input path="lastName" value="${student.lastName}" /></td>
			</tr>
			<tr>
				<td><label>Sex/Gender</label></td>
				<td><form:input path="sex" value="${student.sex}" /></td>
			</tr> 
			<tr>
				<td><label>Age</label></td>
				<td><form:input path="age" value="${student.age}" /></td>
			</tr> 
			<tr>
				<td><label>Class/Level</label></td>
				<td><form:input path="classLevel" value="${student.classLevel}" /></td>
			</tr> 
			<tr id= "sub">
				<td><label></label></td>
				<td id="sub">
				<div id="sub">	<button ><h2 style="padding:5px;">Update Product</h2></button></div>
				</td>
			</tr>
		</table>

	</form:form>
	<a href="${pageContext.request.contextPath}/schoolStudents/index"> <button><h2 style="padding:10px;">Exit</h2></button> </a>
	</div>
	 --%>
	 
	 
<div class="form">
	<!-- test form -->

 <div class="container" >
		<!-- <button type="button" class="btn btn-info float-left" data-toggle="modal" data-target="#myModal">Update Student</button> -->

		<!-- Modal -->
		<div class="" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content" style="background-color: aqua;">
					<div class="modal-header">
					<h4 class="modal-title text-primary">UPDATE STUDENT RECORD</h4>
						<button type="button" class="close" data-dismiss="modal" onclick="window.location.href='profiles'">&times;</button>						
					</div>
					
					<h2 class="logo"> <span>BI</span>PS</h2>
					<div class="modal-body">




						<form action="${pageContext.request.contextPath }/aitiKaceStudentsApiConsumption/saveAitiKaceStudent=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd" method="post">

							<div class="modal-body">
							
						<div class="row">
   							 <div class="col">

								<div class="form-group">
									<label>STUDENT ID</label>
									<input name="studentId" type="text" class="form-control checking_studentId" id="studentId" value="${student.studentId}" placeholder="Student ID" required>
									<span class="error_student_id" id="student_id_error_message" style="color:red;"></span>
								</div>
								</div>
							<div class="col">	
									<label>NAME</label>
								<div class="form-group">
									 <input name="student_name"
										type="text" class="form-control" id="student_name" value="${student.firstName} ${student.lastName}" placeholder="Student Name" required>
										<span id ="student_name_error_message" style="color:red;"></span>
								</div>							
					</div>
					</div>	
					
								<div class="form-group">
									<label>COURSE</label> 
									<select class="form-control" name="course">
										<option value="">Select Course</option>
										<option value="RGN">RGN</option>
										
									</select>
								</div>


					
					<div class="row">
    <div class="col">



								<div class="form-group">
								<label>COURSE/CLASS LEVEL</label> <input name="classLevel"
										type="text" class="form-control" id="course_level" value="${student.classLevel }" placeholder="" required>
										<span id ="classLevel_error_message" style="color:red;"></span>
								</div>
							
						
						</div>
				
   <div class="col">
								
								<div class="form-group">
									<label>DATE OF BIRTH</label> <input name="date_of_birth" type="date"
										class="form-control checking_date_of_birth" id="date_of_birth" value="${student.age }" placeholder="example@play.com" required>
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
									<input name="sex" type="text" class="form-control checking_sex" value="${student.sex }">
									<!-- <select class="form-control" name="gender">
										<option>Select</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>
									</select> -->
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
</div>	

<!-- modal form for student updates ends here -->
	

</body>
</html>