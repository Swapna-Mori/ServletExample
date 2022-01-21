package com.mouritech.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyNameServlet
 */
@WebServlet("/MyNameServlet")
public class MyNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//set response content type
		response.setContentType("text/html");
		//Here the text to be printed on the browser
		PrintWriter out = response.getWriter();
		//read the data entered in the html
		String enteredName = request.getParameter("myname");
		out.println("<h1> Enter Name = " +enteredName + "</h1>");
	
	}

}
