<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">

a:link{
color: red;
}
a:visited{
color: green;
}
/* li:hover{
background-color: green;
transition: 5s;
color: red;
} */
.card{
padding: 2em;
color: white;
animation: mymove 5s infinite;
position: relative;
}
@keyframes mymove{
from{background-color: green;
}
to{background-color: brown;
}
}
h3:before{
content: '\260E';}

.aside{
padding: 2em;
color: white;
position: relative;
animation-name: myaside;
animation: myaside 6s infinite;
}
@keyframes myaside{
from{background-color: green;}
to {background-color: rgb(145,74,152);}
}

.footer {
background-color: rgb(23, 24, 26);
height: 100px;
padding: 10px;
/* padding-top: 4em; */
color: white;
align-content: center;
}
input[type=text], select{
width: 100%;
height: 4em;
border: 3px solid green;
border-radius: 10px;

}

input[type=password]{
width: 100%;
height: 4em;
border: 3px solid green;
border-radius: 10px;
}

input[type=checkbox]{
color: white;
height: 1em;
width: 1em;
}

.submit{
width: 100%;
padding: 1em;
margin-top: 1em;
border-radius: 10px;
background: green;
color: white;
font-size: 1.2em;
}

form{
padding: 2em;
text-align: left;
font-size: 1.5em;
border-radius: 20px;
background-color: brown;
height: 50%;
/* color: white; */

}

label{
margin-top: 1em;
color: white;
}

.nav{

background: blue;
color: white;
}

</style>

<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/w3.css">
<!-- https://www.w3schools.com/w3css/4/w3.css -->

<title>HOME</title>
</head>
<body class="body" style="background-color:gold;">
 
 <div class="nav">
 
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center; font-size: 80px;"><ins>ST. JOSEPH'S HOSPITAL, JIRAPA <!-- <p>(<abbr title="Bernice's International Preparatory School"></abbr>)</p> --></ins></h1>
    </div>
    <%-- <nav class="navbar navbar-expand-md bg-dark" >
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-taget="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span> 
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item"><a href="${pageContext.request.contextPath}/general/logIn">ADMIN</a></li>
            <li class="nav-item"><a href="${pageContext.request.contextPath}/general/teacherLogin">TEACHER</a></li>
            <li class="nav-item"><a href="${pageContext.request.contextPath}/general/parentLogin">PARENT</a></li>
            <li class="nav-item"><a href="${pageContext.request.contextPath}/general/homeExample">HOME Example</a></li>
       		<li class="nav-item"><a href="${pageContext.request.contextPath}/general/adminPageExample">Admin Page Example</a></li>
        <li class="nav-item"><a href="${pageContext.request.contextPath}/general/image">register</a></li>
        <li class="nav-item"><a href="${pageContext.request.contextPath}/general/card">card</a></li>
        <li class="nav-item"><a href="${pageContext.request.contextPath}/general/adminHomePageExample2">Admin Home</a></li>
         <li class="nav-item"><a href="${pageContext.request.contextPath}/schoolStudents/profiles">Profile</a></li>       
        <li class="nav-item"><a href="${pageContext.request.contextPath}/general/module">module</a></li>
        <li class="nav-item"><a href="${pageContext.request.contextPath}/schoolStudents/profilesTry">ProfileTry</a></li>
        </ul>
</div>
    </nav>
 --%>
<br/>
<br />
<h1 style='text-align: center; font-size: 70px;'>Welcome to St. Joseph's Hospital Nurses' Management Database</h1>



<br/> <br/>
 <p style="text-align:center"> <h2 style="text-align:center" >  </h2></p> <br /> <br />
 
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
</div><hr style=" height: 0.51em; background-color: black;">


 
 
 <div class="container" style="display:flex-center; width:40%; text-align:center; height:70%; ">
 
 <form action="leaveFront/profile">
 <label>Username</label> 
 <input type="text" required><br>
 <label>Password</label>
 <input type="password" id="myInput" required> <br>
 <input type="checkbox" onclick="myFunction()"> <label>Show Password</label> 
 <button class="submit" type="submit">Log In</button>
 
 
 
 
 
 </form>
 
</div> 
</div> <br /> <br /><br /> <br /><br /> <br /><br /> <br />
<!-- <div class="card" style="display:inline-block; width:40%; background-color:green;  height: 50%;" >
<div >

<div class="card-header"> <h2> <ins> Our Mission</ins></h2> <br/>
 <div class="card-body"><h2> <p style="padding: 10px; margin: 10px;"> We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community. </p></h2></div>
</div>
</div>
</div> -->
<br /> <br/> <br/>

<footer class="footer"  style="text-align: center;">
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
</script>



</body>
</html>