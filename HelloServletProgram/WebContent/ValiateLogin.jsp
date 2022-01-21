<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ValidateLogin here....</title>
</head>
<body>
<%
	String customerName = request.getParameter("cname");
	String customerPassword = request.getParameter("cpassword");
	if(customerName.equals("Rama")&&customerPassword.equals("")) {
		out.println("Logged successfully");
		RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
		rd.forward(request, response);
	}else {
		out.println("Please check username and password.....");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.include(request, response);
	}
%>
</body>
</html>