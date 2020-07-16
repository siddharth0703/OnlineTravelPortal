package com.hcl.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.DAO.BusDAO;

public class ServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletUpdate() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BusDAO bs = new BusDAO();
		int id = Integer.parseInt(request.getParameter("bId"));
		String bname = request.getParameter("bName");
		String dept = request.getParameter("b_dCity");
		int seat = Integer.parseInt(request.getParameter("b_seats"));
		String acity = request.getParameter("b_aCity");
		String bdetails = request.getParameter("b_details");
		System.out.println(id + bname + dept + seat + acity);

		int i = bs.updateBusbyId(id, bname, dept, seat, acity);
		if (i > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("AllBusEntery.jsp");
			rd.forward(request, response);
		}
	}

}
