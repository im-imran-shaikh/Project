package com.imran.Project.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imran.Project.Dao.RegisterDao;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String  uname = request.getParameter("uname");
		String pass = request.getParameter("psw");
		String rpass = request.getParameter("pswrepeat");
		
		RegisterDao da = new RegisterDao();
		if(da.check(uname,pass,rpass))
		{
			if(da.i>0)
			{
				out.println("congratulation succesfully register");
			}
		}
	}

}
