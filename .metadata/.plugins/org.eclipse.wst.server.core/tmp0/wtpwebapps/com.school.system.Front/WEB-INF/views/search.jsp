<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/java.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Search id</title>
</head>
<body>
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
            <li><a href="">to assign</a></li>
           
            
        </ul>

    </nav>

 <br />
    <br />
<h1 style='text-align: center;'>Welcome to Ecommerce Product Services</h1>
 <br />
    <br />

<div class= "wrapper">
<form:form action="display" method="post" modelAttribute = "student">
<h2>Student id retrieval</h2>
<div class="form"> Student Id: <input type="text" value="${student.studentId }" readonly="readonly" /></div>
<div class="form">
<input type="text"/>
<input type="text"/>
<input type="text" />
<input type="text">
</div>
<div id="sub"><input type="submit" value="search" /></div> 


</form:form>

</div>
</body>
</html>