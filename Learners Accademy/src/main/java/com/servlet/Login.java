package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String UserName = request.getParameter("id");
		String Password = request.getParameter("pw");
		
		if (UserName.equals("Rajkumar")&& Password.equals("Simplilearn") ) {
			
			out.println("<html>\r\n"+"<body>\r\n"
					+ "<center>\r\n"
					+ "<h1 style=\"color:Tomato;\">Learners Accademy Mainmenu</h1>\r\n"
					+ "<p></p>\r\n"
					+ "\r\n"
					+ "<h3 style=\"color:DodgerBlue;\">To Add Student Details: </h3><a href = \"AddData\">Click here</a><p></p>\r\n"
					+ "<h3 style=\"color:DodgerBlue;\">To View Student Details: </h3><a href = \"ReadData\">Click here</a>\r\n"
					+ "</center>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
		else{
			out.println("<html>\r\n"+"<body>\r\n"
					+ "<center>\r\n"
					+"<p></p>\r\n"
					+ "<p></p>\r\n"
					
					+ "<h3 style=\"color:Tomato;\">Login Credentials are Incorrect </h3><p></p>\r\n"
					+ "<h3 style=\"color:DodgerBlue;\">To Login Again: </h3><a href = \"index.html\">Click here</a>\r\n"
					+ "</center>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
		
	}

}
