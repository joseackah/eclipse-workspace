<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*,java.io.*"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="links.jsp" %>
	<%@include file="forms.jsp" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>
	
	
	<script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
	crossorigin='anonymous'></script>

<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">

<style type="text/css">

@media print {
  body * {
    visibility: hidden;
  }
  #print, h1,h2, #print * {
    visibility: visible;
  }
  #print, h2 {
    position: absolute;
    left: 0;
    top: 05%;
  }
  
  h2 {
    position: absolute;
    left: 02%;
    top: 05%;
  }
  
  #b1, #b2 {
  
  visibility:hidden;
  
  }
  
  #myInput, #action, #action1, #action2, #action3  {
  
  visibility:hidden;
  
  }
}


</style>
<meta charset="ISO-8859-1">
<title>Leave Id Display</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">S</span>D
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/nurseStaffProfile">Home</a>
					</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaternityRecom">Recommend
						Leave</a></li> --%>
				<li class="nav-item"><a class="nav-link"
					 onclick="document.getElementById('id08').style.display='block'">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					onclick="document.getElementById('id09').style.display='block'">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>
					<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/admissionFront/form">Birth (Neonate)</a>
				</li> --%>
				<%-- <li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaleMedicalLeave">Death (Neonate)</a>
				</li> --%>
				
				<li class="nav-item"> </li>
			</ul>
						        <button id="b1" style="float:right; border-radius: 5em; display:flex; flex-direction:row-reverse; margin-left: 35em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
		</div>
	</nav>


<div class="wrapper">

<aside class="aside_body w3-padding" style="width:30%; height:1000px">

<div >
				<h2>Staff</h2>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/color_person_male.png"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Staff</p>

				<!--   academic record start here -->
<div class="dropdown">
				<h3>Hospital/Ward Records</h3>
				<p></p>
				<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">Report Display</div>
								</div>
				
				<div class="dropdown-content">
				<ul class="nav nav-pills flex-column">
					<!-- <li class="nav-item"><a class="nav-link active"
						style="width: 100%;">Report Display</a></li> -->
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/maternity">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyMaternity">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeathMaternity">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeMaternity">Admission/Discharge</a>
					</li>
				</ul>
				</div>
				
</div>
<hr class="d-sm">
				
				
				
			
				 <hr class="d-sm-none">
				
			</div>



</aside>




<main style="width:100%">

	<div class="container mt-3" style="margin-left:">
		<h2>Ward Schedule Checker</h2>
	</div>
<div class="container mt-3" id="print">

        
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        
	<table class="table table-bordered table-hover" style="background-color: beige;">
		<thead class="table-success">
			<tr>
				<th hidden=true>Id</th>
				<th>Staff Id</th>
				<th>Ward Name</th>
				<th>Category</th>
				
				<th>Effective Date</th>
				
				<th>Action</th>

			</tr>

		</thead>
		<tbody>




			<%
			String staff = request.getParameter("staff_id");

			try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
				PreparedStatement ps = conn.prepareStatement(
				"select id, staff_id, ward_name, nurse_cate, effective_date from ward_schedule where staff_id = ?");
				ps.setString(1, staff);

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
			%>







			<%-- 
	<form class="modal-content1 animate" action="" method="post">
		<div class="imgcontainer">
			<span onclick="document.getElementById('id01').style.display='none'"
				class="close" title="Close Modal">&times;</span>
			<!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
			<h2 class="avatar">
				<strong> <span style="color: blue;">S</span>D
				</strong>
			</h2>
		</div>

		<div class="container1">
			<label for="uname"><b>Ward Name</b></label> <input
				style="width: 60%;" type="text" placeholder="" name="studentId"
				value="<%=rs.getString(1)%>" readonly class="input"> <br>

			<label for="uname"><b>Staff Id</b></label> <input style="width: 60%;"
				type="text" placeholder="" name="" value="<%=rs.getString(2)%>"
				readonly class="input"> <br> <label for="uname"><b>Leave
					Id</b></label> <input style="width: 60%;" type="text" placeholder="r" name=""
				value="<%=rs.getString(3)%>" readonly class="input">


		</div>

		<!-- <div class="container1" style="background-color: #f1f1f1;">
					<button  type="button"
						onclick="document.getElementById('id01').style.display='none'"
						class="cancelbtn">Cancel</button>
				</div> -->
	</form>
 --%>
			<%-- <c:url value="${pageContext.request.contextPath}/generalFront/disApproval/<%=rs.getInt(3)%>"
				var="checkLeave"></c:url> --%>
			<tr>
				<td hidden=true><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><a href="${pageContext.request.contextPath}/generalFront/disApproval/<%=rs.getInt(1)%>">Check</a></td>


			</tr>
			
			

			<%
			}
			} catch (Exception e) {

			}
			%>
		</tbody>
	</table>
	</div>
	
	
	
	
	</main>

</div>
	
	
	
</body>
</html>