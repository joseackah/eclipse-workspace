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
<title>HOME</title>
</head>
<body class="body" style="background-color:gold;">
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center; font-size: 80px;"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/logIn">ADMIN</a></li>
            <li><a href="${pageContext.request.contextPath}/general/teacherLogin">TEACHER</a></li>
            <li><a href="${pageContext.request.contextPath}/general/parentLogin">PARENT</a></li>
        </ul>

    </nav>

<br/>
<br />
<h1 style='text-align: center; font-size: 70px;'>Welcome to Bernice's Preparatory School Website</h1>
<br/> <br/>
 <p style="text-align:center"> <h2 style="text-align:center" >  </h2></p> <br /> <br />
 
 <section style="display:flex-center; width:100%; text-align:center;">
 <article class="article" style="display:;display:inline-block; width:40%; border: 1px solid green; background-color:red;">
  <header style="display:center;"> <h1 style="text-align:center;"> <ins> Our Vision</ins></h1> <br/>
   <p  style="padding: 5px; margin: 10px;"><h2> Our vision is to develop well rounded, confident and responsible individuals who aspire to achieve their full potential. We will do this by providing a welcoming, happy, safe, and supportive learning environment in which everyone is equal and all achievements are celebrated. </h2></p> <br/>
</header> 
</article><br /> <br /><br /> <br /><br /> <br /><br /> <br />
<aside class="aside" style="display:inline-block; width:40%; background-color:green;  height: 50%;" >
<article >

<header> <h2> <ins> Our Mission</ins></h2></header> <br/>
<h2> <p style="padding: 10px; margin: 10px;"> We are dedicated to a continuing tradition of excellence in an ever-changing world. Within a safe and supportive environment, we provide a relevant, high-quality education and prepare our diverse student body for future endeavors. We honor achievement and promote pride in ourselves, in our school, and in our community. </p></h2>
</article>
</aside>
</section>
<br /> <br/> <br/>

<footer id="mainFooter"  style="text-align:center; color:white; align-content:center; background-color:rgb(23, 45, 67); width:85%; margin:50px; margin-left:90px; padding: 50px; justify: center;">
<h3>Contact Us: 0207173313</h3>

</footer>


</body>
</html>