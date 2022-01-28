<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/java.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Add Results Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
          <%--   <li><a href=""></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href="${pageContext.request.contextPath}/"></a></li>
            <li><a href=""></a></li> --%>
           
            
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome to Bernice's International Preparatory School Result Entry</h1>
     <br />
    <br />
	<div class="wrapper">
		<h2>Add Student Results</h2>
		<form action="${pageContext.request.contextPath}/general/saveR" method="post" id="main_form"
			class="main_form">
			<div class="form">
				Student Id: <input type="text" name="student_id" placeholder="Student Id" />
			</div>
			<div class="form">
				First Name: <input type="text" name="firstName" placeholder="First Name" />
			</div>
			<div class="form">
				Last Name: <input type="text" name="lastName"
					placeholder="Last Name" />
			</div>
			<div class="form">
				Subject: <input type="text" name="subjects"
					placeholder="Subjects" />
			</div>
			<div class="form">
				Marks: <input type="text" name="marks"
					placeholder="marks" />
			</div>
			<div class="form">
				Grade: <input type="text" name="grade"
					placeholder="grade" />
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