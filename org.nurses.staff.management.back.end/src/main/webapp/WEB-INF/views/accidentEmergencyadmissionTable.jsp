<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="links.jsp" %>
<%@include file="forms.jsp" %>
<!DOCTYPE html>
<html>
<head> 

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
  #print, h1,h2, #print * {
    visibility: visible;
  }
  #print {
    position: absolute;
    left: 5%;
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
<title>Admission Table</title>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark" id="navbar_top">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">A</span>EW
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/accidentEmergency">Home</a>
					</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllAccidentEmergencyRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalAccidentEmergency">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckAccidentEmergencySchedule">Check
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

<aside class="aside_body w3-padding table-danger" style="width:30%; height:1000px;">
<div >
				<h2>Administrator</h2>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeim">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/sp4.jpg"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Administrator</p>
<%=(new java.util.Date()).toLocaleString() %>
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
						href="${pageContext.request.contextPath}/admissionFront/accidentEmergency">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnlyAccidentEmergency">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeathAccidentEmergency">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllAccidentEmergencyWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeAccidentEmergency">Admission/Discharge</a>
					</li>
				</ul>
				</div>
				
</div>
<hr class="d-sm">

<div class="nav-item nav nav-pills" >
									<button onclick="document.getElementById('id01').style.display='block'" class="nav-link active">Discharge Summary</button>
								</div>
				
				
				
					<hr class="d-sm">

				<div class="nav-item nav nav-pills">
					<form
						action="${pageContext.request.contextPath}/generalFront/wardSummary"
						method="post">
						<input type="text" value="Accident/Emergency" name="wardName"
							hidden="true">

						<button type="submit" onclick="'" class="nav-link active">Discharge
							Summary</button>
					</form>

				</div>
				
				<hr class="d-sm" style="width: 50%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardTopTen" method="post">
		<input type="text" value="Accident/Emergency" name="wardName" hidden="true">
		
		<button type="submit" onclick="" class="nav-link active">Top Ten</button>
		</form>
									
								</div>	
				
				
				<hr class="d-sm-none">
				
			</div>

</aside>


<main style="width:100%">
<div class="class mt-3" style="text-align: center; width: 100%; margin-top:12px 0 2em;">

 <h1 > Accident and Emergency </h1>
 <h2>  Admission Table</h2>
    </div>    
    <hr style="width:90%; margin:auto;">
    <div class="container mt-3" style=" with:auto;" id="print">
    
       <div> </div> <br> <br>
         
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        
<div id="s1" style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: antiquewhite; width:100%" id="name">
            <thead class="table-danger">
                <tr>
                    <th hidden=true>ID</th>
                    <th>WARD NAME</th>
                    <th>PATIENT NUMBER</th>
                    <th>PATIENT NAME</th>
                    <th>AGE</th>
                    <th>SEX</th>
                   
                    <th>DATE ADMITTED</th>
                    <th>P. DIAGNOSIS</th>
                   
                    <th>INSURED</th>
                    <th>NUMBER</th>
                  
                  
                    <th id="actio">ACTION</th>
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${admission}" var="admission">
            
            
            <c:url value="deleteAdmission_Discharge/${admission.id}" var="delete">
            
            
            </c:url>
            
            
            <c:url value="updateAdmission_Discharge1/${admission.id}"  var="update">
            
            
            
            </c:url>
            
                <tr>
                
                    <td hidden=true>${admission.id}</td>
                    <td>${admission.ward_name}</td>
                    <td>${admission.patient_number}</td>
                    <td>${admission.patient_name}</td>
                    <td>${admission.age}</td>
                    <td>${admission.sex}</td>
                    
                    <td>${admission.date_admitted}</td>
                    <td>${admission.diagnosis}</td>
                 
                    <td>${admission.insured}</td>
                    <td>${admission.insurance_number}</td>
               
                    
                    <td id="action1">
                    
                    <a  href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i class="fa fa-trash" id="action2"></i> </a> |-|
                    <a  href="${update}"> <i class="fa fa-pen" id="action3" > </i></a>
                    
                    
                    </td>
                    
                    
                </tr>
</c:forEach>
                <tr>
                    <td hidden=true></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
              
                </tr>
            </tbody>
            <thead class="table-danger">
                <tr>
                    <th hidden=true>ID</th>
                    <th>WARD NAME</th>
                    <th>PATIENT NUMBER</th>
                    <th>PATIENT NAME</th>
                    <th>AGE</th>
                    <th>SEX</th>
                   
                    <th>DATE ADMITTED</th>
                    <th>P. DIAGNOSIS</th>
                   
                    <th>INSURED</th>
                    <th>NUMBER</th>
                  
                  
                    <th id="actio">ACTION</th>
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