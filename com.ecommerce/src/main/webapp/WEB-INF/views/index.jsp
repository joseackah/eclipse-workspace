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
<body style="background-color:gold;">
 <div id='firstHeader' class='firstHeader' name='firstHeader'>
        
        <h1 style="text-align:center"><ins>S & A The Promise of God Enteprise <p>(<abbr title="S & A The Promise of God Enteprise">S&A TPG</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/ecommerce/indexForm">HOME</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/showForm">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/category/showCate">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/category/displaycate">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add More Product</a></li>
            <li><a href="${pageContext.request.contextPath}/users/userForm">Add User</a></li>
            <li><a href="${pageContext.request.contextPath}/users/getAll">All Users</a></li>
            
            
            <form action="${pageContext.request.contextPath}/ecommerce/search" method="post" id="searchForm">
            	<input type="text" name="id" id="input" />
                <input type="submit" id="input" class="form-control" value="Search" />
            </form>
            
        </ul>

    </nav>

<br/>
<br />
<h1 style='text-align: center;'>Welcome to Ecommerce Product Services</h1>
<br/> <br/>
 <p style="text-align:center"> <h2 style="text-align:center" > We sell all kinds of products at a one shop store </h2></p> <br /> <br />
 
 <section style="display:flex-center; width:100%; text-align:center;">
 <article class="article" style="display:;display:inline-block; width:40%; border: 2px solid green; background-color:red;">
  <header style="display:center;"> <h1 style="text-align:center;"> <ins> Our Vision</ins></h1> <br/>
   <p><h2>To be among the largest global online retail and <br>wholesale shop and provide almost every kind of goods to our customers </h2></p>
</header>
</article><br /> <br /><br /> <br /><br /> <br /><br /> <br />
<aside class="aside" style="display:inline-block; width:40%; background-color:green;  height: 50%;" >
<article >

<header> <h2> <ins> Our Mission</ins></h2></header>
<h2> <p> We exist to provide solution to a wide range of customer needs and other services </p></h2>
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