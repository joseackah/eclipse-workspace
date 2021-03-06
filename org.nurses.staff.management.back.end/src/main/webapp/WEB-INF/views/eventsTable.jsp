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
	
	<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->
<link href="${pageContext.request.contextPath}/resources/font-awesome.min.css"
	rel="stylesheet">

<!-- <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script> -->

<script src='${pageContext.request.contextPath}/resources/js/font-awesome.js' 
crossorigin='anonymous'></script>

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
    left: 17%;
    top: 5%;
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
<title>Events Table</title>
</head>
<body>
<div style="text-align: center; width: 100%; margin:2px 0 2em;">
 <h1 >St. Joseph's Hospital,Jirapa </h1>
 <h2>Events Table</h2>
    </div>

    <div class="container mt-3" id="print">
    
    <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/leaveFront/profile'">back</button>

    <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>
       
<div style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: aliceblue;">
            <thead class="table-primary">
                <tr>
                    <th>ID</th>
                    <th>EVENT TITLE</th>
                    <th>VENUE</th>
                    <th>DATE</th>
                    <th>PARTICIPANTS</th>
                    <th>ACTION</th>


                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${event}" var="event">
            
            <c:url value="retrieve/${event.event_id}" var = "update">
            
            
            </c:url>
            
                <tr>
                    <td>${event.event_id}</td>
                    <td>${event.event_name}</td>
                    <td>${event.venue}</td>
                    <td>${event.event_date}</td>
                    <td>${event.participant}</td>
                    <td id="action" style="align-content: center;">
                    <a id="action" href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i id="action" class="fa fa-trash"></i> </a> |  |
                    <a id="action" href="${update}"> <i id="action" class="fa fa-pen"> </i></a>
                    
                    </td>


                </tr>
</c:forEach>
               
            </tbody>
        </table>
        
        ${event}
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