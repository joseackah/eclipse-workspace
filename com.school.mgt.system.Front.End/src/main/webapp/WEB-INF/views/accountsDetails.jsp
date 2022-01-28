<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<style>
        .head {
            text-align: center;
        }
        
        .detailsContainer {
            margin-left: 20px;
            
        }
        
        .student {
            display: flex;
            flex-direction: row;
            font-size: 30px;
            font-weight: bold;
        }
        
        .sId {
            margin-right: 11.9em;
        }
        
        .addressContainer {
            display: flex;
            flex-direction: row;
            margin-top: 1em;
            font-size: 30px;
            font-weight: bold;
        }
        
        .address {
            margin-right: 18rem;
        }
        
        .yearContainer {
            display: flex;
            flex-direction: row;
            margin-top: 1em;
            font-size: 30px;
            font-weight: bold;
        }
        
        .year {
            margin-right: 13.6em;
        }
        
        .horizontal {
            margin-left: 0;
            width: 70%;
        }
        
        table {
            border: 1px solid black;
            width: 70%;
        }
        
        th {
            /*border: 1px solid black;*/
            border-bottom: 1px solid gray;
            background: none repeat scroll 0 0 #0775d3;
            padding: 10px;
            color: #FFFFFF;
        }
        
        td {
            border: 1px solid black;
            height: 30px;
            font-size: 25px;
            text-align: right;
        }
        
        tr:nth-child(even) {
            background: #FFFFFF
        }
        
        tr:nth-child(odd) {
            background: #BBBBBB
        }
    </style>
<meta charset="ISO-8859-1">
<title>Students Accounts Details</title>
</head>
<body>
 <div class="head">

        <h1><ins>Student Payment Details</ins></h1>

    </div>
   <div class="detailsContainer">
        <tr>
            <div class="student">
                <div class="sId">
                    <td>Student Id:</td>
                    <td>${accountT.id}</td>
                </div>


                <div>
                    <td>Student Name:</td>
                    <td>${accountT.first_name} ${accountT.last_name}</td>
                </div>
            </div>
        </tr>

        <tr>
            <div class="addressContainer">
                <div class="address">
                    <td>Address: </td>
                    <td>Jirapa, Konkuo</td>
                </div>
                <div>
                    <td>Course:</td>
                    <td>bsc Nursing</td>
                </div>
            </div>
        </tr>

        <tr>

            <div class="yearContainer">
                <div class="year">
                    <td>Year/level:</td>
                    <td>${accountT.level}</td>
                </div>

                <div>
                    <td>Date Admitted:</td>
                    <td>2018</td>
                </div>
            </div>
        </tr>

    </div>  
    <hr class="horizontal">

    <table>

        <thead>
            <tr>
                <th>account Id</th>
                <th>
                    student id
                </th>

                <th>amount due</th>
                <th>amount paid</th>
                <th>balance</th>
                <th>date paid</th>
            </tr>

        </thead> 
        <tbody>
       
        <c:forEach items="${accounts}" var="accountss">
     
        <tr>
            <td>${accountss.account_id }</td>
            <td>${accountss.id}</td>
            <td>${accountss.amount_due}</td>
            <td>${accountss.amount_paid}</td>
            <td>${accountss.balance}</td>
            <td>${accountss.date_paid}</td>
        </tr>
       <%--  <tr>
            <td>${accounts.account_id}</td>
            <td>${accounts.student_id}</td>
            <td>${accounts.amount_due}</td>
            <td>${accounts.amount_paid}</td>
            <td>${accounts.balance}</td>
            <td>${accounts.date_paid}</td>
        </tr>

        <tr>
            <td>${accounts.account_id}</td>
            <td>${accounts.student_id}</td>
            <td>${accounts.amount_due}</td>
            <td>${accounts.amount_paid}</td>
            <td>${accounts.balance}</td>
            <td>${accounts.date_paid}</td>
        </tr> --%>

       

</c:forEach>
        </tbody>

    </table>



    <div class="modal-footer" >
    
        <button style="width: 90px; height: 40px;" type="button" class="btn btn-default" data-dismiss="modal" onclick="window.location.href='${pageContext.request.contextPath}/schoolAccounts/displayAccounts'"> Back </button>
        <button style="width: 90px; height: 40px;" type="button" class="btn btn-primary" onclick="window.print()">Print</button>
    </div>








</body>
</html>