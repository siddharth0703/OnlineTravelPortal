package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.flights.FlightDAO;
import com.hcl.flights.FlightDetails;
import com.hcl.service.SearchService;

public class ViewFlightControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FlightDetails fd = new FlightDetails();
	SearchService ss = new SearchService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String origin = request.getParameter("origin");
		String destination = request.getParameter("destination");
		String date = request.getParameter("d1");
		System.out.println(date);
		System.out.println("Origin get is:" + origin);
		fd.setOrigin(origin);
		System.out.println("Destination is:" + destination);
		fd.setDestination(destination);
		List<FlightDetails> flightlist = new ArrayList();
		flightlist = ss.search(origin, destination);
		request.setAttribute("flightList", flightlist);
		getServletContext().setAttribute("flightList1", flightlist);
		getServletContext().setAttribute("date", date);
		System.out.println(flightlist);
		System.out.println("my lis is -------------" + flightlist);
		RequestDispatcher rd = request
				.getRequestDispatcher("FlightSearchResult.jsp");
		rd.forward(request, response);

	}

}
