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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentDAO dao=new StudentDAO(DBConnect.getCon());
		HttpSession session=req.getSession();
		
		boolean f=dao.deletestudent(id);
		if(f) {
			session.setAttribute("sucMsg", "Student Delete Successfully");
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
