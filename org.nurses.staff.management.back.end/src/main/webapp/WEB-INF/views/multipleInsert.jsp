<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.util.*,java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%



String staffId = request.getParameter("staff_id");
String pin = request.getParameter("pin_ain_number");
String renewal = request.getParameter("renewal_date");
String type = request.getParameter("type");
String expire = request.getParameter("expire_date");
String issue = request.getParameter("date_issue");

String staffId1 = request.getParameter("staff_id1");
String pin2 = request.getParameter("pin_ain_number2");
String renewal3 = request.getParameter("renewal_date3");
String type4 = request.getParameter("type4");
String expire5 = request.getParameter("expire_date5");
String issue6 = request.getParameter("date_issue6");

String staffId7 = request.getParameter("staff_id7");
String pin8 = request.getParameter("pin_ain_number8");
String renewal9 = request.getParameter("renewal_date9");
String type10 = request.getParameter("type10");
String expire11 = request.getParameter("expire_date11");
String issue12 = request.getParameter("date_issue12");



try{
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursesdb", "root", "Physics1//,");
PreparedStatement ps = conn.prepareStatement("insert into pin_ain(staff_id, pin_ain_number, renewal_date, type, expire_date, date_issue) values (?,?,?,?,?,?);");
ps.setString(1, staffId);
ps.setString(2, pin);
ps.setString(3, renewal);
ps.setString(4, type);
ps.setString(5, expire);
ps.setString(6, issue);
ps.addBatch();
//ps.setInt(7, id++);

ps.setString(1, staffId1);
ps.setString(2, pin2);
ps.setString(3, renewal3);
ps.setString(4, type4);
ps.setString(5, expire5);
ps.setString(6, issue6);
//ps.setInt(14, id++);
ps.addBatch();

ps.setString(1, staffId7);
ps.setString(2, pin8);
ps.setString(3, renewal9);
ps.setString(4, type10);
ps.setString(5, expire11);
ps.setString(6, issue12);
ps.addBatch();
//ps.setInt(21, id++);

int [] insert = ps.executeBatch();

response.sendRedirect("displayAllPin");

}catch(Exception e){
	out.println(e);
}



%>

</body>
</html>