<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

a:link{
color: red;
}
a:visited{
color: green;
}
li:hover{
background-color: green;
transition: 5s;
color: red;
}
.article{
padding: 2em;
color: white;
animation: mymove 5s infinite;
position: relative;
}
@keyframes mymove{
from{background-color: red;
}
to{background-color: blue;
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
</style>

<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>PARENT HOME</title>
</head>
<body style="background-color:gold;">
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div >
    <div class="d-flex bg-secondary">
    <nav >
    <div class="p-2 mr-auto bg-info">
        <ul class="d-flex justify-content-end">
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            
           
            <li><a href="${pageContext.request.contextPath}/schoolStudents/displayStudents">Display Student</a></li>
            <li><a href="${pageContext.request.contextPath}/schoolParents/displayParents">Display Parent</a></li>
            
            
            <li><a href="${pageContext.request.contextPath}/schoolTeachers/displayTeachers">All Teachers</a></li>
            
      <div class="p-2 ">
				
				<form class="form-inline" action="/action_page.php" >
    			<input class="form-control mr-sm-2" type="text" placeholder="Search" style="margin-top: 0.7em; height: 2.6em; border-radius: 0.8em;">
    			<button class="btn btn-success" type="submit" style="height: 2.8em; padding: 0.5em; margin-top:0.5em; width:10em; border-radius:0.8em;">Search</button>
  			</form>
  			</div>
        </ul>
       </div>
        
       
  			

    </nav>
    </div>

<br/>
<br />
<h1 style='text-align: center;'>Welcome to Bernice's Preparatory School Website</h1>
<br/> <br/>
 <p style="text-align:center"> <h2 style="text-align:center" > Welcome to Parent Home</h2></p> <br /> <br />
 
 <section style="display:flex-center; width:100%; text-align:center;">
 <article class="article" style="display:;display:inline-block; width:40%; border: 2px solid green; background-color:red;">
  <header style="display:center;"> <h1 style="text-align:center;"> <ins> Our Vision</ins></h1> <br/>
   <p><h2>Our vision is to develop well rounded, confident and responsible individuals who aspire to achieve their full potential. We will do this by providing a welcoming, happy, safe, and supportive learning environment in which everyone is equal and all achievements are celebrated. </h2></p>
</header>
</article><br /> <br /><br /> <br /><br /> <br /><br /> <br />
<aside class="aside" style="display:inline-block; width:40%; background-color:green;  height: 50%;" >
<article >

<header> <h2> <ins> Our Mission</ins></h2></header>
<h2> <p> We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community. </p></h2>
</article>
</aside>
</section>
<br /> <br/> <br/>
<aside id="mainFooter" style="background-color:red;">
<footer id="mainFooter"  style="text-align:center; align-content:center;">
<h3 style="display:bottom; ">Contact Us: 0207173313</h3>

</footer>
</aside>

</body>
</html>