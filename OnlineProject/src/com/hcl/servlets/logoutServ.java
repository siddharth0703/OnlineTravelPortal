package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class logoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public logoutServ() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		           PrintWriter out=response.getWriter();  
		             
		          //request.getRequestDispatcher("link.html").include(request, response);  
		              
		            HttpSession session=request.getSession();  
	           session.invalidate();  
		            
	           out.print("You are successfully logged out!");  
	            response.sendRedirect("index.jsp");
		          out.close();  

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
