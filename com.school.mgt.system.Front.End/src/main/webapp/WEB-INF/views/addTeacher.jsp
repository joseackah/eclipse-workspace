<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/java.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add Teacher Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/home">HOME</a></li>
        <%--     <li><a href="">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add More Product</a></li>
            <li><a href="">to assign</a></li>
             --%>
            
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome to Bernice's International Preparatory School</h1>
     <br />
    <br />
	<div class="wrapper">
		<h2>Add Teacher</h2>
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
				Qualification: <input type="text" name="qualification"
					placeholder="Qualification" />
			</div>
			<div class="form">
				Salary: <input type="text" name="salary"
					placeholder="Salary" />
			</div>
			<div class="form">
				Start Date: <input type="date" name="startDate"
					placeholder="Start Date" />
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

</body>
</html>