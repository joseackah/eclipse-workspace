<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head> 



<%-- <link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet"> --%>
<link href="${pageContext.request.contextPath}/resources/css/index.css"
	rel="stylesheet">

<script
	src="${pageContext.request.contextPath}/resources/js/paginationjs.js"></script>


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
<title>Ward/Bed State Table</title>
</head>
<body style="

    background-color: #eee; 
">

<div class="w3-bar w3-red" id="navbar_top">
	<div style="display:flex">
	<div >
				<ul>
					<h1 style="color: gold; font-weight: 900;">
						<span class="" style="color: white;">HS</span>MS
					</h1>
				</ul>
			</div>
			<div style="float: lef;">
		<a href="${pageContext.request.contextPath}/leaveFront/profile"
			class="w3-bar-item w3-button">Home</a> <a href="#modal-id"
			data-toggle="modal" class="w3-bar-item w3-button w3-hide-small">Add
			User</a> <a href="#modal-id1" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Ward</a> <a
			href="#modal-id2" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Add Nurse</a> <a
			href="#modal-id3" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">PIN/AIN</a> <a
			href="#modal-id4" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Schedule Nurse</a> <a
			href="#modal-id5" data-toggle="modal" data-toggle="modal"
			class="w3-bar-item w3-button w3-hide-small">Apply for Leave </a> <a
			href="${pageContext.request.contextPath}/scheduleFront/displayAll"
			class="w3-bar-item w3-button w3-hide-small">schedule </a> <a
			href="${pageContext.request.contextPath}/leaveFront/nurseProfile"
			class="w3-bar-item w3-button w3-hide-small"> Nurse Profile</a> 
			
			<a
			href="${pageContext.request.contextPath}/generalFront/topTen"
			class="w3-bar-item w3-button w3-hide-small">Top Ten</a> 
			
			<a
			href="${pageContext.request.contextPath}/generalFront/nurseStaffProfile"
			class="w3-bar-item w3-button w3-hide-small">Staff Profile</a> 
			
			
			<button id="b1" style="float:right; border-radius: 5em; position: absolut; right: 2%; top: 10%; display:flex; flex-direction:row-reverse;margin-top:0.5%; margin-left: 25em;" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/'">log out</button>
			
			<a
			href="javascript:void(0)"
			class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium"
			onclick="myFunction()">&#9776;</a>
</div>





</div>
	</div>





    
    
    
    <div class="wrapper">
    
    
    <aside class=" w3-margi w3-teal w3-padding w3-border w3-card w3-round-large" style="width: 20%; height:1000px;">
    
   <!-- admin profile column starts here -->
			<div class="check" style="">

				<div class="profile" style="">

					<div
						
						style="width: 250px; " id="col">

						<div class="w3-center">
							<img class="w3-circle w3-center"
								style="width: 200px; height: 200px;" alt=""
								src="${pageContext.request.contextPath}/resources/icons/color_person_male.png">
							<p>admin profile</p>

						</div>
						
						<hr class="d-sm">
								<h4>Hospital/Ward Records</h4>
			
				<hr class="d-sm">		
<div class="dropdown">

<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">General  Display</div>
								</div>
<div class="dropdown-content">

						<div class="w3-tea" style="width: 100%;">
							
								<ul class="nav nav-pills flex-column">


										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/nurseFront/displayAllNurse">Display Nurses</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/wardFront/displayAllWard">Display Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/leaveFront/displayAllLeave">Display Leave Applied</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/scheduleFront/displayAllSchedule">Display Ward Schedule</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/pinFront/displayAllPin">Pin/Ain</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/userFront/displayAllUser">Users</a></li>
										</ul>
								
								
								
								
								
								
								
						</div>
						</div>
		</div>
		
		<hr class="d-sm">				
						
	<div>
						
				
				<div class="dropdown">
				
				<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">General Report Display</div>
								</div>
				<div class="dropdown-content">
				<ul class="nav nav-pills flex-column">
					<!-- <li class="nav-item"><a class="nav-link active"
						style="width: 80%;">Report Display</a></li> -->
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAdmissionOnly">Admission</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDischargeOnly">Discharge</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayDeath">Death</a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/bedStateFront/displayAllWard_Bed_State">Ward
							State</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/admissionFront/displayAllAdmission_Discharge">Admission/Discharge</a>
					</li>
				</ul>
				
				</div>
				
				</div>
						
						</div>


<hr class="d-sm">

						<!-- <br> -->
						
						<div class="try">

							
							<div class="dropdown">
								<div class="nav-item nav nav-pills flex-colmn">
									<div class="nav-link active">Ward Admissions</div>
								</div>
								<div class="dropdown-content">

									<ul class="nav nav-pills flex-column">


										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maleMedical">Male Medical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/femaleMedical">Female Medical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maleSurgical">Male Surgical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/femaleSurgical">Female Surgical</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/maternity">Maternity</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/childrensWard">Children's Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/generalWard">General Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/religiousWard">Religious Ward</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/nicu">NICU</a></li>
										<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/admissionFront/accidentEmergency">Accident/Emergency</a></li>
									</ul>
								</div>
							</div>
							<hr class="d-sm-none">
						</div>
						<br>
						
						<div>
							<ul>
								
							</ul>
					<hr class="d-sm">	
					<div>
					<button onclick="document.getElementById('modal-id9').style.display='block'" data-toggle="modal"
			class="nav-item nav nav-pills flex-colmn nav-link active">Post An Event</button>	
				</div>			
<hr class="d-sm">
							
						</div>

						

					</div>
				</div>




			</div>
			<!-- admin profile column ends here --> 
    
    
    
    
    
    
    </aside>
    
    
    
    
    <main style="width: 100%;">


<div style="text-align: center; width: 100%; margin:2px 0 2em;">
 
 <h1>Ward/Bed State Table</h1>
    </div>    
    <hr style="width:90%; margin: auto;">
    <div class="container mt-3" id="print">
    
       <div> </div> <br> <br>
<%--         <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/leaveFront/profile'">back</button>
 --%>        
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        
       
         <div id="s1" style=" display:flex; flex-direction:row-reverse;">
        
         <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> 

        
        <select class  ="form-control" name="state" id="maxRows" style="width:20%">
						 <option value="5000">Show ALL Rows</option>
						 <option value="5">5</option>
						 <option value="10">10</option>
						 <option value="15">15</option>
						 <option value="20">20</option>
						 <option value="50">50</option>
						 <option value="70">70</option>
						 <option value="100">100</option>
						</select>
        
 </div>
        
        
        <table class="table table-bordered table-hover" style="background-color: antiquewhite; width:auto" id="name">
            <thead class="table-danger">
                <tr>
                    <th>ID</th>
                    <th>DATE</th>
                    <th>WARD NAME</th>                    
                    <th>ADMISSIONS</th>
                    <th>DISCHARGES</th>
                    <th>TRANS-INS</th>
                    <th>TRANS-OUT</th>
                    <th>DEATHS</th>
                     <th>CRITICAL ILL</th>
                    <th>FLOOR PATIENT</th>
                    <th>ABSCONDED</th>
                    <th>INSURED</th>
                    <th>NON-INSURED</th>
                    <th>REMAIN AT MIDNIGHT</th>
                    <th>NURSE INCHARGE</th>
                    <th id="actio">ACTION</th>
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${bedState}" var="bedState">
            
            
            <c:url value="deleteLeave/${bedState.id}" var="delete">
            
            
            </c:url>
            
            
            <c:url value="updateWard_Bed_State1/${bedState.id}"  var="update">
            
            
            
            </c:url>
            
                <tr>
                
                    <td>${bedState.id}</td>
                    <td>${bedState.date}</td>
                    <td>${bedState.ward_name}</td>
                    <td>${bedState.total_admission}</td>
                    <td>${bedState.total_discharge}</td>
                    <td>${bedState.total_trans_in}</td>
                    <td>${bedState.total_trans_out}</td>
                    <td>${bedState.total_deaths}</td>
                     <td>${bedState.total_critical_ill}</td>
                    <td>${bedState.total_floor_patient}</td>
                    <td>${bedState.total_absconded}</td>
                    <td>${bedState.total_insured}</td>
                    <td>${bedState.total_non_insured}</td>
                    <td>${bedState.total_remain_at_midnight}</td>
                    <th>${bedState.nurse_incharge}</th>
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
                    <td></td>
                    <td></td>  <td></td>  <td></td>  <td></td>
                </tr>
            </tbody>
        </table>
        
        
         <!--		Start Pagination -->
			<div id="b1" class='pagination-container' >
				<nav id ="b1" class="w3-secondary">
				  <ul id="b1" class="pagination" >
            
            <li data-page="prev" class="b3" style="">
								     <span class="b3" > < <span class="sr-only">(current)</span></span>
								    </li>
				   <!--	Here the JS Function Will Add the Rows -->
        <li data-page="next" id="prev" style="">
								       <span class="b3"> > <span class="sr-only" style="">(current)</span></span>
								    </li>
				  </ul>
				</nav>
			</div>

 <!-- 		End of Container -->
        
        
        
        
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



<!-- pagination -->

<script type="text/javascript">

getPagination('#name');
//getPagination('.table-class');
//getPagination('table');

/*					PAGINATION 
- on change max rows select options fade out all rows gt option value mx = 5
- append pagination list as per numbers of rows / max rows option (20row/5= 4pages )
- each pagination li on click -> fade out all tr gt max rows * li num and (5*pagenum 2 = 10 rows)
- fade out all tr lt max rows * li num - max rows ((5*pagenum 2 = 10) - 5)
- fade in all tr between (maxRows*PageNum) and (maxRows*pageNum)- MaxRows 
*/


function getPagination(table) {
var lastPage = 1;

$('#maxRows')
.on('change', function(evt) {
//$('.paginationprev').html('');						// reset pagination

lastPage = 1;
$('.pagination')
.find('li')
.slice(1, -1)
.remove();
var trnum = 0; // reset tr counter
var maxRows = parseInt($(this).val()); // get Max Rows from select option

if (maxRows == 5000) {
$('.pagination').hide();
} else {
$('.pagination').show();
}

var totalRows = $(table + ' tbody tr').length; // numbers of rows
$(table + ' tr:gt(0)').each(function() {
// each TR in  table and not the header
trnum++; // Start Counter
if (trnum > maxRows) {
// if tr number gt maxRows

$(this).hide(); // fade it out
}
if (trnum <= maxRows) {
$(this).show();
} // else fade in Important in case if it ..
}); //  was fade out to fade it in
if (totalRows > maxRows) {
// if tr total rows gt max rows option
var pagenum = Math.ceil(totalRows / maxRows); // ceil total(rows/maxrows) to get ..
//	numbers of pages
for (var i = 1; i <= pagenum; ) {
// for each page append pagination li
$('.pagination #prev')
.before(
'<li data-page="' +
i +
'">\
			  <span>' +
i++ +
'<span class="sr-only">(current)</span></span>\
			</li>'
)
.show();
} // end for i
} // end if row count > max rows
$('.pagination [data-page="1"]').addClass('active'); // add active class to the first li
$('.pagination li').on('click', function(evt) {
// on click each page
evt.stopImmediatePropagation();
evt.preventDefault();
var pageNum = $(this).attr('data-page'); // get it's number

var maxRows = parseInt($('#maxRows').val()); // get Max Rows from select option

if (pageNum == 'prev') {
if (lastPage == 1) {
return;
}
pageNum = --lastPage;
}
if (pageNum == 'next') {
if (lastPage == $('.pagination li').length - 2) {
return;
}
pageNum = ++lastPage;
}

lastPage = pageNum;
var trIndex = 0; // reset tr counter
$('.pagination li').removeClass('active'); // remove active class from all li
$('.pagination [data-page="' + lastPage + '"]').addClass('active'); // add active class to the clicked
// $(this).addClass('active');					// add active class to the clicked
limitPagging();
$(table + ' tr:gt(0)').each(function() {
// each tr in table not the header
trIndex++; // tr index counter
// if tr index gt maxRows*pageNum or lt maxRows*pageNum-maxRows fade if out
if (
trIndex > maxRows * pageNum ||
trIndex <= maxRows * pageNum - maxRows
) {
$(this).hide();
} else {
$(this).show();
} //else fade in
}); // end of for each tr in table
}); // end of on click pagination list
limitPagging();
})
.val(5)
.change();

// end of on select change

// END OF PAGINATION
}

function limitPagging(){
// alert($('.pagination li').length)

if($('.pagination li').length > 7 ){
if( $('.pagination li.active').attr('data-page') <= 3 ){
$('.pagination li:gt(5)').hide();
$('.pagination li:lt(5)').show();
$('.pagination [data-page="next"]').show();
}if ($('.pagination li.active').attr('data-page') > 3){
$('.pagination li:gt(0)').hide();
$('.pagination [data-page="next"]').show();
for( let i = ( parseInt($('.pagination li.active').attr('data-page'))  -2 )  ; i <= ( parseInt($('.pagination li.active').attr('data-page'))  + 2 ) ; i++ ){
$('.pagination [data-page="'+i+'"]').show();

}

}
}
}

$(function() {
// Just to append id number for each row
//$('table tr:eq(0)').prepend('<th> ID </th>');

var id = 0;

$('table tr:gt(0)').each(function() {
id++;
//$(this).prepend('<td>' + id + '</td>');
});
});



</script>

</body>
</html>