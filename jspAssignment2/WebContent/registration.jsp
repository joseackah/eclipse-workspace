<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form action="info.jsp" style="display:flex;">
<table style = "margin: 10px; padding:20px; text-align:right; display:flex;">
<tr> 
<th> </th>
<th> </th>
</tr>
<tr>
<td>username </td> 
<td><input type = "text" name ="user"> </td>
</tr>
<tr>
<td>password</td> 
<td> <input type="password" name = "password" checked ="checked"> </td>
</tr>
<tr>
<td>confirm password </td> 
<td> <input type = "password" name ="cpassword" checked ="checked"> </td>
</tr>
<tr>
<td>email </td> 
<td><input type="email" name="email"> </td>
</tr>
<tr>
<td>address </td> 
<td><input type="text" name = "address"> </td>
</tr>
<tr>
<td>Phone Number</td> 
<td> <input type="number" name="phone"></td>
</tr>
<tr>
<td>gender: </td> <td> 
			<input type="radio" name="gender" value="Male" checked="checked">Male
			<input type = "radio" name="gender" value="female">Female
</td>
</tr>
<tr>
<td>education </td> 
<td>
<select name ="education">
<option>Basic </option>
<option>Secondary </option>
<option>Tertiary </option>
<option>Masters </option>
<option>PhD </option>
</select>
</td>
</tr>
<tr >
<td>
<input type="checkbox" name="agree" required>I agree that the</td><td> information are true.
</td>
</tr>

<tr>
<td>
<input type="submit" value="submit"> </td> <td> <input type="Reset" value = "reset">
</td>
</tr>
</table>
</form>

</body>
</html>