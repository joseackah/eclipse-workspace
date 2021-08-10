<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/java.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Parent Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/index">HOME</a></li>
            <li><a href="">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add More Product</a></li>
            <li><a href="">to assign</a></li>
            <form action="${pageContext.request.contextPath}/" method="post" id="searchForm">
            	<input type="text" name="id" id="input" />
                <input type="submit" id="input" class="form-control" value="Search" />
            </form>
            
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome Bernice's International Preparatory School</h1>
     <br />
    <br />
    <hr>
	<div class="wrapper">
		<h2>Parent form</h2>
		<form action="saveParents" method="post" id="main_form"
			class="main_form">
			<div class="form">
				First Name: <input type="text" name="firstName" placeholder="First Name" />
			</div>
			<div class="form">
				Last Name: <input type="text" name="lastName"
					placeholder="Last Name" />
			</div>
			<div class="form">
				Occupation: <input type="text" name="occupation"
					placeholder="Occupation" />
			</div>
			<div class="form">
				Contact/Mobile Number: <input type="text" name="contact"
					placeholder="Contact/Mobile Number" />
			</div>
			<div class="form">
				Residence Address/No.: <input type="text" name="resNumber"
					placeholder="" value="${student.studentId}" />
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