package com.hcl.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.hotel.HotelDetails;
import com.hcl.service.HotelViewService;


public class HotelShowControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HotelDetails hd=new HotelDetails();
	HotelViewService hvs=new HotelViewService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hotelCity=request.getParameter("hotelCity");
		hd.setHotelCity(hotelCity);
		List<HotelDetails> hotelList=new ArrayList();
		hotelList=hvs.findHotel(hotelCity);
		request.setAttribute("hotelList", hotelList);
		RequestDispatcher rd = request.getRequestDispatcher("UserViewHotel.jsp");
		rd.forward(request, response);
	}



}
