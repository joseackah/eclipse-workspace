<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@page import="java.sql.*,java.util.*,java.io.*"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
    
<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>
	
	<link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
	
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
  #print {
    position: absolute;
    left: 0;
    top: 0;
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

<div class="container mt-3" id="print">
	<div style="margin-left: 3em; margin-top: 3em;">
		<h2>Leave You have Applied for</h2>
	</div>

<button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="history.back()">back</button>
        
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        



	<table class="table table-bordered table-hover" style="background-color: antiquewhite; width:100%; margin-left: "  >
		<thead class="table-danger">
			<tr>
				<th>Ward Name</th>
				<th>Staff Id</th>
				<th>Leave Id</th>
				<th>Leave Date</th>
				<th>Leave Type</th>
				<th>Date Return</th>
				<th>Action</th>

			</tr>

		</thead>
		<tbody>




			<%
			String staff = request.getParameter("staff_id");

			try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
				PreparedStatement ps = conn.prepareStatement(
				"select ward_name, staff_id, id, leave_date, leave_type, leave_end_date from leave_table where staff_id = ?");
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
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getInt(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><%=rs.getString(6)%></td>
				<td><a href="${pageContext.request.contextPath}/generalFront/disApproval/<%=rs.getInt(3)%>">Check Leave</a></td>


			</tr>
			
			

			<%
			}
			} catch (Exception e) {

			}
			%>
		</tbody>
	</table>
	
	</div>
</body>
</html>