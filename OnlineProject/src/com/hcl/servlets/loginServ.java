package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class loginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginServ() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Hi");
		HttpSession session = request.getSession(false);
		if(session==null)
		{

		response.sendRedirect("loginUser.jsp");
		}
		else
		{	String name=(String)session.getAttribute("user");
			System.out.println("Name is :"+name);
			session.setAttribute("user", name);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
