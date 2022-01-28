<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pinFront/saveMorePin">
        <div class="row">
         <!-- Id: <input type="text" name="id" id=""> -->
            <br>staff id: <input type="text" name="staff_id" id="">
            <br>pin Number: <input type="text" name="pin_ain_number" id="">
            <br>renewal date:<input type="date" name="renewal_date" id="">
            <br>type: <input type="text" name="type" id="">
             <br>expire date: <input type="date" name="expire_date" id="">
             <br>date issue: <input type="date" name="date_issue" id="">
        </div><br>

        <div class="row">
        <!-- Id: <input type="text" name="id" id=""> -->
            <br>staff id: <input type="text" name="staff_id" id="">
            <br> pin Number: <input type="text" name="pin_ain_number" id="">
            <br> renewal date:<input type="date" name="renewal_date" id="">
            <br> type: <input type="text" name="type4" id="">
            <br> expire date: <input type="date" name="expire_date" id="">
            <br> date issue: <input type="date" name="date_issue" id="">
        </div><br>

        <div class="row">
       <!-- Id: <input type="text" name="id" id=""> -->
            <br>staff id: <input type="text" name="staff_id" id="">
            <br> pin Number: <input type="text" name="pin_ain_number" id="">
            <br> renewal date:<input type="date" name="renewal_date" id="">
            <br> type: <input type="text" name="type10" id="">
            <br> expire date: <input type="date" name="expire_date" id="">
            <br> date issue: <input type="date" name="date_issue" id="">
        </div><br>

        <button type="submit">
    Save
</button>

    </form>

</body>
</html>