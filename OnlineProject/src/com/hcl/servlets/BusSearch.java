package com.hcl.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.BusDAO;
import com.hcl.aojo.BusAjo;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class BusSearch
 */
public class BusSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BusSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dept= request.getParameter("source");
		String arr= request.getParameter("arrival");
		String seats=request.getParameter("seats");
		System.out.println("dept :"+dept +"arr "+arr+ "seats"+seats);
		BusDAO bus= new BusDAO();
		List<BusAjo> list1= bus.getBusesByNames(dept,arr);
		System.out.println(list1);
		request.setAttribute("buslist",list1);
		RequestDispatcher rd= request.getRequestDispatcher("BusSearchResults.jsp");
		rd.forward(request, response);
	
	
	}

}
