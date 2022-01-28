<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
a:link {
	color: red;
}

a:visited {
	color: green;
}

li:hover {
	background-color: green;
	transition: 5s;
	color: red;
}

.article {
	padding: 2em;
	color: white;
	animation: mymove 5s infinite;
	position: relative;
}

@
keyframes mymove {
	from {background-color: red;
}

to {
	background-color: blue;
}

}
h3:before {
	content: '\260E';
}

.aside {
	padding: 2em;
	color: white;
	position: relative;
	animation-name: myaside;
	animation: myaside 6s infinite;
}

@
keyframes myaside {
	from {background-color: green;
}

to {
	background-color: rgb(145, 74, 152);
}

}
.footer {
	background-color: rgb(23, 24, 26);
	height: 100px;
	padding: 10px;
	padding-top: 4em;
	color: white;
	align-content: center;
}
</style>

<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body class="body" style="background-color: gold;">
	<div id='firstHeader' class='firstHeader' name='firstHeader'>

		<h1 style="text-align: center; font-size: 80px;">
			<ins>
				Bernice's International Preparatory School
				<p>
					(<abbr title="Bernice's International Preparatory School">BIPS</abbr>)
				</p>
			</ins>
		</h1>
	</div>
	<nav>
		<ul>
			<li><a href="${pageContext.request.contextPath}/general/logIn">ADMIN</a></li>
			<li><a
				href="${pageContext.request.contextPath}/general/teacherLogin">TEACHER</a></li>
			<li><a
				href="${pageContext.request.contextPath}/general/parentLogin">PARENT</a></li>
			<li><a
				href="${pageContext.request.contextPath}/general/homeExample">HOME
					Example</a></li>
			<li><a
				href="${pageContext.request.contextPath}/general/adminPageExample">Admin
					Page Example</a></li>
			<li><a href="${pageContext.request.contextPath}/general/image">register</a></li>
			<li><a
				href="${pageContext.request.contextPath}/general/adminHomePageExample2">Admin
					Home</a></li>
		</ul>

	</nav>

	<br />
	<br />
	<h1 style='text-align: center; font-size: 70px;'>Welcome to
		Bernice's Preparatory School Website</h1>
	<br />
	<br />
	<p style="text-align: center">
	<h2 style="text-align: center"></h2>
	</p>
	<br />
	<br />
	<!-- carousal begins here -->
	<div style="width: 80%; height: 50%; position: relative; left: 10%;">
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
					<img
						src="${pageContext.request.contextPath}/resources/jpg/school1.jpg"
						alt="Los Angeles" width="2028" height="">
				</div>

				<div class="item">
					<img
						src="${pageContext.request.contextPath}/resources/jpg/school.jpg"
						alt="Chicago" width="2028" height="">
				</div>

				<div class="item">
					<img
						src="${pageContext.request.contextPath}/resources/jpg/school2.jpg"
						alt="New York" width="2028" height="0">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<!--  carousal ends here -->

	<section style="display: flex-center; width: 100%; text-align: center;">
		<article class="article"
			style="display:; display: inline-block; width: 40%; border: 1px solid green; background-color: red;">
			<header style="display: center;">
				<h1 style="text-align: center;">
					<ins> Our Vision</ins>
				</h1>
				<br />
				<p style="padding: 5px; margin: 10px;">
				<h2>Our vision is to develop well rounded, confident and
					responsible individuals who aspire to achieve their full potential.
					We will do this by providing a welcoming, happy, safe, and
					supportive learning environment in which everyone is equal and all
					achievements are celebrated.</h2>
				</p>
				<br />
			</header>
		</article>
		<br /> <br />
		<br /> <br />
		<br /> <br />
		<br /> <br />
		<aside class="aside"
			style="display: inline-block; width: 40%; background-color: green; height: 50%;">
			<article>

				<header>
					<h2>
						<ins> Our Mission</ins>
					</h2>
				</header>
				<br />
				<h2>
					<p style="padding: 10px; margin: 10px;">We are dedicated to a
						continuing tradition of excellence in an ever-changing world.
						Within a safe and supportive environment, we provide a relevant,
						high-quality education and prepare our diverse student body for
						future endeavors. We honor achievement and promote pride in
						ourselves, in our school, and in our community.</p>
				</h2>
			</article>
		</aside>
	</section>
	<br />
	<br />
	<br />

	<footer class="footer">
		<h3 style="text-align: center;">Contact Us: 0207173313</h3>

	</footer>


</body>
</html>