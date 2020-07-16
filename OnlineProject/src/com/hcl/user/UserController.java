package com.hcl.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDetails userDetails=new UserDetails();
	UserDAOImpl UserDaoImpl=new UserDAOImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("showUser")!=null){
			List<UserDetails> userList = new ArrayList();
			userList = UserDaoImpl.showAllUser();
			request.setAttribute("userList", userList);
			RequestDispatcher rd = request.getRequestDispatcher("AdminViewUser.jsp");
			rd.forward(request, response);
		}

	}
}
