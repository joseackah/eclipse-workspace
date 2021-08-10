<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/java.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Teacher LogIn Form</title>
</head>
<body>
<div id='firstHeader' class='firstHeader' name='firstHeader'>
      
 
        <h1 style="text-align:center"><ins>Bernice's International Preparatory School <p>(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)</p></ins></h1>
    </div>
    <nav>
        <ul>
            <li><a href="${pageContext.request.contextPath}/general/homePage">HOME</a></li>
            <li><a href="">Add product</a></li>
            <li><a href="${pageContext.request.contextPath}/general/example">example</a></li>
            <li><a href="${pageContext.request.contextPath}/general/log">log</a></li>
            <li><a href="${pageContext.request.contextPath}/">Display Cate</a></li>
            <li><a href="${pageContext.request.contextPath}/">Add More Product</a></li>
            <li><a href="">to assign</a></li>
                        
        </ul>

    </nav>
    <br />
    <br />
    
    <h1 style='text-align: center;'>Welcome Bernice's International Preparatory School Teacher Log In</h1>
     <br />
    <br />
    <hr>
	<div class="wrapper">
	<h1 style="text-align: center;"><span style="color: blue;">BI</span>PS</h1>
		<h2>Teacher Log In form</h2>
		<form action="teacherHome" method="post" id="main_form"
			class="main_form">
			<div class="form">
				Teacher Id: <input type="text" name="id" placeholder="Teacher Id" />
			</div>
			<div class="form">
				Password: <input type="text" name="password"
					placeholder="Password" />
			</div>
			
			<div class="" id="sub">
				<input type="submit" value="Log In" />
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