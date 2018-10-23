package com.imran.Project.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imran.Project.Dao.LoginDao;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out =	response.getWriter();
	response.setContentType("html/text");
	
	String uname = request.getParameter("uname");
	String pass = request.getParameter("psw");
	
	LoginDao dao = new LoginDao();
	if(dao.test(uname,pass))
	{
		response.sendRedirect("welcome.jsp");
	}
	else
	{
		response.sendRedirect("masterpage.jsp");
	}
	}

}
