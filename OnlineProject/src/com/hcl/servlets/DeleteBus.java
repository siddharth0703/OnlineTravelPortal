package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.BusDAO;


public class DeleteBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteBus() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		BusDAO bd = new BusDAO();
		boolean f=bd.deleteBus(id);
	if(f==true)
	{
		out.println("<html><h1>Your Details Are Deleted Succesfully</h1></html>");
		RequestDispatcher rd=request.getRequestDispatcher("AllBusEntery.jsp");
		rd.forward(request, response);
	}
	else
	{
		out.println("Please Click Again To delete");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
