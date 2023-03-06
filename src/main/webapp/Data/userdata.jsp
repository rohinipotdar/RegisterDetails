<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>User Registration</h1>

	<form action="User" Method="get">
		<table>

			<tr>
				<td>First Name:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>User Last Name:</td>
				<td><input type="text" name="lname"></td>
			</tr>

			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>User Password:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>

				<td><input type="submit" value="Register"></td>
			</tr>


		</table>
	</form>

</body>
</html>