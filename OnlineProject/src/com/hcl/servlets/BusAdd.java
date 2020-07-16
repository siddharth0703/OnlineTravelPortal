package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

import com.hcl.DAO.BusDAO;
import com.hcl.aojo.BusAjo;

public class BusAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BusAdd() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bName = request.getParameter("bName");
		PrintWriter out=response.getWriter();
		String arrCity = request.getParameter("b_dCity");
		String deptCity = request.getParameter("b_aCity");
		int seats = Integer.parseInt(request.getParameter("b_seats"));
		String bDetails = request.getParameter("b_details");
		DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date = null;
		try {
			date = formatter.parse(bDetails);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		BusDAO bd = new BusDAO();
		bd.setBusDetails(bName, arrCity, deptCity, seats, date);
		out.println("Hiiiisdkfjbsdgiufsufviysavfyweufvauygvwil");
		//RequestDispatcher rd=request.getRequestDispatcher("AllBusEntery.jsp");
		//5-Mar-2010,13:00:14 PM
		
		System.out.println("These are the bus Details for particular id");
		BusAjo b=bd.getBusById(20);
		System.out.println(b);
		System.out.println("Hi");
		response.sendRedirect("AllBusEntery.jsp");
		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
