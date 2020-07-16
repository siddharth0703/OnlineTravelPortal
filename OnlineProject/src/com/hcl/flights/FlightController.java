package com.hcl.flights;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	FlightDetails flightDetails = new FlightDetails();
	FlightDAOImpl FlightDaoImpl = new FlightDAOImpl();
	FlightDAO fdao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("addFlight")!=null){
			String flightName = request.getParameter("fname");
			String flightid = request.getParameter("fnumber");
			String origin = request.getParameter("forigin");
			String destination=request.getParameter("fdestination");
			String departureTime=request.getParameter("ftime");
			String status=request.getParameter("fstatus");
			int fare=Integer.parseInt(request.getParameter("ffare"));
			flightDetails.setFlightName(flightName);
			flightDetails.setFlightid(flightid);
			flightDetails.setOrigin(origin);
			flightDetails.setDestination(destination);
			flightDetails.setDepartureTime(departureTime);
			flightDetails.setStatus(status);
			flightDetails.setFare(fare);
			FlightDaoImpl.saveFlight(flightDetails);
			RequestDispatcher rd = request.getRequestDispatcher("ProcessAdmin.jsp");
			rd.forward(request, response);
		}


	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showFlight")!=null){
			List<FlightDetails> flightList = new ArrayList();
			flightList = FlightDaoImpl.showAllFlight();
			request.setAttribute("flightList", flightList);
			RequestDispatcher rd = request.getRequestDispatcher("AdminViewFlight.jsp");
			rd.forward(request, response);

		}
        if(request.getParameter("deleteFlight")!=null){
            String flightid = request.getParameter("flightid");
            flightDetails.setFlightid(flightid);
            FlightDaoImpl.deleteFlight(flightDetails);
             RequestDispatcher rd = request.getRequestDispatcher("ProcessAdmin.jsp");
           rd.forward(request, response);
        }

	}
}
