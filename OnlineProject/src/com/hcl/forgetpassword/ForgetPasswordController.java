package com.hcl.forgetpassword;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.forgetpassword.ForgetService;


public class ForgetPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ForgetPasswordController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String emailId =request.getParameter("email_id");
		RequestDispatcher rd = null;
		//HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		ForgetService authenticator = new ForgetService();
		
		if (authenticator.authenticate(emailId.trim())) {
			System.out.println("Insidfe authenticator and emailid trim");
			rd = request.getRequestDispatcher("ForgetPassword.jsp");
			rd.include(request,response);
			out.println("A link has been sent to your registered email-Id. Kindly click in that link to change password.");
		} else {
			
			rd = request.getRequestDispatcher("ForgetPassword.jsp");
		    rd.include(request,response);
		    out.println("<h1 style='color:red;position:relative;left:380px'>INVALID CREDENTIALS!</h1>");
		}
	}

}
