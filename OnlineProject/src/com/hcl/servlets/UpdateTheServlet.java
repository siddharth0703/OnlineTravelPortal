package com.hcl.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.BusDAO;

public class UpdateTheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateTheServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BusDAO bs= new BusDAO();
		int id=Integer.parseInt(request.getParameter("id"));
		String bname=request.getParameter("name");
		String dept=request.getParameter("dept");
		int seat=Integer.parseInt(request.getParameter("seat"));
		String acity=request.getParameter("acity");
		String bdetails=request.getParameter("details");
		
		System.out.println(id+bname+dept+seat+acity);
		
		int i=bs.updateBusbyId(id,bname,dept,seat,acity);
		if(i>0){
			RequestDispatcher rd= request.getRequestDispatcher("AllBusEntery.jsp");
			rd.forward(request, response);
		}
		doGet(request, response);
	
	
	}

}
