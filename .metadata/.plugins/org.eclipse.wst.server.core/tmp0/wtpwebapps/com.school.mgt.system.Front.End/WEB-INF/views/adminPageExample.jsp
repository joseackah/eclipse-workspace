<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  </style>
</head>
<body>
<div class="jumbotron text-center" style="margin-bottom:0">
  <h1>Bernice's International Preparatory School</h1>
  <p>Where Wisdom is Acquired through Application of Knowledge!</p> 
</div>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="#"><h1 style="font-size: 50px; font-weight: bold;"><span style="color:blue; font-size:;">BI</span>PS </h1></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/general/homePage">Home</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolStudents/moreStudentsForm">Enroll Student</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolParents/showParentForm">Add Parent</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display Student</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolParents/displayParents">Display Parent</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolStudents/showStudentsForm">Add Teacher</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/studentAddress/displayStudentAddress">Add Student Address</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/schoolTeachers/displayTeachers">All Teachers</a>
      </li>  
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/general/lowerResults">Get Results</a>
      </li>      
    </ul>
  </div>  
</nav>

<div class="container" style="margin-top:30px">
  <div class="row">
    <div class="col-sm-4">
      <h2>About Me</h2>
      <h5>Photo of me:</h5>
      <div class="fakeimg"> <img alt="our mision" src="" />  </div>
      
      <p>Administrator of BIPS..</p>
      <h3>Academic Records</h3>
      <p>Enter Examination records here.</p>
      <ul class="nav nav-pills flex-column">
        <li class="nav-item">
          <a class="nav-link active" href="#">results entry</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Year One</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Year Two</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Year Three</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#">Disabled</a>
        </li>
      </ul>
      <hr class="d-sm-none">
    </div>
    <div class="col-sm-8">
      <h2>OUR VISION</h2>
      <h5>Title description, Dec 7, 2017</h5>
      <div class="fakeimg">Our vision is to develop well rounded, confident and responsible individuals who aspire to achieve their full potential. We will do this by providing a welcoming, happy, safe, and supportive learning environment in which everyone is equal and all achievements are celebrated. </div>
      <p>Some text..</p>
      <p>Our vision is to develop well rounded, confident and responsible individuals who aspire to achieve their full potential. We will do this by providing a welcoming, happy, safe, and supportive learning environment in which everyone is equal and all achievements are celebrated. </p>
      <br>
      <h2>OUR MISSION</h2>
      <h5>Title description, Sep 2, 2017</h5>
      <div class="fakeimg">Fake Image</div>
      <p>Some text..</p>
      <p>We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community.</p>
    </div>
  </div>
</div>

<div class="jumbotron text-center" style="margin-bottom:0; align-context: space-between;">
<div style="justify-content: center;">
<div style="display: flex; float: center; justify-content: center;"> 
<p style="margin-right: 10em">address: <br /> Post Office Box SQ 90 Tema</p> <p style="border-left: 1px solid black; height: 80px; position:fix; left: 35%; padding-right: 2em;"> </p>
<p style="display: flex; float: right;"> Location: <br /> Behind Baatsona Fuel Station, <br> Baatsona, Lashiba </p> <P style="border-left: 1px solid black; height: 80px; position:fix; right: 50%; margin-left: 6em;"> </P>
<p style="margin-left: 10em">contact us:<br/> 0207173313</p>
</div>


</div>
</div>

</body>
</html>