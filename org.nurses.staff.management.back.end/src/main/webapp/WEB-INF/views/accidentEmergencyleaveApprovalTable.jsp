<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Leave Approved Table</title>
</head>
<body>
<div class="class mt-3" style="text-align: center; width: 100%; margin-top:12px 0 2em;">

 <h1 >St. Joseph's Hospital,Jirapa </h1>
 <h2> Accident and Emergency Leave Approved Table</h2>
    </div>    
    <hr style="width:90%">
    <div class="container mt-3" id="print">
    <!-- <div style="text-align: center; width: 100%;"> -->
            <!-- <h1>St. Joseph's Hospital,Jirapa Nurses' Staff Leave Application Table</h1> -->
        <!-- </div> -->
       <!-- <hr>  -->
       <div> </div> <br> <br>
        <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/generalFront/accidentEmergency'">back</button>
        
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
        
<div id="s1" style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: antiquewhite; width:100" id="name">
            <thead class="table-danger">
                <tr>
                    <th>ID</th>
                    <th>WARD NAME</th>	
                    <th>STAFF ID</th>
                    <th>NAME</th>
                    <th>STAFF CATEGORY</th>
                    <th>LEAVE TYPE</th>
                    <th>LEAVE DAYS EARN</th>
                    <th>LEAVE DAYS APPLY</th>
                    <th>LEAVE DATE</th>
                     <th>LEAVE RECOM.</th>
                    <th>INCHARGE NAME</th>
                    <th>LEAVE END DATE</th>
                    <th>RESUMPTION DATE</th>
                    <th>DATE APPROVED</th>
                    <th>APPROVED BY</th>
                    <th>REMARKS</th>
                    <!-- <th id="action">ACTION</th> -->
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${leave}" var="leave">
            
            
            <c:url value="deleteLeave/${leave.id}" var="delete">
            
            
            </c:url>
            
            
            <c:url value="updateLeave1/${leave.id}"  var="update">
            
            
            
            </c:url>
            
                <tr>
                
                    <td>${leave.id}</td>
                    <td>${leave.ward_name}</td>
                    <td>${leave.staff_id}</td>
                    <td>${leave.name}</td>
                    <td>${leave.staff_cate}</td>
                    <td>${leave.leave_type}</td>
                    <td>${leave.leave_day_earn}</td>
                    <td>${leave.leave_days_apply}</td>
                    <td>${leave.leave_date}</td>
                     <td>${leave.incharge_recom}</td>
                    <td>${leave.incharge_name}</td>
                    <td>${leave.leave_end_date}</td>
                    <td>${leave.resumption_date}</td>
                    <td>${leave.date_approved}</td>
                    <td>${leave.approved_by}</td>
                    <th>${leave.remarks}</th>
                    <%-- <td id="action1">
                    
                    <a  href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i class="fa fa-trash" id="action2"></i> </a> |-|
                    <a  href="${update}"> <i class="fa fa-pen" id="action3" > </i></a>
                    
                    
                    </td> --%>
                    
                    
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
                    <td></td>  <td></td>  <td></td> <!--  <td></td> -->
                </tr>
            </tbody>
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