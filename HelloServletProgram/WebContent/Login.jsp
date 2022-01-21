<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here.....</title>
</head>
<body>
<form action="CustomerLoginServlet" method="post">
	<input type="text" name="cname" placeholder="Enter the Customer Name">
	<input type="password" name="cpassword" placeholder="Enter the Customer password">
	<input type="submit" value = "submit">
</form>
</body>
</html>