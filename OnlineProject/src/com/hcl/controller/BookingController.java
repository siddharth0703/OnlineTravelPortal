package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.aojo.LoginAojo;
import com.hcl.service.BookingService;

public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookingController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		LoginAojo bp = new LoginAojo();
		bp.setUserName(request.getParameter("name"));
		bp.setPassword1(request.getParameter("pass"));
		bp.setPhone(request.getParameter("mobile"));
		bp.setAddress(request.getParameter("address"));
		bp.setEmail(request.getParameter("email"));
		bp.setCity(request.getParameter("city"));
		BookingService bs = new BookingService();
		getServletContext().setAttribute("books", bp);
		if (bs.signup(bp)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Thank You for Registering! Kindly SignIn to Continue'); ");
			out.println("</script>");
			 RequestDispatcher rd=request.getRequestDispatcher("PaymentPortal.jsp"); rd.include(request, response);
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Please Fill The Details'); ");
			out.println("</script>");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
