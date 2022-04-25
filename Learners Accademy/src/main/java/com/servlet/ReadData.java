package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Students;
import com.Util.HibernateUtil;

/**
 * Servlet implementation class ReadData
 */
@WebServlet("/ReadData")
public class ReadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body><center><h2 style=\"color:DodgerBlue;\">Student and Course Details </h2><p></p>");
		out.println("<style> table,td,th { border : 2px solid DodgerBlue; padding:8px;</style>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th style=\"background-color:Tomato;\">Student_ID</th>");
		out.println("<th style=\"background-color:Tomato;\">Student_Name</th>");
		out.println("<th style=\"background-color:Tomato;\">Course</th>");
		out.println("<th style=\"background-color:Tomato;\">Subjects</th>");
		out.println("<th style=\"background-color:Tomato;\">Teachers</th>");
		out.println("</tr>");
		
		SessionFactory Ses  =HibernateUtil.buildSessionFactory();
		Session se = Ses.openSession();
		List<Students> stds = se.createQuery("from Students").list();
		if(stds != null && stds.size()>0) {
			for(Students student:stds) {
				out.println("<tr>");
				out.println("<th>" +student.getStudent_ID()+ "</th>");
				out.println("<th>" +student.getStudent_Name()+ "</th>");
				out.println("<th>" +student.getCourse_Name()+ "</th>");
				out.println("<th>" +student.getSsub()+ "</th>");
				out.println("<th>" +student.getSteac()+ "</th>");
				out.println("</tr>");
		}
		}
		
		out.println("</center></body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
