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
<title>Staff Table</title>
</head>
<body>
<div style="text-align: center; width: 100%; margin:2px 0 2em;">
 <h1 >St. Joseph's Hospital,Jirapa </h1>
 <h2>Nurses'(Staff) Table</h2>
    </div>

    <div class="container mt-3" id="print">
    
    <button id="b1" style="float: left; border-radius: 5em; " class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/leaveFront/profile'">back</button>
        <button id="b2" style="float: left; border-radius: .5em; font-size:1em; margin-left: 2em;" class="btn btn-primary" onclick="window.print('table')" > <i class="fa fa-print"></i> </button>

       
<div style=" display:flex; flex-direction:row-reverse;"> <input class="form-control" id="myInput" type="text" placeholder="Search.." style="padding: .5em 2em; border-radius: 5em; width:20%; display:flex; flex-direction: flex-end;"> </div>
        <table class="table table-bordered table-hover" style="background-color: aliceblue;">
            <thead class="table-success">
                <tr>
                    <th>ID</th>
                    <th>STAFF ID</th>
                    <th>NAME</th>
                    <th>STAFF CATEGORY</th>
                    <th>CURRENT GRADE</th>
                    <th>ADDRESS</th>
                    <th>SSNIT NUMBER</th>
                    <th>DOB</th>
                    <th>SEX</th>
                    <th>ASSUMPTION DATE</th>
                    <th>BASIC QUALIFICATION</th>
                    <th>ADDITION QUALIFICATION</th>
                    <th>STATUS</th>
                    <th>ACTION</th>
                </tr>
            </thead>
            <tbody id="myTable">
            
            <c:forEach items="${nurse}" var="nurse">
            
            <c:url value="updateNurse1/${nurse.id }" var="update"></c:url>
            
            
            
                <tr>
                    <td>${nurse.id}</td>
                    <td>${nurse.staff_id}</td>
                    <td>${nurse.name}</td>
                    <td>${nurse.category}</td>
                    <td>${nurse.grade}</td>
                    <td>${nurse.address}</td>
                    <td>${nurse.ssnit}</td>
                    <td>${nurse.date_of_birth}</td>
                    <td>${nurse.sex}</td>
                    <td>${nurse.assumption_date}</td>
                    <td>${nurse.basic_qualification}</td>
                    <td style="display:;">${nurse.additional_qualification }</td>
                    <td>${nurse.status}</td>
                    <td id="action">
                    
                    <a id="action" href="${delete}" onclick="if (!confirm('Are you sure you want to delete this record?')) return false"> <i id="action" class="fa fa-trash"></i> </a> |-|
                    <a id="action" href="${update}"> <i id="action" class="fa fa-pen"> </i></a>
                    
                    
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