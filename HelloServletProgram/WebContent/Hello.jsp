<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP Page</title>
</head>
<body>
	Date : <%= new Date() %> <br />
	LocalTime = <%= LocalTime.now() %>
	Value = <%= squareofValue() %>
	<% out.print("<h1> Hello from JSP page </h1>"); %>
		<% out.print("<h1> Bye from JSP page </h1>"); %>
		<%
			System.out.println("scriptlet tag output");
		%>

		<%!
			int value = 30;
		%>
		<%!
			int squareofValue(){
			return value * value;
		}
		%>
		<%
			out.println(" Square of Value = " + squareofValue());	
		%>
		
</body>
</html>