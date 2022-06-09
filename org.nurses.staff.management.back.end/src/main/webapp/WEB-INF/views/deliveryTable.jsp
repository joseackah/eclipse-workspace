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
    left: -2%;
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
<title>Delivery Table</title>
</head>
<body>

<nav id="navbar_top"
		class="navbar navbar-expand-sm bg-dark navbar-dark">
		<a class="navbar-brand" href="#"><h1
				style="font-size: 50px; font-weight: bold;">
				<span style="color: blue; font-size:;">M</span>LW
			</h1></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/generalFront/maternity">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id'>Apply for Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayAllMaternityRecom">Recommend
						Leave</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/leaveFront/displayLeaveApprovalMaternity">Check
						Leave Approval</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/scheduleFront/displayAllCheckMaternitySchedule">Check
						Ward Schedule</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Admission</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id2'>Ward/Bed State</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id5'>Delivery</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					href='#modal-id4'>Birth (Neonate)</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Death
						(Neonate)</a></li>
						
				<li class="nav-item"><a class="nav-link"
					 onclick="document.getElementById('id01').style.display='block'">Discharge Summary</a></li>
					 
				</ul>
			<button id="b1"
				style="float: right; border-radius: 5em; display: flex; flex-direction: row-reverse; margin-left: 10em;"
				class="btn btn-primary"
				onclick="window.location.href='${pageContext.request.contextPath}/'">log
				out</button>

		</div>
	</nav>

<div class="wrapper">

<aside class="aside_body table-danger w3-padding" style="width:30%; height:1000px">
<div >
				<h2>Administrator</h2>
				<h5>Photo of me:</h5>
				<div class="w3-circle" style="width: 200px; height: 200px;">
					<div class="fakeim">
						<img class="w3-circle" alt="our mision"
							src="${pageContext.request.contextPath}/resources/icons/color_person_female.png"
							style="width: 100%; height: 100%;" />
					</div>
				</div>
				<p>Administrator</p>
				<%=(new java.util.Date()).toLocaleString()%>
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
								href="${pageContext.request.contextPath}/bedStateFront/displayAllMaternityWard_Bed_State">Ward
									State</a></li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_DischargeMaternity">Admission/Discharge</a>
							</li>

							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/deliveryFront/displayAllDelivery_table">Delivery</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="${pageContext.request.contextPath}/newbornFront/displayAllNewborn_table">Birth(newborn)</a>
							</li>
						</ul>
					</div>

				</div>
				<hr class="d-sm" style="width:50%">
			

				<div class="nav-item nav nav-pills" >
									<button onclick="document.getElementById('id01').style.display='block'" class="nav-link active">Discharge Summary</button>
								</div>
								
								
								
		<hr class="d-sm" style="width:50%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardSummary" method="post">
		<input type="text" value="Maternity" name="wardName" hidden="true">
		
		<button type="submit" onclick="'" class="nav-link active">Discharge Summary</button>
		</form>
									
								</div>	
								
		<hr class="d-sm" style="width: 50%">							
				
		<div class="nav-item nav nav-pills" >
		<form action="${pageContext.request.contextPath}/generalFront/wardTopTen" method="post">
		<input type="text" value="Maternity" name="wardName" hidden="true">
		
		<button type="submit" onclick="" class="nav-link active">Top Ten</button>
		</form>
									
								</div>						
								
								
													
				<hr class="d-sm" style="width: 50%">
				
				<button onclick="document.getElementById('id09').style.display='block'" class="nav-item nav nav-pills flex-colmn nav-link active" >
Post An Event

</button>
				
			</div>



</aside>
<main style="width:100%;">
<div style="text-align: center; width: 100%; margin:2px 0 2em;">
 <h1 >Labour Ward</h1>
 <h2>Delivery Table</h2>
    </div>
    <hr style="width:90%; margin:auto;">
    <div class="container mt-3" id="print" style="margin-left: 2%;">
    
       <div> </div> <br> <br>
        
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        
<div id="s1" style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: antiquewhite; width:100%" id="name">
            <thead class="table-danger">
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>GESTATION</th>
                    <th>DATE OF DEL.</th>
                    <th>TIME OF DEL.</th>
                    <th>DATE LABOUR STARTED</th>                    
                    <th>TIME OF PLACENTA</th>
                    <th>DURATION OF DEL.</th>
                    <th>COND. OF MOTHER</th>
                     <th>COND. OF PLACENTA</th>
                    <th>TYPE OF DELIVERY</th>
                    <th>INDICATION OF CS</th>
                    <th>CS CONDUCTED BY</th>
                    <th>STATE OF PERINEUM</th>
                    <th>COMPLICATION</th>
                    <th>MIDWIFE</th>
                    <th>ASSISTANT</th>
                    
   
                    
                    
                    
                    <th id="actio">ACTION</th>
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${delivery}" var="delivery">
            
            
            <c:url value="deleteLeave/${delivery.delivery_id}" var="delete">
            
            
            </c:url>
            
            
            <c:url value="updateLeave1/${delivery.delivery_id}"  var="update">
            
            
            
            </c:url>
            
                <tr>
                
                    <td>${delivery.delivery_id}</td>
                    <td>${delivery.name}</td>
                    <td>${delivery.gestation_of_pregnancy}</td>
                    <td>${delivery.date_of_delivery}</td>
                    <td>${delivery.time_of_delivery}</td>
                    <td>${delivery.date_labour_started}</td>
                    <td>${delivery.time_of_placenta}</td>
                    <td>${delivery.duration_of_delivery}</td>
                    <td>${delivery.condition_of_mother}</td>
                     <td>${delivery.condition_of_placenta}</td>
                    <td>${delivery.type_of_delivery}</td>
                    <td>${delivery.indication_of_cs}</td>
                    <td>${delivery.cs_conducted_by}</td>
                    <%-- <td>${delivery.date_approved}</td> --%>
                    <td>${delivery.state_of_perineum}</td>
                    <th>${delivery.complication_of_delivery}</th>
                    <th>${delivery.midwife_conducting_delivery}</th>
                    <th>${delivery.assisstant}</th>
                    <td id="action1">
                    
                    <a  href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i class="fa fa-trash" id="action2"></i> </a> |-|
                    <a  href="${update}"> <i class="fa fa-pen" id="action3" > </i></a>
                    
                    
                    </td>
                    
                    
                </tr>
</c:forEach>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td><td></td>
                    <td></td>
              
                    <td></td>  <td></td>  <td></td>  <td></td>
                </tr>
            </tbody>
            <thead class="table-danger">
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>GESTATION</th>
                    <th>DATE OF DEL.</th>
                    <th>TIME OF DEL.</th>
                    <th>DATE LABOUR STARTED</th>                    
                    <th>TIME OF PLACENTA</th>
                    <th>DURATION OF DEL.</th>
                    <th>COND. OF MOTHER</th>
                     <th>COND. OF PLACENTA</th>
                    <th>TYPE OF DELIVERY</th>
                    <th>INDICATION OF CS</th>
                    <th>CS CONDUCTED BY</th>
                    <th>STATE OF PERINEUM</th>
                    <th>COMPLICATION</th>
                    <th>MIDWIFE</th>
                    <th>ASSISTANT</th>
                    
   
                    
                    
                    
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