package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/check")
public class LoginServlet extends HttpServlet {
	
	public static final long serialVersionUID = 1L;
	public LoginServlet()
	{
		super();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		LoginDAO dao =new LoginDAO();
		writer.println("<html>");
		writer.println("<body>");
		
		if (dao.checkLogin(name,pass)) {
			RequestDispatcher dispatcher =request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
		else {
			request.setAttribute("message", "CREDENTIALS NOT MATCHING");
			RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);		}
		writer.println("</body>");
		writer.println("</html>");
	}

}
