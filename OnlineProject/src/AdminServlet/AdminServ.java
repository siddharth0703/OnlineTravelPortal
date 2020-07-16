package AdminServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdminDao.ADao;


public class AdminServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminServ() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("userName");
		String password=request.getParameter("password");
		ADao ad=new ADao();
		String pass=ad.doGetCredentials(uname);
		System.out.println("Password="+pass);
		if(pass.equals(password))
		{
			RequestDispatcher rd=request.getRequestDispatcher("AdminMediate.jsp");
			rd.forward(request, response);
			out.println("You dbdd");
		}
		else{
			
			RequestDispatcher rd=request.getRequestDispatcher("adminlogin.jsp");
			rd.include(request, response);
			out.println("Please Enter Valid Details");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
