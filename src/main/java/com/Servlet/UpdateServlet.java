package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.StudentDAO;
import com.DbConnect.DBConnect;
import com.entity.Student;


@WebServlet("/updates")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		String qualification=req.getParameter("qualification");
		String email=req.getParameter("email");
		
		int id=Integer.parseInt(req.getParameter("id"));
		Student student=new Student(id,name,dob,address,qualification,email);
		
		StudentDAO dao=new StudentDAO(DBConnect.getCon());
		HttpSession session=req.getSession();
		
		boolean f=dao.updatestudent(student);
		if(f) {
			session.setAttribute("sucMsg", "Student Updated Successfully");
			resp.sendRedirect("index.jsp");
//			System.out.println("Student Added Successfully");
		}
		else {
			session.setAttribute("errMsg", "Something went wrong");
			resp.sendRedirect("index.jsp");
//			System.out.println("Something went wrong");
		}
		
		
		
	}
	
	

}
