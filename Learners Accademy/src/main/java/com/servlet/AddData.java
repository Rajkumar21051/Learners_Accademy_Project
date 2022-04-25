package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.Entity.Students;
import com.Entity.Subjects;
import com.Entity.Teachers;
import com.Util.HibernateUtil;


/**
 * Servlet implementation class AddData
 */
@WebServlet("/AddData")
public class AddData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("AdminstratorForm.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Student_Name = request.getParameter("Sname1");
		String Course_Name = request.getParameter("Cname1");
		String Subject_11 = request.getParameter("Sub11");
		String Subject_12 = request.getParameter("Sub12");
		String Subject_13 = request.getParameter("Sub13");
		String Subject_11_Teacher = request.getParameter("Sub11t");
		String Subject_12_Teacher = request.getParameter("Sub12t");
		String Subject_13_Teacher = request.getParameter("Sub13t");
		
		Students s1 = new Students();
		
		Subjects sub11 = new Subjects();
		Teachers t11 = new Teachers();
		
		sub11.setSubject(Subject_11);
		
		t11.setTeacher_Name(Subject_11_Teacher);
		
		t11.setTstd(s1);
		sub11.setSubs(s1);
		
	
		Subjects sub12 = new Subjects();
		Teachers t12 = new Teachers();
		
		sub12.setSubject(Subject_12);
		
		t12.setTeacher_Name(Subject_12_Teacher);
		
		
		t12.setTstd(s1);
		sub12.setSubs(s1);
		
		Subjects sub13 = new Subjects();
		Teachers t13 = new Teachers();
		
		sub13.setSubject(Subject_13);
		
		t13.setTeacher_Name(Subject_13_Teacher);
		
		sub13.setSubs(s1);
		t13.setTstd(s1);
		
		List <Teachers>	Te_1 = new ArrayList<Teachers>();
		
		Te_1.add(t11);
		Te_1.add(t12);
		Te_1.add(t13);
		
		List <Subjects>	Sub_1 = new ArrayList<Subjects>();
		
		Sub_1.add(sub11);
		Sub_1.add(sub12);
		Sub_1.add(sub13);
		
		
		s1.setStudent_Name(Student_Name);
		s1.setCourse_Name(Course_Name);
		s1.setSsub(Sub_1);
		s1.setSteac(Te_1);
		
		

				
				SessionFactory Ses  =HibernateUtil.buildSessionFactory();
				Session se = Ses.openSession();
				Transaction trans = se.beginTransaction();
				
				se.save(s1);
				
				
				trans.commit();
				
				PrintWriter out = response.getWriter();
				out.println("<html><body><center>");
				out.println("<h2 style=\"color:Tomato;\">Data was Sucessfully Stored</h2>");
				out.println("<p><a href = 'Form.html'>Click here for Main Menu</a></p>");
				out.println("</center></body></html>");
				
				
				
				
				se.close();
		
		
	}

}
