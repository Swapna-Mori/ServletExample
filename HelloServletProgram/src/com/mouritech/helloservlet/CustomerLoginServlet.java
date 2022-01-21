package com.mouritech.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			//Here the text to be printed on the browser
			PrintWriter out = response.getWriter();
			//read the data entered in the html
			String customerName = request.getParameter("cname");
			String customerPassword = request.getParameter("cpassword");
			if(customerName.equals("Rama")&&customerPassword.equals("rama@1234")) {
				out.println("Logged successfully");
				RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
				rd.forward(request, response);
			}else {
				out.println("Please check username and password.....");
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
