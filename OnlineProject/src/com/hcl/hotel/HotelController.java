package com.hcl.hotel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	HotelDetails hotelDetails = new HotelDetails();
	HotelDAOImpl hotelDaoImpl = new HotelDAOImpl();
	HotelDAO hdao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("addHotel")!=null){
			int hotelid=Integer.parseInt(request.getParameter("hotelid"));
			String hotelName = request.getParameter("name");
			String hotelCity = request.getParameter("city");
			String address = request.getParameter("address");
			String contactno=request.getParameter("contactno");
			int rate=Integer.parseInt(request.getParameter("rate"));
			hotelDetails.setHotelid(hotelid);
			hotelDetails.setHotelName(hotelName);
			hotelDetails.setHotelCity(hotelCity);
			hotelDetails.setAddress(address);
			hotelDetails.setContactNumber(contactno);
			hotelDetails.setFare(rate);
			hotelDaoImpl.saveHotel(hotelDetails);
			RequestDispatcher rd = request.getRequestDispatcher("ProcessAdminHotel.jsp");
			rd.forward(request, response);
		}


	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showHotel")!=null){
			List<HotelDetails> hotelList = new ArrayList();
			hotelList = hotelDaoImpl.showAllHotel();
			request.setAttribute("hotelList", hotelList);
			RequestDispatcher rd = request.getRequestDispatcher("AdminViewHotel.jsp");
			rd.forward(request, response);

		}
        if(request.getParameter("deleteHotel")!=null){
            int hotelid =Integer.parseInt(request.getParameter("hotelid"));
            hotelDetails.setHotelid(hotelid);
            hotelDaoImpl.deleteHotel(hotelDetails);
             RequestDispatcher rd = request.getRequestDispatcher("ProcessAdminHotel.jsp");
           rd.forward(request, response);
        }

	}
}
