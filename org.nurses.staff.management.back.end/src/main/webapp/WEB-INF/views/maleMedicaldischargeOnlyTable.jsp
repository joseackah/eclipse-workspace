<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="forms.jsp" %>
<!DOCTYPE html>
<html>
<head> 


<link href="${pageContext.request.contextPath}/resources/css/projectCss.css"
	rel="stylesheet">
	
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
    
   
    
    <link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 -->

<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>


<%-- 
	<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">
 --%>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<!-- https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css -->

<script
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

<!-- https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js -->

<script
	src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>

<!-- https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js -->
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<!-- https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/w3.css">
<!-- https://www.w3schools.com/w3css/4/w3.css -->
<link
	href="${pageContext.request.contextPath}/resources/css/profile.css"
	rel="stylesheet">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/profile.js"></script>

<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/loader.js"></script>
 --%>




  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
    
   
    
    <link href="${pageContext.request.contextPath}/resources/datatables.min.css"
	rel="stylesheet">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/datatables.min.js"></script>
	
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
 -->


<script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
	crossorigin='anonymous'></script>

<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">

<style type="text/css">

@media print {
  body * {
    visibility: hidden;
  }
  #print, h1,h2,  #print * {
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
<title>Discharge Table</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark"
		id="navbar_top">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">M</span>MW
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/maleMedical">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaleMedicalRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalMaleMedical">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckMaleMedicalSchedule">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>

			</ul>

			<button id="b1"
				style="float: right; border-radius: 5em; display: flex; flex-direction: row-reverse; margin-left: 35em;"
				class="btn btn-primary"
				onclick="window.location.href='${pageContext.request.contextPath}/'">log
				out</button>

		</div>
	</nav>



<div class="wrapper">

<aside class="aside_body w3-padding" style="width:20%; height:800px;">

<div  style="">
				<h3>Administrator</h3>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeimg">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/person-icon-male.jpg"
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
								href="${pageContext.request.contextPath}/admissionFront/maleMedical">Admission</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyMaleMedical">Discharge</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayDeathMaleMedical">Death</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/bedStateFront/displayAllMaleMedicalWard_Bed_State">Ward
									State</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeMaleMedical">Admission/Discharge</a>
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
						<input type="text" value="Male Medical" name="wardName"
							hidden="true">

						<button type="submit" onclick="'" class="nav-link active">Discharge
							Summary</button>
					</form>

				</div>
				
				
		<hr class="d-sm" style="width: 100%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardTopTen" method="post">
		<input type="text" value="Male Medical" name="wardName" hidden="true">
		
		<button type="submit" onclick="" class="nav-link active">Top Ten</button>
		</form>
									
								</div>	

			</div>







</aside>




<main style="width: 100%;">


<div style="text-align: center; width: 100%; margin:2px 0 2em;">
 <h1>Male Medical </h1>
 <h2>Discharge Table</h2>
    </div>
    <hr style="width:90%; margin: auto;">
    <div class="container" id="print">
    <!-- <div style="text-align: center; width: 100%;"> -->
            <!-- <h1>St. Joseph's Hospital,Jirapa Nurses' Staff Leave Application Table</h1> -->
        <!-- </div> -->
       <!-- <hr>  -->
       <div> </div> <br> <br>
<%--         <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/generalFront/maleMedical'">back</button>
 --%>        
        <button id="b1" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i id="b1" class="fa fa-print"></i> </button>
        
<div id="s1" style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: antiquewhite; width:auto" id="name">
            <thead class="table-danger">
                <tr>
                    <th hidden=true>ID</th>
                    <th>WARD NAME</th>
                    <th>PATIENT NUMBER</th>
                    <th>PATIENT NAME</th>
                    <th>SEX</th>                                       
                    <th>DATE ADMITTED</th>
                    <th>P. DIAGNOSIS</th>
                     <th>OUTCOME</th>
                    <th>FINAL DIAGNOSIS</th>
                    <th>DATE DISCHARGE</th>                   
                    <th>INSURED</th>
                    <th>NUMBER</th>
                  
                    <th id="b1">ACTION</th>
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${dischargeOnly}" var="dischargeOnly">
            
            
            <c:url value="deleteAdmission_Discharge/${dischargeOnly.id}" var="delete">
            
            
            </c:url>
            
            
            <c:url value="updateAdmission_Discharge1/${dischargeOnly.id}"  var="update">
            
            
            
            </c:url>
            
                <tr>
                
                    <td style="display:none">${dischargeOnly.id}</td>
                    <td>${dischargeOnly.ward_name}</td>
                    <td>${dischargeOnly.patient_number}</td>
                    <td>${dischargeOnly.patient_name}</td>
                    <td>${dischargeOnly.sex}</td>            
                    <td>${dischargeOnly.date_admitted}</td>
                    <td>${dischargeOnly.diagnosis}</td>
                     <td>${dischargeOnly.outcome_of_admission}</td>
                    <td>${dischargeOnly.final_diagnosis}</td>
                    <td>${dischargeOnly.date_discharge}</td>	
                    <td>${dischargeOnly.insured}</td>
                    <td>${dischargeOnly.insurance_number}</td>
                    
                    <td id="action1">
                    
                    <a id="action1" href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i class="fa fa-trash" id="action2"></i> </a> |-|
                    <a id="action1" href="${update}"> <i class="fa fa-pen" id="action3" > </i></a>
                    
                    
                    </td>
                    
                    
                </tr>
</c:forEach>
              
            </tbody>
             <thead class="table-danger" id="b1">
                <tr id="b1">
                    <th id="b1" hidden=true>ID</th>
                    <th id="b1">WARD NAME</th>
                    <th id="b1">PATIENT NUMBER</th>
                    <th id="b1">PATIENT NAME</th>
                    <th id="b1">SEX</th>                                       
                    <th id="b1">DATE ADMITTED</th>
                    <th id="b1">P. DIAGNOSIS</th>
                     <th id="b1">OUTCOME</th>
                    <th id="b1">FINAL DIAGNOSIS</th>
                    <th id="b1">DATE DISCHARGE</th>                   
                    <th id="b1">INSURED</th>
                    <th id="b1">NUMBER</th>
                  
                    <th id="b1">ACTION</th>
                </tr>
            </thead>
        </table>
    </div>




</main>
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