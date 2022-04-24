<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="links.jsp" %>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>

 <link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
	
	<script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
	crossorigin='anonymous'></script>

<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">
	
	
<meta charset="ISO-8859-1">
<style type="text/css">

@media print {
  body * {
    visibility: hidden;
  }
  #print, h1,h2, #print * {
    visibility: visible;
    margin: 0.5em;
  }
  #print {
    position: absolute;
    left: 16%;
    top: 5%;
    margin: 0.5em;
  }
  
  #b1, #b2 {
  
  visibility:hidden;
  
  }
  
  #myInput, #action, #action1, #action2, #action3  {
  
  visibility:hidden;
  
  }
}


</style>

<title>Ward Schedule Table</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark " id="navbar_top">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">F</span>MW
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/femaleMedical">Home</a>
					</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllFemaleMedicalRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalFemaleMedical">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckFemaleMedicalSchedule">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>
					
					
			
			</ul>
			
			        <button id="b1" style="float:right; border-radius: 5em; display:flex; flex-direction:row-reverse; margin-left: 35em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
		</div>
	</nav>


<div class="wrapper">


<aside class="aside_body w3-padding" style="width:30%; height:800px; ">

<div  style="">
				<h3>Administrator</h3>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/person-icon-female.jpg"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Administrator</p>
			<p>	<%=(new java.util.Date()).toLocaleString()%></p>
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
								href="${pageContext.request.contextPath}/admissionFront/femaleMedical">Admission</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyFemaleMedical">Discharge</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDeathFemaleMedical">Death</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/bedStateFront/displayAllFemaleMedicalWard_Bed_State">Ward
									State</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeFemaleMedical">Admission/Discharge</a>
							</li>
						</ul>
					</div>

				</div>
				<hr class="d-sm" style="width: 100%;">

				<div class="nav-item nav nav-pills flex-colmn">
					<button
						onclick="document.getElementById('id01').style.display='block'"
						class="nav-link active">Discharge Summary</button>
				</div>


				<hr class="d-sm-none">

				<hr class="d-sm" style="width: 100%;">

				<div class="nav-item nav nav-pills">
					<form
						action="${pageContext.request.contextPath}/generalFront/wardSummary"
						method="post">
						<input type="text" value="Female Medical" name="wardName"
							hidden="true">

						<button type="submit" onclick="'" class="nav-link active">Discharge
							Summary</button>
					</form>

				</div>
				
				
		<hr class="d-sm" style="width: 100%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardTopTen" method="post">
		<input type="text" value="Female Medical" name="wardName" hidden="true">
		
		<button type="submit" onclick="" class="nav-link active">Top Ten</button>
		</form>
									
								</div>	

			</div>



</aside>






<main style="width:100%;">



<div style="text-align: center; width: 100%; margin:2px 0 2em;">
<h1>Female Medical</h1>
<h2> Ward Schedule Table</h2>
</div>
 <hr style="width:90%; margin: auto;">
    <div class="container mt-3" id="print">
    <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/generalFront/femaleMedical'">back</button>
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>

       
<div style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: beige;">
            <thead class="table-warning">
                <tr>
                    <th style="display:none;">ID</th>
                    
                    <th>STAFF ID</th>
                    <th>WARD NAME</th>
                    <th>NURSE CATEGORY</th>
                    <th>EFFECTIVE DATE</th>
                    <!-- <th>ACTION</th> -->



                </tr>
            </thead>
            <tbody id="myTable">
            <c:forEach items="${scheduleTable}" var="scheduleTable">
            
                <tr>
                    <td style="display:none;">${scheduleTable.id}</td>
                    <td>${scheduleTable.staff_id}</td>
                    <td>${scheduleTable.ward_name}</td>
                    <td>${scheduleTable.nurse_cate}</td>
                    <td>${scheduleTable.effective_date}</td>
                  <%--   <td>
                    <a href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i class="fa fa-trash"></i> </a> |-|
                    <a href="${update}"> <i class="fa fa-pen"> </i></a>
                    
                    
                    
                    </td> --%>



                </tr>
</c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                  <!--   <td></td> -->



                </tr>
            </tbody>
            <thead class="table-warning">
                <tr>
                    <th style="display:none;">ID</th>
                    
                    <th>STAFF ID</th>
                    <th>WARD NAME</th>
                    <th>NURSE CATEGORY</th>
                    <th>EFFECTIVE DATE</th>
                    <!-- <th>ACTION</th> -->



                </tr>
            </thead>
        </table>
    </div>

<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</body>
</html>