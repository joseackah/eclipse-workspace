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
<title>Search Product</title>
</head>
<body>
	<div id='firstHeader' class='firstHeader' name='firstHeader'>

		<h1 style="text-align: center">
			<ins>
				S & A The Promise of God Enteprise
				<p>
					(<abbr title="S & A The Promise of God Enteprise">S&A TPG</abbr>)
				</p>
			</ins>
		</h1>
	</div>
	<nav>
		<ul>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/indexForm">HOME</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/showForm">Add
					product</a></li>
			<li><a
				href="${pageContext.request.contextPath}/category/showCate">Add
					Cate</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/display">Display</a></li>
			<li><a
				href="${pageContext.request.contextPath}/category/displaycate">Display
					Cate</a></li>
			<li><a
				href="${pageContext.request.contextPath}/ecommerce/moreProductForm">Add
					More Product</a></li>
			<li><a href="">to assign</a></li>
			<form action="${pageContext.request.contextPath}/ecommerce/search"
				method="post" id="searchForm">
				<input type="text" name="id" id="input" /> <input type="submit"
					id="input" class="form-control" value="Search" />
			</form>

		</ul>

	</nav>

	<br />
	<br />
	<h1 style='text-align: center;'>Welcome to Ecommerce Product
		Services</h1>
	<br />
	<br />


	<div class="wrapper">
		<h2>User Details</h2>
		<form:form action="updateUsers" modelAttribute="users" method="post">
			<table class="form">
				<tr>
					<td><label>Id</label></td>
					<td class="td"><form:input path="id" value="${users.id}" readonly="true"  style="padding: .3em 1em; border-radius: 5em;" /></td>
				</tr>
				<tr>
					<td><label>First Name</label></td>
					<td class="td"><form:input path="firstName" value="${users.firstName }"  style="padding: .3em 1em; border-radius: 5em;" /></td>
				</tr>
				<tr>
					<td><label>Last Name</label></td>
					<td class="td"><form:input path="lastName" value="${users.lastName}"  style="padding: .3em 1em; border-radius: 5em;" /></td>
				</tr>
				<tr>
					<td><label>Username</label></td>
					<td class="td"><form:input path="userName" value="${users.userName }"  style="padding: .3em 1em; border-radius: 5em;" /></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td class="td"><form:input path="email" value="${users.email }"   style="padding: .3em 1em; border-radius: 5em;"/></td>
				</tr>
				<tr id="sub">
					<td><label></label></td>
					<td id="sub">
					<!--  	<div id="sub">
							<button>
								<h2 style="padding: 5px;">Update User</h2>
							</button>
						</div>-->
					</td>
				</tr>
			</table>
			<div style='display: flex; place-content: space-between;'>
			<div></div>
			<div id="sub">
							<a href="" ><button style="padding: .3em 1em; border-radius: 5em; background-color:blue;">
								<h2 style="padding: px; border-radius: ;">Update User</h2>
							</button></a>
						</div>
			</div>

		</form:form>
		<div style='display: flex; place-content: space-between;'>
		<div>
		<a href="${pageContext.request.contextPath}/ecommerce/indexForm">
			<button style='padding: .3em 1em; border-radius: 5em;'>
				<h2 style="padding: px;">Exit</h2>
			</button>
		</a>
		</div>
		
	</div>
		${usersTable}
	</div>


	

</body>
</html>