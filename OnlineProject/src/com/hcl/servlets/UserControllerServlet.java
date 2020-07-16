package com.hcl.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import com.hcl.DAO.BusDAO;
import com.hcl.DAO.EnquiryDAO;
import com.hcl.DAO.FeedbackDAO;
import com.hcl.DAO.FlightDAO;
import com.hcl.DAO.HotelDAO;
import com.hcl.DAO.PaymentDAO;
import com.hcl.DAO.UserDAO;
import com.hcl.aojo.HotelAjo;

public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserControllerServlet() {
		super();
		
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ")
				.append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password1");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		int zipcode = Integer.parseInt(request.getParameter("zipcode"));

		HttpSession session = request.getSession(true);
		session.setAttribute("nameof", userName);
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(userName, password, email, phone, address,
					city, zipcode);
			//userDAO.setReservation();
			FlightDAO fd = new FlightDAO();
			response.sendRedirect("loginUser.jsp");
			//fd.addFlightDetails();
			
			BusDAO bs = new BusDAO();
			
//			
//			PaymentDAO pj = new PaymentDAO();
//			pj.checkPayment();
//			HotelDAO hd = new HotelDAO();
//			hd.addHotel();
//			EnquiryDAO eq = new EnquiryDAO();
//			eq.setEnquiry();
//			FeedbackDAO f = new FeedbackDAO();
//			f.setFeedback();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
