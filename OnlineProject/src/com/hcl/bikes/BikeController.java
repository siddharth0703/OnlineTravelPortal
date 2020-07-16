package com.hcl.bikes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BikeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BikeDetails bikeDetails = new BikeDetails();
	BikeDAOImpl bikeDaoImpl = new BikeDAOImpl();
	BikeDAO bdao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("addBike")!=null){
			String bikeName = request.getParameter("bikename");
			String bikeid = request.getParameter("bikeid");

			String type=request.getParameter("type");


			int fare=Integer.parseInt(request.getParameter("fare"));
			bikeDetails.setBikeName(bikeName);
			bikeDetails.setBikeid(bikeid);
			bikeDetails.setType(type);
			bikeDetails.setFare(fare);
			bikeDaoImpl.saveBike(bikeDetails);
			RequestDispatcher rd = request.getRequestDispatcher("AdminMediate.jsp");
			rd.forward(request, response);
		}


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showBike")!=null){
			List<BikeDetails> bikeList = new ArrayList();
			bikeList = bikeDaoImpl.showAllBike();
			request.setAttribute("bikeList", bikeList);
			RequestDispatcher rd = request.getRequestDispatcher("AdminViewBike.jsp");
			rd.forward(request, response);

		}
		if(request.getParameter("deleteBike")!=null){
			String bikeid = request.getParameter("bikeid");
			bikeDetails.setBikeid(bikeid);
			bikeDaoImpl.deleteBike(bikeDetails);
			RequestDispatcher rd = request.getRequestDispatcher("ProcessAdminBike.jsp");
			rd.forward(request, response);
		}

	}
}
