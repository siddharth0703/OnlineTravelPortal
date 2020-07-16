package com.hcl.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.flights.FlightDetails;

public class UserFeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserFeedbackDetails userfeedbackDetails = new UserFeedbackDetails();
	UserFeedbackDAOImpl userfeedbackDaoImpl = new UserFeedbackDAOImpl();
	UserFeedbackDAO udao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		if(request.getParameter("addFeedback")!=null){
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String suggestion=request.getParameter("suggestion");
		userfeedbackDetails.setName(name);
		userfeedbackDetails.setUsername(username);
		userfeedbackDetails.setEmail(email);
		userfeedbackDetails.setSuggestion(suggestion);
		userfeedbackDaoImpl.saveUserFeedback(userfeedbackDetails);
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Thank You for your Feedback!'); ");
		out.println("</script>");
		RequestDispatcher rd = request.getRequestDispatcher("feedbackform.html");
		rd.include(request, response);
		}


	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x="";
		if((x=request.getParameter("showFeed"))!=null){	
			System.out.println(x);
		List<UserFeedbackDetails> feedbackList = new ArrayList();
			feedbackList = userfeedbackDaoImpl.showAllFeedback();
			request.setAttribute("feedbackList", feedbackList);
			System.out.println(feedbackList);
			RequestDispatcher rd = request.getRequestDispatcher("ViewAllFeedback.jsp");
			rd.forward(request, response);
		}
		
	}
}