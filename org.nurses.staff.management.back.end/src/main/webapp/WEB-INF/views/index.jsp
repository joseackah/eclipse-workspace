<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
	
	
<!DOCTYPE html>
<html>
<head>


<script type="text/javascript">
	
window.history.forward();
function noBack() {
    window.history.forward();
}
	</script>



<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script> -->
	
	<script>

	 var app = angular.module('myTry', []);
	 app.controller('myTryCtrl', function($scope, $http) {
  	$http.get("http://localhost:8084/users/getAllUsers").then(function (response) {
      $scope.Users = response.data.users;
  	});
	});  

	 /* app.controller('myTryCtrl', function($scope, $http) {
		  $http({
		    method : "GET",
		      url : "http://localhost:8084/users/getAllUsers"
		  }).then(function mySuccess(response) {
		    $scope.Users = response.data;
		  }, function myError(response) {
		    $scope.Users = response.statusText;
		  });
		});  */

</script>
	
	<script
	src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
	
	
	<script
	src="${pageContext.request.contextPath}/resources/js/time.js"></script>
	
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>
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
	crossorigin="anonymous"></script> -->

<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->





<%-- <link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet"> --%>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/trycss.css">

<%--

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/w3.css"> --%>
<!-- https://www.w3schools.com/w3css/4/w3.css -->


<%-- <link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>



<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>
 --%>


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
<%-- <link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>
 --%>
<%-- 
<link href="${pageContext.request.contextPath}/resources/css/textAnimation.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/textAnimation.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/anime.min.js"></script> --%>
<title>HOME</title>
</head>
<body class="body" style="background-color: gold;" ng-app="myApp" ng-controller="myCtrl">

	<div class="nav">
	<div class="container1">
			
			<div class="text"></div>
			</div>
		<div style="text-align: center; width: 100%; margin: 2px 0 2em;">

		<!-- 	<h1 class="" style="text-align: center; font-size: 40px;">
			
			
			<ins>
					ST. JOSEPH'S HOSPITAL, JIRAPA
					<p>(<abbr title="Bernice's International Preparatory School"></abbr>)</p>
				</ins>
				
				
			</h1> -->
			
			<br /> 
			
		
			
		<h1 class="" >
		
	<span class="">	Welcome to Hospital Management Database</span></h1>
			<span class="ml12"></span>
		</div>
		



		<br /> <br />
		
	
 
		<!-- carousal begins here -->
		<%-- <div style="width: 80%; height: 50%; position: relative; left:10%;">
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="${pageContext.request.contextPath}/resources/jpg/school1.jpg" alt="Los Angeles" width="2028" height="">
    </div>

    <div class="item">
      <img src="${pageContext.request.contextPath}/resources/jpg/school.jpg" alt="Chicago" width="2028" height="">
    </div>

    <div class="item">
      <img src="${pageContext.request.contextPath}/resources/jpg/school2.jpg" alt="New York" width="2028" height="0">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
 </div> --%>
		<!--  carousal ends here -->
	</div>
	<hr style="height: 0.51em; background-color: black;">

<div > 
<h1 style="text-align:center;">{{theTime}}</h1>

</div>


	<div ng-app="">
		<div class="mod" style="padding:2%;">
		<div class="modal-dialog">
		<div class="modal-content " style="padding:4%; border-radius: 15px;">
                
			<div class="modal-header">
				<h4 class="modal-title">User Log In</h4>
				<!-- <button type="button" class="close" data-dismiss="mod"
					aria-hidden="true">&times;</button> -->

			</div>
			<form style=""
				action="${pageContext.request.contextPath}/generalFront/validate" 
				method="POST" id="form" >

				<div class="row">
					<div class="col">
					<div class="form-group">
						<label for="userId">Username/Id</label> <input type="text" name="userId"
						ng-model="user_id"	class="form-control" placeholder="provide your staff Id" required><br>
					</div></div>
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
								<option value="Secretary">Secretary</option>
								<option value="Others">Others</option>
							</select>

						</div>
					</div>
					<div class="col">
						<label>Department/Unit/Ward</label> <select name="ward_name"
							class="form-control" id="lets" onclick="myDisplay()">
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
							<option value="Outpatient Department">Outpatient
								Department</option>
							<option value="Administration">Administration</option>
						</select>
					</div>
				</div>

				<label>Password</label> <input type="password" id="myInput"
					name="userPassword" class="form-control" placeholder="password"
					required> <br> <input type="checkbox"
					onclick="myFunction()"> <label>Show Password</label>

				<!-- <button class="submit" type="submit">Log In</button> -->

				<div class="modal-footer">
					<button type="submit" onclick="submitForms" class="btn btn-secondary"
					style="width:50%;"	data-dismiss="modal">Log In</button>
					
				</div>


			</form>
			<hr>
			<button type="button"
						onclick="window.location.href='${pageContext.request.contextPath}/generalFront/userForm'"
						class="btn btn-primary">Register</button>
			
	<%-- 		<form:form action="${pageContext.request.contextPath}/generalFront/vali" id="form1" method="POST" modelAttribute="fere">
			
			<input  class="form-control" type="text" name="userId" value="{{user_id}}" >
			
			
			</form:form> --%>
			
			
			<%-- <a 
			href="${pageContext.request.contextPath}/generalFront/userForm">
			<button class="submit" style="background-color: blue;">Register</button>
		</a> --%>
</div>
</div>
		</div>
	</div>

	<br />
	<br />
	<br />
	<br />
	<br />
	
	<!-- <div class="card" style="display:inline-block; width:40%; background-color:green;  height: 50%;" >
<div >

<div class="card-header"> <h2> <ins> Our Mission</ins></h2> <br/>
 <div class="card-body"><h2> <p style="padding: 10px; margin: 10px;"> We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community. </p></h2></div>
</div>
</div>
</div> -->
	

	<footer class="footer" style="text-align: center;">
		<h3 style="text-align: center;">Contact Us: 0207173313</h3>

	</footer>






	<!-- register form start here -->

	<!-- <div class="container">
		<button type="button" class="btn btn-info float-left"
			data-toggle="modal" data-target="#myModal">Register</button>

		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">
				<div class="modal-content">
<button type="button" class="btn btn-info float-left"
			data-toggle="modal" data-target="#myModal"> Register</button>
					<div class="modal-header">

						<h4 class="modal-title text-primary">REGISTER</h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
					<h2 style="text-align: center;">
						<span style="color: blue;">BI</span>PS
					</h2>
					<div class="modal-body">
						<form action="imageUpload">
							<div class="row">
								<div class="col">
									<div class="form-group">
										<input type="text" name="username" placeholder="username">
										<br>
									</div>
									<div class="form-group">
										<input type="text" name="password" placeholder="password"><br>
									</div>
									<div class="form-group">
										<input type="text" name="email" placeholder="email"> <br>
									</div>
									<div class="form-group">
										<input type="file" name="file" accept="image/jpg"> <br>
									</div>
								</div>
							</div>
							<input type="submit" value="submit">
							<div class="modal-footer">
								<button type="submit" class="btn btn-primary"
									onclick="return validate()" id="alert">Register</button>
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

 -->
	<!-- register form ends here -->
	<script>
		function myFunction() {
			var x = document.getElementById("myInput");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
		
		
		
		 /* const sendData = e => {
		      e.preventDefault();
		      const formData = new FormData(document.getElementById("form"));

		      fetch("${pageContext.request.contextPath}/generalFront/validate", { method: "POST"});
		      fetch("${pageContext.request.contextPath}/generalFront/userTry", { method: "POST"});
		    }; */
		    
		    
		    
		   /*  function SubmitForm()
		    {
		        //showResultDiv();
		        document.forms['form'].action='${pageContext.request.contextPath}/generalFront/validate ';
		        //document.forms['form'].target='frame_result1';
		        document.forms['form'].submit();

		       document.forms['form'].action='${pageContext.request.contextPath}/generalFront/userTry';
		        document.forms['form'].target='use';
		       document.forms['form'].submit();
		        return true;
		    } */
		    
		    
		   /*   submitForms = function(){
		    	document.getElementById("form").submit();
		        document.getElementById("form1").submit();
		        
		        
		    } */  
		    
		    
		     /*  function submitForms() {
		    	setTimeout(function(){ document.getElementById("form").submit();}, 3000);   
		    	//setTimeout(function(){ document.getElementById("form1").submit();}, 6000);   
		    	}   
		     */
		    
	</script>


<!-- <script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $interval) {
  $scope.theTime = new Date().toLocaleTimeString();
  $interval(function () {
      $scope.theTime = new Date().toLocaleTimeString();
  }, 1000);
});


</script> -->






</body>
</html>